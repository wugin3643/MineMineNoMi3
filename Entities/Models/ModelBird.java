package MineMineNoMi3.Entities.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBird extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public ModelBird()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 5, 5, 7);
      Shape1.setRotationPoint(0F, 0F, -9F);
      Shape1.setTextureSize(64, 64);

      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 3, 2, 3);
      Shape2.setRotationPoint(1F, 2F, -12F);
      Shape2.setTextureSize(64, 64);

      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(0F, 0F, 0F, 9, 7, 17);
      Shape3.setRotationPoint(-2F, -1F, -2F);
      Shape3.setTextureSize(64, 64);

      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 1, 2, 4);
      Shape4.setRotationPoint(5F, -3F, 1F);
      Shape4.setTextureSize(64, 64);

      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 17, 1, 10);
      Shape5.setRotationPoint(5.133333F, -3F, 1F);
      Shape5.setTextureSize(64, 64);

      Shape6 = new ModelRenderer(this, 0, 0);
      Shape6.addBox(0F, 0F, 0F, 1, 2, 4);
      Shape6.setRotationPoint(-1F, -3F, 1F);
      Shape6.setTextureSize(64, 64);

      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 17, 1, 10);
      Shape7.setRotationPoint(-0.2F, -2F, 1F);
      Shape7.setTextureSize(64, 64);

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
