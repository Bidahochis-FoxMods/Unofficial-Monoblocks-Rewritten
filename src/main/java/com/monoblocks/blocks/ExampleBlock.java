package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ExampleBlock extends Block {
   public ExampleBlock(int i, Material rock) {
      super(rock);
      this.func_149672_a(Block.field_149780_i);
      this.setHardness(9000.0F);
      this.setResistance(9000.0F);
      this.setBlockName("Block of Missing Texture");
   }
}
