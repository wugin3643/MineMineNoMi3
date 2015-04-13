package MineMineNoMi3.Lists;

import net.minecraftforge.common.MinecraftForge;
import MineMineNoMi3.MainKeys;
import MineMineNoMi3.Events.EventDevilFruits;
import MineMineNoMi3.Events.EventDoriki;
import MineMineNoMi3.Events.EventEnchantments;
import MineMineNoMi3.Events.EventExtendedPlayer;
import cpw.mods.fml.common.FMLCommonHandler;

public class ListForge 
{
	public static void init()
	{
		
		MinecraftForge.EVENT_BUS.register(new EventExtendedPlayer());
		MinecraftForge.EVENT_BUS.register(new EventDevilFruits());
		MinecraftForge.EVENT_BUS.register(new EventEnchantments());
		MinecraftForge.EVENT_BUS.register(new EventDoriki());
		
		if(FMLCommonHandler.instance().getEffectiveSide().isClient())
			FMLCommonHandler.instance().bus().register(new MainKeys());
		MainKeys.init();
		
	}
}
