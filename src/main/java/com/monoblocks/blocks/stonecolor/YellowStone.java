package com.monoblocks.blocks.stonecolor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class YellowStone extends Block {
   public YellowStone(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Yellow Stone");
      this.setBlockTextureName("monoblocks:yellowstone");
   }
}
