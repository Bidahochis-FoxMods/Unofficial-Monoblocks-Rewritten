package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class MagentaIron extends Block {
   public MagentaIron(int i, Material Iron) {
      super(Iron);
      this.func_149672_a(field_149777_j);
      this.setHardness(10.0F);
      this.setResistance(6.0F);
      this.setBlockName("Magenta Iron");
      this.setBlockTextureName("monoblocks:magentairon");
   }
}
