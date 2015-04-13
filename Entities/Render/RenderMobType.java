package MineMineNoMi3.Entities.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMobType extends RenderLiving
{
	private ResourceLocation texture;
	private float scale;
	
	public RenderMobType(ModelBase model, float scale, String tex)
	{
		super(model, 0);
		this.scale = scale;
		this.texture = new ResourceLocation("mineminenomi:textures/models/"+tex+".png");
	}

	public RenderMobType(ModelBase model, String tex)
	{
		super(model, 0);
		this.scale = 1.0F;
		this.texture = new ResourceLocation("mineminenomi:textures/models/"+tex+".png");
	}
	
	protected void preRenderCallback(EntityLivingBase livingBase, float f)
	{
		GL11.glScalef(this.scale, this.scale, this.scale);
	}
	
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return this.texture;
	}
    
}
