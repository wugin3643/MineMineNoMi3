package MineMineNoMi3.Entities.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCube extends ModelBase
{
	ModelRenderer box;
	  
	public ModelCube()
	{
		this.textureWidth = 32;
		this.textureHeight = 16;
		
		this.box = new ModelRenderer(this);
		this.box.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
	}
  
	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
	{
		super.render(par1Entity, par2, par3, par4, par5, par6, par7);
		this.box.render(0.0625F);
	}
  
	public void render()
  	{
		render(null, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
  	}
}
