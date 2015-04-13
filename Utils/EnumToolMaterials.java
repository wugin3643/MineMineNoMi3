package MineMineNoMi3.Utils;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class EnumToolMaterials 
{
	  public static Item.ToolMaterial p15 = EnumHelper.addToolMaterial("power", 2, 2, 6.0F, 10, 14);
	  public static Item.ToolMaterial p11 = EnumHelper.addToolMaterial("power", 2, 2, 6.0F, 7, 14);
	  public static Item.ToolMaterial p9 = EnumHelper.addToolMaterial("power", 2, 2, 6.0F, 4, 14);
	  public static Item.ToolMaterial p7 = EnumHelper.addToolMaterial("power", 2, 2, 6.0F, 2, 14);
	  
	  public static ArmorMaterial marine_armor = EnumHelper.addArmorMaterial("marine", 12, new int[] {1, 2, 1, 1}, 15);
	  public static ArmorMaterial pirate_armor = EnumHelper.addArmorMaterial("pirate", 12, new int[] {1, 2, 1, 1}, 15);
	  
	  public static EnumEnchantmentType impactDial = EnumHelper.addEnchantmentType("dialimpact");
	  public static EnumEnchantmentType flashDial = EnumHelper.addEnchantmentType("dialflash");
	  public static EnumEnchantmentType axeDial = EnumHelper.addEnchantmentType("dialaxe");
	  public static EnumEnchantmentType kairoseki = EnumHelper.addEnchantmentType("kairoseki");
	
}
