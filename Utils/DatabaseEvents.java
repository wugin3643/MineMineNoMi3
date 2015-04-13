package MineMineNoMi3.Utils;

import MineMineNoMi3.Helper;
import MineMineNoMi3.Lists.ListMisc;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class DatabaseEvents 
{
	public static void eventDestoryBlocksInRadius(EntityThrowable e, int radius)
	{	
		Helper.explosion(e, radius, false, false);
	}
	
	public static void eventTeleport(EntityThrowable e)
	{
		if(e.getThrower() != null && e.getThrower() instanceof EntityPlayerMP)
		{
			EntityPlayerMP entityplayermp = (EntityPlayerMP)e.getThrower();
			EnderTeleportEvent event = new EnderTeleportEvent(entityplayermp, e.posX, e.posY, e.posZ, 5.0F);
			if (!MinecraftForge.EVENT_BUS.post(event))
			{
				if (e.getThrower().isRiding())
					e.getThrower().mountEntity((Entity)null);
				e.getThrower().setPositionAndUpdate(event.targetX, event.targetY, event.targetZ);
			}
        }
	}
	
	public static void eventThor(EntityPlayer player)
	{
		if(player != null && player.getLookVec() != null)
		{
			Vec3 look = player.getLookVec();

			EntityLightningBolt thor = new EntityLightningBolt(player.worldObj, look.xCoord, look.yCoord, look.zCoord);
			player.worldObj.spawnEntityInWorld(thor);
		}
	}

}
