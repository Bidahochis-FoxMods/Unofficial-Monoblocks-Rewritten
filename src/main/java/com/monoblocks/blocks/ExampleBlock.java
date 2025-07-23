package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ExampleBlock extends Block {
   public ExampleBlock(int i, Material rock) {
      super(rock);
      this.setStepSound(Block.soundTypePiston);
      this.setHardness(9000.0F);
      this.setResistance(9000.0F);
      this.setBlockName("Block of Missing Texture");
   }
}
