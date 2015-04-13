package MineMineNoMi3.Entities.Groups.Special;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityRoom extends EntityMob
{

	public EntityRoom(World world) 
	{
		super(world);
	}

	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
	{return super.attackEntityFrom(par1DamageSource, par2);}
	
	protected void entityInit()
	{super.entityInit();}
    
	protected boolean isValidLightLevel()
	{return true; } 
    
	protected boolean canDespawn()
	{return true;}
    
	public boolean isAIEnabled()
	{return true;}
	
	public boolean getCanSpawnHere()
	{return true;}
	
}
