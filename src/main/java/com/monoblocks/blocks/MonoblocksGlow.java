package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.IBlockAccess;

public class MonoblocksGlow extends Block {
   public MonoblocksGlow() {
      super(Material.glass);
      this.setCreativeTab(Monoblocks.monoblocksLighting);
      this.setHardness(2.5F);
      this.setResistance(500.0F);
      this.setLightLevel(1.0F);
      this.setStepSound(soundTypeGlass);
   }

   public int getRenderBlockPass() {
      return 1;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, 1 - par5);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister register) {
      if (this == MBlocks.BlackGlow) {
         this.blockIcon = register.registerIcon("monoblocks:blackglow");
         this.setBlockName("Black Glow");
      } else if (this == MBlocks.BlueGlow) {
         this.blockIcon = register.registerIcon("monoblocks:blueglow");
         this.setBlockName("Blue Glow");
      } else if (this == MBlocks.BrownGlow) {
         this.blockIcon = register.registerIcon("monoblocks:brownglow");
         this.setBlockName("Brown Glow");
      } else if (this == MBlocks.CyanGlow) {
         this.blockIcon = register.registerIcon("monoblocks:cyanglow");
         this.setBlockName("Cyan Glow");
      } else if (this == MBlocks.GrayGlow) {
         this.blockIcon = register.registerIcon("monoblocks:grayglow");
         this.setBlockName("Gray Glow");
      } else if (this == MBlocks.GreenGlow) {
         this.blockIcon = register.registerIcon("monoblocks:greenglow");
         this.setBlockName("Green Glow");
      } else if (this == MBlocks.LblueGlow) {
         this.blockIcon = register.registerIcon("monoblocks:lblueglow");
         this.setBlockName("Lblue Glow");
      } else if (this == MBlocks.LgrayGlow) {
         this.blockIcon = register.registerIcon("monoblocks:lgrayglow");
         this.setBlockName("Lgray Glow");
      } else if (this == MBlocks.LimeGlow) {
         this.blockIcon = register.registerIcon("monoblocks:limeglow");
         this.setBlockName("Lime Glow");
      } else if (this == MBlocks.MagentaGlow) {
         this.blockIcon = register.registerIcon("monoblocks:magentaglow");
         this.setBlockName("Magenta Glow");
      } else if (this == MBlocks.OrangeGlow) {
         this.blockIcon = register.registerIcon("monoblocks:orangeglow");
         this.setBlockName("Orange Glow");
      } else if (this == MBlocks.PinkGlow) {
         this.blockIcon = register.registerIcon("monoblocks:pinkglow");
         this.setBlockName("Pink Glow");
      } else if (this == MBlocks.PurpleGlow) {
         this.blockIcon = register.registerIcon("monoblocks:purpleglow");
         this.setBlockName("Purple Glow");
      } else if (this == MBlocks.RedGlow) {
         this.blockIcon = register.registerIcon("monoblocks:redglow");
         this.setBlockName("Red Glow");
      } else if (this == MBlocks.WhiteGlow) {
         this.blockIcon = register.registerIcon("monoblocks:whiteglow");
         this.setBlockName("White Glow");
      } else if (this == MBlocks.YellowGlow) {
         this.blockIcon = register.registerIcon("monoblocks:yellowglow");
         this.setBlockName("Yellow Glow");
      }

   }
}
