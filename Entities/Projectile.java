package MineMineNoMi3.Entities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import MineMineNoMi3.Helper;
import MineMineNoMi3.Utils.DatabaseEvents;
import MineMineNoMi3.Utils.DatabaseParticles;
import MineMineNoMi3.Utils.DatabaseStructures;
import MineMineNoMi3.Utils.EnumAbility;

public class Projectile extends EntityThrowable
{
	
	public int ticks, maxticks;
	private EnumAbility proj;
	
	public Projectile(World par1World)
	{
		super(par1World);
	}
	
	public Projectile(World par1World, EntityPlayer par3EntityPlayer)
	{
		super(par1World, par3EntityPlayer);
	}
	
	public Projectile(World par1World, double par2, double par4, double par6)
	{
		super(par1World, par2, par4, par6);
	}

	public Projectile(World par1World, EntityPlayer par3EntityPlayer, EnumAbility proj)
	{
		super(par1World, par3EntityPlayer);
		this.proj = proj;
		this.ticks = proj.getEntityTicks();
		this.maxticks = ticks;
	}
	
	public EnumAbility getAbility()
	{
		return this.proj;
	}
	
	public void onEntityUpdate()
	{
		if(ticks <= 0)
		{
			ticks = maxticks;
			this.setDead();
		}
		else
			ticks--;		
	}

	public void onUpdate()
	{	
		if(this.proj != null && this.proj.getEntityAttr() != null)
		{
			for(int i = 0; i < this.proj.getEntityAttr().length; i++)
			{
				if(this.proj.getEntityAttr()[i].equals("particles_vulcan"))
					DatabaseParticles.renderVulcan(this);
				if(this.proj.getEntityAttr()[i].equals("particles_greenfire"))
					DatabaseParticles.renderGreenFire(this);
				if(this.proj.getEntityAttr()[i].equals("particles_avalanche"))
					DatabaseParticles.renderAvalanche(this);
				if(this.proj.getEntityAttr()[i].equals("particles_fire"))
					DatabaseParticles.renderFire(this);
			}
		}			
		super.onUpdate();
	}

	protected void onImpact(MovingObjectPosition hit)
	{
		if(this.proj != null)
		{
			if (hit.entityHit != null)
			{    
				if(this.proj.getEntitySideEffect() == -1)
					((EntityLivingBase)hit.entityHit).setFire(this.proj.getItemTicks());
				
				if(!(this.proj.getEntitySideEffect() <= 0))
					((EntityLivingBase)hit.entityHit).addPotionEffect(new PotionEffect(this.proj.getEntitySideEffect(), this.proj.getItemTicks()*2, this.proj.getEntityDmg()));
				
				if(this.proj.getEntityAttr() != null)
				{
					for(int i = 0; i < this.proj.getEntityAttr().length; i++)
					{
						if(this.proj.getEntityAttr()[i].equals("create_iceball"))
						{
							DatabaseStructures.createIceBall(((EntityLivingBase)hit.entityHit));		
						}
					}
				}

				hit.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), this.proj.getEntityDmg());
			}
			if (!this.worldObj.isRemote)
			{
				
				if(this.proj.getEntityAttr() != null)
				{
					for(int i = 0; i < this.proj.getEntityAttr().length; i++)
					{
						if(this.proj.getEntityAttr()[i].equals("event_teleport"))
							DatabaseEvents.eventTeleport(this);
						
						if(this.proj.getEntityAttr()[i].contains("destroy_"))
						{
							int radius = Integer.parseInt(this.proj.getEntityAttr()[i].substring(8));
							DatabaseEvents.eventDestoryBlocksInRadius(this, radius);							
						}
					}
				}
				
				if(this.proj.getEntityExplosion() > 0)
					Helper.explosion(this, this.proj.getEntityExplosion(), true, true);
				
				if(this.proj.getEntityExplosion() != 0 && this.proj.getEntityExplosion() < 0)
					Helper.explosion(this, this.proj.getEntityExplosion(), true, false);
				
				this.setDead();
			}    
		}       
	}

	protected float getGravityVelocity()
	{
		return 0.001F;
	}
}