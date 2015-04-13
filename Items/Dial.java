package MineMineNoMi3.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import MineMineNoMi3.MainItem;
import MineMineNoMi3.Entities.Projectile;
import MineMineNoMi3.Utils.EnumAbility;

public class Dial extends MainItem
{

	private String type;
	
	public Dial(String type, int uses)
	{
		this.type = type;
		this.maxStackSize = 16;
		this.setMaxDamage(uses);
	}
	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) 
	{  
		boolean flag = !world.isRemote;
		
		if(this.type.equals("axe"))
			world.spawnEntityInWorld(new Projectile(world, player, EnumAbility.AXEDIAL));
			
		if(this.type.equals("reject") && flag)
		{
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 50, 10));
			world.createExplosion(player, player.posX, player.posY, player.posZ, (float)6, true);
			player.attackEntityFrom(DamageSource.wither, player.getHealth()/2);	
			itemStack.damageItem(1, player);
		}
			
		if(this.type.equals("impact") && flag)
		{
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 50, 10));
			world.createExplosion(player, player.posX, player.posY, player.posZ, (float)3, true);			
		}
			
		if(this.type.equals("fire") && flag)
		{
			Vec3 look = player.getLookVec();
			EntitySmallFireball fireball = new EntitySmallFireball(world, player, 1, 1, 1);
			fireball.setPosition(
					player.posX,
					player.posY+1.5,
					player.posZ);
			fireball.accelerationX = look.xCoord * 0.2;
			fireball.accelerationY = look.yCoord * 0.2;
			fireball.accelerationZ = look.zCoord * 0.2;
			world.spawnEntityInWorld(fireball);		  				
		}
		
		itemStack.damageItem(1, player);
		return itemStack;
	}
	
}
