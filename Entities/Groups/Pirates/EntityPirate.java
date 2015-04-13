package MineMineNoMi3.Entities.Groups.Pirates;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import MineMineNoMi3.Entities.Base.EntityPirateBase;

public class EntityPirate extends EntityPirateBase
{

	public EntityPirate(World par1World)
	{
		super(par1World);
	}

	protected void applyEntityAttributes()
	{  	
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);         
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(25.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D); 
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);   	
	}
 
}