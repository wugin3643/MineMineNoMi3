package MineMineNoMi3.Blocks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import MineMineNoMi3.MainBlock;

public class BlockOpe extends MainBlock
{		
		public BlockOpe()
        {
                super();
                setLightOpacity(0);
        }
		
	    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	    {
	    	if(par5Entity instanceof EntityPlayer)
	    	{
	    		EntityPlayer player = (EntityPlayer)par5Entity;
	    	}
	    }
	    
		public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
		{			
			return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, 1 - par5);
		}	
		
	    public int getRenderBlockPass()
	    {
	        return 1;
	    }
	    
	    public boolean isOpaqueCube()
	    {
	        return false;
	    }

	    public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	    
	    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	    {        
	    	return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);
	    } 
}
