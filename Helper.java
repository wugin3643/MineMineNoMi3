package MineMineNoMi3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.Explosion;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import MineMineNoMi3.Utils.CustomExplosion;

public class Helper 
{
	public static List<Item> abilities = new ArrayList();
	public static List<Item> devilfruits = new ArrayList();
	public static List<Item> logias = new ArrayList();
	public static List<Object[]> mobs = new ArrayList();
	
	public static void sendText(EntityPlayer player, String text)
	{
		if(Config.allowDebugMode_actual)
			player.addChatComponentMessage(new ChatComponentText(makeFabulous(text)));
		else
			player.addChatComponentMessage(new ChatComponentText(text));
	}
	
	public static String makeFabulous(String parString)
	{
	    int stringLength = parString.length();
	    if (stringLength < 1)
	    {
	        return "";
	    }
	    String outputString = "";
	    EnumChatFormatting[] colorChar = 
	    {
	        EnumChatFormatting.RED,
	        EnumChatFormatting.GOLD,
	        EnumChatFormatting.YELLOW,
	        EnumChatFormatting.GREEN,
	        EnumChatFormatting.AQUA,
	        EnumChatFormatting.LIGHT_PURPLE,
	        EnumChatFormatting.DARK_PURPLE,
	        EnumChatFormatting.AQUA,
	        EnumChatFormatting.WHITE,
	        EnumChatFormatting.DARK_RED
	    };
	    Random rand = new Random();
	    for (int i = 0; i < stringLength; i++)
	    {
	        outputString = outputString+colorChar[rand.nextInt(stringLength)%10]+parString.substring(i, i+1);
	    }
	    return outputString;
	}
	
	public static Explosion explosion(Entity e, float force, boolean normal, boolean griefing)
    {
		if(normal)
		{
			e.worldObj.newExplosion(e, e.posX, e.posY, e.posZ, force, false, griefing);
			return null;
		}
		else
		{
			CustomExplosion explosion = new CustomExplosion(e.worldObj, e, e.posX, e.posY, e.posZ, force);
			explosion.doExplosionA();
			return explosion;
		}
	}
	
	public static int hexToRGB(String hexColor)
	{
		int value = Integer.parseInt(hexColor, 16);
		return value;
	}
	
	public static void renderPlayerModelInGUI(int x, int y, int z, float i, float j, EntityLivingBase entity)
	{
		GL11.glEnable(GL11.GL_COLOR_MATERIAL);
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, 50.0F);
		GL11.glScalef((float)(-z), (float)z, (float)z);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		float f2 = entity.renderYawOffset;
		float f3 = entity.rotationYaw;
		float f4 = entity.rotationPitch;
    	float f5 = entity.prevRotationYawHead;
    	float f6 = entity.rotationYawHead;
    	GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
    	RenderHelper.enableStandardItemLighting();
    	GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
    	GL11.glRotatef(-((float)Math.atan((double)(j / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
    	entity.renderYawOffset = (float)Math.atan((double)(i / 40.0F)) * 20.0F;
    	entity.rotationYaw = (float)Math.atan((double)(i / 40.0F)) * 40.0F;
    	entity.rotationPitch = -((float)Math.atan((double)(j / 40.0F))) * 20.0F;
    	entity.rotationYawHead = entity.rotationYaw;
    	entity.prevRotationYawHead = entity.rotationYaw;
    	GL11.glTranslatef(0.0F, entity.yOffset, 0.0F);
    	RenderManager.instance.playerViewY = 180.0F;
    	RenderManager.instance.renderEntityWithPosYaw(entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
    	entity.renderYawOffset = f2;
    	entity.rotationYaw = f3;
    	entity.rotationPitch = f4;
    	entity.prevRotationYawHead = f5;
    	entity.rotationYawHead = f6;
    	GL11.glPopMatrix();
    	RenderHelper.disableStandardItemLighting();
    	GL11.glDisable(GL12.GL_RESCALE_NORMAL);
    	OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
    	GL11.glDisable(GL11.GL_TEXTURE_2D);
    	OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
	}	
}
