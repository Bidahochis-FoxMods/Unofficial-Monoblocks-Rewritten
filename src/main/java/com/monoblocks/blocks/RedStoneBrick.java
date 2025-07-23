package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RedStoneBrick extends Block {
   public RedStoneBrick(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Red Stone Bricks");
      this.setBlockTextureName("monoblocks:redstonebrick");
   }
}
