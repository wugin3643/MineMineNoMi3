package MineMineNoMi3;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class MainPotion extends Potion
{

	  private static ResourceLocation textureLocation = new ResourceLocation("mineminenomi:textures/gui/inventory.png");

	  public MainPotion(int par1, boolean par2, int par3)
	  {   
		  super(par1, par2, par3);
	  }
	  
	  @Override
	  public int getStatusIconIndex()
	  {
	    Minecraft.getMinecraft().getTextureManager().bindTexture(textureLocation);
	    return super.getStatusIconIndex();
	  }
	  
	  @Override
	  public Potion setIconIndex(int par1, int par2) {
	    super.setIconIndex(par1, par2);
	    return this;
	  }
}
