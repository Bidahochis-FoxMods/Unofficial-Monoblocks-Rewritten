package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BluePlanks extends Block {
   public BluePlanks(int i, Material wood) {
      super(wood);
      this.func_149672_a(field_149766_f);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Blue Planks");
      this.setBlockTextureName("monoblocks:blueplanks");
   }
}
