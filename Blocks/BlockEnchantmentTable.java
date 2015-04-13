package MineMineNoMi3.Blocks;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import MineMineNoMi3.Helper;
import MineMineNoMi3.Main;
import MineMineNoMi3.MainBlock;
import MineMineNoMi3.Lists.ListCreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockEnchantmentTable extends MainBlock 
{
    @SideOnly(Side.CLIENT)
    private IIcon field_94461_a;

    public BlockEnchantmentTable()
    {
        super();
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.70F, 1.0F);
        this.setLightOpacity(0);
        this.setCreativeTab(ListCreativeTabs.tab4); 
    }
    
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("mineminenomi:dialtable_side");
        this.field_94461_a = par1IconRegister.registerIcon("mineminenomi:dialtable_top");
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }  

    public IIcon getIcon(int par1, int par2)
    {
        return par1 == 0 ? this.field_94461_a : (par1 == 1 ? this.field_94461_a : this.blockIcon);
    }
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
        if (par1World.isRemote)
            return true;
        else
        {
            par5EntityPlayer.openGui(Main.instance, 0, par1World, par2, par3, par4);
            return true;
        }
    }
}
