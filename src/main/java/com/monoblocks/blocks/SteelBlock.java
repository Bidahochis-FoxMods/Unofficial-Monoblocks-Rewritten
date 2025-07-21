package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SteelBlock extends Block {
   public SteelBlock(int i, Material iron) {
      super(iron);
      this.func_149672_a(field_149777_j);
      this.setHardness(9.0F);
      this.setResistance(9.0F);
      this.setBlockName("Steel Block");
      this.setBlockTextureName("monoblocks:steelblock");
   }
}
