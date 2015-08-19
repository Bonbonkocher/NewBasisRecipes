package de.bonbonkocher.basis;


import com.sun.security.auth.login.ConfigFile;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import de.bonbonkocher.basis.crafting.ManagerCrafting;
import de.bonbonkocher.basis.proxies.BasisCommonProxy;

@Mod(modid="nbr_mod", name="New Basis Reipes Mod", version="MC 1.7.2")

public class Basis
{
	
	@Instance(value="basisrezept")
	public static Basis instance;
	
	@SidedProxy(clientSide="de.bonbonkocher.basis.proxies.BasisClientProxy", serverSide="de.bonbonkocher.basis.proxies.BasisCommonProxy")
	public static BasisCommonProxy proxy;

	/**
	 * Config ersteller
	 */
	//#############################################
	//Shaped = Geformt
	public static boolean Chiseled_Stone_Bricks = true;
	public static boolean Horse_Armor = true;
	public static boolean Name_Tag = true;
	public static boolean Saddle = true;
	public static boolean Sponge = true;
	public static boolean Waterlily = true;
	public static boolean Web = true;
	//Shapeless = Formlos
	public static boolean Ice = true;
	public static boolean Mossy_Cobblestone = true;
	public static boolean Mossy_Stone_Bricks = true;
	public static boolean Sand = true;
	public static boolean Wheat_Seeds = true;
	public static boolean String = true;
	//Smelting = Schmeltzen
	public static boolean Charcoal = true;
	public static boolean Leather = true;
	//#############################################
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//config erstellen oder berarbeiten
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		Horse_Armor = config.get("Shaped", "Horse_Armor", true).getBoolean(true);
		Saddle = config.get("Shaped", "Saddle", true).getBoolean(true);
		Sand = config.get("Shapeless", "Sand", true).getBoolean(true);
		Web = config.get("Shaped", "Web", true).getBoolean(true);
		Waterlily = config.get("Shaped", "Waterlily", true).getBoolean(true);
		Wheat_Seeds = config.get("Shapeless", "Seed", true).getBoolean(true);
		String = config.get("Shapeless", "String", true).getBoolean(true);
		Name_Tag = config.get("Shaped", "Name_Tag", true).getBoolean(true);
		Sponge = config.get("Shaped", "Sponge", true).getBoolean(true);
		Mossy_Stone_Bricks = config.get("Shapeless", "Mossy_Stone_Brick", true).getBoolean(true);
		Chiseled_Stone_Bricks = config.get("Shaped", "Chiseled_Stone_Bricks", true).getBoolean(true);
		Mossy_Cobblestone = config.get("Shapeless", "Mossy_Cobblestone", true).getBoolean(true);
		Ice = config.get("Shapeless", "Ice", true).getBoolean(true);
		Charcoal = config.get("Smelting", "Charcoal", true).getBoolean(true);
		Leather = config.get("Smelting", "Leather", true).getBoolean(true);
		
		config.save();
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		new ManagerCrafting();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
