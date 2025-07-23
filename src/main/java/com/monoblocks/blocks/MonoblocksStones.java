package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class MonoblocksStones extends Block {
   public MonoblocksStones() {
      super(Material.rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(4.0F);
      this.setResistance(4.0F);
      this.setCreativeTab(Monoblocks.monoblocksmcstained);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister register) {
      if (this == MBlocks.BlackStone) {
         this.blockIcon = register.registerIcon("monoblocks:blackstone");
         this.setBlockName("Black Stone");
      } else if (this == MBlocks.BlueStone) {
         this.blockIcon = register.registerIcon("monoblocks:bluestone");
         this.setBlockName("Blue Stone");
      } else if (this == MBlocks.BrownStone) {
         this.blockIcon = register.registerIcon("monoblocks:brownstone");
         this.setBlockName("Brown Stone");
      } else if (this == MBlocks.CyanStone) {
         this.blockIcon = register.registerIcon("monoblocks:cyanstone");
         this.setBlockName("Cyan Stone");
      } else if (this == MBlocks.GrayStone) {
         this.blockIcon = register.registerIcon("monoblocks:graystone");
         this.setBlockName("Gray Stone");
      } else if (this == MBlocks.GreenStone) {
         this.blockIcon = register.registerIcon("monoblocks:greenstone");
         this.setBlockName("Green Stone");
      } else if (this == MBlocks.Lbluestone) {
         this.blockIcon = register.registerIcon("monoblocks:lbluestone");
         this.setBlockName("Light Blue Stone");
      } else if (this == MBlocks.LgrayStone) {
         this.blockIcon = register.registerIcon("monoblocks:lgraystone");
         this.setBlockName("Light Gray Stone");
      } else if (this == MBlocks.LimeStone) {
         this.blockIcon = register.registerIcon("monoblocks:limestone");
         this.setBlockName("Lime Stone");
      } else if (this == MBlocks.MagentaStone) {
         this.blockIcon = register.registerIcon("monoblocks:magentastone");
         this.setBlockName("Magenta Stone");
      } else if (this == MBlocks.OrangeStone) {
         this.blockIcon = register.registerIcon("monoblocks:orangestone");
         this.setBlockName("Lime Stone");
      } else if (this == MBlocks.PinkStone) {
         this.blockIcon = register.registerIcon("monoblocks:pinkstone");
         this.setBlockName("Pink Stone");
      } else if (this == MBlocks.PurpleStone) {
         this.blockIcon = register.registerIcon("monoblocks:purplestone");
         this.setBlockName("Purple Stone");
      } else if (this == MBlocks.RedStone) {
         this.blockIcon = register.registerIcon("monoblocks:redstone");
         this.setBlockName("Red Stone");
      } else if (this == MBlocks.WhiteStone) {
         this.blockIcon = register.registerIcon("monoblocks:whitestone");
         this.setBlockName("Whie Stone");
      } else if (this == MBlocks.YellowStone) {
         this.blockIcon = register.registerIcon("monoblocks:yellowstone");
         this.setBlockName("Yellow Stone");
      } else if (this == MBlocks.BlackStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:blackstonebrick");
         this.setBlockName("Black Stone Bricks");
      } else if (this == MBlocks.BlueStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:bluestonebrick");
         this.setBlockName("Blue Stone Bricks");
      } else if (this == MBlocks.BrownStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:brownstonebrick");
         this.setBlockName("Brown Stone Bricks");
      } else if (this == MBlocks.CyanStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:cyanstonebrick");
         this.setBlockName("Cyan Stone Bricks");
      } else if (this == MBlocks.GrayStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:graystonebrick");
         this.setBlockName("Gray Stone Bricks");
      } else if (this == MBlocks.GreenStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:greenstonebrick");
         this.setBlockName("Green Stone Bricks");
      } else if (this == MBlocks.LBlueStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:lbluestonebrick");
         this.setBlockName("Light Blue Stone Bricks");
      } else if (this == MBlocks.LGrayStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:lgraystonebrick");
         this.setBlockName("Light Gray Stone Bricks");
      } else if (this == MBlocks.LimeStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:limestonebrick");
         this.setBlockName("Lime Stone Bricks");
      } else if (this == MBlocks.MagentaStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:magentastonebrick");
         this.setBlockName("Magenta Stone Bricks");
      } else if (this == MBlocks.OrangeStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:orangestonebrick");
         this.setBlockName("Orange Stone Bricks");
      } else if (this == MBlocks.PinkStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:pinkstonebrick");
         this.setBlockName("Pink Stone Bricks");
      } else if (this == MBlocks.PurpleStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:purplestonebrick");
         this.setBlockName("Purple Stone Bricks");
      } else if (this == MBlocks.RedStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:redstonebrick");
         this.setBlockName("Red Stone Bricks");
      } else if (this == MBlocks.WhiteStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:whitestonebrick");
         this.setBlockName("White Stone Bricks");
      } else if (this == MBlocks.YellowStoneBrick) {
         this.blockIcon = register.registerIcon("monoblocks:yellowstonebrick");
         this.setBlockName("Yellow Stone Bricks");
      } else if (this == MBlocks.Andesite) {
         this.blockIcon = register.registerIcon("monoblocks:andesite");
         this.setBlockName("Andesite");
      } else if (this == MBlocks.SmoothAndesite) {
         this.blockIcon = register.registerIcon("monoblocks:smoothandesite");
         this.setBlockName("Smooth Andesite");
      } else if (this == MBlocks.Diorite) {
         this.blockIcon = register.registerIcon("monoblocks:diorite");
         this.setBlockName("Diorite");
      } else if (this == MBlocks.SmoothDiorite) {
         this.blockIcon = register.registerIcon("monoblocks:smoothdiorite");
         this.setBlockName("Smooth Diorite");
      } else if (this == MBlocks.Granite) {
         this.blockIcon = register.registerIcon("monoblocks:granite");
         this.setBlockName("Granite");
      } else if (this == MBlocks.SmoothGranite) {
         this.blockIcon = register.registerIcon("monoblocks:smoothgranite");
         this.setBlockName("Smooth Granite");
      }

   }
}
