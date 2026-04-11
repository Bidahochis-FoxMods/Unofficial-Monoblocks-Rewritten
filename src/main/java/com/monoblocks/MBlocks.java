package com.monoblocks;

import com.bidahochi.BlockMod.blocks.roadpaints.ScrollingItemBlock;
import com.bidahochi.BlockMod.core.handler.IFoxBlockIDs;
import com.bidahochi.BlockMod.core.handler.SimpleBlockIDGroupRegister;
import com.bidahochi.BlockMod.core.handler.baseBlocks.blockPropertys.BlockProperty;
import com.bidahochi.BlockMod.core.handler.baseBlocks.blockPropertys.FallingBlockProperty;
import com.bidahochi.BlockMod.items.BaseItems.BaseItemBlock_1XTile;
import com.monoblocks.blocks.GlassDoor;
import com.monoblocks.blocks.*;
import com.monoblocks.blocks.doors.*;
import com.monoblocks.blocks.lampblocks.*;
import com.monoblocks.blocks.powerpole.*;
import com.monoblocks.blocks.props.*;
import com.monoblocks.blocks.signage.variable.*;
import com.monoblocks.items.*;
import com.monoblocks.utilities.ItemBroken;
import com.monoblocks.utilities.PartiallyBroken;
import com.tbea.MonoBlockProp;
import com.tbea.TransparentMonoBlockProp;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

import java.util.HashMap;

import static com.monoblocks.Monoblocks.monoblocksmcstained;
import static net.minecraft.block.Block.*;

public class MBlocks {
   public static Block StainedCobble;
   public static Block StainedStoneFence;
   public static Block PlankFence;
   public static Block GlowstoneFence;
   public static Block IronFence;
   public static Block OrangePole;
   public static Block SafetyPole;
   public static Block TrafficConeSmall;
   public static Block BlackLampOn;
   public static Block BlackLamp;
   public static Block BlueLampOn;
   public static Block BlueLamp;
   public static Block BrownLampOn;
   public static Block BrownLamp;
   public static Block CyanLampOn;
   public static Block CyanLamp;
   public static Block GrayLampOn;
   public static Block GrayLamp;
   public static Block GreenLamp;
   public static Block GreenLampOn;
   public static Block LblueLampOn;
   public static Block LblueLamp;
   public static Block LgrayLampOn;
   public static Block LgrayLamp;
   public static Block LimeLampOn;
   public static Block LimeLamp;
   public static Block MagentaLamp;
   public static Block MagentaLampOn;
   public static Block PinkLamp;
   public static Block PinkLampOn;
   public static Block PurpleLampOn;
   public static Block PurpleLamp;
   public static Block OrangeLampOn;
   public static Block OrangeLamp;
   public static Block RedLampOn;
   public static Block RedLamp;
   public static Block YellowLamp;
   public static Block YellowLampOn;
   public static Block WhiteLampOn;
   public static Block WhiteLamp;
   public static Block WoodTable;
   public static Block EternalLoadingBlock;
   public static Block GoldenSand;
   public static Block Mud;
   public static Block OrangeBlock;
   public static Block Sifter;
   public static Block RedCrystalOre;
   public static Block RedCrystalBlock;
   public static Block PurpleCrystalBlock;
   public static Block PurpleCrystalOre;
   public static Block OldLamp;
   public static Block Flasher;
   public static Block blockIronFurnaceIdle;
   public static Block blockIronFurnaceActive;
   public static Block FallingStone;
   public static Block Fryer;
   public static Block Stoplight;
   public static Block RoundBBQ;
   public static Block Gravel;
   public static Block ZincOre;
   public static Block CopperOre;
   public static Block SilverOre;
   public static Block AluminumOre;
   public static Block SteelOre;
   public static Block RedLight;
   public static Block RedGlow;
   public static Block YellowGlow;
   public static Block GreenGlow;
   public static Block GrayGlow;
   public static Block LgrayGlow;
   public static Block CyanGlow;
   public static Block BrownGlow;
   public static Block PurpleGlow;
   public static Block PinkGlow;
   public static Block BlueGlow;
   public static Block LimeGlow;
   public static Block BlackGlow;
   public static Block LblueGlow;
   public static Block OrangeGlow;
   public static Block MagentaGlow;
   public static Block WhiteGlow;
   public static Block TrafficCone;
   public static Block GlassDoor;
   public static Block ExampleBlock;
   public static Block StoneFence;
   public static Block WaterBlock;
   public static Block BlackDoor;
   public static Block BlueDoor;
   public static Block BrownDoor;
   public static Block CyanDoor;
   public static Block GrayDoor;
   public static Block GreenDoor;
   public static Block LgrayDoor;
   public static Block LblueDoor;
   public static Block LimeDoor;
   public static Block MagentaDoor;
   public static Block OrangeDoor;
   public static Block PinkDoor;
   public static Block PurpleDoor;
   public static Block RedDoor;
   public static Block YellowDoor;
   public static Block WhiteDoor;
   public static Block StoneLantern;
   public static Block AluminumFence;
   public static Block SingleStoplight;
   public static Block YellowSnowBlock;
   public static Block YellowSnow;
   public static Block Fence;
   public static Block StoplightPole;
   public static Block North;
   public static Block South;
   public static Block East;
   public static Block West;
   public static Block Gate;
   public static Block GateClosed;
   public static Block Flag;
   public static Block YellowStoplight;
   public static Block YellowStoplightPole;
   public static Block StreetLight;
   public static Block Stereo;
   public static Block GuardRail;
   public static Block InsideGuardRail;
   public static Block OutsideGuardRail;
   public static Block DoubleStreetLight;
   public static Block TrainCrossing;
   public static Block StopAhead;
   public static Block Yield;
   public static Block Construction;
   public static Block Showcase;
   public static Block CDPlayer;
   public static Block GlowFence;
   public static Block PlasticFence;
   public static Block CobbleFence;
   public static Block PlasticStairs;
   public static Block Cattleguard;

   public static Block MonsterEggBricks;
   public static Block BlackLampInverted;
   public static Block BlueLampInverted;
   public static Block BrownLampInverted;
   public static Block CyanLampInverted;
   public static Block GrayLampInverted;
   public static Block GreenLampInverted;
   public static Block LblueLampInverted;
   public static Block LgrayLampInverted;
   public static Block LimeLampInverted;
   public static Block YellowLine;
   public static Block YellowReflector;
   public static Block Pole1;
   public static Block Pole2;
   public static Block Pole3;
   public static Block Pole4;
   public static Block Pole5;
   public static Block Pole6;
   public static Block Pole7;
   public static Block Pole8;
   public static Block Pole9;
   public static Block Pole10;
   public static Block Pole11;
   public static Block Pole12;
   public static Block Pole13;
   public static Block Pole14;
   public static Block Transformer;
   public static Block Insulator1;
   public static Block Insulator2;
   public static Block Shoplight;
   public static Block OrangeShoplight;
   public static Block StoplightStick;
   public static Block YellowStoplightStick;
   public static Block Streetlightpole;
   public static Block MonoTiles;
   public static Block LowIntensityBlocks;
   public static Block PowerPole15;
   public static Block PowerPole16;
   public static Block IronLantern;
   public static Block GroundConnector;
   public static Block StainedGlassFence;
   public static Block StoneTile;
   public static Block WoodTile;
   public static Block GlassTile;
   public static Block GlowstoneTiles;
   public static Block IronTiles;

   public static Block StoneBrickTiles;
   public static Block FancyGlass;

   public static Block XPBlocks;

   public static Block PowerPole17;
   public static Block PowerPole18;
   public static Block ParkingMeter;
   public static Block TrafficLightLeftArrow;
   public static Block TrafficLightRightArrow;
   public static Block TrafficLightStraightArrow;
   public static Block TrafficLightStickLeftArrow;
   public static Block TrafficLightStickRightArrow;
   public static Block TrafficLightStickStraightArrow;
   public static Block GoldenDoor;
   public static Block DiamondDoor;
   public static Block FancyStreetlight;
   public static Block HalogenLight;
   public static Block RailwayCrossingLight;
   public static Block TallTrafficLight;
   public static Block TallTrafficLightYellow;
   public static Block VariableSpeedSignA;
   public static Block VariableSpeedSignB;
   public static Block VariableSpeedSignC;
   public static Block VariableSpeedSignD;
   public static Block VariableSpeedSignE;
   public static Block VariableSpeedSignF;
   public static Block VariableSpeedSignG;
   public static Block VariableSpeedSignH;
   public static Block VariableSpeedSignI;
   public static Block VariableSpeedSignJ;
   public static Block Barrier;
   public static Block BarrierCorner;
   public static Block YellowLeftArrow;
   public static Block YellowRightArrow;
   public static Block YellowStraightArrow;
   //public static Block Vinyl;

   public static void registerBlocks()
   {
      HashMap<IFoxBlockIDs, BlockProperty> tempBlockCache = new HashMap();

      final String PICKAXE = "pickaxe";
      final String SHEARS = "shears";
      final String SHOVEL = "shovel";
      final String AXE = "AXE";

      { // stucco
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.stucco, Material.rock, 2.5F, 2.0F,
                 PICKAXE, 1,
                 soundTypeStone, 16, "stucco/stucco", Monoblocks.monoblocksTab, false);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.stucco.block = property.getNewBlock();
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.stucco, property);
      }

      { // Vinyl
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.vinyl, Material.rock, 2.5F, 2.0F,
                 AXE, 1,
                 soundTypeWood, 16,"vinyl/vinyl", Monoblocks.monoblocksTab, false);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.vinyl.block = property.getNewBlock();
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.vinyl, property);
      }

      //Stucco = new Stucco();
      //Vinyl = new Vinyl();
      YellowStraightArrow = (new YellowStraightArrow()).setCreativeTab(Monoblocks.monoblocksSignage);
      YellowLeftArrow = (new YellowLeftArrow()).setCreativeTab(Monoblocks.monoblocksSignage);
      YellowRightArrow = (new YellowRightArrow()).setCreativeTab(Monoblocks.monoblocksSignage);
      BarrierCorner = (new BarrierCorner()).setCreativeTab(Monoblocks.monoblocksSignage);
      Barrier = (new Barrier()).setCreativeTab(Monoblocks.monoblocksSignage);
      TallTrafficLight = (new TallTrafficLight()).setCreativeTab(Monoblocks.monoblocksSignage);
      TallTrafficLightYellow = (new TallTrafficLightYellow()).setCreativeTab(Monoblocks.monoblocksSignage);
      VariableSpeedSignA = new VariableSpeedSignA();
      VariableSpeedSignB = new VariableSpeedSignB();
      VariableSpeedSignC = new VariableSpeedSignC();
      VariableSpeedSignD = new VariableSpeedSignD();
      VariableSpeedSignE = new VariableSpeedSignE();
      VariableSpeedSignF = new VariableSpeedSignF();
      VariableSpeedSignG = new VariableSpeedSignG();
      VariableSpeedSignH = new VariableSpeedSignH();
      VariableSpeedSignI = new VariableSpeedSignI();
      VariableSpeedSignJ = new VariableSpeedSignJ();
      RailwayCrossingLight = (new RailwayCrossingLight(Material.iron)).setCreativeTab(Monoblocks.monoblocksSignage);
      HalogenLight = (new HalogenLight()).setCreativeTab(Monoblocks.monoblocksLighting);
      FancyStreetlight = (new FancyStreetLight()).setCreativeTab(Monoblocks.monoblocksLighting);
      DiamondDoor = new DiamondDoor(Material.iron);
      GoldenDoor = new GoldenDoor(Material.iron);
      TrafficLightStickStraightArrow = (new StoplightStickStraightArrow()).setCreativeTab(Monoblocks.monoblocksSignage);
      TrafficLightStickRightArrow = (new StoplightStickRightArrow()).setCreativeTab(Monoblocks.monoblocksSignage);
      TrafficLightStickLeftArrow = (new StoplightStickLeftArrow()).setCreativeTab(Monoblocks.monoblocksSignage);
      TrafficLightStraightArrow = (new TrafficLightStraightArrow()).setCreativeTab(Monoblocks.monoblocksSignage);
      TrafficLightRightArrow = (new TrafficLightRightArrow()).setCreativeTab(Monoblocks.monoblocksSignage);
      TrafficLightLeftArrow = (new TrafficLightLeftArrow()).setCreativeTab(Monoblocks.monoblocksSignage);
      ParkingMeter = (new ParkingMeter()).setCreativeTab(Monoblocks.monoblocksSignage);
      PowerPole18 = (new PowerPole18()).setCreativeTab(Monoblocks.monoblocksOther);
      //ColoredQuartz = new ColoredQuartz();

      { // ColorQuartz
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.coloredquartz, Material.rock, 2.5F, 2.0F,
                 PICKAXE, 1,
                 soundTypeStone, 16,"colorQuartz/colorQuartz", Monoblocks.monoblocksmcstained);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.coloredquartz.block = property.getNewBlock();
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.coloredquartz, property);
      }

      { // TransparentPlastic

         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.transparentplastic, Material.wood, 2.5F, 2.0F,
                 PICKAXE, 1,
                 soundTypeStone, 16,"plastic/plastic", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.transparentplastic.block = property.getNewBlock();
         //property.is1XTileAllowed = true;
         //tempBlockCache.put(MBlocksEnum.transparentplastic, property);
      }

      //TransparentPlastic = new TransparentPlastic(Material.wood);
      //FancyBricksTiles = (new FancyBricksTiles()).setCreativeTab(Monoblocks.monoblocksTiles);
      //FancyBricks2Tiles = (new FancyBricks2Tiles()).setCreativeTab(Monoblocks.monoblocksTiles);

      { // fancybricks
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.fancybricks, Material.rock, 2.5F, 2.0F,
                 PICKAXE, 1,
                 soundTypeStone, 16,"fancybricks/fancybricks", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.fancybricks.block = property.getNewBlock();
         property.blockRegisterNameOverrides.put(property.TileKey, "fancybrickstiles");
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.fancybricks, property);
      }

      { // FancyBricks2
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.fancybricks2, Material.rock, 2.5F, 2.0F,
                 PICKAXE, 1,
                 soundTypeStone, 16,"fancybricks2/fancybricks2", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.fancybricks2.block = property.getNewBlock();
         property.blockRegisterNameOverrides.put(property.TileKey, "fancybricks2tiles");
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.fancybricks2, property);
      }

      //FancyBricks = new FancyBricks();
      //FancyBricks2 = new FancyBricks2();
      FancyGlass = new FancyGlass();
      StoneBrickTiles = (new StoneBrickTiles()).setCreativeTab(Monoblocks.monoblocksTiles);
      //SandTiles = (new SandTiles()).setCreativeTab(Monoblocks.monoblocksTiles);
      //GravelTiles = (new GravelTiles()).setCreativeTab(Monoblocks.monoblocksTiles);
      IronTiles = (new IronTiles()).setCreativeTab(Monoblocks.monoblocksTiles);
      GlowstoneTiles = (new GlowstoneTile()).setCreativeTab(Monoblocks.monoblocksTiles);
      //LowIntensityTiles = (new LowIntensityTiles()).setCreativeTab(Monoblocks.monoblocksTiles);
      StoneTile = (new StoneTile()).setCreativeTab(Monoblocks.monoblocksTiles);
      GlassTile = (new GlassTile()).setCreativeTab(Monoblocks.monoblocksTiles);
      //CobbleTile = (new CobblestoneTile()).setCreativeTab(Monoblocks.monoblocksTiles);
      WoodTile = (new WoodTile()).setCreativeTab(Monoblocks.monoblocksTiles);
      StainedGlassFence = new StainedGlassFence();
      IronLantern = (new IronLantern()).setCreativeTab(Monoblocks.monoblocksLighting);
      MonoTiles = (new MonoTiles()).setCreativeTab(Monoblocks.monoblocksTiles);


      { // LowIntensityBlocks
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.lowintensityblocks, Material.wood, 1.5F, 3.0F,
                 AXE, 1,
                 soundTypeWood, 16,"lowIntensityBlocks/lowIntensityBlocks", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.lowintensityblocks.block = property.getNewBlock();
         property.blockRegisterNameOverrides.put(property.TileKey, "lowintensitytiles");
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.lowintensityblocks, property);
      }

      //LowIntensityBlocks = new LowIntensityBlocks();


      Shoplight = (new Shoplight()).setCreativeTab(Monoblocks.monoblocksLighting);
      OrangeShoplight = (new OrangeShoplight()).setCreativeTab(Monoblocks.monoblocksLighting);
      StoplightStick = (new SingleStoplight2()).setCreativeTab(Monoblocks.monoblocksSignage);
      YellowStoplightStick = (new YellowStoplightWithStick()).setCreativeTab(Monoblocks.monoblocksSignage);
      Streetlightpole = (new StreetlightPole()).setCreativeTab(Monoblocks.monoblocksLighting);
      GroundConnector = (new GroundConnector()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole1 = (new PowerPole1()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole2 = (new PowerPole2()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole3 = (new PowerPole3()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole4 = (new PowerPole4()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole5 = (new PowerPole5()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole6 = (new PowerPole6()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole7 = (new PowerPole7()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole8 = (new PowerPole8()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole9 = (new PowerPole9()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole10 = (new PowerPole10()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole11 = (new PowerPole11()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole12 = (new PowerPole12()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole13 = (new PowerPole13()).setCreativeTab(Monoblocks.monoblocksOther);
      Pole14 = (new PowerPole14()).setCreativeTab(Monoblocks.monoblocksOther);
      Transformer = (new Transformer()).setCreativeTab(Monoblocks.monoblocksOther);
      Insulator1 = (new Insulator1()).setCreativeTab(Monoblocks.monoblocksOther);
      Insulator2 = (new Insulator2()).setCreativeTab(Monoblocks.monoblocksOther);
      YellowLine = new YellowLine();

      { // darkstonebrick
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.darkstonebrick, Material.rock, 2.0F, 2.0F,
                 SHOVEL, 0,
                 soundTypeStone, 1,"darkstonebrick/darkstonebrick", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.darkstonebrick.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.darkstonebrick, property);
      }

      { // bricks
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.bricks, Material.rock, 2.0F, 2.0F,
                 SHOVEL, 0,
                 soundTypeStone, 1,"bricks/bricks", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.bricks.block = property.getNewBlock();
         //property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.bricks, property);
      }

      MBlocksEnum.eggbricks.block = (new SilverfishBlock()).setBlockName("eggbricks").setBlockTextureName("monoblocks:bricks");

      { // HardBlock
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.hardblock, Material.rock, 2.5F, 2.0F,
                 SHOVEL, 0,
                 soundTypeStone, 16,"hardBlock/hardBlock", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.hardblock.block = property.getNewBlock();
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.hardblock, property);
      }

      { // ColorGravel
         BlockProperty property = new FallingBlockProperty(MBlocksEnum.colorgravel, Material.sand, 2.5F, 2.0F,
                 SHOVEL, 0,
                 soundTypeGravel, 16,"colorGravel/colorGravel", Monoblocks.monoblocksmcstained);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.colorgravel.block = property.getNewBlock();
         property.blockRegisterNameOverrides.put(property.TileKey, "graveltiles");
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.colorgravel, property);
      }

      { // ColorSand
         BlockProperty property = new FallingBlockProperty(MBlocksEnum.colorsand, Material.sand, 2.5F, 2.0F,
                 SHOVEL, 0,
                 soundTypeSand, 16,"colorsand/colorSand", Monoblocks.monoblocksmcstained);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.colorsand.block = property.getNewBlock();
         property.blockRegisterNameOverrides.put(property.TileKey, "sandtiles");
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.colorsand, property);
      }

      YellowReflector = (new YellowReflector()).setCreativeTab(Monoblocks.monoblocksSignage);
      Cattleguard = (new Cattleguard()).setCreativeTab(Monoblocks.monoblocksOther);
      GlowFence = new GlowFence();
      //PlasticFence = new PlasticFence();
      CDPlayer = new CDPlayer();
      GuardRail = (new GuardRail()).setCreativeTab(Monoblocks.monoblocksSignage);
      InsideGuardRail = (new InsideGuardRail()).setCreativeTab(Monoblocks.monoblocksSignage);
      OutsideGuardRail = (new OutsideGuardRail()).setCreativeTab(Monoblocks.monoblocksSignage);
      DoubleStreetLight = (new DoubleStreetLight()).setCreativeTab(Monoblocks.monoblocksLighting);
      YellowStoplight = (new YellowStoplight()).setCreativeTab(Monoblocks.monoblocksSignage);
      YellowStoplightPole = (new YellowStoplightPole()).setCreativeTab(Monoblocks.monoblocksSignage);
      //RoughPlastic = new RoughPlastic(Material.wood);
      { // roughplastic
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.roughplastic, Material.wood, 2.0F, 2.0F,
                 AXE, 1,
                 soundTypeWood, 1,"roughplastic/roughplastic", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.roughplastic.block = property.getNewBlock();
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.roughplastic, property);
      }

      { // colorplastic
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.colorplastic, Material.wood, 2.5F, 2.0F,
                 AXE, 1,
                 soundTypeWood, 16,"plastic/plastic", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.colorplastic.block = property.getNewBlock();
         property.blockRegisterNameOverrides.put(property.FenceKey, "plasticfence");
         property.isFenceBlockAllowed = true;
         property.getNewFenceBLock().setCreativeTab(Monoblocks.monoblocksfences);
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         tempBlockCache.put(MBlocksEnum.colorplastic, property);
      }

      { // smoothiron
         MonoBlockProp property = new MonoBlockProp(
                 MBlocksEnum.smoothiron,
                 Material.iron,
                 10.0F,
                 10.0F,
                 PICKAXE, // important: iron uses pickaxe, not shovel
                 0,
                 soundTypeMetal,
                 1,
                 "smoothiron",
                 Monoblocks.monoblocksTab
         );

         property.setResourceFolderName(Monoblocks.MODID);

         MBlocksEnum.smoothiron.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.smoothiron, property);
      }

      //Iron = new SmoothIron(Material.iron);

      { // gold
         MonoBlockProp property = new MonoBlockProp(
                 MBlocksEnum.gold,
                 Material.iron,
                 10.0F,
                 10.0F,
                 PICKAXE, 0,
                 soundTypeMetal,
                 1,
                 "gold",
                 Monoblocks.monoblocksTab
         );

         property.setResourceFolderName(Monoblocks.MODID);

         MBlocksEnum.gold.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.gold, property);
      }

      //Gold = new Gold(Material.iron);

      { // diamond
         MonoBlockProp property = new MonoBlockProp(
                 MBlocksEnum.diamond,
                 Material.iron,
                 10.0F,
                 10.0F,
                 PICKAXE, 0,
                 soundTypeMetal,
                 1,
                 "diamond",
                 Monoblocks.monoblocksTab
         );

         property.setResourceFolderName(Monoblocks.MODID);

         MBlocksEnum.diamond.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.diamond, property);
      }

      //Diamond = new Diamond(Material.iron);
      YellowSnowBlock = (new YellowSnowBlock(Material.snow)).setCreativeTab(Monoblocks.monoblocksTab);
      YellowSnow = new YellowSnow(Material.snow);
      WaterBlock = new WaterBlock(Material.water);
      SingleStoplight = (new SingleStoplight()).setCreativeTab(Monoblocks.monoblocksSignage);
      StoplightPole = (new StoplightWithPole(Material.iron)).setCreativeTab(Monoblocks.monoblocksSignage);
      Flag = new Flag();
      Gate = (new Gate(Material.iron, false)).setCreativeTab(Monoblocks.monoblocksSignage);
      GateClosed = new Gate(Material.iron, true);
      BlackDoor = new BlackDoor(Material.glass);
      BlueDoor = new BlueDoor(Material.glass);
      BrownDoor = new BrownDoor(Material.glass);
      CyanDoor = new CyanDoor(Material.glass);
      GrayDoor = new GrayDoor(Material.glass);
      GreenDoor = new GreenDoor(Material.glass);
      LblueDoor = new LblueDoor(Material.glass);
      LgrayDoor = new LgrayDoor(Material.glass);
      LimeDoor = new LimeDoor(Material.glass);
      MagentaDoor = new MagentaDoor(Material.glass);
      OrangeDoor = new OrangeDoor(Material.glass);
      PinkDoor = new PinkDoor(Material.glass);
      PurpleDoor = new PurpleDoor(Material.glass);
      RedDoor = new RedDoor(Material.glass);
      WhiteDoor = new WhiteDoor(Material.glass);
      YellowDoor = new YellowDoor(Material.glass);
      StreetLight = (new StreetLight()).setCreativeTab(Monoblocks.monoblocksLighting);
      Stereo = (new Stereo()).setCreativeTab(Monoblocks.monoblocksOther);
      Showcase = (new Showcase(Material.glass)).setCreativeTab(Monoblocks.monoblocksOther);
      StoneLantern = (new StoneLantern()).setCreativeTab(Monoblocks.monoblocksLighting);
      StoneFence = (new BlockFence("stone", Material.rock)).setBlockName("Stone Fence").setCreativeTab(Monoblocks.monoblocksfences).setBlockTextureName("monoblocks:stone").setHardness(3.0F).setResistance(5.0F);
      ExampleBlock = new Placeholder(0, Material.rock);
      GlassDoor = new GlassDoor(Material.glass);
      OrangePole = (new OrangePole()).setCreativeTab(Monoblocks.monoblocksSignage);
      SafetyPole = (new SafetyPole()).setCreativeTab(Monoblocks.monoblocksSignage);
      TrafficConeSmall = (new TrafficConeSmall(Material.wood)).setCreativeTab(Monoblocks.monoblocksSignage);
      TrafficCone = (new TrafficCone()).setCreativeTab(Monoblocks.monoblocksSignage);
      RoundBBQ = (new RoundBBQ(Material.iron, false)).setBlockName("Round BBQ").setCreativeTab(Monoblocks.monoblocksOther);
      Fence = new MonoblockFence();
      StainedStoneFence = new StainedStoneFence();
      PlankFence = new PlankFence();
      GlowstoneFence = new GlowstoneFence();
      //StainedCobble = new ColorCobble(Material.rock);

      { // colorCobble
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.colorCobble, Material.rock, 2.5F, 2.0F,
                 PICKAXE, 1,
                 soundTypeStone, 16,"colorCobble/colorCobble", Monoblocks.monoblocksmcstained);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.colorCobble.block = property.getNewBlock();
         property.blockRegisterNameOverrides.put(property.TileKey, "cobbletiles");
         property.blockRegisterNameOverrides.put(property.FenceKey, "cobblefence");
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         property.isFenceBlockAllowed = true;
         tempBlockCache.put(MBlocksEnum.colorCobble, property);
      }

      IronFence = new IronFence();
      RoundBBQ = (new RoundBBQ(Material.iron, true)).setBlockName("Round BBQ").setCreativeTab(Monoblocks.monoblocksOther);
      //RedBlock = (new RedBlock(4003, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //GreenBlock = (new GreenBlock(4004, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //BlueBlock = (new BlueBlock(4005, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //PurpleBlock = (new PurpleBlock(4006, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //PinkBlock = (new PinkBlock(4007, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //YellowBlock = (new YellowBlock(4008, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //BlackBlock = (new BlackBlock(4009, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //WhiteBlock = (new WhiteBlock(4010, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //OrangeBlock = (new OrangeBlock(4011, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //RainbowBlock = (new RainbowBlock(4012, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //LimeBlock = (new LimeBlock(4013, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //BrownBlock = (new BrownBlock(4014, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //InvisibleBlock = (new InvisibleBlock(4015, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //GrayBlock = (new GrayBlock(4016, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //FleshBlock = (new FleshBlock(4017, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //Lgray = (new Lgray(4018, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //Lblue = (new Lblue(4019, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //MagentaBlock = (new MagentaBlock(4020, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);
      //CyanBlock = (new CyanBlock(4021, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);

      { // red
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.RedBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "red", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.RedBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.RedBlock, property);
      }

      { // green
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.GreenBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "green", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.GreenBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.GreenBlock, property);
      }

      { // blue
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.BlueBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "blue", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlueBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.BlueBlock, property);
      }

      { // purple
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.PurpleBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "purple", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.PurpleBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.PurpleBlock, property);
      }

      { // pink
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.PinkBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "pink", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.PinkBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.PinkBlock, property);
      }

      { // yellow
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.YellowBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "yellow", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.YellowBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.YellowBlock, property);
      }

      { // black
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.BlackBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "black", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlackBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.BlackBlock, property);
      }

      { // white
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.WhiteBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "white", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.WhiteBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.WhiteBlock, property);
      }

      { // orange
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.OrangeBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "orange", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);;
         MBlocksEnum.OrangeBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.OrangeBlock, property);
      }

      { // rainbow
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.RainbowBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "rainbow", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.RainbowBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.RainbowBlock, property);
      }

      { // lime
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.LimeBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "lime", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LimeBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.LimeBlock, property);
      }

      { // brown
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.BrownBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "brown", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BrownBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.BrownBlock, property);
      }

      { // invisible

         MBlocksEnum.InvisibleBlock.block = (new InvisibleBlock(4015, Material.wood)).setCreativeTab(Monoblocks.monoblocksTab);

      }

      { // gray
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.GrayBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "gray", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.GrayBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.GrayBlock, property);
      }

      { // flesh
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.FleshBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "flesh", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.FleshBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.FleshBlock, property);
      }

      { // lgray
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.Lgray, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "lightgray", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.Lgray.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.Lgray, property);
      }

      { // lblue
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.Lblue, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "lightblue", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.Lblue.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.Lblue, property);
      }

      { // magenta
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.MagentaBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "magenta", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.MagentaBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.MagentaBlock, property);
      }

      { // cyan
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.CyanBlock, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "cyan", Monoblocks.monoblocksTab);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.CyanBlock.block = property.getNewBlock();
         tempBlockCache.put(MBlocksEnum.CyanBlock, property);
      }

      { // colorStone
         MonoBlockProp property = new MonoBlockProp(MBlocksEnum.colorStone, Material.rock, 2.0F, 2.0F,
                 PICKAXE, 0,
                 soundTypeStone, 16,"colorStone/colorStone", Monoblocks.monoblocksmcstained);
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.colorStone.block = property.getNewBlock();
         property.blockRegisterNameOverrides.put(property.TileKey, "stonetiles");
         property.blockRegisterNameOverrides.put(property.FenceKey, "stonefence");
         property.getNewBlock1XTile().setCreativeTab(Monoblocks.monoblocksTiles);
         property.is1XTileAllowed = true;
         property.isFenceBlockAllowed = true;
         tempBlockCache.put(MBlocksEnum.colorStone, property);
      }

      //RedStone = (new RedStone(4022, Material.rock)).setCreativeTab(monoblocksmcstained);
      //BlueStone = (new BlueStone(4023, Material.rock)).setCreativeTab(monoblocksmcstained);
      //YellowStone = (new YellowStone(4024, Material.rock)).setCreativeTab(monoblocksmcstained);
      //GreenStone = (new GreenStone(4025, Material.rock)).setCreativeTab(monoblocksmcstained);
      //GrayStone = (new GrayStone(4026, Material.rock)).setCreativeTab(monoblocksmcstained);
      //PinkStone = (new PinkStone(4027, Material.rock)).setCreativeTab(monoblocksmcstained);
      //BlackStone = (new BlackStone(4028, Material.rock)).setCreativeTab(monoblocksmcstained);
      //WhiteStone = (new WhiteStone(4029, Material.rock)).setCreativeTab(monoblocksmcstained);
      //PurpleStone = (new PurpleStone(4030, Material.rock)).setCreativeTab(monoblocksmcstained);
      //LgrayStone = (new LgrayStone(4031, Material.rock)).setCreativeTab(monoblocksmcstained);
      //MagentaStone = (new MagentaStone(4032, Material.rock)).setCreativeTab(monoblocksmcstained);
      //Lbluestone = (new Lbluestone(4033, Material.rock)).setCreativeTab(monoblocksmcstained);
      //OrangeStone = (new OrangeStone(4034, Material.rock)).setCreativeTab(monoblocksmcstained);
      //LimeStone = (new LimeStone(4035, Material.rock)).setCreativeTab(monoblocksmcstained);
      //BrownStone = (new BrownStone(4036, Material.rock)).setCreativeTab(monoblocksmcstained);
      //CyanStone = (new CyanStone(4037, Material.rock)).setCreativeTab(monoblocksmcstained);

      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.RedStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "redstone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.RedStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.RedStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BlueStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "bluestone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.BlueStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.BlueStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GreenStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "greenstone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.GreenStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.GreenStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GrayStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "graystone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.GrayStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.GrayStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PinkStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "pinkstone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.PinkStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.PinkStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.YellowStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "yellowstone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.YellowStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.YellowStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BlackStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "blackstone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.BlackStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.BlackStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.WhiteStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "whitestone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.WhiteStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.WhiteStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.MagentaStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "magentastone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.MagentaStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.MagentaStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LgrayStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "lgraystone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.LgrayStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.LgrayStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.Lbluestone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "lbluestone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.Lbluestone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.Lbluestone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PurpleStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "purplestone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.PurpleStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.PurpleStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BrownStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "brownstone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.BrownStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.BrownStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.CyanStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "cyanstone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.CyanStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.CyanStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LimeStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "limestone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.LimeStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.LimeStone, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.OrangeStone, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "orangestone", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.OrangeStone.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.OrangeStone, p); }


      //BlackPlanks = (new BlackPlanks(4038, Material.wood)).setCreativeTab(monoblocksmcstained);
      //BluePlanks = (new BluePlanks(4039, Material.wood)).setCreativeTab(monoblocksmcstained);
      //BrownPlanks = (new BrownPlanks(4040, Material.wood)).setCreativeTab(monoblocksmcstained);
      //CyanPlanks = (new CyanPlanks(4041, Material.wood)).setCreativeTab(monoblocksmcstained);
      //GrayPlanks = (new GrayPlanks(4042, Material.wood)).setCreativeTab(monoblocksmcstained);
      //GreenPlanks = (new GreenPlanks(4043, Material.wood)).setCreativeTab(monoblocksmcstained);
      //Lblueplanks = (new Lblueplanks(4044, Material.wood)).setCreativeTab(monoblocksmcstained);
      //Lgrayplanks = (new Lgrayplanks(4045, Material.wood)).setCreativeTab(monoblocksmcstained);
      //LimePlanks = (new LimePlanks(4046, Material.wood)).setCreativeTab(monoblocksmcstained);
      //MagentaPlanks = (new MagentaPlanks(4047, Material.wood)).setCreativeTab(monoblocksmcstained);
      //OrangePlanks = (new OrangePlanks(4048, Material.wood)).setCreativeTab(monoblocksmcstained);
      //PinkPlanks = (new PinkPlanks(4049, Material.wood)).setCreativeTab(monoblocksmcstained);
      //PurplePlanks = (new PurplePlanks(4050, Material.wood)).setCreativeTab(monoblocksmcstained);
      //RedPlanks = (new RedPlanks(4051, Material.wood)).setCreativeTab(monoblocksmcstained);
      //WhitePlanks = (new WhitePlanks(4052, Material.wood)).setCreativeTab(monoblocksmcstained);
      //YellowPlanks = (new YellowPlanks(4053, Material.wood)).setCreativeTab(monoblocksmcstained);

      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BlackPlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "blackplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.BlackPlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.BlackPlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BluePlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "blueplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.BluePlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.BluePlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BrownPlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "brownplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.BrownPlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.BrownPlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.CyanPlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "cyanplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.CyanPlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.CyanPlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GrayPlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "grayplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.GrayPlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.GrayPlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GreenPlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "greenplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.GreenPlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.GreenPlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.Lblueplanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "lblueplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.Lblueplanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.Lblueplanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.Lgrayplanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "lgrayplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.Lgrayplanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.Lgrayplanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LimePlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "limeplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.LimePlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.LimePlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.MagentaPlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "magentaplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.MagentaPlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.MagentaPlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.OrangePlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "orangeplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.OrangePlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.OrangePlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PinkPlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "pinkplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.PinkPlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.PinkPlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PurplePlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "purpleplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.PurplePlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.PurplePlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.RedPlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "redplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.RedPlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.RedPlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.WhitePlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "whiteplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.WhitePlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.WhitePlanks, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.YellowPlanks, Material.wood, 2.0F, 2.0F, AXE, 0, soundTypeWood, 1, "yellowplanks", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.YellowPlanks.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.YellowPlanks, p); }

      //BlackStoneBrick = (new BlackStoneBrick(4054, Material.rock)).setCreativeTab(monoblocksmcstained);
      //BlueStoneBrick = (new BlueStoneBrick(4055, Material.rock)).setCreativeTab(monoblocksmcstained);
      //BrownStoneBrick = (new BrownStoneBrick(4056, Material.rock)).setCreativeTab(monoblocksmcstained);
      //CyanStoneBrick = (new CyanStoneBrick(4057, Material.rock)).setCreativeTab(monoblocksmcstained);
      //GrayStoneBrick = (new GrayStoneBrick(4058, Material.rock)).setCreativeTab(monoblocksmcstained);
      //GreenStoneBrick = (new GreenStoneBrick(4059, Material.rock)).setCreativeTab(monoblocksmcstained);
      //LBlueStoneBrick = (new LBlueStoneBrick(4060, Material.rock)).setCreativeTab(monoblocksmcstained);
      //LGrayStoneBrick = (new LGrayStoneBrick(4061, Material.rock)).setCreativeTab(monoblocksmcstained);
      //LimeStoneBrick = (new LimeStoneBrick(4062, Material.rock)).setCreativeTab(monoblocksmcstained);
      //MagentaStoneBrick = (new MagentaStoneBrick(4063, Material.rock)).setCreativeTab(monoblocksmcstained);
      //OrangeStoneBrick = (new OrangeStoneBrick(4064, Material.rock)).setCreativeTab(monoblocksmcstained);
      //PinkStoneBrick = (new PinkStoneBrick(4065, Material.rock)).setCreativeTab(monoblocksmcstained);
      //PurpleStoneBrick = (new PurpleStoneBrick(4067, Material.rock)).setCreativeTab(monoblocksmcstained);
      //RedStoneBrick = (new RedStoneBrick(4068, Material.rock)).setCreativeTab(monoblocksmcstained);
      //WhiteStoneBrick = (new WhiteStoneBrick(4069, Material.rock)).setCreativeTab(monoblocksmcstained);
      //YellowStoneBrick = (new YellowStoneBrick(4070, Material.rock)).setCreativeTab(monoblocksmcstained);

      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BlackStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "blackstonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.BlackStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.BlackStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BlueStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "bluestonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.BlueStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.BlueStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BrownStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "brownstonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.BrownStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.BrownStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.CyanStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "cyanstonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.CyanStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.CyanStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GrayStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "graystonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.GrayStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.GrayStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GreenStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "greenstonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.GreenStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.GreenStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LBlueStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "lbluestonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.LBlueStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.LBlueStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LGrayStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "lgraystonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.LGrayStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.LGrayStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LimeStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "limestonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.LimeStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.LimeStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.MagentaStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "magentastonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.MagentaStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.MagentaStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.OrangeStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "orangestonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.OrangeStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.OrangeStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PinkStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "pinkstonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.PinkStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.PinkStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PurpleStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "purplestonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.PurpleStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.PurpleStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.RedStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "redstonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.RedStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.RedStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.WhiteStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "whitestonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.WhiteStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.WhiteStoneBrick, p); }
      { MonoBlockProp p = new MonoBlockProp(MBlocksEnum.YellowStoneBrick, Material.rock, 2.0F, 2.0F, PICKAXE, 0, soundTypeStone, 1, "yellowstonebrick", monoblocksmcstained); p.setResourceFolderName(Monoblocks.MODID); MBlocksEnum.YellowStoneBrick.block = p.getNewBlock(); tempBlockCache.put(MBlocksEnum.YellowStoneBrick, p); }



      //BlackGlowstone = (new BlackGlowstone(4071, Material.glass)).setCreativeTab(monoblocksmcstained);
      //BlueGlowstone = (new BlueGlowstone(4072, Material.glass)).setCreativeTab(monoblocksmcstained);
      //BrownGlowstone = (new BrownGlowstone(4073, Material.glass)).setCreativeTab(monoblocksmcstained);
      //CyanGlowstone = (new CyanGlowstone(4074, Material.glass)).setCreativeTab(monoblocksmcstained);
      //GrayGlowstone = (new GrayGlowstone(4075, Material.glass)).setCreativeTab(monoblocksmcstained);
      //GreenGlowstone = (new GreenGlowstone(4076, Material.glass)).setCreativeTab(monoblocksmcstained);
      //Lblueglowstone = (new Lblueglowstone(4077, Material.glass)).setCreativeTab(monoblocksmcstained);
      //Lgrayglowstone = (new Lgrayglowstone(4078, Material.glass)).setCreativeTab(monoblocksmcstained);
      //LimeGlowstone = (new LimeGlowstone(4079, Material.glass)).setCreativeTab(monoblocksmcstained);
      //MagentaGlowstone = (new MagentaGlowstone(4080, Material.glass)).setCreativeTab(monoblocksmcstained);
      //PinkGlowstone = (new PinkGlowstone(4081, Material.glass)).setCreativeTab(monoblocksmcstained);
      //PurpleGlowstone = (new PurpleGlowstone(4082, Material.glass)).setCreativeTab(monoblocksmcstained);
      //OrangeGlowstone = (new OrangeGlowstone(4083, Material.glass)).setCreativeTab(monoblocksmcstained);
      //RedGlowstone = (new RedGlowstone(4084, Material.glass)).setCreativeTab(monoblocksmcstained);
      //WhiteGlowstone = (new WhiteGlowstone(4085, Material.glass)).setCreativeTab(monoblocksmcstained);
      //YellowGlowstone = (new YellowGlowstone(4084, Material.glass)).setCreativeTab(monoblocksmcstained);

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BlackGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "blackglowstone", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlackGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.BlackGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BlueGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "blueglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlueGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.BlueGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BrownGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "brownglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BrownGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.BrownGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.CyanGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "cyanglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.CyanGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.CyanGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GrayGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "grayglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.GrayGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.GrayGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GreenGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "greenglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.GreenGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.GreenGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LblueGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "lblueglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LblueGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.LblueGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LgrayGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "lgrayglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LgrayGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.LgrayGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LimeGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "limeglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LimeGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.LimeGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.MagentaGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "magentaglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.MagentaGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.MagentaGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PinkGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "pinkglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.PinkGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.PinkGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PurpleGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "purpleglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.PurpleGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.PurpleGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.OrangeGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "orangeglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.OrangeGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.OrangeGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.RedGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "redglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.RedGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.RedGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.WhiteGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "whiteglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.WhiteGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.WhiteGlowstone, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.YellowGlowstone, Material.glass, 2.0F, 2.0F, PICKAXE, 0, soundTypeGlass, 1, "yellowglowstone", monoblocksmcstained);

         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.YellowGlowstone.block = p.getNewBlock().setLightLevel(1.0F);
         //tempBlockCache.put(MBlocksEnum.YellowGlowstone, p);
      }

      Mud = (new Mud(4087, Material.ground)).setCreativeTab(Monoblocks.monoblocksTab);

      GoldenSand = (new GoldenSand(4088, Material.sand)).setCreativeTab(Monoblocks.monoblocksTab);

      RedCrystalOre = (new RedCrystalOre(4089, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);
      PurpleCrystalOre = (new PurpleCrystalOre(4090, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);
      PurpleCrystalBlock = (new PurpleCrystalBlock(4091, Material.glass)).setCreativeTab(Monoblocks.monoblocksTab);
      RedCrystalBlock = (new RedCrystalBlock(4092, Material.glass)).setCreativeTab(Monoblocks.monoblocksTab);

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BlackIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/blackiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlackIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.BlackIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BlueIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/blueiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlueIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.BlueIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.BrownIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/browniron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BrownIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.BrownIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.CyanIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/cyaniron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.CyanIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.CyanIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GrayIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/grayiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.GrayIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.GrayIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.GreenIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/greeniron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.GreenIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.GreenIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LblueIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/lblueiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LblueIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.LblueIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LgrayIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/lgrayiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LgrayIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.LgrayIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.LimeIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/limeiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LimeIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.LimeIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.MagentaIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/magentairon", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.MagentaIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.MagentaIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.OrangeIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/orangeiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.OrangeIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.OrangeIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PinkIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/pinkiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.PinkIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.PinkIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.PurpleIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/purpleiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.PurpleIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.PurpleIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.RedIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/rediron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.RedIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.RedIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.WhiteIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/whiteiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.WhiteIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.WhiteIron, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.YellowIron, Material.iron, 10.0F, 6.0F, PICKAXE, 0, soundTypeMetal, 1, "colorIron/yellowiron", monoblocksmcstained);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.YellowIron.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.YellowIron, p);
      }

      //BlackIron = (new BlackIron(4093, Material.iron)).setCreativeTab(monoblocksmcstained);
      //BlueIron = (new BlueIron(4094, Material.iron)).setCreativeTab(monoblocksmcstained);
      //BrownIron = (new BrownIron(4095, Material.iron)).setCreativeTab(monoblocksmcstained);
      //CyanIron = (new CyanIron(4096, Material.iron)).setCreativeTab(monoblocksmcstained);
      //GrayIron = (new GrayIron(4097, Material.iron)).setCreativeTab(monoblocksmcstained);
      //GreenIron = (new GreenIron(4098, Material.iron)).setCreativeTab(monoblocksmcstained);
      //LblueIron = (new LblueIron(4099, Material.iron)).setCreativeTab(monoblocksmcstained);
      //LgrayIron = (new LgrayIron(4100, Material.iron)).setCreativeTab(monoblocksmcstained);
      //LimeIron = (new LimeIron(4101, Material.iron)).setCreativeTab(monoblocksmcstained);
      //MagentaIron = (new MagentaIron(4102, Material.iron)).setCreativeTab(monoblocksmcstained);
      //OrangeIron = (new OrangeIron(4103, Material.iron)).setCreativeTab(monoblocksmcstained);
      //PinkIron = (new PinkIron(4104, Material.iron)).setCreativeTab(monoblocksmcstained);
      //PurpleIron = (new PurpleIron(4105, Material.iron)).setCreativeTab(monoblocksmcstained);
      //RedIron = (new RedIron(4106, Material.iron)).setCreativeTab(monoblocksmcstained);
      //WhiteIron = (new WhiteIron(4107, Material.iron)).setCreativeTab(monoblocksmcstained);
      //YellowIron = (new YellowIron(4108, Material.iron)).setCreativeTab(monoblocksmcstained);

      //Granite = (new Granite(4109, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);
      //SmoothGranite = (new SmoothGranite(4110, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);
      //Andesite = (new Andesite(4111, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);
      //SmoothAndesite = (new SmoothAndesite(4112, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);
      //Diorite = (new Diorite(4113, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);
      //SmoothDiorite = (new SmoothDiorite(4114, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.Granite, Material.rock, 4.0F, 4.0F, PICKAXE, 0, soundTypeStone, 1, "granite", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.Granite.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.Granite, p);
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.SmoothGranite, Material.rock, 4.0F, 4.0F, PICKAXE, 0, soundTypeStone, 1, "smoothgranite", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.SmoothGranite.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.SmoothGranite, p);
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.Andesite, Material.rock, 4.0F, 4.0F, PICKAXE, 0, soundTypeStone, 1, "andesite", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.Andesite.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.Andesite, p);
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.SmoothAndesite, Material.rock, 4.0F, 4.0F, PICKAXE, 0, soundTypeStone, 1, "smoothandesite", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.SmoothAndesite.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.SmoothAndesite, p);
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.Diorite, Material.rock, 4.0F, 4.0F, PICKAXE, 0, soundTypeStone, 1, "diorite", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.Diorite.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.Diorite, p);
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.SmoothDiorite, Material.rock, 4.0F, 4.0F, PICKAXE, 0, soundTypeStone, 1, "smoothdiorite", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.SmoothDiorite.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.SmoothDiorite, p);
      }

      //OldLamp = (new OldLamp(4115, Material.redstoneLight)).setCreativeTab(Monoblocks.monoblocksLighting);
      //Gravel = (new Gravel(4116, Material.ground)).setCreativeTab(null);
      //ZincOre = (new ZincOre(4117, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);
      //SilverOre = (new SilverOre(4118, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);
      //CopperOre = (new CopperOre(4119, Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);

      {
         MonoBlockProp p = new MonoBlockProp(
                 MBlocksEnum.ZincOre, Material.rock, 10.0F, 10.0F, PICKAXE, 0, soundTypeStone, 1, "zincore", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.ZincOre.block = p.getNewBlock();
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.OldLamp, Material.redstoneLight, 3.0F, 3.0F, PICKAXE, 0, soundTypeGlass, 1, "oldlamp", Monoblocks.monoblocksLighting);
         p.setResourceFolderName(Monoblocks.MODID);
         p.lightLevel = 1.0F;
         MBlocksEnum.OldLamp.block = p.getNewBlock();
         //tempBlockCache.put(MBlocksEnum.OldLamp, p);
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.Gravel, Material.ground, 0.5F, 0.5F, PICKAXE, 0, soundTypeGravel, 1, "gravel", null);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.Gravel.block = p.getNewBlock();
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.ZincOre, Material.rock, 10.0F, 10.0F, PICKAXE, 0, soundTypeStone, 1, "zincore", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.ZincOre.block = p.getNewBlock();
         //tempBlockCache.put(MBlocksEnum.ZincOre, p);
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.SilverOre, Material.rock, 6.0F, 6.0F, PICKAXE, 0, soundTypeStone, 1, "silverore", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.SilverOre.block = p.getNewBlock();
         //tempBlockCache.put(MBlocksEnum.SilverOre, p);
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.CopperOre, Material.rock, 9.0F, 9.0F, PICKAXE, 0, soundTypeStone, 1, "copperore", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.CopperOre.block = p.getNewBlock();
         //tempBlockCache.put(MBlocksEnum.CopperOre, p);
      }


      //ZincBlock = (new ZincBlock(4120, Material.iron)).setCreativeTab(Monoblocks.monoblocksTab);
      //SilverBlock = (new SilverBlock(4121, Material.iron)).setCreativeTab(Monoblocks.monoblocksTab);
      //CopperBlock = (new CopperBlock(4122, Material.iron)).setCreativeTab(Monoblocks.monoblocksTab);
      //AluminumBlock = (new AluminumBlock(4123, Material.iron)).setCreativeTab(Monoblocks.monoblocksTab);
      //SteelBlock = (new SteelBlock(4124, Material.iron)).setCreativeTab(Monoblocks.monoblocksTab);

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.ZincBlock, Material.iron, 10.0F, 10.0F, PICKAXE, 0, soundTypeMetal, 1, "zincblock", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.ZincBlock.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.ZincBlock, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.SilverBlock, Material.iron, 10.0F, 10.0F, PICKAXE, 0, soundTypeMetal, 1, "silverblock", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.SilverBlock.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.SilverBlock, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.CopperBlock, Material.iron, 10.0F, 10.0F, PICKAXE, 0, soundTypeMetal, 1, "copperblock", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.CopperBlock.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.CopperBlock, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.AluminumBlock, Material.iron, 9.0F, 9.0F, PICKAXE, 0, soundTypeMetal, 1, "aluminumblock", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.AluminumBlock.block = p.getNewBlock();
         p.blockRegisterNameOverrides.put(p.FenceKey, "Aluminum Fence");
         p.isFenceBlockAllowed = true;

         tempBlockCache.put(MBlocksEnum.AluminumBlock, p);
      }
      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.SteelBlock, Material.iron, 9.0F, 9.0F, PICKAXE, 0, soundTypeMetal, 1, "steelblock", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.SteelBlock.block = p.getNewBlock();
         tempBlockCache.put(MBlocksEnum.SteelBlock, p);
      }

      {
         MonoBlockProp p = new MonoBlockProp(MBlocksEnum.AluminumOre, Material.iron, 9.0F, 9.0F, PICKAXE, 0, soundTypeMetal, 1, "aluminumore", Monoblocks.monoblocksTab);
         p.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.AluminumOre.block = p.getNewBlock();
         //tempBlockCache.put(MBlocksEnum.AluminumOre, p);
      }

      //SteelOre = (new SteelOre(4125, Material.iron)).setCreativeTab(Monoblocks.monoblocksTab);
      //AluminumOre = (new AluminumOre(4126, Material.iron)).setCreativeTab(Monoblocks.monoblocksTab);
      EternalLoadingBlock = (new EternalLoadingBlock(4085, Material.iron)).setCreativeTab(Monoblocks.monoblocksTab).setCreativeTab(Monoblocks.monoblocksOther);
      Sifter = (new Sifter(Material.iron)).setBlockName("Sifter").setCreativeTab(Monoblocks.monoblocksOther);
      RedLight = (new RedLight(Material.iron)).setBlockName("Red Light");
      Fryer = (new Fryer(Material.iron, false)).setBlockName("Fryer").setCreativeTab(Monoblocks.monoblocksOther);
      Stoplight = (new Stoplight()).setBlockName("Stoplight").setCreativeTab(Monoblocks.monoblocksSignage);
      Flasher = (new Flasher(4099, Material.glass)).setCreativeTab(Monoblocks.monoblocksLighting);
      FallingStone = (new FallingStone(Material.rock)).setCreativeTab(Monoblocks.monoblocksTab);

      { // YellowGlow

         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.YellowGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1,
                 soundTypeGlass, 1,"yellowglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.YellowGlow.block = property.getNewBlock();
         //property.is1XTileAllowed = true;
         //tempBlockCache.put(MBlocksEnum.transparentplastic, property);
      }

      { // BlueGlow
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.BlueGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1,
                 soundTypeGlass, 1,"blueglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlueGlow.block = property.getNewBlock();
         //property.is1XTileAllowed = true;
         //tempBlockCache.put(MBlocksEnum.transparentplastic, property);
      }

      { // BlackGlow
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.BlackGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1,
                 soundTypeGlass, 1,"blackglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlackGlow.block = property.getNewBlock();
         //property.is1XTileAllowed = true;
         //tempBlockCache.put(MBlocksEnum.transparentplastic, property);
      }

      // / YellowGlow = new YellowGlow(Material.glass, "Yellow Glow");
      // / BlueGlow = new BlueGlow(Material.glass, "Blue Glow");
      // / BlackGlow = new BlackGlow(Material.glass);
      // / WhiteGlow = new WhiteGlow(Material.glass);
      // / RedGlow = new RedGlow(Material.glass, "Red Glow");
      // / GreenGlow = new GreenGlow(Material.glass);
      // / OrangeGlow = new OrangeGlow(Material.glass);
      // / CyanGlow = new CyanGlow(Material.glass);
      // / BrownGlow = new BrownGlow(Material.glass);
      // / GrayGlow = new GrayGlow(Material.glass);
      // / LgrayGlow = new LgrayGlow(Material.glass);
      // / LblueGlow = new LblueGlow(Material.glass);
      // / MagentaGlow = new MagentaGlow(Material.glass);
      // / PinkGlow = new PinkGlow(Material.glass);
      // / PurpleGlow = new PurpleGlow(Material.glass);
      // / LimeGlow = new LimeGlow(Material.glass);

      // YellowGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.YellowGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "yellowglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.YellowGlow.block = property.getNewBlock();
      }

      // BlueGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.BlueGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "blueglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlueGlow.block = property.getNewBlock();
      }

      // BlackGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.BlackGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "blackglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BlackGlow.block = property.getNewBlock();
      }

      // WhiteGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.WhiteGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "whiteglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.WhiteGlow.block = property.getNewBlock();
      }

      // RedGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.RedGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "redglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.RedGlow.block = property.getNewBlock();
      }

      // GreenGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.GreenGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "greenglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.GreenGlow.block = property.getNewBlock();
      }

      // OrangeGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.OrangeGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "orangeglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.OrangeGlow.block = property.getNewBlock();
      }

      // CyanGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.CyanGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "cyanglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.CyanGlow.block = property.getNewBlock();
      }

      // BrownGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.BrownGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "brownglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.BrownGlow.block = property.getNewBlock();
      }

      // GrayGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.GrayGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "grayglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.GrayGlow.block = property.getNewBlock();
      }

      // LgrayGlow (Light Gray)
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.LgrayGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "lgrayglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LgrayGlow.block = property.getNewBlock();
      }

      // LblueGlow (Light Blue)
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.LblueGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "lblueglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LblueGlow.block = property.getNewBlock();
      }

      // MagentaGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.MagentaGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "magentaglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.MagentaGlow.block = property.getNewBlock();
      }

      // PinkGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.PinkGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "pinkglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.PinkGlow.block = property.getNewBlock();
      }

      // PurpleGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.PurpleGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "purpleglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.PurpleGlow.block = property.getNewBlock();
      }

      // LimeGlow
      {
         BlockProperty property = new TransparentMonoBlockProp(MBlocksEnum.LimeGlow, Material.glass, 2.5F, 500.0F,
                 PICKAXE, 1, soundTypeGlass, 1, "limeglow", Monoblocks.monoblocksLighting);
         property.lightLevel = 1.0F;
         property.setResourceFolderName(Monoblocks.MODID);
         MBlocksEnum.LimeGlow.block = property.getNewBlock();
      }

      WoodTable = (new WoodTable(Material.wood)).setCreativeTab(Monoblocks.monoblocksOther);
      PurpleLampOn = new PurpleLamp(true);
      PurpleLamp = (new PurpleLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Purple Lamp");
      BlackLampOn = new BlackLamp(true);
      BlackLamp = (new BlackLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Black Lamp");
      BlueLampOn = new BlueLamp(true);
      BlueLamp = (new BlueLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Blue Lamp");
      BrownLampOn = new BrownLamp(true);
      BrownLamp = (new BrownLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Brown Lamp");
      CyanLampOn = new CyanLamp(true);
      CyanLamp = (new CyanLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Cyan Lamp");
      GrayLampOn = new GrayLamp(true);
      GrayLamp = (new GrayLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Gray Lamp");
      GreenLampOn = new GreenLamp(true);
      GreenLamp = (new GreenLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Green Lamp");
      LblueLampOn = new LblueLamp(true);
      LblueLamp = (new LblueLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Lblue Lamp");
      LgrayLampOn = new LgrayLamp(true);
      LgrayLamp = (new LgrayLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Lgray Lamp");
      LimeLampOn = new LimeLamp(true);
      LimeLamp = (new LimeLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Lime Lamp");
      MagentaLampOn = new MagentaLamp(true);
      MagentaLamp = (new MagentaLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Magenta Lamp");
      PinkLampOn = new PinkLamp(true);
      PinkLamp = (new PinkLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Pink Lamp");
      OrangeLampOn = new OrangeLamp(true);
      OrangeLamp = (new OrangeLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Orange Lamp");
      RedLampOn = new RedLamp(true);
      RedLamp = (new RedLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Red Lamp");
      WhiteLampOn = new WhiteLamp(true);
      WhiteLamp = (new WhiteLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("White Lamp");
      YellowLampOn = new YellowLamp(true);
      YellowLamp = (new YellowLamp(false)).setCreativeTab(Monoblocks.monoblocksLighting).setBlockName("Yellow Lamp");
      blockIronFurnaceIdle = (new IronFurnace(false)).setBlockName("IronFurnaceIdle").setCreativeTab(Monoblocks.monoblocksOther);
      blockIronFurnaceActive = (new IronFurnace(true)).setBlockName("IronFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
      AluminumFence = (new BlockFence("monoblocks:aluminumblock_0", Material.iron)).setHardness(3.5F).setCreativeTab(Monoblocks.monoblocksfences).setBlockName("Aluminum Fence").setStepSound(Block.soundTypeMetal);
      PowerPole15 = (new PowerPole15()).setCreativeTab(Monoblocks.monoblocksOther);
      PowerPole16 = (new PowerPole16()).setCreativeTab(Monoblocks.monoblocksOther);
      XPBlocks = new XPBlocks();
      PowerPole17 = (new PowerPole17()).setCreativeTab(Monoblocks.monoblocksOther);
      GameRegistry.registerBlock(CDPlayer, ItemBroken.class, "cdplayer");
      GameRegistry.registerBlock(Showcase, "showcase");
      GameRegistry.registerBlock(GuardRail, "GuardRail");
      GameRegistry.registerBlock(InsideGuardRail, "InsideGuardRail");
      GameRegistry.registerBlock(OutsideGuardRail, "OutsideGuardRail");
      GameRegistry.registerBlock(DoubleStreetLight, "DoubleStreetLight");
      GameRegistry.registerBlock(Stereo, "stereo");
      GameRegistry.registerBlock(StreetLight, "streetlight");
      GameRegistry.registerBlock(YellowStoplight, "yellowstoplight");
      GameRegistry.registerBlock(YellowReflector, "yellowreflector");
      //GameRegistry.registerBlock(RoughPlastic, "roughplastic");
      //GameRegistry.registerBlock(MBlocksEnum.smoothiron, "iron");
      //GameRegistry.registerBlock(Gold, "gold");
      //GameRegistry.registerBlock(Diamond, "diamond");
      GameRegistry.registerBlock(Cattleguard, PartiallyBroken.class, "cattleguard");
      GameRegistry.registerBlock(YellowSnowBlock, "yellowsnow");
      GameRegistry.registerBlock(YellowSnow, "yellowSnow");
      GameRegistry.registerBlock(WaterBlock, "Block Of Water");
      GameRegistry.registerBlock(Fence, FenceItem.class, "fence");
      //GameRegistry.registerBlock(StainedStoneFence, StoneFenceItem.class, "stonefence");
      GameRegistry.registerBlock(GlowFence, GlowFenceItem.class, "glowfence");
      GameRegistry.registerBlock(GlowstoneFence, GlowstoneFenceItem.class, "glowstonefence");
      //GameRegistry.registerBlock(CobbleFence, CobbleItem.class, "cobblefence");
      //GameRegistry.registerBlock(HardBlock, HardBlockItem.class, "hardblock");
      //GameRegistry.registerBlock(ColorGravel, GravelItem.class, "colorgravel");
      //GameRegistry.registerBlock(ColorSand, SandItem.class, "colorsand");
      //GameRegistry.registerBlock(PlasticFence, PlasticItem.class, "plasticfence");
      GameRegistry.registerBlock(PlankFence, PlankFenceItem.class, "plankfence");
      GameRegistry.registerBlock(IronFence, IronFenceItem.class, "ironFence");
      //GameRegistry.registerBlock(StainedCobble, CobbleItem.class, "colorCobble");
     // GameRegistry.registerBlock(Plastic, PlasticItem.class, "colorplastic");
      GameRegistry.registerBlock(Gate, "Gate");
      GameRegistry.registerBlock(GateClosed, "GateClosed");
      GameRegistry.registerBlock(SingleStoplight, "Single faced Stoplight");
      GameRegistry.registerBlock(YellowStoplightPole, "YellowStoplightPole");
      GameRegistry.registerBlock(StoplightPole, "Stoplight2");
      //GameRegistry.registerBlock(AluminumFence, "Aluminum Fence");
      GameRegistry.registerBlock(StoneLantern, "Stone Lantern");
      GameRegistry.registerBlock(StoneFence, "Stone Fence");
      GameRegistry.registerBlock(BlackDoor, "Black Door");
      GameRegistry.registerBlock(BlueDoor, "Blue Door");
      GameRegistry.registerBlock(BrownDoor, "Brown Door");
      GameRegistry.registerBlock(CyanDoor, "Cyan Door");
      GameRegistry.registerBlock(GrayDoor, "Gray Door");
      GameRegistry.registerBlock(GreenDoor, "Green Door");
      GameRegistry.registerBlock(LblueDoor, "Lblue Door");
      GameRegistry.registerBlock(LgrayDoor, "Lgray Door");
      GameRegistry.registerBlock(LimeDoor, "Lime Door");
      GameRegistry.registerBlock(MagentaDoor, "Magenta Door");
      GameRegistry.registerBlock(OrangeDoor, "Orange Door");
      GameRegistry.registerBlock(PinkDoor, "Pink Door");
      GameRegistry.registerBlock(PurpleDoor, "Purple Door");
      GameRegistry.registerBlock(RedDoor, "Red Door");
      GameRegistry.registerBlock(WhiteDoor, "White Door");
      GameRegistry.registerBlock(YellowDoor, "Yellow Door");
      GameRegistry.registerBlock(ExampleBlock, "Block of Missing Texture");
      GameRegistry.registerBlock(GlassDoor, "Glass Door");
      GameRegistry.registerBlock(OrangePole, "Orange Pole");
      GameRegistry.registerBlock(SafetyPole, "Safety Pole");
      GameRegistry.registerBlock(TrafficCone, "Traffic Cone");
      GameRegistry.registerBlock(WoodTable, "Wood Table");
      GameRegistry.registerBlock(BlackLampOn, "Black Lamp On");
      GameRegistry.registerBlock(BlackLamp, "Black Lamp");
      GameRegistry.registerBlock(BlueLampOn, "Blue Lamp On");
      GameRegistry.registerBlock(BlueLamp, "Blue Lamp");
      GameRegistry.registerBlock(BrownLampOn, "Brown Lamp On");
      GameRegistry.registerBlock(BrownLamp, "Brown Lamp");
      GameRegistry.registerBlock(CyanLampOn, "Cyan Lamp On");
      GameRegistry.registerBlock(CyanLamp, "Cyan Lamp");
      GameRegistry.registerBlock(GrayLampOn, "Gray Lamp On");
      GameRegistry.registerBlock(GrayLamp, "Gray Lamp");
      GameRegistry.registerBlock(GreenLampOn, "Green Lamp On");
      GameRegistry.registerBlock(GreenLamp, "Green Lamp");
      GameRegistry.registerBlock(LblueLampOn, "Lblue Lamp On");
      GameRegistry.registerBlock(LblueLamp, "Lblue Lamp");
      GameRegistry.registerBlock(LgrayLampOn, "Lgray Lamp On");
      GameRegistry.registerBlock(LgrayLamp, "Lgray Lamp");
      GameRegistry.registerBlock(LimeLampOn, "Lime Lamp On");
      GameRegistry.registerBlock(LimeLamp, "Lime Lamp");
      GameRegistry.registerBlock(MagentaLampOn, "Magenta Lamp On");
      GameRegistry.registerBlock(MagentaLamp, "Magenta Lamp");
      GameRegistry.registerBlock(PinkLampOn, "Pink Lamp On");
      GameRegistry.registerBlock(PinkLamp, "Pink Lamp");
      GameRegistry.registerBlock(OrangeLampOn, "Orange Lamp On");
      GameRegistry.registerBlock(OrangeLamp, "Orange Lamp");
      GameRegistry.registerBlock(RedLampOn, "Red Lamp On");
      GameRegistry.registerBlock(RedLamp, "Red Lamp");
      GameRegistry.registerBlock(WhiteLampOn, "White Lamp On");
      GameRegistry.registerBlock(WhiteLamp, "White Lamp");
      GameRegistry.registerBlock(YellowLampOn, "Yellow Lamp On");
      GameRegistry.registerBlock(YellowLamp, "Yellow Lamp");
      GameRegistry.registerBlock(PurpleLampOn, "Purple Lamp On");
      GameRegistry.registerBlock(PurpleLamp, "Purple Lamp");
      GameRegistry.registerBlock(blockIronFurnaceIdle, "IronFurnaceIdle");
      GameRegistry.registerBlock(blockIronFurnaceActive, "IronFurnaceActive");

      //GameRegistry.registerBlock(RedBlock, "Red Block");
      //GameRegistry.registerBlock(GreenBlock, "Green Block");
      //GameRegistry.registerBlock(BlueBlock, "Blue Block");
      //GameRegistry.registerBlock(PurpleBlock, "Purple Block");
      //GameRegistry.registerBlock(PinkBlock, "Pink Block");
      //GameRegistry.registerBlock(YellowBlock, "Yellow Block");
      //GameRegistry.registerBlock(BlackBlock, "Black Block");
      //GameRegistry.registerBlock(WhiteBlock, "White Block");
      //GameRegistry.registerBlock(OrangeBlock, "Orange Block");
      //GameRegistry.registerBlock(RainbowBlock, "Rainbow Block");
      //GameRegistry.registerBlock(LimeBlock, "Lime Block");
      //GameRegistry.registerBlock(BrownBlock, "Brown Block");
      //GameRegistry.registerBlock(InvisibleBlock, "X-Ray Block");
      //GameRegistry.registerBlock(GrayBlock, "Gray Block");
      //GameRegistry.registerBlock(FleshBlock, "Flesh Block");
      //GameRegistry.registerBlock(Lgray, "Light Gray Block");
      //GameRegistry.registerBlock(Lblue, "Light Blue Block");
      //GameRegistry.registerBlock(MagentaBlock, "Magenta Block");
      //GameRegistry.registerBlock(CyanBlock, "Cyan Block");

      //GameRegistry.registerBlock(RedStone, "Red Stone");
      //GameRegistry.registerBlock(BlueStone, "Blue Stone");
      //GameRegistry.registerBlock(GreenStone, "Green Stone");
      //GameRegistry.registerBlock(GrayStone, "Gray Stone");
      //GameRegistry.registerBlock(PinkStone, "Pink Stone");
      //GameRegistry.registerBlock(YellowStone, "Yellow Stone");
      //GameRegistry.registerBlock(BlackStone, "Black Stone");
      //GameRegistry.registerBlock(WhiteStone, "White Stone");
      //GameRegistry.registerBlock(MagentaStone, "Magenta Stone");
      //GameRegistry.registerBlock(LgrayStone, "Light Gray Stone");
      //GameRegistry.registerBlock(Lbluestone, "Light Blue Stone");
      //GameRegistry.registerBlock(PurpleStone, "Purple Stone");
      //GameRegistry.registerBlock(BrownStone, "Brown Stone");
      //GameRegistry.registerBlock(CyanStone, "Cyan Stone");
      //GameRegistry.registerBlock(LimeStone, "Lime Stone");
      //GameRegistry.registerBlock(OrangeStone, "Orange Stone");
      //GameRegistry.registerBlock(BlackPlanks, "Black Planks");
      //GameRegistry.registerBlock(BluePlanks, "Blue Planks");
      //GameRegistry.registerBlock(BrownPlanks, "Brown Planks");
      //GameRegistry.registerBlock(CyanPlanks, "Cyan Planks");
      //GameRegistry.registerBlock(GrayPlanks, "Gray Planks");
      //GameRegistry.registerBlock(GreenPlanks, "Green Planks");
      //GameRegistry.registerBlock(Lblueplanks, "Light Blue Planks");
      //GameRegistry.registerBlock(Lgrayplanks, "Light Gray Planks");
      //GameRegistry.registerBlock(LimePlanks, "Lime Planks");
      //GameRegistry.registerBlock(MagentaPlanks, "Magenta Planks");
      //GameRegistry.registerBlock(OrangePlanks, "Orange Planks");
      //GameRegistry.registerBlock(PinkPlanks, "Pink Planks");
      //GameRegistry.registerBlock(PurplePlanks, "Purple Planks");
      //GameRegistry.registerBlock(RedPlanks, "Red Planks");
      //GameRegistry.registerBlock(WhitePlanks, "White Planks");
      //GameRegistry.registerBlock(YellowPlanks, "Yellow Planks");
      //GameRegistry.registerBlock(BlackStoneBrick, "Black Stone Bricks");
      //GameRegistry.registerBlock(BlueStoneBrick, "Blue Stone Bricks");
      //GameRegistry.registerBlock(BrownStoneBrick, "Brown Stone Bricks");
      //GameRegistry.registerBlock(CyanStoneBrick, "Cyan Stone Bricks");
      //GameRegistry.registerBlock(GrayStoneBrick, "Gray Stone Bricks");
      //GameRegistry.registerBlock(GreenStoneBrick, "Green Stone Bricks");
      //GameRegistry.registerBlock(LBlueStoneBrick, "Light Blue Stone Bricks");
      //GameRegistry.registerBlock(LGrayStoneBrick, "Light Gray Stone Bricks");
      //GameRegistry.registerBlock(LimeStoneBrick, "Lime Stone Bricks");
      //GameRegistry.registerBlock(MagentaStoneBrick, "Magenta Stone Bricks");
      //GameRegistry.registerBlock(OrangeStoneBrick, "Orange Stone Bricks");
      //GameRegistry.registerBlock(PinkStoneBrick, "Pink Stone Bricks");
      //GameRegistry.registerBlock(PurpleStoneBrick, "Purple Stone Bricks");
      //GameRegistry.registerBlock(RedStoneBrick, "Red Stone Bricks");
      //GameRegistry.registerBlock(WhiteStoneBrick, "White Stone Bricks");
      //GameRegistry.registerBlock(YellowStoneBrick, "Yellow Stone Bricks");

      //GameRegistry.registerBlock(BlackGlowstone, "Black Glowstone");
      //GameRegistry.registerBlock(BlueGlowstone, "Blue Glowstone");
      //GameRegistry.registerBlock(BrownGlowstone, "Brown Glowstone");
      //GameRegistry.registerBlock(CyanGlowstone, "Cyan Glowstone");
      //GameRegistry.registerBlock(GrayGlowstone, "Gray Glowstone");
      //GameRegistry.registerBlock(GreenGlowstone, "Green Glowstone");
      //GameRegistry.registerBlock(Lblueglowstone, "Light Blue Glowstone");
      //GameRegistry.registerBlock(Lgrayglowstone, "Light Gray Glowstone");
      //GameRegistry.registerBlock(LimeGlowstone, "Lime Glowstone");
      //GameRegistry.registerBlock(MagentaGlowstone, "Magenta Glowstone");
      //GameRegistry.registerBlock(OrangeGlowstone, "Orange Glowstone");
      //GameRegistry.registerBlock(PinkGlowstone, "Pink Glowstone");
      //GameRegistry.registerBlock(PurpleGlowstone, "Purple Glowstone");
      //GameRegistry.registerBlock(RedGlowstone, "Red Glowstone");
      //GameRegistry.registerBlock(WhiteGlowstone, "White Glowstone");
      //GameRegistry.registerBlock(YellowGlowstone, "Yellow Glowstone");

      GameRegistry.registerBlock(EternalLoadingBlock, "Block of Eternal Loaading");
      GameRegistry.registerBlock(Mud, "Mud");
      GameRegistry.registerBlock(GoldenSand, "Golden Sand");
      GameRegistry.registerBlock(RedCrystalOre, "Red Crystal Ore");
      GameRegistry.registerBlock(PurpleCrystalOre, "Purple Crystal Ore");
      GameRegistry.registerBlock(PurpleCrystalBlock, "Purple Crystal Block");
      GameRegistry.registerBlock(RedCrystalBlock, "Red Crystal Block");
      GameRegistry.registerBlock(Sifter, "Sifter");
      GameRegistry.registerBlock(Fryer, "Fryer");
      GameRegistry.registerBlock(Stoplight, "Stoplight");

      //GameRegistry.registerBlock(BlackIron, "Black Iron");
      //GameRegistry.registerBlock(BlueIron, "Blue Iron");
      //GameRegistry.registerBlock(BrownIron, "Brown Iron");
      //GameRegistry.registerBlock(CyanIron, "Cyan Iron");
      //GameRegistry.registerBlock(GrayIron, "Gray Iron");
      //GameRegistry.registerBlock(GreenIron, "Green Iron");
      //GameRegistry.registerBlock(LblueIron, "Light Blue Iron");
      //GameRegistry.registerBlock(LgrayIron, "Light Gray Iron");
      //GameRegistry.registerBlock(LimeIron, "Lime Iron");
      //GameRegistry.registerBlock(MagentaIron, "Magenta Iron");
      //GameRegistry.registerBlock(OrangeIron, "Orange Iron");
      //GameRegistry.registerBlock(PinkIron, "Pink Iron");
      //GameRegistry.registerBlock(PurpleIron, "Purple Iron");
      //GameRegistry.registerBlock(RedIron, "Red Iron");
      //GameRegistry.registerBlock(WhiteIron, "White Iron");
      //GameRegistry.registerBlock(YellowIron, "Yellow Iron");

      GameRegistry.registerBlock(RoundBBQ, "BBQ");

      //GameRegistry.registerBlock(Granite, "Granite");
      //GameRegistry.registerBlock(SmoothGranite, "Smooth Granite");
      //GameRegistry.registerBlock(Andesite, "Andesite");
      //GameRegistry.registerBlock(SmoothAndesite, "Smooth Andesite");
      //GameRegistry.registerBlock(Diorite, "Diorite");
      //GameRegistry.registerBlock(SmoothDiorite, "Smooth Diorite");

      //GameRegistry.registerBlock(OldLamp, "Old Lamp");
      //GameRegistry.registerBlock(Gravel, "Gravel");
      ////GameRegistry.registerBlock(ZincBlock, "Zinc Block");
      ////GameRegistry.registerBlock(SilverBlock, "Silver Block");
      ////GameRegistry.registerBlock(CopperBlock, "Copper Block");
      ////GameRegistry.registerBlock(SteelBlock, "Steel Block");
      ////GameRegistry.registerBlock(AluminumBlock, "Aluminum Block");
      GameRegistry.registerBlock(Flasher, FlasherItem.class, "Flasher");
      GameRegistry.registerBlock(RedLight, ItemBroken.class, "Red Light");
      GameRegistry.registerBlock(FallingStone, "Falling Stone");

      //GameRegistry.registerBlock(YellowGlow, "Yellow Glow");
      //GameRegistry.registerBlock(GreenGlow, "Green Glow");
      //GameRegistry.registerBlock(RedGlow, "Red Glow");
      //GameRegistry.registerBlock(BlueGlow, "Blue Glow");
      //GameRegistry.registerBlock(BlackGlow, "Black Glow");
      //GameRegistry.registerBlock(CyanGlow, "Cyan Glow");
      //GameRegistry.registerBlock(LimeGlow, "Lime Glow");
      //GameRegistry.registerBlock(LblueGlow, "LblueGlow");
      //GameRegistry.registerBlock(LgrayGlow, "LgrayGlow");
      //GameRegistry.registerBlock(MagentaGlow, "Magenta Glow");
      //GameRegistry.registerBlock(PurpleGlow, "Purple Glow");
      //GameRegistry.registerBlock(PinkGlow, "Pink Glow");
      //GameRegistry.registerBlock(BrownGlow, "Brown Glow");
      //GameRegistry.registerBlock(GrayGlow, "Gray Glow");
      //GameRegistry.registerBlock(WhiteGlow, "White Glow");
      //GameRegistry.registerBlock(OrangeGlow, "Orange Glow");

      GameRegistry.registerBlock(TrafficConeSmall, "TrafficConeSmall");
      GameRegistry.registerBlock(Pole1, "powerpole1");
      GameRegistry.registerBlock(Pole2, "powerpole2");
      GameRegistry.registerBlock(Pole3, "powerpole3");
      GameRegistry.registerBlock(Pole4, "powerpole4");
      GameRegistry.registerBlock(Pole5, "powerpole5");
      GameRegistry.registerBlock(Pole6, "powerpole6");
      GameRegistry.registerBlock(Pole7, "powerpole7");
      GameRegistry.registerBlock(Pole8, "powerpole8");
      GameRegistry.registerBlock(Pole9, "powerpole9");
      GameRegistry.registerBlock(Pole10, "powerpole10");
      GameRegistry.registerBlock(Pole11, "powerpole11");
      GameRegistry.registerBlock(Pole12, "powerpole12");
      GameRegistry.registerBlock(Pole13, "powerpole13");
      GameRegistry.registerBlock(Pole14, "powerpole14");
      GameRegistry.registerBlock(Insulator1, "insulator1");
      GameRegistry.registerBlock(Insulator2, "insulator2");
      GameRegistry.registerBlock(Transformer, "transformer");
     // GameRegistry.registerBlock(DarkStoneBrick, "darkstonebrick");
      //GameRegistry.registerBlock(Bricks, "bricks");
      //GameRegistry.registerBlock(MonsterEggBricks, "eggbricks");
      GameRegistry.registerBlock(Shoplight, "shoplight");
      GameRegistry.registerBlock(OrangeShoplight, "orangeshoplight");
      //GameRegistry.registerBlock(CopperOre, "Copper Ore");
      //GameRegistry.registerBlock(ZincOre, "ZincOre");
      //GameRegistry.registerBlock(SilverOre, "Silver Ore");
      //GameRegistry.registerBlock(AluminumOre, "Aluminum Ore");
      GameRegistry.registerBlock(StoplightStick, "stoplightstick");
      GameRegistry.registerBlock(YellowStoplightStick, "yellowstoplightstick");
      GameRegistry.registerBlock(Streetlightpole, "streetlightpole");
      GameRegistry.registerBlock(MonoTiles, MonoTilesItem.class, "monotiles");
      //GameRegistry.registerBlock(LowIntensityBlocks, LowIntensityBlockItem.class, "lowintensityblocks");
      GameRegistry.registerBlock(PowerPole15, "powerpole15");
      GameRegistry.registerBlock(PowerPole16, "powerpole16");
      GameRegistry.registerBlock(IronLantern, "ironlantern");
      GameRegistry.registerBlock(GroundConnector, "groundconnector");
      GameRegistry.registerBlock(StainedGlassFence, StainedGlassFenceItem.class, "stainedglassfence");
      //GameRegistry.registerBlock(StoneTile, StoneTileItem.class, "stonetiles");
      GameRegistry.registerBlock(WoodTile, BaseItemBlock_1XTile.class, "woodtiles");
      //GameRegistry.registerBlock(CobbleTile, CobbleTileItem.class, "cobbletiles");
      GameRegistry.registerBlock(GlassTile, GlassTileItem.class, "glasstiles");
      //GameRegistry.registerBlock(LowIntensityTiles, LowIntensityTileItem.class, "lowintensitytiles");
      GameRegistry.registerBlock(GlowstoneTiles, GlowstoneTileItem.class, "glowstonetiles");
      GameRegistry.registerBlock(IronTiles, IronTilesItem.class, "irontiles");
      //GameRegistry.registerBlock(GravelTiles, GravelTilesItem.class, "graveltiles");
      //GameRegistry.registerBlock(SandTiles, SandTilesItem.class, "sandtiles");
      GameRegistry.registerBlock(StoneBrickTiles, StoneBrickTilesItem.class, "stonebricktiles");
      GameRegistry.registerBlock(FancyGlass, FancyGlassItem.class, "fancyglass");
      //GameRegistry.registerBlock(FancyBricks, FancyBricksItem.class, "fancybricks");
      //GameRegistry.registerBlock(FancyBricks2, FancyBricks2Item.class, "fancybricks2");
      //GameRegistry.registerBlock(FancyBricksTiles, FancyBricksTilesItem.class, "fancybrickstiles");
      //GameRegistry.registerBlock(FancyBricks2Tiles, FancyBricks2TilesItem.class, "fancybricks2tiles");
      GameRegistry.registerBlock(XPBlocks, XPBlocksItem.class, "xpblocks");
      //GameRegistry.registerBlock(TransparentPlastic,ew TransparentPlasticItem.class, "transparentplastic");
      //GameRegistry.registerBlock(ColoredQuartz, ColoredQuartzItem.class, "coloredquartz");
      GameRegistry.registerBlock(PowerPole17, "powerpole17");
      GameRegistry.registerBlock(PowerPole18, "powerpole18");
      GameRegistry.registerBlock(ParkingMeter, "parkingmeter");
      GameRegistry.registerBlock(TrafficLightLeftArrow, ScrollingItemBlock.class,"trafficlightleftarrow");
      GameRegistry.registerBlock(TrafficLightRightArrow, ScrollingItemBlock.class,"trafficlightrightarrow");
      GameRegistry.registerBlock(TrafficLightStraightArrow, ScrollingItemBlock.class,"trafficlightstraightarrow");
      GameRegistry.registerBlock(TrafficLightStickLeftArrow, ScrollingItemBlock.class,"trafficlightstickleftarrow");
      GameRegistry.registerBlock(TrafficLightStickRightArrow, ScrollingItemBlock.class,"trafficlightstickrightarrow");
      GameRegistry.registerBlock(TrafficLightStickStraightArrow, ScrollingItemBlock.class,"trafficlightstickstraightarrow");
      GameRegistry.registerBlock(GoldenDoor, "goldendoor");
      GameRegistry.registerBlock(DiamondDoor, "diamonddoor");
      GameRegistry.registerBlock(FancyStreetlight, "fancystreetlight");
      GameRegistry.registerBlock(HalogenLight, "halogenlight");
      GameRegistry.registerBlock(RailwayCrossingLight, "railwaycrossinglight");
      GameRegistry.registerBlock(VariableSpeedSignA, ScrollingItemBlock.class, "variablespeedsigna");
      GameRegistry.registerBlock(VariableSpeedSignB, ScrollingItemBlock.class, "variablespeedsignb");
      GameRegistry.registerBlock(VariableSpeedSignC, ScrollingItemBlock.class, "variablespeedsignc");
      GameRegistry.registerBlock(VariableSpeedSignD, ScrollingItemBlock.class, "variablespeedsignd");
      GameRegistry.registerBlock(VariableSpeedSignE, ScrollingItemBlock.class, "variablespeedsigne");
      GameRegistry.registerBlock(VariableSpeedSignF, ScrollingItemBlock.class, "variablespeedsignf");
      GameRegistry.registerBlock(VariableSpeedSignG, ScrollingItemBlock.class, "variablespeedsigng");
      GameRegistry.registerBlock(VariableSpeedSignH, ScrollingItemBlock.class, "variablespeedsignh");
      GameRegistry.registerBlock(VariableSpeedSignI, ScrollingItemBlock.class, "variablespeedsigni");
      GameRegistry.registerBlock(VariableSpeedSignJ, ScrollingItemBlock.class, "variablespeedsignj");
      GameRegistry.registerBlock(TallTrafficLight, ScrollingItemBlock.class,  "talltrafficlight");
      GameRegistry.registerBlock(TallTrafficLightYellow, ScrollingItemBlock.class, "talltrafficlightwellow");
      GameRegistry.registerBlock(Barrier, ScrollingItemBlock.class, "barrier");
      GameRegistry.registerBlock(BarrierCorner, ScrollingItemBlock.class, "barriercorner");
      GameRegistry.registerBlock(YellowLeftArrow, "yellowleftarrow");
      GameRegistry.registerBlock(YellowRightArrow, "yellowrightarrow");
      GameRegistry.registerBlock(YellowStraightArrow, "yellowstraightarrow");
      //GameRegistry.registerBlock(Stucco, StuccoItem.class, "stucco");
      //GameRegistry.registerBlock(Vinyl, VinylItem.class, "vinyl");

      SimpleBlockIDGroupRegister simpleBlockIDGroupRegister = new SimpleBlockIDGroupRegister(Monoblocks.MODID);
      simpleBlockIDGroupRegister.RegisterIFoxBlockIDs(MBlocksEnum.values(), tempBlockCache);
      simpleBlockIDGroupRegister.RegisterIFoxBlockIDRecipes(MBlocksEnum.values(), tempBlockCache);

   }
}
