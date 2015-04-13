package MineMineNoMi3.Entities.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBall extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public ModelBall()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(-2F, -2F, -2F, 4, 4, 4);
      Shape1.setRotationPoint(0F, 0F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(-1.5F, -2.5F, -1.5F, 3, 1, 3);
      Shape2.setRotationPoint(0F, 0F, 0F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(-1.5F, 1.5F, -1.5F, 3, 1, 3);
      Shape3.setRotationPoint(0F, 0F, 0F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(-1.5F, -1.5F, -2.5F, 3, 3, 1);
      Shape4.setRotationPoint(0F, 0F, 0F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(-1.5F, -1.5F, 1.5F, 3, 3, 1);
      Shape5.setRotationPoint(0F, 0F, 0F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(-2.5F, -1.5F, -1.5F, 1, 3, 3);
      Shape6.setRotationPoint(0F, 0F, 0F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(1.5F, -1.5F, -1.5F, 1, 3, 3);
      Shape7.setRotationPoint(0F, 0F, 0F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
  }
}
