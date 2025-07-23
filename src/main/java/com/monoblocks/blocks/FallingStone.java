package com.monoblocks.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class FallingStone extends BlockFalling {
   public FallingStone(Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(1.0F);
      this.setBlockName("Stone");
      this.setBlockTextureName("monoblocks:stone");
   }
}
