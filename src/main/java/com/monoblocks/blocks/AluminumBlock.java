package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AluminumBlock extends Block {
   public AluminumBlock(int i, Material iron) {
      super(iron);
      this.func_149672_a(field_149777_j);
      this.setHardness(9.0F);
      this.setResistance(9.0F);
      this.setBlockName("Aluminum Block");
      this.setBlockTextureName("monoblocks:aluminumblock");
   }
}
