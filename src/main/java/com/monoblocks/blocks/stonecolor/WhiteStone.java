package com.monoblocks.blocks.stonecolor;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class WhiteStone extends Block {
   public WhiteStone(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Whie Stone");
      this.setBlockTextureName("monoblocks:whitestone");
   }
}
