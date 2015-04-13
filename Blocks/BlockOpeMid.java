package MineMineNoMi3.Blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import MineMineNoMi3.MainExtendedPlayer;
import MineMineNoMi3.Blocks.TileEntities.TileEntityOpe;
import MineMineNoMi3.Lists.ListMisc;
import MineMineNoMi3.Utils.UtilISphere;
import MineMineNoMi3.Utils.UtilSphere;

public class BlockOpeMid extends BlockContainer
{
		
		public BlockOpeMid()
        {
			super(Material.rock);
			setLightOpacity(0);
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

		public TileEntity createNewTileEntity(World par1World, int arg1)
		{
			return new TileEntityOpe();
		}
	    
		public boolean renderAsNormalBlock()
		{
			return false;
		}	
	    
		public void onEntityWalking(final World par1World, int par2, int par3, int par4, Entity par5Entity) 
		{
			if (!par1World.isRemote)
			{
				MainExtendedPlayer props = (MainExtendedPlayer)par5Entity.getExtendedProperties("ExtendedPlayer");
				if(par5Entity instanceof EntityPlayer)
				{
					if(props.getUsedFruit().equals("opeope"))
					{
						par1World.setBlock(par2, par3, par4, Blocks.dirt);
						UtilSphere.generate(par2, par3, par4, 15, new UtilISphere()
						{
							public void call(int x, int y, int z)
							{
								if(par1World.getBlock(x, y, z)==ListMisc.Ope)
								{
									par1World.setBlock(x, y, z, Blocks.air);
									TileEntityOpe.isRoom = false;
								}
							}
						});	
					}
				} 	
			}
	    }
	    
		public void registerIcons(IIconRegister reg)
		{
		   this.blockIcon = reg.registerIcon("mineminenomi:" + this.getUnlocalizedName().substring(5));
		}
}

