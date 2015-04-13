package MineMineNoMi3.Entities.Groups.Marines;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import MineMineNoMi3.Entities.Base.EntityMarineBase;
import MineMineNoMi3.Lists.ListMisc;

public class EntityMarine extends EntityMarineBase
{

	public EntityMarine(World par1World)
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