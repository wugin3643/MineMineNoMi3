package MineMineNoMi3.Packets;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import MineMineNoMi3.MainExtendedPlayer;
import cpw.mods.fml.common.network.ByteBufUtils;

public class PacketSync extends AbstractPacket
{
	private NBTTagCompound compound;

	public PacketSync()
	{}

	public PacketSync(EntityPlayer player)
	{
		this.compound = new NBTTagCompound();
		MainExtendedPlayer.get(player).saveNBTData(this.compound);
	}
  
	public PacketSync(MainExtendedPlayer info)
	{
		this.compound = new NBTTagCompound();
		info.saveNBTData(this.compound);
	}

	public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		ByteBufUtils.writeTag(buffer, this.compound);
	}

	public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer)
	{
		this.compound = ByteBufUtils.readTag(buffer);
	}

	public void handleClientSide(EntityPlayer player)
	{
		MainExtendedPlayer.get(player).loadNBTData(this.compound);
	}

	public void handleServerSide(EntityPlayer player){}
	
}