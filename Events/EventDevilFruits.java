package MineMineNoMi3.Events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import MineMineNoMi3.Config;
import MineMineNoMi3.Helper;
import MineMineNoMi3.Items.Ability;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventDevilFruits 
{
	
	@SubscribeEvent
	public void onLivingUpdate(LivingEvent.LivingUpdateEvent event)
	{
		if ((event.entity instanceof EntityPlayer))
		{	
			EntityPlayer player = (EntityPlayer)event.entity;
			for(int i = 100; i <= 200; i++)
			{
				for(int j = 200; j > 100; j--)
				{
					if(i!=j && player.isPotionActive(i) && player.isPotionActive(j) && !player.capabilities.isCreativeMode)
					{
						player.attackEntityFrom(DamageSource.wither, Float.POSITIVE_INFINITY);
						if(Config.allowDebugMode_actual)
						{
							Helper.sendText(player, "Potions: " + i + ":" + j + " - Should be DEAD");
						}
					}					
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onLivingDeath(LivingDeathEvent event)
	{
		if ((event.entity instanceof EntityPlayer))
		{	
			EntityPlayer player = (EntityPlayer)event.entity;
			
			for(int i=0; i < Helper.abilities.size(); i++)
			{
				player.inventory.consumeInventoryItem(Helper.abilities.get(i));
			}
		}
	}
	
	@SubscribeEvent
	public void onPlayerDrinkMilk(PlayerInteractEvent event)
	{
		if(event.action.RIGHT_CLICK_AIR != null && event.entityPlayer.inventory.getCurrentItem() != null && event.entityPlayer.inventory.getCurrentItem().getItem()==Items.milk_bucket && !event.world.isRemote)
		{
			for(int i=0; i < Helper.abilities.size(); i++)
			{
				event.entityPlayer.inventory.consumeInventoryItem(Helper.abilities.get(i));
			}
			
			for(int j=100; j < 256; j++)
			{
				event.entityPlayer.removePotionEffect(j);
			}	
		}
	}
	
	@SubscribeEvent	
	public void onTossedItem(ItemTossEvent event)
	{		
		Item i = event.entityItem.getEntityItem().getItem();
		
		if(i instanceof Ability)
		{
			event.setCanceled(true);
			
			if ((event.player instanceof EntityPlayer))
			{
				EntityPlayer player = (EntityPlayer)event.player;
				
				player.inventory.addItemStackToInventory(new ItemStack(Helper.abilities.get(Helper.abilities.indexOf(i))));
			}
		}		
	}
	
}
