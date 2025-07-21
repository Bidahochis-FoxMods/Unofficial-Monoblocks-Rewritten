package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PinkIron extends Block {
   public PinkIron(int i, Material Iron) {
      super(Iron);
      this.func_149672_a(field_149777_j);
      this.setHardness(10.0F);
      this.setResistance(6.0F);
      this.setBlockName("Pink Iron");
      this.setBlockTextureName("monoblocks:pinkiron");
   }
}
