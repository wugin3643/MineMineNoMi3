package MineMineNoMi3.Events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import MineMineNoMi3.Config;
import MineMineNoMi3.Helper;
import MineMineNoMi3.Main;
import MineMineNoMi3.MainExtendedPlayer;
import MineMineNoMi3.Proxy.CommonProxy;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventExtendedPlayer
{
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer && MainExtendedPlayer.get((EntityPlayer) event.entity) == null)
			MainExtendedPlayer.register((EntityPlayer) event.entity);
		
		if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties(MainExtendedPlayer.EXT_PROP_NAME) == null)
			event.entity.registerExtendedProperties(MainExtendedPlayer.EXT_PROP_NAME, new MainExtendedPlayer((EntityPlayer) event.entity));
	}
	
	@SubscribeEvent
	public void onEntityJoinWorld(EntityJoinWorldEvent event)
	{
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer)
			MainExtendedPlayer.get((EntityPlayer) event.entity);
		
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer && Config.allowDebugMode_actual)
			Helper.sendText((EntityPlayer) event.entity, "Debug Mode is ON");	
	}
	
	@SubscribeEvent
	public void onLivingDeathEvent(LivingDeathEvent event)
	{
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer)
		{
			NBTTagCompound playerData = new NBTTagCompound();
			((MainExtendedPlayer)(event.entity.getExtendedProperties(MainExtendedPlayer.EXT_PROP_NAME))).saveNBTData(playerData);
			CommonProxy.storeEntityData(((EntityPlayer) event.entity).getCommandSenderName(), playerData);
			MainExtendedPlayer.saveProxyData((EntityPlayer) event.entity);
		}
	}

}
