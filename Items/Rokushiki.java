package MineMineNoMi3.Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import MineMineNoMi3.MainItem;
import MineMineNoMi3.Entities.Projectile;
import MineMineNoMi3.Utils.EnumAbility;

public class Rokushiki extends MainItem
{
	private String type;
	
	public Rokushiki(String type)
	{
		this.type = type;
	}
		
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) 
	{  
		boolean flag = !world.isRemote;
		
		if(this.type.equals("soru") && flag)
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5 , 3));

		if(this.type.equals("tekkai") && flag)
		{
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 10));
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 100));
		}

		if(this.type.equals("kamie") && !player.capabilities.isCreativeMode && flag)
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 20));
		
		if(this.type.equals("rankyaku"))
			world.spawnEntityInWorld(new Projectile(world, player, EnumAbility.RANKYAKU));
		
		return itemStack;
	}
	
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player)
	{
		return false;
	}
}
