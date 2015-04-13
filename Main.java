package MineMineNoMi3;

import java.io.File;

import MineMineNoMi3.GUI.GUIHandler;
import MineMineNoMi3.Lists.ListCreativeTabs;
import MineMineNoMi3.Lists.ListDF;
import MineMineNoMi3.Lists.ListEntities;
import MineMineNoMi3.Lists.ListForge;
import MineMineNoMi3.Lists.ListMisc;
import MineMineNoMi3.Lists.ListPotions;
import MineMineNoMi3.Lists.ListRecipes;
import MineMineNoMi3.Packets.PacketPipeline;
import MineMineNoMi3.Proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = "mineminenomi", name = "Mine Mine no Mi", version = "0.3.0")

public class Main 
{

	@Instance("mineminenomi")
	public static Main instance;	
	@SidedProxy(clientSide = "MineMineNoMi3.Proxy.ClientProxy", serverSide = "MineMineNoMi3.Proxy.CommonProxy")
	public static CommonProxy proxy;

	public static final PacketPipeline packetPipeline = new PacketPipeline();
	public static GUIHandler guiHandler = new GUIHandler();
	private File config;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{	
		ListPotions.expandPotions();
		config = new File(event.getModConfigurationDirectory(), "mineminenomi3.cfg");
		Config.initConfig(config);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		packetPipeline.initialise();
		
		ListEntities.init();
		
		proxy.render();
		proxy.tick();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, guiHandler);
		
		ListPotions.init();
		ListMisc.init();
		ListDF.init();
		ListCreativeTabs.init();
		ListRecipes.init();
		ListForge.init();
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		packetPipeline.postInitialise();
	}
	
}
