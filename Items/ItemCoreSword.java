package MineMineNoMi3.Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import MineMineNoMi3.Helper;
import MineMineNoMi3.MainExtendedPlayer;
import MineMineNoMi3.Entities.Groups.Special.EntityRoom;
import MineMineNoMi3.Entities.Models.ModelX;
import MineMineNoMi3.Entities.Render.RenderMobType;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCoreSword extends ItemSword
{
	
	public double weaponDamage;
	private final Item.ToolMaterial toolMaterial;

	public ItemCoreSword(Item.ToolMaterial material)
	{
		super(material);
		this.toolMaterial = material;
		this.maxStackSize = 1;
		this.weaponDamage = material.getDamageVsEntity();
		this.setMaxDamage((int)Float.POSITIVE_INFINITY);
	}  	

	public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity)
	{	
    	return false;
	}

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
    	MainExtendedPlayer props = MainExtendedPlayer.get(par3EntityPlayer);    	

        return par1ItemStack;
    }
    
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
		return true;  
	}
    
    public void onUpdate(ItemStack itemStack, World par2World, Entity par3Entity, int par4, boolean par5)
    {

    }
    
    
    
    
	public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) 
	{

	}
    
	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
		return true;
	}
    
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
    	return EnumAction.block;
	}
	
	public Multimap getItemAttributeModifiers()
    {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", this.weaponDamage, 0)); 
        return multimap;
    }

}
