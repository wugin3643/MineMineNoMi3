package MineMineNoMi3;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import MineMineNoMi3.Packets.PacketSync;
import MineMineNoMi3.Proxy.CommonProxy;

public class MainExtendedPlayer implements IExtendedEntityProperties
{

	public static final String EXT_PROP_NAME = "ExtendedPlayer";
	private EntityPlayer player;
	
	private int doriki, bounty, belly;
	private String faction = "N/A", race = "N/A", job = "N/A", quest = "N/A";
	private boolean hasFruitEffect, isLogia;
	private String akumaNoMiUsed = "";
	
	public MainExtendedPlayer(EntityPlayer player)
	{
	    this.player = player;
	}
	
	private static final String getSaveKey(EntityPlayer player) 
	{
		return player.getCommandSenderName() + ":" + EXT_PROP_NAME;
	}
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties("ExtendedPlayer", new MainExtendedPlayer(player));
	}
	
	public static void saveProxyData(EntityPlayer player) 
	{
		MainExtendedPlayer playerData = MainExtendedPlayer.get(player);
		NBTTagCompound savedData = new NBTTagCompound();
		playerData.saveNBTData(savedData);
		CommonProxy.storeEntityData(getSaveKey(player), savedData);
	} 
	  
	public static final void loadProxyData(EntityPlayer player) 
	{
		MainExtendedPlayer playerData = MainExtendedPlayer.get(player);
		NBTTagCompound savedData = CommonProxy.getEntityData(getSaveKey(player));
		if (savedData != null){ playerData.loadNBTData(savedData); }
		Main.packetPipeline.sendToServer(new PacketSync(playerData));
	}
	
	public static final MainExtendedPlayer get(EntityPlayer player)
	{
		return (MainExtendedPlayer)player.getExtendedProperties("ExtendedPlayer");
	}

	public void init(Entity entity, World world) {}
	
	public void saveNBTData(NBTTagCompound compound)
	{
		NBTTagCompound nbt = new NBTTagCompound();
	
		nbt.setString("AkumaNoMiUsed", this.akumaNoMiUsed);
		
		nbt.setInteger("Doriki", this.doriki);
		nbt.setInteger("Bounty", this.bounty);
		nbt.setInteger("Belly", this.belly);
		
		nbt.setString("Faction", this.faction);
		nbt.setString("Race", this.race);
		nbt.setString("Job", this.job);
		
		compound.setTag("ExtendedPlayer", nbt);
	}
	
	@Override
	public void loadNBTData(NBTTagCompound compound) 
	{
		NBTTagCompound nbt = (NBTTagCompound)compound.getTag("ExtendedPlayer");

		this.akumaNoMiUsed = nbt.getString("AkumaNoMiUsed");
		
		this.doriki = nbt.getInteger("Doriki");
		this.bounty = nbt.getInteger("Bounty");
		this.belly = nbt.getInteger("Belly");
		
		this.faction = nbt.getString("Faction");
		this.race = nbt.getString("Race");
		this.job = nbt.getString("Job");
	}

	public String getJob()
	{return this.job;}
	public void setJob(String i)
	{this.job = i;}
	
	public String getRace()
	{return this.race;}
	public void setRace(String i)
	{this.race = i;}
	
	public String getFaction()
	{return this.faction;}
	public void setFaction(String i)
	{this.faction = i;}
	
	public int getBelly()
	{return this.belly;}
	public void setBelly(int i)
	{this.belly = i;}
	public void addBelly(int i)
	{this.belly += i;}
	public void decBelly(int i)
	{this.belly -= i;}
	
	public int getBounty()
	{return this.bounty;}
	public void setBounty(int i)
	{this.bounty = i;}
	public void addBounty(int i)
	{this.bounty += i;}
	public void decBounty(int i)
	{this.bounty -= i;}
	
	public int getDoriki()
	{return this.doriki;}
	public void setDoriki(int i)
	{this.doriki = i;}
	public void addDoriki(int i)
	{this.doriki += i;}
	public void decDoriki(int i)
	{this.doriki -= i;}
	
	public String getUsedFruit()
	{return this.akumaNoMiUsed;}
	public void setUsedFruit(String name)
	{this.akumaNoMiUsed = name;}
	
	public void resetStats()
	{
		this.setDoriki(0);
		this.setBelly(0);
		this.setBounty(0);
		this.setFaction("N/A");
		this.setRace("N/A");
		this.setJob("N/A");
		Main.packetPipeline.sendTo(new PacketSync(player), (EntityPlayerMP)player);
	}

}
