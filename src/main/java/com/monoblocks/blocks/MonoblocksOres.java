package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class MonoblocksOres extends Block {
   public MonoblocksOres() {
      super(Material.rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(9.0F);
      this.setResistance(9.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
   }

   public void func_149651_a(IIconRegister register) {
      if (this == MBlocks.AluminumOre) {
         this.blockIcon = register.registerIcon("monoblocks:aluminumore");
         this.setBlockName("Aluminum Ore");
      } else if (this == MBlocks.CopperOre) {
         this.blockIcon = register.registerIcon("monoblocks:copperore");
         this.setBlockName("Copper Ore");
      } else if (this == MBlocks.SteelOre) {
         this.blockIcon = register.registerIcon("monoblocks:steelore");
         this.setBlockName("Steel Ore");
      } else if (this == MBlocks.PurpleCrystalOre) {
         this.blockIcon = register.registerIcon("monoblocks:purplecrystalore");
         this.setBlockName("Purple Crystal Ore");
      } else if (this == MBlocks.RedCrystalOre) {
         this.blockIcon = register.registerIcon("monoblocks:redcrystalore");
         this.setBlockName("Red Crystal Ore");
      } else if (this == MBlocks.SilverOre) {
         this.blockIcon = register.registerIcon("monoblocks:silverore");
         this.setBlockName("Silver Ore");
      } else if (this == MBlocks.ZincOre) {
         this.blockIcon = register.registerIcon("monoblocks:zincore");
         this.setBlockName("Zinc Ore");
      }

   }
}
