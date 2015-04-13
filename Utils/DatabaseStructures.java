package MineMineNoMi3.Utils;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import MineMineNoMi3.Lists.ListMisc;

public class DatabaseStructures 
{
	
	public static void createRoom(final EntityLivingBase entity)
	{
		if(!entity.worldObj.isRemote)
		{
			int X = (int)entity.posX;
			int Z = (int)entity.posZ;
			int Y = (int)(entity.posY - 1.0D);
			
			entity.worldObj.setBlock(X, Y, Z, ListMisc.OpeMid);
			
			UtilSphere.generate(X, Y, Z, 15, new UtilISphere()
		    {
		    	public void call(int x, int y, int z)
		    	{  
		    		if(entity.worldObj.getBlock(x, y, z) == Blocks.air || entity.worldObj.getBlock(x, y, z) == Blocks.grass || entity.worldObj.getBlock(x, y, z) == Blocks.water || 
		    				entity.worldObj.getBlock(x, y, z) == Blocks.lava || entity.worldObj.getBlock(x, y, z) == Blocks.ladder || entity.worldObj.getBlock(x, y, z) == Blocks.skull || 
		    				entity.worldObj.getBlock(x, y, z) == Blocks.carpet || entity.worldObj.getBlock(x, y, z) == Blocks.snow_layer)
		    		{
		    			entity.worldObj.setBlock(x, y, z, ListMisc.Ope);
		    		}
		    	}
		    });	
		}
	}
	
	public static void createIceBall(final EntityLivingBase entity)
	{
		int X = (int)entity.posX;
	    int Z = (int)entity.posZ;
	    int Y = (int)(entity.posY - 1.0D);
		
	    UtilSphere.generate(X, Y, Z, 6, new UtilISphere()
	    {
	      public void call(int x, int y, int z)
	      {  
	    	  if(entity.worldObj.getBlock(x, y, z)==Blocks.air)
	    	  {
	    	  	entity.worldObj.setBlock(x, y, z, Blocks.packed_ice);
	    	  }
	      }
	    });
	}
	
	public static void createIceAge(EntityPlayer player)
	{
		int X = (int)player.posX;
	    int Z = (int)player.posZ;
	    int Y = (int)(player.posY - 1.0D);
	    for (int i = -20; i <= 2; i++) 
	    {
	    	for (int k = -20; k <= 2; k++) 
	    	{
	    		for (int j = -10; j <= 2; j++) 
	    		{	        	
	    			if ((!player.worldObj.isAirBlock((X+10) + i, (Y+5)+j, (Z+10) + k)) || (!player.worldObj.isAirBlock((X+10) + i, ((Y+1)+5)+j, (Z+10) + k)) || (!player.worldObj.isAirBlock((X+10) + i, ((Y+2)+5)+j, (Z+10) + k)))
	    			{
	    				if((player.worldObj.getBlock((X+10) + i, (Y+5)+j, (Z+10) + k)!=Blocks.bedrock)&&(player.worldObj.getBlock((X+10) + i, (Y+5)+j, (Z+10) + k)!=ListMisc.Ope)&&(player.worldObj.getBlock((X+10) + i, (Y+5)+j, (Z+10) + k)!=ListMisc.OpeMid))
	    				{
	    					player.worldObj.setBlock((X+10) + i, (Y+5)+j, (Z+10) + k, Blocks.packed_ice);
	    				}
	    			}      	  
	    		}
	        }
	    }
	    int d0 = 20;
	    AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox((double)player.posX, (double)player.posY, (double)player.posZ, (double)(player.posX + 1), (double)(player.posY + 1), (double)(player.posZ + 1)).expand(d0, d0, d0);
	    axisalignedbb.maxY = (double)player.worldObj.getHeight();
	    List<EntityLivingBase> list = player.worldObj.getEntitiesWithinAABB(EntityLivingBase.class, axisalignedbb);
	    list.remove(player);
	    Iterator<EntityLivingBase> iterator = list.iterator();							 
	    EntityLivingBase entity;
	    while(iterator.hasNext())
	    {
	    	entity = (EntityLivingBase)iterator.next();
	    	entity.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id,200,5));
	    }		
	}
}
