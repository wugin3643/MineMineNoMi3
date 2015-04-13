package MineMineNoMi3.Lists;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import MineMineNoMi3.Config;
import MineMineNoMi3.MainBlock;
import MineMineNoMi3.MainItem;
import MineMineNoMi3.Blocks.BlockEnchantmentTable;
import MineMineNoMi3.Blocks.BlockOpe;
import MineMineNoMi3.Blocks.BlockOpeMid;
import MineMineNoMi3.Items.CharacterCreator;
import MineMineNoMi3.Items.Dial;
import MineMineNoMi3.Items.ItemCoreArmor;
import MineMineNoMi3.Items.ItemCoreSword;
import MineMineNoMi3.Items.Rokushiki;
import MineMineNoMi3.Utils.EnumToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ListMisc 
{	
	public static Block Ope = new BlockOpe();
	public static Block OpeMid = new BlockOpeMid();
	public static Block KairosekiBlock = new MainBlock();
	public static Block EnchantmentTable = new BlockEnchantmentTable();
	
	public static Item CharacterCreator = new CharacterCreator();
	public static Item Kairoseki = new MainItem(); 
	public static Item DenseKairoseki = new MainItem();
	public static Item BlackMetal = new MainItem();

	public static Item DialDefault = new MainItem();
	public static Item DialFire = new Dial("fire", 2);
	public static Item DialEisen = new MainItem();
	public static Item DialImpact = new Dial("impact", 2);
	public static Item DialMilky = new MainItem();
	public static Item DialAxe = new Dial("axe", 4);
	public static Item DialBreath = new MainItem();
	public static Item DialReject = new Dial("reject", 1);
	public static Item DialFlash = new MainItem();
	
	public static Item Soru = new Rokushiki("soru");
	public static Item Tekkai = new Rokushiki("tekkai");
 	public static Item Geppo = new Rokushiki("geppo");
 	public static Item Rankyaku = new Rokushiki("rankyaku");
 	public static Item Shigan = new Rokushiki("shigan");
 	public static Item Kamie = new Rokushiki("kamie");
	
	public static Item Bullets = new MainItem(); 
	public static Item KairosekiBullets = new MainItem();
	public static Item KujaArrow = new MainItem();
	
	public static Item MarineHelm = new ItemCoreArmor(EnumToolMaterials.marine_armor, 0);
	public static Item MarineChestplate = new ItemCoreArmor(EnumToolMaterials.marine_armor, 1);
	public static Item MarineLeggings = new ItemCoreArmor(EnumToolMaterials.marine_armor, 2);
	public static Item MarineBoots = new ItemCoreArmor(EnumToolMaterials.marine_armor, 3);
	
	public static Item PirateChestplate = new ItemCoreArmor(EnumToolMaterials.pirate_armor, 1);
	public static Item PirateLeggings = new ItemCoreArmor(EnumToolMaterials.pirate_armor, 2);
	public static Item PirateBoots = new ItemCoreArmor(EnumToolMaterials.pirate_armor, 3);
	
	public static Item basicSword = new ItemCoreSword(EnumToolMaterials.p7);
	
	public static void init()
	{
		addITEM(Kairoseki, "Kairoseki", ListCreativeTabs.tab4);
		addITEM(DenseKairoseki, "Dense Kairoseki", ListCreativeTabs.tab4);
		addITEM(BlackMetal, "Black Metal", ListCreativeTabs.tab4);
		
 		addITEM(KujaArrow, "Kuja Arrow", ListCreativeTabs.tab2);
 		addITEM(Bullets, "Bullets", ListCreativeTabs.tab2);
 		addITEM(KairosekiBullets, "Kairoseki Bullets", ListCreativeTabs.tab2);
 		
 		addITEM(MarineHelm, "Marine Helm", ListCreativeTabs.tab4);
 		addITEM(MarineChestplate, "Marine Chestplate", ListCreativeTabs.tab4);
 		addITEM(MarineLeggings, "Marine Leggings", ListCreativeTabs.tab4);
 		addITEM(MarineBoots, "Marine Boots", ListCreativeTabs.tab4);
 	
 		addITEM(PirateChestplate, "Pirate Chestplate", ListCreativeTabs.tab4);
 		addITEM(PirateLeggings, "Pirate Leggings", ListCreativeTabs.tab4);
 		addITEM(PirateBoots, "Pirate Boots", ListCreativeTabs.tab4);
 		
 		addITEM(basicSword, "Basic Sword", ListCreativeTabs.tab2); 		
 		addITEM(CharacterCreator, "Character Creator", ListCreativeTabs.tab4);
 		
 		addITEM(Soru, "Soru", ListCreativeTabs.tab3); 	
		addITEM(Tekkai, "Tekkai", ListCreativeTabs.tab3); 
 		addITEM(Geppo, "Geppo", ListCreativeTabs.tab3); 	
		addITEM(Rankyaku, "Rankyaku", ListCreativeTabs.tab3);
 		addITEM(Shigan, "Shigan", ListCreativeTabs.tab3); 	
		addITEM(Kamie, "Kamie", ListCreativeTabs.tab3);	
		
 		addITEM(DialDefault, "Default Dial", ListCreativeTabs.tab4);
 		addITEM(DialFire, "Fire Dial", ListCreativeTabs.tab4);
 		addITEM(DialImpact, "Impact Dial", ListCreativeTabs.tab4);
 		addITEM(DialEisen, "Eisen Dial", ListCreativeTabs.tab4);
 		addITEM(DialMilky, "Milky Dial", ListCreativeTabs.tab4);
 		addITEM(DialAxe, "Axe Dial", ListCreativeTabs.tab4);
 		addITEM(DialBreath, "Breath Dial", ListCreativeTabs.tab4);
 		addITEM(DialReject, "Reject Dial", ListCreativeTabs.tab4);		
 		addITEM(DialFlash, "Flash Dial", ListCreativeTabs.tab4);			
 		
 		addBLOCK(Ope, "Ope", Float.POSITIVE_INFINITY, null, null);
 		addBLOCK(OpeMid, "Ope Mid", Float.POSITIVE_INFINITY, null, null);
 		addBLOCK(KairosekiBlock, "Kairoseki Block", 3.5F, null, ListCreativeTabs.tab4);
 		addBLOCK(EnchantmentTable, "Kairoseki Table", 3.5F, null, ListCreativeTabs.tab4);
	}
	
	
	private static void addITEM(Item item,String localizedName, CreativeTabs tab)
	{	
		String truename = localizedName.replaceAll("\\s+","").replaceAll("'", "").replaceAll("-", "").toLowerCase();
		if(!Config.hdTextures_actual)
			item.setUnlocalizedName(truename).setTextureName("mineminenomi:old/"+truename).setCreativeTab(tab);
		else
			item.setUnlocalizedName(truename).setTextureName("mineminenomi:new/"+truename).setCreativeTab(tab);		
		GameRegistry.registerItem(item, truename);
		LanguageRegistry.addName(item, localizedName);
	}
	
	private static void addBLOCK(Block item, String localizedName, float hard, Class<? extends TileEntity> tile, CreativeTabs tab)
	{	
		String truename = localizedName.replaceAll("\\s+","").replaceAll("'", "").replaceAll("-", "").toLowerCase();
		item.setBlockName(truename).setBlockTextureName("mineminenomi:"+truename).setHardness(hard).setCreativeTab(tab);
		GameRegistry.registerBlock(item, truename);
		if(tile != null)
			GameRegistry.registerTileEntity(tile, localizedName);
		LanguageRegistry.addName(item, localizedName);
	}
}
