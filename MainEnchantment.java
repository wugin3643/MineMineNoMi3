package MineMineNoMi3;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class MainEnchantment extends Enchantment
{
	int max;

	public MainEnchantment(int par1, int par2, EnumEnchantmentType par3, String par4, int par5)
	{
		super(par1, par2, par3);
		setName(par4);
		this.max = par5;
	}

	public int getMinEnchantability(int par1)
	{
		return 10 + 20 * (par1 - 1);
	}

	public int getMaxEnchantability(int par1)
	{
		return super.getMinEnchantability(par1) + 50;
	}

	public int getMaxLevel()
	{
		return this.max;
	}

	public boolean canApply(ItemStack stack)
	{
		if ((stack.getItem() instanceof ItemSword))
			return true;
		return false;
	}

	public boolean canApplyAtEnchantingTable(ItemStack stack)
	{
		return false;
	}

	public boolean isAllowedOnBooks()
	{
		return false;
	}
}
