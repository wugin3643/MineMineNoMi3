package MineMineNoMi3.Entities.Render;

import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

import org.lwjgl.opengl.GL11;

import MineMineNoMi3.Proxy.ClientProxy;

public class RenderRoom extends RenderPlayer
{

	public RenderRoom()
	{
		
	}
	
	protected void passSpecialRender(EntityLivingBase parEntity, double parX, double parY, double parZ)
	{
		super.passSpecialRender(parEntity, parX, parY, parZ);
		GL11.glPushMatrix();
		GL11.glTranslated(parX, parY + parEntity.height / 2, parZ);
		GL11.glScalef(3.0F, 3.0F, 3.0F);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glDepthMask(false);

		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glColor4f(1.0F, 1.0F, 255.0F, 0.7F);
		GL11.glEnable(GL11.GL_ALPHA_TEST);
		GL11.glCallList(ClientProxy.sphereIdOutside);

		GL11.glCallList(ClientProxy.sphereIdInside);
		GL11.glPopMatrix();
	}
	
}
