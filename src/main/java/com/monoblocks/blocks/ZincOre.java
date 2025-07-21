package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ZincOre extends Block {
   public ZincOre(int i, Material rock) {
      super(rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(10.0F);
      this.setResistance(10.0F);
      this.setBlockName("Zinc Ore");
      this.setBlockTextureName("monoblocks:zincore");
   }
}
