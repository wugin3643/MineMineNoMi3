package MineMineNoMi3;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class MainBlock extends Block 
{

	public MainBlock() 
	{
		super(Material.rock);
	}

	public void registerIcons(IIconRegister reg)
	{
	    this.blockIcon = reg.registerIcon("mineminenomi:" + this.getUnlocalizedName().substring(5));
	}
}
