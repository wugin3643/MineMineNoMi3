package MineMineNoMi3.Proxy;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.nbt.NBTTagCompound;

public class CommonProxy 
{
	private static final Map<String, NBTTagCompound> extendedEntityData = new HashMap();
	 
	public static void storeEntityData(String name, NBTTagCompound compound)
	{
		extendedEntityData.put(name, compound);
	}
	
	public static NBTTagCompound getEntityData(String name)
	{
		return extendedEntityData.remove(name);
	}
	
	public void tick(){}
	public void render(){}
	
}
