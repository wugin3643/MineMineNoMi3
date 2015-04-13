package MineMineNoMi3.Blocks.TileEntities;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

public class TileEntityOpe extends TileEntity
{

	public void updateEntity()
	{
		this.checkPlayers();
	}
    
	public static boolean isRoom = false;
	
	public void checkPlayers()
	{
		if(!this.worldObj.isRemote)
		{
	    	int d0 = 13;
	    	AxisAlignedBB axisalignedbb = AxisAlignedBB.getBoundingBox((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)(this.xCoord + 1), (double)(this.yCoord + 1), (double)(this.zCoord + 1)).expand(d0, d0, d0);
	    	axisalignedbb.maxY = (double)this.worldObj.getHeight();
	    	List list = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class, axisalignedbb);
	    	Iterator iterator = list.iterator();
	    	EntityPlayer entityplayer;
	
	    	if(iterator.hasNext())
	    	{
	    		entityplayer = (EntityPlayer)iterator.next();
	    		this.isRoom = true;
	    	}
	    	else
	    		this.isRoom = false;       
    	}
	}
	
}
