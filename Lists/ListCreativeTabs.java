package MineMineNoMi3.Lists;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import MineMineNoMi3.MainCreativeTab;
import MineMineNoMi3.Items.ItemCoreSword;
import MineMineNoMi3.Utils.EnumToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ListCreativeTabs 
{

	
	public static void init()
	{
		GameRegistry.registerItem(tab1Icon, tab1Icon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tab2Icon, tab2Icon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tab3Icon, tab3Icon.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tab4Icon, tab4Icon.getUnlocalizedName().substring(5));
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.tab1", "en_US", "Devil Fruits");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tab2", "en_US", "Weapons");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tab3", "en_US", "Speical Techniques");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tab4", "en_US", "Miscellaneous");
	}
	
    private static Item tab1Icon = new ItemCoreSword(EnumToolMaterials.p7).setUnlocalizedName("tab1Icon").setTextureName("mineminenomi:old/merameranomi").setCreativeTab(null); 
    private static Item tab2Icon = new ItemCoreSword(EnumToolMaterials.p7).setUnlocalizedName("tab2Icon").setTextureName("mineminenomi:old/yoru").setCreativeTab(null); 
    private static Item tab3Icon = new ItemCoreSword(EnumToolMaterials.p7).setUnlocalizedName("tab3Icon").setTextureName("mineminenomi:old/tekkai").setCreativeTab(null); 
    private static Item tab4Icon = new ItemCoreSword(EnumToolMaterials.p7).setUnlocalizedName("tab4Icon").setTextureName("mineminenomi:old/shadow").setCreativeTab(null); 
    
    public static CreativeTabs tab1 = new MainCreativeTab(CreativeTabs.getNextID(), "tab1", tab1Icon);
    public static CreativeTabs tab2 = new MainCreativeTab(CreativeTabs.getNextID(), "tab2", tab2Icon);
    public static CreativeTabs tab3 = new MainCreativeTab(CreativeTabs.getNextID(), "tab3", tab3Icon);
    public static CreativeTabs tab4 = new MainCreativeTab(CreativeTabs.getNextID(), "tab4", tab4Icon);
	
	
}
