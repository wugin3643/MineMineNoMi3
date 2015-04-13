package MineMineNoMi3.Items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import MineMineNoMi3.Utils.EnumToolMaterials;

public class ItemCoreArmor extends ItemArmor 
{

	private ArmorMaterial mat;
	
	public ItemCoreArmor(ArmorMaterial material, int type) 
	{
		super(material, 0, type);
		this.mat = material;
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		return "mineminenomi:textures/armor/" + this.mat.name() + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}

}
