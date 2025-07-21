package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PinkStoneBrick extends Block {
   public PinkStoneBrick(int i, Material rock) {
      super(rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Pink Stone Bricks");
      this.setBlockTextureName("monoblocks:pinkstonebrick");
   }
}
