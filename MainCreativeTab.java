package MineMineNoMi3;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MainCreativeTab extends CreativeTabs
{
	private Item itemTab;
	
    public MainCreativeTab(int id, String modid)
    {
        super(id, modid);
    }
    
    public MainCreativeTab(int id, String modid, Item item)
    {
        super(id, modid);
        this.itemTab = item;
    }
 
    @Override
    public Item getTabIconItem()
    {
        return this.itemTab;
    }
}