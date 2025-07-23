package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class MonoblocksBlocks extends Block {
   public MonoblocksBlocks() {
      super(Material.wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister register) {
      if (this == MBlocks.BlackBlock) {
         this.blockIcon = register.registerIcon("monoblocks:black");
         this.setBlockName("Black Block");
      } else if (this == MBlocks.BlueBlock) {
         this.blockIcon = register.registerIcon("monoblocks:blue");
         this.setBlockName("Blue Block");
      } else if (this == MBlocks.BrownBlock) {
         this.blockIcon = register.registerIcon("monoblocks:brown");
         this.setBlockName("Brown Block");
      } else if (this == MBlocks.CyanBlock) {
         this.blockIcon = register.registerIcon("monoblocks:cyan");
         this.setBlockName("Cyan Block");
      } else if (this == MBlocks.GrayBlock) {
         this.blockIcon = register.registerIcon("monoblocks:gray");
         this.setBlockName("Gray Block");
      } else if (this == MBlocks.GreenBlock) {
         this.blockIcon = register.registerIcon("monoblocks:green");
         this.setBlockName("Green Block");
      } else if (this == MBlocks.InvisibleBlock) {
         this.blockIcon = register.registerIcon("monoblocks:invisible");
         this.setBlockName("X-Ray Block");
      } else if (this == MBlocks.Lblue) {
         this.blockIcon = register.registerIcon("monoblocks:lightblue");
         this.setBlockName("Light Blue Block");
      } else if (this == MBlocks.Lgray) {
         this.blockIcon = register.registerIcon("monoblocks:lightgray");
         this.setBlockName("Light Gray");
      } else if (this == MBlocks.LimeBlock) {
         this.blockIcon = register.registerIcon("monoblocks:lime");
         this.setBlockName("Lime Block");
      } else if (this == MBlocks.MagentaBlock) {
         this.blockIcon = register.registerIcon("monoblocks:magenta");
         this.setBlockName("Magenta Block");
      } else if (this == MBlocks.OrangeBlock) {
         this.blockIcon = register.registerIcon("monoblocks:orange");
         this.setBlockName("Orange Block");
      } else if (this == MBlocks.PinkBlock) {
         this.blockIcon = register.registerIcon("monoblocks:pink");
         this.setBlockName("Pink Block");
      } else if (this == MBlocks.PurpleBlock) {
         this.blockIcon = register.registerIcon("monoblocks:purple");
         this.setBlockName("Purple Block");
      } else if (this == MBlocks.RedBlock) {
         this.blockIcon = register.registerIcon("monoblocks:red");
         this.setBlockName("Red Block");
      } else if (this == MBlocks.WhiteBlock) {
         this.blockIcon = register.registerIcon("monoblocks:white");
         this.setBlockName("White Block");
      } else if (this == MBlocks.YellowBlock) {
         this.blockIcon = register.registerIcon("monoblocks:yellow");
         this.setBlockName("Yellow Block");
      } else if (this == MBlocks.FleshBlock) {
         this.blockIcon = register.registerIcon("monoblocks:flesh");
         this.setBlockName("Flesh Block");
      } else if (this == MBlocks.RainbowBlock) {
         this.blockIcon = register.registerIcon("monoblocks:rainbow");
         this.setBlockName("Rainbow Block");
      } else if (this == MBlocks.BlackPlanks) {
         this.blockIcon = register.registerIcon("monoblocks:blackplanks");
         this.setBlockName("Black Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.BluePlanks) {
         this.blockIcon = register.registerIcon("monoblocks:blueplanks");
         this.setBlockName("Blue Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.BrownPlanks) {
         this.blockIcon = register.registerIcon("monoblocks:brownplanks");
         this.setBlockName("Brown Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.CyanPlanks) {
         this.blockIcon = register.registerIcon("monoblocks:cyanplanks");
         this.setBlockName("Cyan Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.GrayPlanks) {
         this.blockIcon = register.registerIcon("monoblocks:grayplanks");
         this.setBlockName("Gray Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.GreenPlanks) {
         this.blockIcon = register.registerIcon("monoblocks:greenplanks");
         this.setBlockName("Green Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.Lblueplanks) {
         this.blockIcon = register.registerIcon("monoblocks:lblueplanks");
         this.setBlockName("Light Blue Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.Lgrayplanks) {
         this.blockIcon = register.registerIcon("monoblocks:lgrayplanks");
         this.setBlockName("Light Gray Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.LimePlanks) {
         this.blockIcon = register.registerIcon("monoblocks:limeplanks");
         this.setBlockName("Lime Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.MagentaPlanks) {
         this.blockIcon = register.registerIcon("monoblocks:magentaplanks");
         this.setBlockName("Magenta Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.OrangePlanks) {
         this.blockIcon = register.registerIcon("monoblocks:orangeplanks");
         this.setBlockName("Orange Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.PinkPlanks) {
         this.blockIcon = register.registerIcon("monoblocks:pinkplanks");
         this.setBlockName("Pink Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.PurplePlanks) {
         this.blockIcon = register.registerIcon("monoblocks:purpleplanks");
         this.setBlockName("Purple Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.RedPlanks) {
         this.blockIcon = register.registerIcon("monoblocks:redplanks");
         this.setBlockName("Red Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.YellowPlanks) {
         this.blockIcon = register.registerIcon("monoblocks:yellowplanks");
         this.setBlockName("Yellow Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.WhitePlanks) {
         this.blockIcon = register.registerIcon("monoblocks:whiteplanks");
         this.setBlockName("White Planks");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
      } else if (this == MBlocks.BlackGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:blackglowstone");
         this.setBlockName("Black Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setStepSound(soundTypeGlass);
         this.setLightLevel(1.0F);
      } else if (this == MBlocks.BlueGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:blueglowstone");
         this.setBlockName("Blue Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setStepSound(soundTypeGlass);
         this.setLightLevel(1.0F);
      } else if (this == MBlocks.BrownGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:brownglowstone");
         this.setBlockName("Black Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.CyanGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:cyanglowstone");
         this.setBlockName("Cyan Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.GrayGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:grayglowstone");
         this.setBlockName("Gray Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.GreenGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:greenglowstone");
         this.setBlockName("Green Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.Lblueglowstone) {
         this.blockIcon = register.registerIcon("monoblocks:lblueglowstone");
         this.setBlockName("Light Blue Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.Lgrayglowstone) {
         this.blockIcon = register.registerIcon("monoblocks:lgrayglowstone");
         this.setBlockName("Light Gray Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.LimeGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:limeglowstone");
         this.setBlockName("Lime Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.MagentaGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:magentaglowstone");
         this.setBlockName("Magenta Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.OrangeGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:orangeglowstone");
         this.setBlockName("Orange Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.PinkGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:pinkglowstone");
         this.setBlockName("Pink Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.PurpleGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:purpleglowstone");
         this.setBlockName("Purple Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.RedGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:redglowstone");
         this.setBlockName("Red Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.WhiteGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:whiteglowstone");
         this.setBlockName("White Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.YellowGlowstone) {
         this.blockIcon = register.registerIcon("monoblocks:yellowglowstone");
         this.setBlockName("Yellow Glowstone");
         this.setCreativeTab(Monoblocks.monoblocksmcstained);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      } else if (this == MBlocks.Flasher) {
         this.blockIcon = register.registerIcon("monoblocks:flasher");
         this.setBlockName("Flasher");
         this.setCreativeTab(Monoblocks.monoblocksLighting);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      }

      if (this == MBlocks.RoughPlastic) {
         this.blockIcon = register.registerIcon("monoblocks:plastic");
         this.setBlockName("roughplastic");
      } else if (this == MBlocks.OldLamp) {
         this.blockIcon = register.registerIcon("monoblocks:oldlamp");
         this.setBlockName("Old Lamp");
         this.setCreativeTab(Monoblocks.monoblocksLighting);
         this.setLightLevel(1.0F);
         this.setStepSound(soundTypeGlass);
      }

   }
}
