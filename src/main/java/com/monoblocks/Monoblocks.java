package com.monoblocks;


import com.monoblocks.handler.GuiHandler;
import com.monoblocks.proxy.CommonProxy;
import com.monoblocks.tabs.MonoblocksDoors;
import com.monoblocks.tabs.MonoblocksFences;
import com.monoblocks.tabs.MonoblocksItems;
import com.monoblocks.tabs.MonoblocksLighting;
import com.monoblocks.tabs.MonoblocksMCStained;
import com.monoblocks.tabs.MonoblocksOther;
import com.monoblocks.tabs.MonoblocksSignage;
import com.monoblocks.tabs.MonoblocksTab;
import com.monoblocks.tabs.MonoblocksTiles;
import com.monoblocks.tabs.MonoblocksWeapons;
import com.monoblocks.utilities.PacketLine;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import java.io.File;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

@Mod(
   modid = "Monoblocks",
   version = "11.6",
   dependencies = "required-after:foxblocks"
)
public class Monoblocks {
   public static final String MODID = "Monoblocks";
   public static final String version = "11.6-UnofficalRewrite-TBEA";
   public static boolean OreGen;
   public static boolean Experimental;
   public static boolean TrafficSigns;
   public static boolean OreDict;
   public static boolean SmallTrafficLight;
   public static boolean NoStreetLight;
   public static boolean TrafficLight;
   public static CreativeTabs monoblocksTab = new MonoblocksTab(CreativeTabs.getNextID(), "monoblocksTab");
   public static CreativeTabs monoblocksweapons = new MonoblocksWeapons(CreativeTabs.getNextID(), "MonoblocksWeapons");
   public static CreativeTabs monoblocksitems = new MonoblocksItems(CreativeTabs.getNextID(), "Monoblocksitems");
   public static CreativeTabs monoblocksmcstained = new MonoblocksMCStained(CreativeTabs.getNextID(), "Monoblocksmcstained");
   public static CreativeTabs monoblocksLighting = new MonoblocksLighting(CreativeTabs.getNextID(), "MonoblocksLighting");
   public static CreativeTabs monoblocksSignage = new MonoblocksSignage(CreativeTabs.getNextID(), "MonoblocksSignage");
   public static CreativeTabs monoblocksfences = new MonoblocksFences(CreativeTabs.getNextID(), "MonoblocksFences");
   public static CreativeTabs monoblocksDoors = new MonoblocksDoors(CreativeTabs.getNextID(), "MonoblocksDoors");
   public static CreativeTabs monoblocksTiles = new MonoblocksTiles(CreativeTabs.getNextID(), "MonoblocksTiles");
   public static CreativeTabs monoblocksOther = new MonoblocksOther(CreativeTabs.getNextID(), "MonoblocksOther");
   @Instance("Monoblocks")
   public static Monoblocks instance;
   public static final int guiIDIronFurnace = 0;
   public static final int guiIDFryer = 1;
   public static final int guiIDRoundBBQ = 2;

   @SidedProxy(
      clientSide = "com.monoblocks.proxy.ClientProxy",
      serverSide = "com.monoblocks.proxy.CommonProxy"
   )
   public static CommonProxy proxy;
   public static final PacketLine packetPipeline = new PacketLine();

   @EventHandler
   public void PreInit(FMLPreInitializationEvent pre) {
      System.out.println("[" + version + "] Hello");
      // proxy.capes();
      Configuration config = new Configuration(new File(pre.getModConfigurationDirectory().getAbsolutePath() + "/Monoblocks.cfg"));
      config.load();
      OreGen = config.get("general", "Enable or Disable OreGen", true).getBoolean(true);
      Experimental = config.get("general", "Enable or Disable Experimental Blocks/Items? Note: These will become enabled when I deem them stable.", true).getBoolean(true);
      TrafficSigns = config.get("general", "Enable or Disable Traffic Signs", true).getBoolean(true);
      OreDict = config.get("general", "Enable or Disable things in the ore dictionary (metal ingots, flesh/rainbow dyes etc.)", true).getBoolean(true);
      SmallTrafficLight = config.get("general", "If true, traffic lights will be only 1 block tall", false).getBoolean(false);
      config.save();
   }

   @EventHandler
   public void init(FMLInitializationEvent intial)
   {
      System.out.println("[" + version + "] init Hello");
      MBlocks.registerBlocks();
      MItems.registerItems();
      MSmelting.registerSmelting();
      MTileEntities.registerTileEntities();
      new MRegisterEntities();
      proxy.registerRenderThings();
      NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
      // proxy.capes();

      if (OreGen) {
         GameRegistry.registerWorldGenerator(new MonoblocksWorldGen(), 0);
      }

      if (Experimental) {
         MFluids.registerFluids();
         MFluids.registerBuckets();
      }

      if (TrafficSigns) {
         SignReg.regSigns();
      }

      if (OreDict) {
         new MOres();
      }

      packetPipeline.initalise();
   }

   @EventHandler
   public void PostInit(FMLPostInitializationEvent post) {
      packetPipeline.postInitialise();
      new MRecipes();
      System.out.println("[" + version + "] : All components of Monoblocks have sucessfully initialised.");
   }
}
