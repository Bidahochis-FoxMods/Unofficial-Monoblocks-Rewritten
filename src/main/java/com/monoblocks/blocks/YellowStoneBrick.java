package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class YellowStoneBrick extends Block {
   public YellowStoneBrick(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Yellow Stone Bricks");
      this.setBlockTextureName("monoblocks:yellowstonebrick");
   }
}
