package MineMineNoMi3;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class Config 
{
	public static boolean allowShips_actual;
	public static final boolean allowShips_default = true;
	
	public static boolean allowQuests_actual;
	public static final boolean allowQuests_default = true;
	
	public static boolean resetStats_actual;
	public static final boolean resetStats_default = true;
	
	public static boolean allowParticles_actual;
	public static final boolean allowParticles_default = true;
	
	public static boolean allowSounds_actual;
	public static final boolean allowSounds_default = false;
	
	public static boolean allow3D_actual; 
	public static final boolean allow3D_default = false;
	
	public static boolean allowGriefing_actual;
	public static final boolean allowGriefing_default = true;
	
	public static boolean allowDebugMode_actual;
	public static boolean allowDebugMode_default = false;
	
	public static boolean hdTextures_actual;
	public static final boolean hdTextures_default = false;

	public static void initConfig(File configFile) 
	{
		Configuration config = new Configuration(configFile);
		
		config.load();	
		
		allowShips_actual = 	config.get("Mine Mine no Mi Config", "Allow Ships Spawn"		, allowShips_default).getBoolean(true);
		allowQuests_actual = 	config.get("Mine Mine no Mi Config", "Allow Quests"				, allowQuests_default).getBoolean(true);
		resetStats_actual = 	config.get("Mine Mine no Mi Config", "Reset Stats After Death"	, resetStats_default).getBoolean(true);
		allowParticles_actual = config.get("Mine Mine no Mi Config", "Allow Particles"			, allowParticles_default).getBoolean(true);
		//allowSounds_actual = 	config.get("Mine Mine no Mi Config", "Allow Sounds"				, allowSounds_default).getBoolean(false);
		allow3D_actual = 		config.get("Mine Mine no Mi Config", "Allow 3D Rendering"		, allow3D_default).getBoolean(false);
		allowDebugMode_actual = config.get("Mine Mine no Mi Config", "Allow Debug Mode"			, allowDebugMode_default).getBoolean(false);
		//allowGriefing_actual = 	config.get("Mine Mine no Mi Config", "Allow Griefing"			, allowGriefing_default).getBoolean(true);
		
		hdTextures_actual = 	config.get("Mine Mine no Mi Config", "HD Textures"				, hdTextures_default).getBoolean(false);
		
		config.save();		
	}
}
