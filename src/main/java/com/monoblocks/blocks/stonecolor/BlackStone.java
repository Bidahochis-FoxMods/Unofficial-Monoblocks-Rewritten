package com.monoblocks.blocks.stonecolor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlackStone extends Block {
   public BlackStone(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Black Stone");
      this.setBlockTextureName("monoblocks:blackstone");
   }
}
