package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Diorite extends Block {
   public Diorite(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(4.0F);
      this.setResistance(4.0F);
      this.setBlockName("Diorite");
      this.setBlockTextureName("monoblocks:diorite");
   }
}
