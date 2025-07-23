package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class MonoblocksMetals extends Block {
   public MonoblocksMetals() {
      super(Material.iron);
      this.setStepSound(soundTypeMetal);
      this.setHardness(10.0F);
      this.setResistance(6.0F);
      this.setCreativeTab(Monoblocks.monoblocksmcstained);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister register) {
      if (this == MBlocks.BlackIron) {
         this.blockIcon = register.registerIcon("monoblocks:blackiron");
         this.setBlockName("Black Iron");
      } else if (this == MBlocks.BlueIron) {
         this.blockIcon = register.registerIcon("monoblocks:blueiron");
         this.setBlockName("Blue Iron");
      } else if (this == MBlocks.BrownIron) {
         this.blockIcon = register.registerIcon("monoblocks:browniron");
         this.setBlockName("Brown Iron");
      } else if (this == MBlocks.CyanIron) {
         this.blockIcon = register.registerIcon("monoblocks:cyaniron");
         this.setBlockName("Cyan Iron");
      } else if (this == MBlocks.GrayIron) {
         this.blockIcon = register.registerIcon("monoblocks:grayiron");
         this.setBlockName("Gray Iron");
      } else if (this == MBlocks.GreenIron) {
         this.blockIcon = register.registerIcon("monoblocks:greeniron");
         this.setBlockName("Green Iron");
      } else if (this == MBlocks.LblueIron) {
         this.blockIcon = register.registerIcon("monoblocks:lblueiron");
         this.setBlockName("Lblue Iron");
      } else if (this == MBlocks.LgrayIron) {
         this.blockIcon = register.registerIcon("monoblocks:lgrayiron");
         this.setBlockName("Lgray Iron");
      } else if (this == MBlocks.LimeIron) {
         this.blockIcon = register.registerIcon("monoblocks:limeiron");
         this.setBlockName("Lime Iron");
      } else if (this == MBlocks.MagentaIron) {
         this.blockIcon = register.registerIcon("monoblocks:magentairon");
         this.setBlockName("Magenta Iron");
      } else if (this == MBlocks.OrangeIron) {
         this.blockIcon = register.registerIcon("monoblocks:orangeiron");
         this.setBlockName("Orange Iron");
      } else if (this == MBlocks.PinkIron) {
         this.blockIcon = register.registerIcon("monoblocks:pinkiron");
         this.setBlockName("Pink Iron");
      } else if (this == MBlocks.PurpleIron) {
         this.blockIcon = register.registerIcon("monoblocks:purpleiron");
         this.setBlockName("Purple Iron");
      } else if (this == MBlocks.RedIron) {
         this.blockIcon = register.registerIcon("monoblocks:rediron");
         this.setBlockName("Red Iron");
      } else if (this == MBlocks.WhiteIron) {
         this.blockIcon = register.registerIcon("monoblocks:whiteiron");
         this.setBlockName("White Iron");
      } else if (this == MBlocks.YellowIron) {
         this.blockIcon = register.registerIcon("monoblocks:yellowiron");
         this.setBlockName("Yellow Iron");
      } else if (this == MBlocks.AluminumBlock) {
         this.blockIcon = register.registerIcon("monoblocks:aluminumblock");
         this.setBlockName("Aluminum Block");
         this.setHardness(9.0F);
         this.setResistance(9.0F);
         this.setCreativeTab(Monoblocks.monoblocksTab);
      } else if (this == MBlocks.CopperBlock) {
         this.blockIcon = register.registerIcon("monoblocks:copperblock");
         this.setBlockName("Copper Block");
         this.setHardness(10.0F);
         this.setResistance(10.0F);
         this.setCreativeTab(Monoblocks.monoblocksTab);
      } else if (this == MBlocks.Gold) {
         this.blockIcon = register.registerIcon("monoblocks:gold");
         this.setBlockName("Gold Block");
         this.setHardness(10.0F);
         this.setResistance(10.0F);
         this.setCreativeTab(Monoblocks.monoblocksTab);
      } else if (this == MBlocks.Diamond) {
         this.blockIcon = register.registerIcon("monoblocks:diamond");
         this.setBlockName("Diamond Block");
         this.setHardness(20.0F);
         this.setResistance(20.0F);
         this.setCreativeTab(Monoblocks.monoblocksTab);
      } else if (this == MBlocks.Iron) {
         this.blockIcon = register.registerIcon("monoblocks:smoothiron");
         this.setBlockName("Iron Block");
         this.setHardness(10.0F);
         this.setResistance(10.0F);
         this.setCreativeTab(Monoblocks.monoblocksTab);
      } else if (this == MBlocks.SilverBlock) {
         this.blockIcon = register.registerIcon("monoblocks:silverblock");
         this.setBlockName("Silver Block");
         this.setHardness(10.0F);
         this.setResistance(10.0F);
         this.setCreativeTab(Monoblocks.monoblocksTab);
      } else if (this == MBlocks.SteelBlock) {
         this.blockIcon = register.registerIcon("monoblocks:steelblock");
         this.setBlockName("Steel Block");
         this.setHardness(15.0F);
         this.setResistance(15.0F);
         this.setCreativeTab(Monoblocks.monoblocksTab);
      } else if (this == MBlocks.ZincBlock) {
         this.blockIcon = register.registerIcon("monoblocks:zincblock");
         this.setBlockName("Zinc Block");
         this.setHardness(5.0F);
         this.setResistance(5.0F);
         this.setCreativeTab(Monoblocks.monoblocksTab);
      }

   }
}
