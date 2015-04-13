package MineMineNoMi3.Lists;

import java.lang.reflect.Field;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.potion.Potion;
import MineMineNoMi3.MainEnchantment;
import MineMineNoMi3.MainPotion;
import MineMineNoMi3.Utils.EnumToolMaterials;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ListPotions 
{

    public static Potion meramera;
    public static Potion hiehie;
    public static Potion pikapika;
	public static Potion sukesuke;
	public static Potion gomugomu;
	public static Potion noronoro;
	public static Potion banebane;
	public static Potion gorogoro;
	public static Potion opeope;
	public static Potion mokumoku;
	public static Potion nikyunikyu;
	public static Potion bomubomu;
	public static Potion guragura;
	public static Potion kagekage;
	public static Potion sunasuna;
	public static Potion magumagu;
	public static Potion dorudoru;
	public static Potion dokudoku;
	public static Potion baribari;
	public static Potion gasugasu;
	public static Potion yukiyuki;
	public static Potion jikijiki;
	public static Potion ushiushi1;
	public static Potion toritori1;
	public static Potion yamiyami;
	public static Potion itoito;
	public static Potion toritori2;
	public static Potion nekoneko;
	public static Potion horohoro;
	public static Potion manemane;
	public static Potion supasupa;
	public static Potion hanahana;
	public static Potion oriori;
	public static Potion goegoe;
	public static Potion meromero;
	public static Potion kilokilo;
	public static Potion horuhoru;
	
	public static Enchantment dialImpact;
	public static Enchantment dialFlash;
	public static Enchantment dialAxe;
	public static Enchantment kairoseki;
	
	public static void init()
	{
		addPotion();
		addNames();
	}		
	public static void addPotion()
	{
		   meramera = new MainPotion(100,false,0).setIconIndex(0,0).setPotionName("potion.meramera");
		   hiehie 	= new MainPotion(101,false,0).setIconIndex(0,0).setPotionName("potion.hiehie");
		   pikapika = new MainPotion(102,false,0).setIconIndex(0,0).setPotionName("potion.pikapika");
	       sukesuke = new MainPotion(103,false,0).setIconIndex(0,0).setPotionName("potion.sukesuke");
		   gomugomu = new MainPotion(104,false,0).setIconIndex(0,0).setPotionName("potion.gomugomu");
		   noronoro = new MainPotion(105,false,0).setIconIndex(0,0).setPotionName("potion.noronoro");
		   banebane = new MainPotion(106,false,0).setIconIndex(0,0).setPotionName("potion.banebane");
		   gorogoro = new MainPotion(107,false,0).setIconIndex(0,0).setPotionName("potion.gorogoro");
		   opeope 	= new MainPotion(108,false,0).setIconIndex(0,0).setPotionName("potion.opeope");
		   mokumoku = new MainPotion(109,false,0).setIconIndex(0,0).setPotionName("potion.mokumoku");
		   nikyunikyu = new MainPotion(110,false,0).setIconIndex(0,0).setPotionName("potion.nikyunikyu");
		   bomubomu = new MainPotion(111,false,0).setIconIndex(0,0).setPotionName("potion.bomubomu");
		   guragura = new MainPotion(112,false,0).setIconIndex(0,0).setPotionName("potion.guragura"); 
		   kagekage = new MainPotion(113,false,0).setIconIndex(0,0).setPotionName("potion.kagekage");
		   sunasuna = new MainPotion(114,false,0).setIconIndex(0,0).setPotionName("potion.sunasuna");
		   magumagu = new MainPotion(115,false,0).setIconIndex(0,0).setPotionName("potion.magumagu");
		   dorudoru = new MainPotion(116,false,0).setIconIndex(0,0).setPotionName("potion.dorudoru");
		   dokudoku = new MainPotion(117,false,0).setIconIndex(0,0).setPotionName("potion.dokudoku"); 
		   baribari = new MainPotion(118,false,0).setIconIndex(0,0).setPotionName("potion.baribari");
		   gasugasu = new MainPotion(119,false,0).setIconIndex(0,0).setPotionName("potion.gasugasu");
		   yukiyuki = new MainPotion(120,false,0).setIconIndex(0,0).setPotionName("potion.yukiyuki");
		   jikijiki = new MainPotion(121,false,0).setIconIndex(0,0).setPotionName("potion.jikijiki");
		   ushiushi1 = new MainPotion(122,false,0).setIconIndex(0,0).setPotionName("potion.ushiushi");
		   toritori1 = new MainPotion(123,false,0).setIconIndex(0,0).setPotionName("potion.toritori");
		   yamiyami = new MainPotion(124,false,0).setIconIndex(0,0).setPotionName("potion.yamiyami");
		   itoito   = new MainPotion(125,false,0).setIconIndex(0,0).setPotionName("potion.itoito");
		   toritori2 = new MainPotion(126,false,0).setIconIndex(0, 0).setPotionName("potion.toritori");
		   nekoneko = new MainPotion(127,false,0).setIconIndex(0, 0).setPotionName("potion.nekoneko");
		   horohoro = new MainPotion(128,false,0).setIconIndex(0, 0).setPotionName("potion.horohoro");
		   supasupa = new MainPotion(129,false,0).setIconIndex(0, 0).setPotionName("potion.supasupa");
		   meromero = new MainPotion(130,false,0).setIconIndex(0, 0).setPotionName("potion.meromero");
		   oriori = new MainPotion(131,false,0).setIconIndex(0, 0).setPotionName("potion.oriori");
		   goegoe = new MainPotion(132,false,0).setIconIndex(0, 0).setPotionName("potion.goegoe");
		   hanahana = new MainPotion(133,false,0).setIconIndex(0, 0).setPotionName("potion.hanahana");
		   kilokilo = new MainPotion(134,false,0).setIconIndex(0, 0).setPotionName("potion.kilokilo");
		   horuhoru = new MainPotion(135,false,0).setIconIndex(0, 0).setPotionName("potion.horuhoru");

		   
		   dialImpact = new MainEnchantment(145, 4, EnumToolMaterials.impactDial, "Impact", 1);
		   kairoseki = new MainEnchantment(146, 4, EnumToolMaterials.kairoseki, "Kairoseki", 1);
		   dialFlash = new MainEnchantment(147, 4, EnumToolMaterials.flashDial, "Flash", 1);
		   dialAxe = new MainEnchantment(148, 4, EnumToolMaterials.axeDial, "Axe", 1);
	}
	
	public static void addNames()
	{
		LanguageRegistry.instance().addStringLocalization("enchantment.Impact", "en_US", "Impact Dial");
		LanguageRegistry.instance().addStringLocalization("enchantment.Flash", "en_US", "Flash Dial");
		LanguageRegistry.instance().addStringLocalization("enchantment.Axe", "en_US", "Axe Dial");
		LanguageRegistry.instance().addStringLocalization("enchantment.Kairoseki", "en_US", "Kairoseki");
		
		LanguageRegistry.instance().addStringLocalization("potion.meramera", "Mera Mera no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.hiehie", "Hie Hie no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.pikapika", "Pika Pika no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.sukesuke", "Suke Suke no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.gomugomu", "Gomu Gomu no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.noronoro", "Noro Noro no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.banebane", "Bane Bane no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.gorogoro", "Goro Goro no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.opeope", "Ope Ope no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.mokumoku", "Moku Moku no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.nikyunikyu", "Nikyu Nikyu no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.bomubomu", "Bomu Bomu no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.guragura", "Gura Gura no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.kagekage", "Kage Kage no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.sunasuna", "Suna Suna no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.magumagu", "Magu Magu no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.dorudoru", "Doru Doru no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.dokudoku", "Doku Doku no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.baribari", "Bari Bari no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.gasugasu", "Gasu Gasu no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.yukiyuki", "Yuki Yuki no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.jikijiki", "Geshu Geshu no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.ushiushi", "Ushi Ushi no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.toritori", "Tori Tori no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.yamiyami", "Yami Yami no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.itoito", "Ito Ito no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.horohoro", "Horo Horo no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.manemane", "Mane Mane no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.supasupa", "Supa Supa no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.meromero", "Mero Mero no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.oriori", "Ori Ori no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.goegoe", "Goe Goe no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.hanahana", "Hana Hana no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.horuhoru", "Horu Horu no Mi");
		LanguageRegistry.instance().addStringLocalization("potion.kilokilo", "Kilo Kilo no Mi");
	}
	
	public static void expandPotions()
	{
		Potion[] potionTypes = null;

		for (Field f : Potion.class.getDeclaredFields()) 
		{
			f.setAccessible(true);
			try 
			{
				if ((f.getName().equals("potionTypes")) || (f.getName().equals("field_76425_a")))
				{
					Field modfield = Field.class.getDeclaredField("modifiers");
					modfield.setAccessible(true);
					modfield.setInt(f, f.getModifiers() & 0xFFFFFFEF);
	
					potionTypes = (Potion[])f.get(null);
					Potion[] newPotionTypes = new Potion[256];
					System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
	
					f.set(null, newPotionTypes);
		        }
			} catch (Exception e) {
				System.err.println("[Mine Mine no Mi] Severe error, please report this to the mod author");

				System.err.println(e);
			}
		}
	}
}