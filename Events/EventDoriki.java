package MineMineNoMi3.Events;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import MineMineNoMi3.Config;
import MineMineNoMi3.Main;
import MineMineNoMi3.MainExtendedPlayer;
import MineMineNoMi3.Entities.Base.EntityMarineBase;
import MineMineNoMi3.Packets.PacketSync;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventDoriki 
{

	@SubscribeEvent
	public void onPlayerDeath(LivingAttackEvent event)
	{
		if(event.entityLiving instanceof EntityPlayer && event.entityLiving.getHealth() - event.ammount <= 0)
		{
			EntityPlayer player = (EntityPlayer)event.entityLiving;
			MainExtendedPlayer props = MainExtendedPlayer.get(player);			

			if(Config.resetStats_actual)
				props.resetStats();				
		}
	}
	
	@SubscribeEvent
	public void onLivingDeath(LivingDeathEvent event)
	{
	    if ((event.source.getEntity() instanceof EntityPlayer))
	    { 
			EntityPlayer player = (EntityPlayer)event.source.getEntity();
			MainExtendedPlayer props = MainExtendedPlayer.get(player);		
			EntityLivingBase target = event.entityLiving;
			
			IAttributeInstance attrAtk = target.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.attackDamage);
			IAttributeInstance attrHP = target.getAttributeMap().getAttributeInstance(SharedMonsterAttributes.maxHealth);
			
			if(props.getDoriki() < 10000 && attrAtk != null && attrHP != null)
			{
				double i = attrAtk.getAttributeValue();
				double j = attrHP.getAttributeValue();

				int rng = player.worldObj.rand.nextInt(3)+1;
				
				if(props.getFaction().equals("Marine") && target instanceof EntityMarineBase)
					return;	
				
				props.addDoriki((int)Math.round(((i + j)/10)/Math.PI)+rng);

				Main.packetPipeline.sendTo(new PacketSync(player), (EntityPlayerMP)player);								
			}
	    }
	}
	
	@SubscribeEvent
	public void onEnterWorld(EntityJoinWorldEvent event)
	{
		if(event.entity instanceof EntityPlayer)
		{
			
			if(FMLCommonHandler.instance().getEffectiveSide().isClient())
				return;
			
			EntityPlayer player = (EntityPlayer)event.entity;
			MainExtendedPlayer props = MainExtendedPlayer.get(player);
			
			int dims = MinecraftServer.getServer().worldServers.length;
		
			Main.packetPipeline.sendTo(new PacketSync(player), (EntityPlayerMP)player);			
			for(int i = 0; i < dims; i++)
				Main.packetPipeline.sendToDimension(new PacketSync(props), i);
			
		}
	}
	
}
