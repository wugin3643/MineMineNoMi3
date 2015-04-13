package MineMineNoMi3.GUI.Containers;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import MineMineNoMi3.Lists.ListMisc;
import MineMineNoMi3.Lists.ListPotions;

public class ContainerEnchantmentTable extends Container
{	
	private World world;
	private EntityPlayer player;
	
	public IInventory dialEnch = new InventoryBasic("DialEnchant", true, 1)
	{
		public int getInventoryStackLimit(){return 1;}
		public void markDirty()
		{
			super.markDirty();
			ContainerEnchantmentTable.this.onCraftMatrixChanged(this);
		}
	};
    
	public IInventory dialSlots = new InventoryBasic("DialSlots", true, 3)
	{
		public int getInventoryStackLimit(){return 1;}
		public void markDirty()
		{
			super.markDirty();
			ContainerEnchantmentTable.this.onCraftMatrixChanged(this);
		}
	};

	public ContainerEnchantmentTable(EntityPlayer player, World world)
	{
		this.world = world;
		this.player = player;
		
        this.addSlotToContainer(new Slot(this.dialEnch, 0, 78, 52));
		
        this.addSlotToContainer(new Slot(this.dialSlots, 0, 112, 10));
        this.addSlotToContainer(new Slot(this.dialSlots, 1, 78, 10));
        this.addSlotToContainer(new Slot(this.dialSlots, 2, 44, 10));
        
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (int i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 142));
        }
	}

	public void onCraftMatrixChanged(IInventory par1IInventory)
	{
		ItemStack var3 = this.dialEnch.getStackInSlot(0);
		
		if(!this.world.isRemote && this.dialEnch.getStackInSlot(0) != null && this.dialSlots.getStackInSlot(0) != null && this.dialSlots.getStackInSlot(1) != null && this.dialSlots.getStackInSlot(2) != null)
		{	
			for(int i = 0; i < this.dialSlots.getSizeInventory(); i++)
			{
				if(!var3.isItemEnchanted())
				{
					if(var3.getItem() instanceof ItemSword)
					{
				        if(this.dialSlots.getStackInSlot(i).getItem() == ListMisc.DialFire)	
				        	var3.addEnchantment(Enchantment.fireAspect, 1);
				        if(this.dialSlots.getStackInSlot(i).getItem() == ListMisc.DialImpact)	
				        	var3.addEnchantment(ListPotions.dialImpact, 1);
				        if(this.dialSlots.getStackInSlot(i).getItem() == ListMisc.DialEisen)	
				        	var3.addEnchantment(Enchantment.sharpness, 3);
				        if(this.dialSlots.getStackInSlot(i).getItem() == ListMisc.BlackMetal)	
				        {
				        	var3.addEnchantment(Enchantment.sharpness, 10);
				        	var3.addEnchantment(Enchantment.sharpness, 2);
				        }
					}
					if(var3.getItem() instanceof ItemArmor)
					{
				        if(this.dialSlots.getStackInSlot(i).getItem() == ListMisc.DialFire)	
				        	var3.addEnchantment(Enchantment.fireProtection, 1);
					}
				}
				this.dialSlots.setInventorySlotContents(i, null);
			}			
		}
	}
	

        

	public boolean canInteractWith(EntityPlayer arg0) 
	{
		return true;
	}
	
    public void onContainerClosed(EntityPlayer player)
    {
        super.onContainerClosed(player);

        if (!this.world.isRemote)
        {            
            for(int i = 0; i < this.dialSlots.getSizeInventory(); i++)
            {
            	if(this.dialSlots.getStackInSlot(i) != null)
            	{
            		player.dropPlayerItemWithRandomChoice(this.dialSlots.getStackInSlot(i), false);
            	}
            }
            
        	ItemStack slot1 = this.dialEnch.getStackInSlotOnClosing(0);
        	
            if (slot1 != null)
            {
                player.dropPlayerItemWithRandomChoice(slot1, false);
            }
        }
    }	
}