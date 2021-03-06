package tk.genesishub.gtechcraft;

import tk.genesishub.gtechcraft.handler.ConfigurationHandler;
import tk.genesishub.gtechcraft.init.ModBlocks;
import tk.genesishub.gtechcraft.init.ModItems;
import tk.genesishub.gtechcraft.proxy.IProxy;
import tk.genesishub.gtechcraft.reference.Reference;
import tk.genesishub.gtechcraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Main {
	
	@Mod.Instance(Reference.MOD_ID)
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.MOD_CLIENTPROXY, serverSide = Reference.MOD_SERVERPROXY)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) //Items, network handlers, etc
	{
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		ModItems.init();
		
		ModBlocks.init();
		
		LogHelper.info("Pre Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void init (FMLInitializationEvent event) //GUIs, crafting, etc
	{
		LogHelper.info("Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event) //Run code after other mods
	{
		LogHelper.info("Post Initialization Complete! All ready for take off!");
	}
	
}
