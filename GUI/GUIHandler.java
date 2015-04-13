package MineMineNoMi3.GUI;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import MineMineNoMi3.GUI.Containers.ContainerEnchantmentTable;
import MineMineNoMi3.Lists.ListMisc;
import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler
{
	
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getTileEntity(x, y, z);
		switch(id)
		{
			case 0: return id == 0 && world.getBlock(x, y, z) == ListMisc.EnchantmentTable ? new GUIEnchantmentTable(player, world, x, y, z) : null;
			case 1: return id == 1 ? new GUIPlayer(player) : null;
			case 2: return id == 2 ? new GUICC(player) : null;
		}
		return null;
	}
	
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tile_entity = world.getTileEntity(x, y, z);
		switch(id)
		{
			case 0: return id == 0 && world.getBlock(x, y, z) == ListMisc.EnchantmentTable ? new ContainerEnchantmentTable(player, world) : null;
		}
		return null;
	}
}
