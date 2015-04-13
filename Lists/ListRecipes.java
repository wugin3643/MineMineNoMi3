package MineMineNoMi3.Lists;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ListRecipes 
{

	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(ListMisc.EnchantmentTable, 1), new Object[] {"###","@#@","@@@", '#', ListMisc.DenseKairoseki, '@', Blocks.log});	
		
		GameRegistry.addRecipe(new ItemStack(ListMisc.KairosekiBlock, 1), new Object[] {"###","###","###", '#', ListMisc.Kairoseki});	
		GameRegistry.addShapelessRecipe(new ItemStack(ListMisc.Kairoseki, 9), new Object[] {ListMisc.KairosekiBlock});
		GameRegistry.addRecipe(new ItemStack(ListMisc.DenseKairoseki, 1), new Object[] {"#$.","$#.","...", '#', ListMisc.KairosekiBlock, '$', Items.iron_ingot});		
		GameRegistry.addRecipe(new ItemStack(ListMisc.BlackMetal, 1), new Object[] {"###","###","###", '#', ListMisc.DenseKairoseki});		
	}
	
}
