package MineMineNoMi3.Entities.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import MineMineNoMi3.Entities.Projectile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderProjectile extends Render
{
    double scaleX, scaleY, scaleZ, red, blue, green;
    private ModelBase model;
    
    public RenderProjectile() 
    {}
	
    public void render(Projectile entity, double par2, double par4, double par6, float par8, float par9)
    { 	
    	if(entity.getAbility().getEntityScale() != null)
    	{
	    	this.scaleX = entity.getAbility().getEntityScale()[0];
	    	this.scaleY = entity.getAbility().getEntityScale()[1];
	    	this.scaleZ = entity.getAbility().getEntityScale()[2];
    	}
    	if(entity.getAbility().getEntityColor() != null)
    	{
	    	this.red = entity.getAbility().getEntityColor().getRed();
	    	this.green = entity.getAbility().getEntityColor().getGreen();
	    	this.blue = entity.getAbility().getEntityColor().getBlue();
    	}
    	this.model = entity.getAbility().getEntityModel();   
    	
		GL11.glPushMatrix();
		GL11.glTranslated(par2, par4, par6);
		GL11.glDisable(3553);
		GL11.glEnable(3042);
		GL11.glBlendFunc(770, 771);
		
        GL11.glRotatef(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
		GL11.glColor4d(this.red/255, this.green/255, this.blue/255, 255);
		GL11.glScaled(this.scaleX, this.scaleY, this.scaleZ);
		
		if(entity.getAbility().getEntityModel() != null)
			this.model.render(entity, (float)par2, (float)par4, (float)par6, 0.0F, 0.0F, 0.0625F);
		
		GL11.glDisable(3042);
		GL11.glEnable(3553);
		GL11.glPopMatrix();
    }

    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.render(((Projectile)par1Entity), par2, par4, par6, par8, par9);
    }

	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return null;
	}

}
