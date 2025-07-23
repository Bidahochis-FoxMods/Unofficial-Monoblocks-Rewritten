package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Andesite extends Block {
   public Andesite(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(4.0F);
      this.setResistance(4.0F);
      this.setBlockName("Andesite");
      this.setBlockTextureName("monoblocks:andesite");
   }
}
