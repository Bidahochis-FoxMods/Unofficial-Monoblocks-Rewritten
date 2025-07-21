package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Diorite extends Block {
   public Diorite(int i, Material rock) {
      super(rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(4.0F);
      this.setResistance(4.0F);
      this.setBlockName("Diorite");
      this.setBlockTextureName("monoblocks:diorite");
   }
}
