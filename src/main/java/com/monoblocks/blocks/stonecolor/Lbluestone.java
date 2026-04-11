package com.monoblocks.blocks.stonecolor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Lbluestone extends Block {
   public Lbluestone(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Light Blue Stone");
      this.setBlockTextureName("monoblocks:lbluestone");
   }
}
