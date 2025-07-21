package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LblueIron extends Block {
   public LblueIron(int i, Material Iron) {
      super(Iron);
      this.func_149672_a(field_149777_j);
      this.setHardness(10.0F);
      this.setResistance(6.0F);
      this.setBlockName("Lblue Iron");
      this.setBlockTextureName("monoblocks:lblueiron");
   }
}
