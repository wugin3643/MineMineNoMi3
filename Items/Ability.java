package MineMineNoMi3.Items;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import MineMineNoMi3.Config;
import MineMineNoMi3.MainItem;
import MineMineNoMi3.Entities.Projectile;
import MineMineNoMi3.Utils.DatabaseEvents;
import MineMineNoMi3.Utils.DatabaseStructures;
import MineMineNoMi3.Utils.EnumAbility;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Ability extends MainItem
{
	
	private int ticks, use;
	private EnumAbility proj;

	public Ability()
	{
		this.setMaxStackSize(1);
	}
	
	public Ability(EnumAbility ability)
	{
		this.setMaxStackSize(1);
		this.proj = ability;
	}
	
	public boolean hasEffect(ItemStack itemStack, int pass)
	{ 
		if (itemStack.stackTagCompound != null) 
		{	
			if(itemStack.stackTagCompound.getInteger("use")==1)
				return true;	
			else
				return false;
		}
		return false;	
	}

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
	{
		if(!itemStack.hasTagCompound())
		{
			itemStack.setTagCompound(new NBTTagCompound());

			itemStack.stackTagCompound.setInteger("ticks", this.ticks);
			itemStack.stackTagCompound.setInteger("ticksfin", this.ticks);
			itemStack.stackTagCompound.setInteger("use", this.use);
		}
		if(itemStack.stackTagCompound != null)
		{
			if(itemStack.stackTagCompound.getInteger("use")==0)
			{
				if(this.proj.getEntityTicks() != 0)
					world.spawnEntityInWorld(new Projectile(world, player, this.proj));
				else 
				{
					if(this.proj.getEntitySideEffect() != 0)
					{
						if(this.proj.getEntityAttr() != null)
						{
							for(int i = 0; i < this.proj.getEntityAttr().length; i++)
							{
								if(!this.proj.getEntityAttr()[i].contains("on_hit_action"))									
									player.addPotionEffect(new PotionEffect(this.proj.getEntitySideEffect(), this.proj.getItemTicks(), this.proj.getEntityDmg()*5));
							}
						}
					}
					else
					{
						if(this.proj.getEntityAttr() != null)
						{
							for(int i = 0; i < this.proj.getEntityAttr().length; i++)
							{
								if(this.proj.getEntityAttr()[i].equals("create_iceage"))									
									DatabaseStructures.createIceAge(player);
								if(this.proj.getEntityAttr()[i].equals("create_room"))		
									DatabaseStructures.createRoom(player);
							}
						}						
					}
				}
				if(this.proj.getEntitySideEffect() == -2)
					player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 100));

				if(!Config.allowDebugMode_actual)
					itemStack.stackTagCompound.setInteger("ticks", this.proj.getItemTicks());
				else
					itemStack.stackTagCompound.setInteger("ticks", 0);
				itemStack.stackTagCompound.setInteger("use", 1);
			}
		}
		return itemStack;		
		
	}

	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player)
	{
		return false;
	}
	
	@Override
	public void addInformation(ItemStack par1, EntityPlayer player, List list, boolean par4) {}
	
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) 
	{
		if (this.proj != null)
		{
			if (par1ItemStack.stackTagCompound != null) 
			{
				int t = par1ItemStack.stackTagCompound.getInteger("ticks");      
				int tf = par1ItemStack.stackTagCompound.getInteger("ticksfin");    
				int u = par1ItemStack.stackTagCompound.getInteger("use");
				tf=this.proj.getItemTicks();
				if((u == 1) && (t > 0))
				{
					t--;
					if(this.proj.getEntityRepeat() && t > (tf/4)*3+(tf/11))
						par2World.spawnEntityInWorld(new Projectile(par2World, (EntityPlayer)par3Entity, this.proj));
					par1ItemStack.stackTagCompound.setInteger("ticks", t);	
				}
				else if(t <= 0)
				{
					par1ItemStack.stackTagCompound.setInteger("use", 0);
					par1ItemStack.stackTagCompound.setInteger("ticks", tf);
				}
			}
		}
	}
	
	@Override
	public boolean hitEntity(ItemStack par1, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
		if(this.proj != null)
		{
			if(this.proj.getEntityAttr() != null)
			{
				for(int i = 0; i < this.proj.getEntityAttr().length; i++)
				{
					if(par1.stackTagCompound != null)
					{
						if(par1.stackTagCompound.getInteger("use")==0)
						{
							if(this.proj.getEntityAttr()[i].equals("on_hit_action_mes"))
							{				
					            Random rand = new Random();
					        	par2EntityLivingBase.addPotionEffect(new PotionEffect(this.proj.getEntitySideEffect(), this.proj.getItemTicks(), this.proj.getEntityDmg()*5));
					        	//ItemStack stack = new ItemStack(ListMisc.Heart);
					    		/*if(!stack.hasTagCompound())
					    		{
					    			stack.setTagCompound(new NBTTagCompound());
					    			stack.stackTagCompound.setString("name", par2EntityLivingBase.getCommandSenderName());
					    		}
					        	((EntityPlayer)par3EntityLivingBase).inventory.addItemStackToInventory(stack);*/			
							}
						}
					}
				}
			}
			par1.stackTagCompound.setInteger("use", 1);
			par1.stackTagCompound.setInteger("ticks", this.proj.getItemTicks());	
		}
		return false;		
	}
	
	public Multimap getItemAttributeModifiers()
    {
		Multimap multimap = super.getItemAttributeModifiers();
		if(this.proj.getEntityAttr() != null)
		{
			for(int i = 0; i < this.proj.getEntityAttr().length; i++)
			{
				if(this.proj.getEntityAttr()[i].contains("sword_"))
				{
					double weaponDamage = Integer.parseInt(this.proj.getEntityAttr()[i].substring(6));
			        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", weaponDamage, 0));  
			        return multimap;
				}
			}
		}
		return multimap;
    }
	
	@Override
	public boolean onItemUse(ItemStack item, EntityPlayer player, World par3World, int X, int Y, int Z, int side, float xOffset, float yOffset, float zOffSet)
	{
		return false;
	}

	
}
