package MineMineNoMi3.Lists;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import MineMineNoMi3.Helper;
import MineMineNoMi3.Main;
import MineMineNoMi3.Entities.Projectile;
import MineMineNoMi3.Entities.Groups.Marines.EntityMarine;
import MineMineNoMi3.Entities.Groups.Models.ModelMarine;
import MineMineNoMi3.Entities.Groups.Models.ModelPirate;
import MineMineNoMi3.Entities.Groups.Pirates.EntityPirate;
import MineMineNoMi3.Entities.Render.RenderMobType;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ListEntities
{ 

	public static void init()
	{
		EntityRegistry.registerModEntity(Projectile.class, "Proj", 1, Main.instance , 64, 10, true);

		addENTITY("Marine", EntityMarine.class, new RenderMobType(new ModelMarine(), "marine"), Helper.hexToRGB("94D5F7"), Helper.hexToRGB("0000FF"));
		addENTITY("Pirate", EntityPirate.class, new RenderMobType(new ModelPirate(), "pirate"), Helper.hexToRGB("C9C9C9"), Helper.hexToRGB("CC3134"));
	}
	
	
	
	private static void addENTITY(String name, Class<? extends Entity> entity, Render renderer)
	{
		Helper.mobs.add(new Object[] {entity, renderer});
		EntityRegistry.registerGlobalEntityID(entity, name, EntityRegistry.findGlobalUniqueEntityId());
		LanguageRegistry.instance().addStringLocalization("entity."+name+".name", "en_US", name);			
	}
	
	private static void addENTITY(String name, Class<? extends Entity> entity, Render renderer, int color1, int color2)
	{
		Helper.mobs.add(new Object[] {entity, renderer});
		EntityRegistry.registerGlobalEntityID(entity, name, EntityRegistry.findGlobalUniqueEntityId(), color1, color2);
		LanguageRegistry.instance().addStringLocalization("entity."+name+".name", "en_US", name);			
	}
}
