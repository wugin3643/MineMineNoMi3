package MineMineNoMi3.Utils;

import java.awt.Color;

import net.minecraft.client.model.ModelBase;
import MineMineNoMi3.Entities.Models.ModelBall;
import MineMineNoMi3.Entities.Models.ModelBird;
import MineMineNoMi3.Entities.Models.ModelCube;
import MineMineNoMi3.Entities.Models.ModelX;

public enum EnumAbility 
{
	//				I.TICKS  DMG   E.TICKS	EXPLO	SIDE	E.COLOR						  E.MODEL				 E.SIZES					E.ATTRS
	
	ROOM			(200	, 0		, 0		, 0		, 0		, null						, null				, null							, new String[] {"create_room"}),
	COUNTERSHOCK	(150	, 30	, 2		, -2	, 0		, null						, null				, null							, null),
	MES				(150	, 30	, 0		, 0		, 9		, null						, null				, null							, new String[] {"on_hit_action_mes"}),
	GAMMAKNIFE		(600	, 80	, 3		, 0		, 0		, null						, null				, null							, null),
	
	NORONOROBEAM	(80		, 10	, 60	, 0		, 2		, new Color(240, 161, 228)	, new ModelBall()	, new double[] {3, 3, 3}		, null),
	
	SKATTING		(80		, 0		, 0		, 0		, 14	, null						, null				, null							, null),
	SHISHANOTE		(150	, 10	, 60	, 3		, 0		, null						, null				, null							, null),
	
	GOMUGOMUNOPISTOL(80		, 15	, 60	, 0		, 0		, new Color(232, 213, 158)	, new ModelCube()	, new double[] {1.5, 1, 1}		, null),
	GOMUGOMUNOGATLIN(200	, 15	, 5		, 0		, 0		, new Color(232, 213, 158)	, new ModelCube()	, new double[] {1.5, 1, 1}		, null		, true),
	GOMUGOMUNOROCKET(100	, 5		, 60	, 0		, 0		, new Color(232, 213, 158)	, new ModelCube()	, new double[] {1.5, 1, 1}		, null),
	GOMUGOMUNOGIGANT(80		, 30	, 60	, 0		, 0		, new Color(232, 213, 158)	, new ModelCube()	, new double[] {10, 10, 10}		, null),
	
	YATANOKAGAMI	(100	, 0		, 100	, 0		, -3	, new Color(255, 255, 0)	, new ModelCube()	, new double[] {5, .5, .5}		, new String[] {"event_teleport"}),
	YASAKANI		(60		, 5		, 60	, 1		, 0		, new Color(255, 255, 0)	, new ModelCube()	, new double[] {5, .5, .5}		, null	, true),
	AMANOMURAKUMO	(0		, 4		, 0		, 0		, 0		, null						, null				, null							, new String[] {"sword_13"}),
	AMATERASU		(400	, 20	, 60	, 0		, 0		, new Color(255, 255, 0)	, new ModelCube()	, new double[] {5, .5, .5}		, null),

	SPRINGHOPPER	(100	, 2		, 0		, 0		, 8		, null						, null				, null							, null),
	SPRINGDEATHKNOCK(100	, 15	, 5		, 0		, 0		, new Color(230, 240, 220)	, new ModelCube()	, new double[] {10, 3, 3}		, null),
	
	ICEBLOCKPARTISAN(100	, 10	, 60	, 0		, 0		, new Color(0, 255, 255)	, new ModelCube()	, new double[] {5, .5, .5}		, new String[] {"particles_avalanche"}),
	ICEBALL			(150	, 5		, 60	, 0		, 2		, new Color(0, 255, 255)	, new ModelBall()	, new double[] {5, 5, 5}		, new String[] {"create_iceball"}),
	ICEAGE			(400	, 0		, 0		, 0		, 0		, null						, null				, null							, new String[] {"create_iceage"}),
	ICEBLOCKPHEASANT(500	, 35	, 60	, 0		, 0		, new Color(0, 255, 255)	, new ModelBird()	, new double[] {10, 1, 1}		, new String[] {"particles_avalanche"}),
	
	HIKEN			(200	, 10	, 60	, 2		, -2	, new Color(255, 0, 0)		, new ModelCube()	, new double[] {3, 1, 1}		, new String[] {"particles_vulcan"}),
	HIGAN			(60		, 4		, 60	, 0		, 0		, new Color(255, 0, 0)		, new ModelCube()	, new double[] {.3, .3, .3}		, new String[] {"particles_fire"}	, true),
	DAIENKAIENTEI	(500	, 20	, 60	, 8		, -2	, new Color(255, 0, 0)		, new ModelBall()	, new double[] {10, 10, 10}		, new String[] {"particles_vulcan"}),
	HIDARUMA		(150	, 1		, 60	, 0		, -1	, null						, null				, null							, new String[] {"particles_greenfire"}),
	
	RANKYAKU		(150	, 20	, 60	, 0		, 0		, new Color(105, 227, 255)	, new ModelCube()	, new double[] {1.5, 1, 6}		, new String[] {"destroy_2"}),
	AXEDIAL			(0		, 15	, 60	, 0		, 0		, new Color(158, 189, 222)	, new ModelX()		, new double[] {3, 3, 3}		, null);
	
	private int item_ticks, entity_ticks, entity_dmg, entity_explosion, entity_sideeffect;
	private Color entity_color;
	private double[] entity_scale;
	private ModelBase entity_model;
	private String[] entity_attrs;
	private boolean entity_self;

	private EnumAbility(int par1, int par2, int par3, int par4, int par5, Color par6, ModelBase par7, double[] par8, String[] par9)
	{
		this.item_ticks = par1;
		this.entity_dmg = par2;
		this.entity_ticks = par3;
		this.entity_explosion = par4;
		this.entity_sideeffect = par5;
		this.entity_color = par6;
		this.entity_model = par7;
		this.entity_scale = par8;
		this.entity_attrs = par9;
	}
	
	private EnumAbility(int par1, int par2, int par3, int par4, int par5, Color par6, ModelBase par7, double[] par8, String[] par9, boolean par10)
	{
		this.item_ticks = par1;
		this.entity_dmg = par2;
		this.entity_ticks = par3;
		this.entity_explosion = par4;
		this.entity_sideeffect = par5;
		this.entity_color = par6;
		this.entity_model = par7;
		this.entity_scale = par8;
		this.entity_attrs = par9;
		this.entity_self = par10;
	}
	
	public int getItemTicks()
	{return item_ticks;}
	public int getEntityTicks()
	{return entity_ticks;}
	public int getEntityDmg()
	{return entity_dmg;}
	public int getEntityExplosion()
	{return entity_explosion;}
	public int getEntitySideEffect()
	{return entity_sideeffect;}
	public Color getEntityColor()
	{return entity_color;}
	public ModelBase getEntityModel()
	{return entity_model;}
	public double[] getEntityScale()
	{return entity_scale;}
	public String[] getEntityAttr()
	{return entity_attrs;}
	public boolean getEntityRepeat()
	{return entity_self;}
}
