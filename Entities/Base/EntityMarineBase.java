package MineMineNoMi3.Entities.Base;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import MineMineNoMi3.MainExtendedPlayer;

public class EntityMarineBase extends EntityMob
{
	
	public EntityMarineBase(World arg0) 
	{
		super(arg0);
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPirateBase.class, 1.0D, false));
		this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPirateBase.class, 0, true));    
	}

	public void onEntityUpdate()
	{
		super.onEntityUpdate();
		int d0 = 25;
		AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox((double)this.posX, (double)this.posY, (double)this.posZ, (double)(this.posX + 1), (double)(this.posY + 1), (double)(this.posZ + 1)).expand(d0, d0, d0);
		axisalignedbb.maxY = (double)this.worldObj.getHeight();
		List<EntityPlayer> list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);
		Iterator<EntityPlayer> iterator = list.iterator();
		EntityPlayer entity;
		while(iterator.hasNext())
		{
			entity = (EntityPlayer)iterator.next();
			MainExtendedPlayer props = MainExtendedPlayer.get(entity);
			if(!props.getFaction().equals("Marine") && !((EntityPlayer)entity).capabilities.isCreativeMode)
			{
				 /*if(this instanceof EntityMarineGun)
					  this.tasks.addTask(1, new EntityAIArrowAttack((IRangedAttackMob)this, 1.0D, 20, 60, 15.0F));
				  else
					  this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));*/
			}
		}
	}
	
	public boolean attackEntityFrom(DamageSource damageSource, float f)
	{return super.attackEntityFrom(damageSource, f);}
	
	protected void entityInit()
	{super.entityInit();}
    
	protected boolean isValidLightLevel()
	{return true;} 
    
	protected boolean canDespawn()
	{return true;}
    
	public boolean isAIEnabled()
	{return true;}
	
	public boolean getCanSpawnHere()
	{return true;}

}
