package MineMineNoMi3.Utils;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class DatabaseParticles
{

	public static void renderVulcan(Entity e)
	{
		e.worldObj.spawnParticle("flame", e.posX + 0.2D, e.posY, e.posZ, -0.05D, 0.03D, 0.05D);
		e.worldObj.spawnParticle("flame", e.posX - 0.2D, e.posY, e.posZ, -0.05D, 0.03D, 0.05D);
		e.worldObj.spawnParticle("flame", e.posX, e.posY + 0.3D, e.posZ, -0.05D, 0.03D, 0.05D);
	  
		e.worldObj.spawnParticle("flame", e.posX, e.posY - 0.4D, e.posZ, 0.05D, 0.03D, -0.05D);
		e.worldObj.spawnParticle("flame", e.posX + 0.1D, e.posY, e.posZ, 0.05D, 0.03D, -0.05D); 
		e.worldObj.spawnParticle("flame", e.posX - 0.1D, e.posY, e.posZ, 0.05D, 0.03D, -0.05D);
	  
		e.worldObj.spawnParticle("flame", e.posX + 0.2D, e.posY - 0.3D, e.posZ, 0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("flame", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("flame", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.05D, -0.03D, -0.05D);
	  
		e.worldObj.spawnParticle("flame", e.posX - 0.2D, e.posY + 0.1D, e.posZ, -0.05D, -0.03D, 0.05D);
		e.worldObj.spawnParticle("flame", e.posX - 0.4D, e.posY + 0.2D, e.posZ, -0.05D, -0.03D, 0.05D);
		e.worldObj.spawnParticle("flame", e.posX - 0.1D, e.posY - 0.2D, e.posZ, -0.05D, -0.03D, 0.05D);
		
		e.worldObj.spawnParticle("flame", e.posX + 0.2D, e.posY - 0.3D, e.posZ, -0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("flame", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("flame", e.posX + 0.4D, e.posY - 0.2D, e.posZ, -0.05D, -0.03D, -0.05D);
	  
		e.worldObj.spawnParticle("flame", e.posX - 0.2D, e.posY + 0.1D, e.posZ, 0.05D, 0.03D, 0.05D);
		e.worldObj.spawnParticle("flame", e.posX - 0.4D, e.posY + 0.2D, e.posZ, -0.05D, 0.03D, -0.05D);
		e.worldObj.spawnParticle("flame", e.posX - 0.1D, e.posY - 0.2D, e.posZ, 0.05D, 0.03D, -0.05D);
		
		e.worldObj.spawnParticle("flame", e.posX + 0.2D, e.posY - 0.3D, e.posZ, -0.02D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("flame", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.02D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("flame", e.posX + 0.4D, e.posY - 0.2D, e.posZ, -0.02D, -0.03D, -0.05D);
	  
		e.worldObj.spawnParticle("flame", e.posX - 0.2D, e.posY + 0.1D, e.posZ, 0.02D, 0.05D, 0.02D);
		e.worldObj.spawnParticle("flame", e.posX - 0.4D, e.posY + 0.2D, e.posZ, -0.02D, 0.05D, -0.02D);
		e.worldObj.spawnParticle("flame", e.posX - 0.1D, e.posY - 0.2D, e.posZ, 0.02D, 0.05D, -0.02D);
		
		
		e.worldObj.spawnParticle("lava", e.posX + 0.2D, e.posY - 0.3D, e.posZ, 0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("lava", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("lava", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.05D, -0.03D, -0.05D);
	  
		e.worldObj.spawnParticle("lava", e.posX - 0.2D, e.posY + 0.1D, e.posZ, -0.05D, -0.03D, 0.05D);
		e.worldObj.spawnParticle("lava", e.posX - 0.4D, e.posY + 0.2D, e.posZ, -0.05D, -0.03D, 0.05D);
		e.worldObj.spawnParticle("lava", e.posX - 0.1D, e.posY - 0.2D, e.posZ, -0.05D, -0.03D, 0.05D);
		
		e.worldObj.spawnParticle("lava", e.posX + 0.2D, e.posY - 0.3D, e.posZ, -0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("lava", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("lava", e.posX + 0.4D, e.posY - 0.2D, e.posZ, -0.05D, -0.03D, -0.05D);
	  
		e.worldObj.spawnParticle("lava", e.posX - 0.2D, e.posY + 0.1D, e.posZ, 0.05D, 0.03D, 0.05D);
		e.worldObj.spawnParticle("lava", e.posX - 0.4D, e.posY + 0.2D, e.posZ, -0.05D, 0.03D, -0.05D);
		e.worldObj.spawnParticle("lava", e.posX - 0.1D, e.posY - 0.2D, e.posZ, 0.05D, 0.03D, -0.05D);
		
		e.worldObj.spawnParticle("lava", e.posX + 0.2D, e.posY - 0.3D, e.posZ, -0.02D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("lava", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.02D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("lava", e.posX + 0.4D, e.posY - 0.2D, e.posZ, -0.02D, -0.03D, -0.05D);
	  
		e.worldObj.spawnParticle("lava", e.posX - 0.2D, e.posY + 0.1D, e.posZ, 0.02D, 0.05D, 0.02D);
		e.worldObj.spawnParticle("lava", e.posX - 0.4D, e.posY + 0.2D, e.posZ, -0.02D, 0.05D, -0.02D);
		e.worldObj.spawnParticle("lava", e.posX - 0.1D, e.posY - 0.2D, e.posZ, 0.02D, 0.05D, -0.02D);
	}

	public static void renderGreenFire(Entity e)
	{
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY, e.posZ, 0.0D, 0.0D, 0.0D);
	    
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY+0.4D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-0.4D, e.posZ, 0.0D, 0.0D, 0.0D);	
		    
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
	    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.5D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.5D, e.posZ, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY+0.4D-0.5D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-0.4D-0.5D, e.posZ, 0.0D, 0.0D, 0.0D);	
		    
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-0.5D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-0.5D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.5D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.5D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.5D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.5D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.5D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.5D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.5D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.5D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		    
		    
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.7D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.7D, e.posZ, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY+0.4D-0.7D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-0.4D-0.7D, e.posZ, 0.0D, 0.0D, 0.0D);	
		    
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-0.7D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-0.7D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.7D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.7D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.7D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.7D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.7D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-0.7D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.7D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-0.7D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		    
		    
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-1.2D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-1.2D, e.posZ, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY+0.4D-1.2D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-0.4D-1.2D, e.posZ, 0.0D, 0.0D, 0.0D);	
		    
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-1.2D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX, e.posY-1.2D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-1.2D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-1.2D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-1.2D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-1.2D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-1.2D, e.posZ-0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX+0.4D, e.posY-1.2D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		    
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-1.2D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("happyVillager", e.posX-0.4D, e.posY-1.2D, e.posZ+0.4D, 0.0D, 0.0D, 0.0D);
	}

	public static void renderAvalanche(Entity e)
	{
		e.worldObj.spawnParticle("splash", e.posX + 0.2D, e.posY, e.posZ, -0.05D, 0.03D, 0.05D);
		e.worldObj.spawnParticle("splash", e.posX - 0.2D, e.posY, e.posZ, -0.05D, 0.03D, 0.05D);
		e.worldObj.spawnParticle("magicCrit", e.posX, e.posY + 0.3D, e.posZ, -0.05D, 0.03D, 0.05D);
	  
		e.worldObj.spawnParticle("splash", e.posX - 0.2D, e.posY, e.posZ, +0.05D, -0.03D, 0.05D);
		e.worldObj.spawnParticle("splash", e.posX - 0.2D, e.posY + 0.2D, e.posZ, -0.03D, 0.03D, 0.05D);
		e.worldObj.spawnParticle("magicCrit", e.posX, e.posY - 0.3D, e.posZ, +0.07D, -0.05D, -0.03D);
		
		e.worldObj.spawnParticle("droplet", e.posX, e.posY - 0.4D, e.posZ, 0.05D, 0.03D, -0.05D);
		e.worldObj.spawnParticle("droplet", e.posX + 0.1D, e.posY, e.posZ, 0.05D, 0.03D, -0.05D); 
		e.worldObj.spawnParticle("droplet", e.posX - 0.1D, e.posY, e.posZ, 0.05D, 0.03D, -0.05D);
	  
		e.worldObj.spawnParticle("splash", e.posX + 0.2D, e.posY - 0.3D, e.posZ, 0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("magicCrit", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("splash", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.05D, -0.03D, -0.05D);
	  
		e.worldObj.spawnParticle("magicCrit", e.posX + 0.4D, e.posY - 0.2D, e.posZ, -0.05D, +0.03D, -0.05D);
		e.worldObj.spawnParticle("magicCrit", e.posX - 0.4D, e.posY - 0.2D, e.posZ, 0.05D, -0.03D, -0.05D);
		e.worldObj.spawnParticle("magicCrit", e.posX + 0.4D, e.posY - 0.2D, e.posZ, -0.05D, -0.03D, +0.05D);
		
		e.worldObj.spawnParticle("dripWater", e.posX - 0.2D, e.posY + 0.1D, e.posZ, -0.05D, -0.03D, 0.05D);
		e.worldObj.spawnParticle("magicCrit", e.posX - 0.4D, e.posY + 0.2D, e.posZ, -0.05D, -0.03D, 0.05D);
		e.worldObj.spawnParticle("dripWater", e.posX - 0.1D, e.posY - 0.2D, e.posZ, -0.05D, -0.03D, 0.05D);
	}

	public static void renderFire(Entity e)
	{
		e.worldObj.spawnParticle("flame", e.posX + 0.2D, e.posY, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("flame", e.posX - 0.2D, e.posY, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("flame", e.posX, e.posY + 0.3D, e.posZ, 0.0D, 0.0D, 0.0D);
		  
		e.worldObj.spawnParticle("flame", e.posX, e.posY - 0.4D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("flame", e.posX + 0.1D, e.posY, e.posZ, 0.0D, 0.0D, 0.0D); 
		e.worldObj.spawnParticle("flame", e.posX - 0.1D, e.posY, e.posZ, 0.0D, 0.0D, 0.0D);
		  
		e.worldObj.spawnParticle("flame", e.posX + 0.2D, e.posY - 0.3D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("flame", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("flame", e.posX + 0.4D, e.posY - 0.2D, e.posZ, 0.0D, 0.0D, 0.0D);
		  
		e.worldObj.spawnParticle("flame", e.posX - 0.2D, e.posY + 0.1D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("flame", e.posX - 0.4D, e.posY + 0.2D, e.posZ, 0.0D, 0.0D, 0.0D);
		e.worldObj.spawnParticle("flame", e.posX - 0.1D, e.posY - 0.2D, e.posZ, 0.0D, 0.0D, 0.0D);
	}
}
