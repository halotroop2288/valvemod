package halotroop2288.valvemod;

import halotroop2288.valvemod.proxy.CommonProxy;
import halotroop2288.valvemod.tabs.ValveTab;
import halotroop2288.valvemod.util.ModSoundEvent;
import halotroop2288.valvemod.util.Reference;
import halotroop2288.valvemod.util.compat.OreDictionaryCompat;
import halotroop2288.valvemod.util.handlers.RegistryHandler;
import halotroop2288.valvemod.util.handlers.SoundsHandler;
import halotroop2288.valvemod.world.ModWorldGen;
import halotroop2288.valvemod.init.ModRecipes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs VALVE_TAB = new ValveTab("valve_tab");
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
	}

	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandler.InitRegistries();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
