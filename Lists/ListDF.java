package MineMineNoMi3.Lists;

import net.minecraft.item.Item;
import MineMineNoMi3.Helper;
import MineMineNoMi3.Items.Ability;
import MineMineNoMi3.Items.AkumaNoMi;
import MineMineNoMi3.Utils.EnumAbility;
import MineMineNoMi3.Utils.EnumFruitType;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ListDF 
{
	public static Item MeraMeraNoMi, Hiken, Higan, DaiEnkaiEntei, Hidaruma;
	
	public static Item HieHieNoMi, IceBlockPartisan, IceAge, IceBall, IceBlockPheasant;

	public static Item BaneBaneNoMi, SpringHopper, SpringDeathKnock;
	
	public static Item PikaPikaNoMi, YataNoKagami, YasakaniNoMagatama, AmaNoMurakumo, Amaterasu;

	public static Item GomuGomuNoMi, GomuGomuNoPistol, GomuGomuNoGatling, GomuGomuNoRocket, GomuGomuNoGigantPistol;
	
	public static Item SukeSukeNoMi, Skatting, ShishaNoTe;
	
	public static Item OpeOpeNoMi, Room, Mes, CounterShock;
	
	public static Item NoroNoroNoMi, NoroNoroBeam;
	
	public static Item GoroGoroNoMi, ElThor, VoltVari, Raigo;
	
	public static Item MokuMokuNoMi, WhiteSnake, WhiteOut;
	
	public static Item NikyuNikyuNoMi, PadHo, UrsusShock, Hanpatsu;
	
	public static Item BomuBomuNoMi, NoseFancyCannon, KickBomb;
	
	public static Item GuraGuraNoMi, Kaishin, Kabutowari, ShimaYurashi;
	
	public static Item KageKageNoMi, BrickBat, Doppelman, Kagemusha;
	
	public static Item SunaSunaNoMi, DesertSpada, Sables, Barjan;
	
	public static Item MaguMaguNoMi, DaiFunka, Meigo, RyuseiKazan, KazanBakuhatsu;
	
	public static Item DoruDoruNoMi, DoruDoruArtsMori, DoruDoruArtsKen, CandleWall, CandleHouse;
	
	public static Item DokuDokuNoMi, Hydra, ChloroBall, VenomDemon;

	public static Item BariBariNoMi, BarrierCrash;

	public static Item GasuGasuNoMi, GasRobe, Gastille, Gastanet, BlueSword;
	
	public static Item YukiYukiNoMi, Kamakura, YukiRabi;
	
	public static Item JikiJikiNoMi, SagariNoRyusei, Juryoku, Moko;
	
	public static Item YamiYamiNoMi, Kurouzu, BlackHole, Liberation, DarkMatter;
	
	public static Item ItoItoNoMi, Parasite, SoraNoMichi, Overheat;
	
	public static Item HoroHoroNoMi, NegativeHollow, MiniHollow, TokuHollow;
	
	public static Item SupaSupaNoMi, Spider, SparClaw, SpiralHollow;
	
	public static Item OriOriNoMi, Bind, AwaseBaori;
	
	public static Item MeroMeroNoMi, MeroMeroMellow, SlaveArrow, PistolKiss;
	
	public static Item GoeGoeNoMi, Todoroki;
	
	public static Item KiloKiloNoMi, KiloPress, KiloGuillotine;
	
	public static Item HanaHanaNoMi, CienFleurWing, DosFleurClutch;

	public static Item HoruHoruNoMi, ChiyuHormone, TensionHormone, EnergyHormone;	
	
	public static void init()
	{
		OpeOpeNoMi = new AkumaNoMi(ListPotions.opeope, EnumFruitType.PARAMECIA, 
				Room = new Ability(EnumAbility.ROOM), 
				CounterShock = new Ability(EnumAbility.COUNTERSHOCK), 
				Mes = new Ability(EnumAbility.MES), null);
		addITEM(OpeOpeNoMi,"Ope Ope no Mi", false);
		addITEM(Room,"Room");
		addITEM(CounterShock,"Counter Shock");
		addITEM(Mes,"Mes");
		
		NoroNoroNoMi = new AkumaNoMi(ListPotions.noronoro, EnumFruitType.PARAMECIA, 
				NoroNoroBeam = new Ability(EnumAbility.NORONOROBEAM), null, null, null);
		addITEM(NoroNoroNoMi,"Noro Noro no Mi", false);
		addITEM(NoroNoroBeam,"Noro Noro Beam");
		
		SukeSukeNoMi = new AkumaNoMi(ListPotions.sukesuke, EnumFruitType.PARAMECIA, 
				Skatting = new Ability(EnumAbility.SKATTING), 
				ShishaNoTe = new Ability(EnumAbility.SHISHANOTE), null, null);
		addITEM(SukeSukeNoMi,"Suke Suke no Mi", false);
		addITEM(Skatting,"Skatting");
		addITEM(ShishaNoTe,"Shisha no Te");
		
		GomuGomuNoMi = new AkumaNoMi(ListPotions.gomugomu, EnumFruitType.PARAMECIA, 
				GomuGomuNoPistol = new Ability(EnumAbility.GOMUGOMUNOPISTOL), 
				GomuGomuNoRocket = new Ability(EnumAbility.GOMUGOMUNOROCKET), 
				GomuGomuNoGatling = new Ability(EnumAbility.GOMUGOMUNOGATLIN), 
				GomuGomuNoGigantPistol = new Ability(EnumAbility.GOMUGOMUNOGIGANT));
		addITEM(GomuGomuNoMi,"Gomu Gomu no Mi", false);
		addITEM(GomuGomuNoPistol,"Gomu Gomu no Pistol");
		addITEM(GomuGomuNoGatling,"Gomu Gomu no Gatling");
		addITEM(GomuGomuNoRocket,"Gomu Gomu no Rocket");
		addITEM(GomuGomuNoGigantPistol,"Gomu Gomu no Gigant Pistol");
		
		PikaPikaNoMi = new AkumaNoMi(ListPotions.pikapika, EnumFruitType.LOGIA, 
				YataNoKagami = new Ability(EnumAbility.YATANOKAGAMI), 
				YasakaniNoMagatama = new Ability(EnumAbility.YASAKANI),
				AmaNoMurakumo = new Ability(EnumAbility.AMANOMURAKUMO),
				Amaterasu = new Ability(EnumAbility.AMATERASU));
		addITEM(PikaPikaNoMi,"Pika Pika no Mi", true);
		addITEM(YataNoKagami,"Yata no Kagami");
		addITEM(YasakaniNoMagatama,"Yasakani no Magatama");
		addITEM(AmaNoMurakumo,"Ama no Murakumo");
		addITEM(Amaterasu,"Amaterasu");		
			
		BaneBaneNoMi = new AkumaNoMi(ListPotions.banebane, EnumFruitType.PARAMECIA, 
				SpringHopper = new Ability(EnumAbility.SPRINGHOPPER), 
				SpringDeathKnock = new Ability(EnumAbility.SPRINGDEATHKNOCK), null, null);
		addITEM(BaneBaneNoMi, "Bane Bane no Mi", false);
		addITEM(SpringHopper, "Spring Hopper");
		addITEM(SpringDeathKnock, "Spring Death Knock");	
		
		HieHieNoMi = new AkumaNoMi(ListPotions.hiehie, EnumFruitType.LOGIA, 
				IceBlockPartisan = new Ability(EnumAbility.ICEBLOCKPARTISAN), 
				IceAge = new Ability(EnumAbility.ICEAGE), 
				IceBall = new Ability(EnumAbility.ICEBALL),
				IceBlockPheasant = new Ability(EnumAbility.ICEBLOCKPHEASANT));
		addITEM(HieHieNoMi,"Hie Hie no Mi", true);
		addITEM(IceBlockPartisan,"Ice Block : Partisan");
		addITEM(IceAge,"Ice Age");
		addITEM(IceBall,"Ice Ball");
		addITEM(IceBlockPheasant,"Ice Block : Pheasant");	
		
		MeraMeraNoMi = new AkumaNoMi(ListPotions.meramera, EnumFruitType.LOGIA, 
				Hiken = new Ability(EnumAbility.HIKEN), 
				Higan = new Ability(EnumAbility.HIGAN), 
				DaiEnkaiEntei = new Ability(EnumAbility.DAIENKAIENTEI), 
				Hidaruma = new Ability(EnumAbility.HIDARUMA));
		addITEM(MeraMeraNoMi,"Mera Mera no Mi", true);
		addITEM(Hiken, "Hiken");
		addITEM(Higan, "Higan");
		addITEM(DaiEnkaiEntei, "Dai Enkai : Entei");addITEM(Hidaruma, "Hidaruma");		
		
	}

	private static void addITEM(Item item, String localizedName, boolean isLogia)
	{	
		if(isLogia)
			Helper.logias.add(item);	
		Helper.devilfruits.add(item);	
		String truename = localizedName.replaceAll("\\s+","").replaceAll(",", "").replaceAll(":", "").toLowerCase();
		item.setUnlocalizedName(truename);
		GameRegistry.registerItem(item, truename);
		LanguageRegistry.addName(item, localizedName);
	}
	
	private static void addITEM(Item item, String localizedName)
	{	
		Helper.abilities.add(item);	
		String truename = localizedName.replaceAll("\\s+","").replaceAll(",", "").replaceAll(":", "").toLowerCase();
		item.setUnlocalizedName(truename);
		GameRegistry.registerItem(item, truename);
		LanguageRegistry.addName(item, localizedName);
	}
	
}
