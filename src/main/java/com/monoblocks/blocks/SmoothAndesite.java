package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SmoothAndesite extends Block {
   public SmoothAndesite(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(4.0F);
      this.setResistance(4.0F);
      this.setBlockName("Smooth Andesite");
      this.setBlockTextureName("monoblocks:smoothandesite");
   }
}
