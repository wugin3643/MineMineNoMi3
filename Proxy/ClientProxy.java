package MineMineNoMi3.Proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Sphere;

import MineMineNoMi3.Helper;
import MineMineNoMi3.Entities.Projectile;
import MineMineNoMi3.Entities.Groups.Special.EntityRoom;
import MineMineNoMi3.Entities.Render.RenderProjectile;
import MineMineNoMi3.Entities.Render.RenderRoom;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	
	public void tick()
	{
		
		
		
	}
	
	public static int sphereIdOutside;
	public static int sphereIdInside;
	
	public void render()
	{	
		RenderingRegistry.registerEntityRenderingHandler(Projectile.class, new RenderProjectile());	
		
		RenderingRegistry.registerEntityRenderingHandler(EntityRoom.class, new RenderRoom());	
		
		for(int i = 0; i < Helper.mobs.size(); i++)
			RenderingRegistry.registerEntityRenderingHandler(((Class<? extends Entity>)Helper.mobs.get(i)[0]), ((Render)Helper.mobs.get(i)[1]));

		Sphere sphere = new Sphere();
		
		sphere.setDrawStyle(GLU.GLU_FILL);
		sphere.setNormals(GLU.GLU_SMOOTH);

		ResourceLocation texture = new ResourceLocation("mineminenomi:textures/blocks/ope.png");
		
		sphere.setOrientation(GLU.GLU_OUTSIDE);
		sphereIdOutside = GL11.glGenLists(1);
		GL11.glNewList(sphereIdOutside, GL11.GL_COMPILE);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		sphere.draw(0.5F, 32, 32);
		GL11.glEndList();

		sphere.setOrientation(GLU.GLU_INSIDE);
		sphereIdInside = GL11.glGenLists(1);
		GL11.glNewList(sphereIdInside, GL11.GL_COMPILE);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		sphere.draw(0.5F, 32, 32);
		GL11.glEndList();
	}
}
