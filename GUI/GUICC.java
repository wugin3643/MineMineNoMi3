package MineMineNoMi3.GUI;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import MineMineNoMi3.Helper;
import MineMineNoMi3.MainExtendedPlayer;
import MineMineNoMi3.Lists.ListMisc;

public class GUICC extends GuiScreen
{
	private ResourceLocation texture = new ResourceLocation("mineminenomi", "textures/gui/gui_blank.png");
	private EntityPlayer player;
	private ItemStack helm, boots, chestplate, leggings;
	private int page = 0;
	
	public GUICC(EntityPlayer player)
	{
		this.player = player;
	}
	
	public void drawScreen(int x, int y, float f)
	{
		drawDefaultBackground();
    
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		MainExtendedPlayer props = MainExtendedPlayer.get(this.player);
    
		Minecraft.getMinecraft().getTextureManager().bindTexture(this.texture);
    
		int posX = (this.width - 256) / 2;
		int posY = (this.height - 256) / 2;
		drawTexturedModalRect(posX, posY + 50, 0, 0, 256, 256);
		
		GL11.glPushMatrix();
		double i = 1.5;
		GL11.glScaled(i, i, i);
		
		if(this.page == 0)
			mc.fontRenderer.drawStringWithShadow("Choose a faction ", posX - 20, posY + 42, Helper.hexToRGB("FFFFFF"));
		if(this.page == 1)	
			mc.fontRenderer.drawStringWithShadow("Choose a race ", posX - 20, posY + 42, Helper.hexToRGB("FFFFFF"));
		if(this.page == 2)	
			mc.fontRenderer.drawStringWithShadow("Choose a job ", posX - 20, posY + 42, Helper.hexToRGB("FFFFFF"));
		
		GL11.glPopMatrix();
		
		Helper.renderPlayerModelInGUI(posX+190, posY+200 , 67, 16, 0, this.player);

		super.drawScreen(x, y, f);
	}
	
	public void initGui()
	{
		int posX = (this.width - 256) / 2;
		int posY = (this.height - 256) / 2;

		this.buttonList.add(new GuiButton(100, posX + 70, posY + 190, 40, 20, "Next >"));
		
		this.buttonList.add(new GuiButton(101, posX + 10, posY + 190, 40, 20, "< Prev"));
		
		this.buttonList.add(new GuiButton(102, posX + 70, posY + 190, 40, 20, "Finish"));
		
		if(this.page == 0)
		{
			this.buttonList.add(new GuiButton(0, posX + 10, posY + 160, 100, 20, "Marine"));
			this.buttonList.add(new GuiButton(1, posX + 10, posY + 80, 100, 20, "Pirate"));
			this.buttonList.add(new GuiButton(2, posX + 10, posY + 120, 100, 20, "Bounty Hunter"));
		}
		if(this.page == 1)
		{
			this.buttonList.add(new GuiButton(4, posX + 10, posY + 160, 100, 20, "Fishman"));
			this.buttonList.add(new GuiButton(5, posX + 10, posY + 80, 100, 20, "Human"));
			this.buttonList.add(new GuiButton(6, posX + 10, posY + 120, 100, 20, "Cyborg"));		
		}
		if(this.page == 2)
		{
			this.buttonList.add(new GuiButton(8, posX + 10, posY + 160, 100, 20, "Sniper"));
			this.buttonList.add(new GuiButton(9, posX + 10, posY + 80, 100, 20, "Swordsman"));
			this.buttonList.add(new GuiButton(10, posX + 10, posY + 120, 100, 20, "Medic"));
		}
		
		this.helm = this.player.inventory.armorInventory[3];
		this.chestplate = this.player.inventory.armorInventory[2];
		this.leggings = this.player.inventory.armorInventory[1];
		this.boots = this.player.inventory.armorInventory[0];
	}
	
	public void onGuiClosed()
	{
		
		
		this.player.inventory.armorInventory[3] = this.helm;
		this.player.inventory.armorInventory[2] = this.chestplate;
		this.player.inventory.armorInventory[1] = this.leggings;
		this.player.inventory.armorInventory[0] = this.boots;
	}
	
	public void updateScreen()
	{
		if(this.page == 0)
			((GuiButton)this.buttonList.get(1)).visible = false;
		if(this.page == 2)
			((GuiButton)this.buttonList.get(0)).visible = false;
		if(this.page != 2)
			((GuiButton)this.buttonList.get(2)).visible = false;
	}
	
	public void actionPerformed(GuiButton button)
	{
		MainExtendedPlayer props = MainExtendedPlayer.get(this.player);
		
		switch (button.id)
		{
		case 100:
			if(this.page < 2)
				this.page++;
			this.player.inventory.armorInventory[3] = this.helm;
			this.player.inventory.armorInventory[2] = this.chestplate;
			this.player.inventory.armorInventory[1] = this.leggings;
			this.player.inventory.armorInventory[0] = this.boots;
			this.mc.displayGuiScreen((GuiScreen)this);
			break;
		case 101:
			if(this.page > 0)
				this.page--;
			this.player.inventory.armorInventory[3] = this.helm;
			this.player.inventory.armorInventory[2] = this.chestplate;
			this.player.inventory.armorInventory[1] = this.leggings;
			this.player.inventory.armorInventory[0] = this.boots;
			this.mc.displayGuiScreen((GuiScreen)this);
			break;
		case 0:
			this.player.inventory.armorInventory[3] = new ItemStack(ListMisc.MarineHelm);
			this.player.inventory.armorInventory[2] = new ItemStack(ListMisc.MarineChestplate);
			this.player.inventory.armorInventory[1] = new ItemStack(ListMisc.MarineLeggings);
			this.player.inventory.armorInventory[0] = new ItemStack(ListMisc.MarineBoots);
			props.setFaction("Marine");
			break;
		case 1:
			this.player.inventory.armorInventory[3] = null;
			this.player.inventory.armorInventory[2] = new ItemStack(ListMisc.PirateChestplate);
			this.player.inventory.armorInventory[1] = new ItemStack(ListMisc.PirateLeggings);
			this.player.inventory.armorInventory[0] = new ItemStack(ListMisc.PirateBoots);
			props.setFaction("Pirate");
			break;
		case 2:
			for(int i = 0; i < this.player.inventory.armorInventory.length; i++)
				this.player.inventory.armorInventory[i] = null;
			props.setFaction("Bounty Hunter");
			break;
		}
	}
	
	public boolean doesGuiPauseGame()
	{
		return false;
	}
}
