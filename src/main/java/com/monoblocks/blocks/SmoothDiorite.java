package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SmoothDiorite extends Block {
   public SmoothDiorite(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(4.0F);
      this.setResistance(4.0F);
      this.setBlockName("Smooth Diorite");
      this.setBlockTextureName("monoblocks:smoothdiorite");
   }
}
