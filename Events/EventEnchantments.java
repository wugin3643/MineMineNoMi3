package MineMineNoMi3.Events;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import MineMineNoMi3.Lists.ListPotions;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventEnchantments
{
	@SubscribeEvent
	public void onLivingAttackEvent(LivingAttackEvent event)
	{
		if (((event.source.getEntity() instanceof EntityPlayer)) && ((event.entityLiving instanceof EntityLiving)))
		{
			EntityPlayer player = (EntityPlayer)event.source.getEntity();
			EntityLiving living = (EntityLiving)event.entityLiving;
			ItemStack hand = player.inventory.getCurrentItem();
			
			if(hand != null)
			{
				if(!living.worldObj.isRemote)
				{
					if (EnchantmentHelper.getEnchantmentLevel(ListPotions.dialImpact.effectId, player.getHeldItem()) == 1)
					{
						int r = living.worldObj.rand.nextInt(10);
						if(r < 1)
						{	    			  
							player.addPotionEffect(new PotionEffect(Potion.resistance.id, 40, 10)); 
							living.worldObj.createExplosion(living, living.posX, living.posY, living.posZ, 2, true);
						}
					}
					
					if (EnchantmentHelper.getEnchantmentLevel(ListPotions.dialFlash.effectId, player.getHeldItem()) == 1)
					{    			  
						living.addPotionEffect(new PotionEffect(Potion.nightVision.id, 200, 10)); 
						living.addPotionEffect(new PotionEffect(Potion.blindness.id, 200, 10)); 
						living.addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 10)); 
					}
				}
			}
		}
	}
}