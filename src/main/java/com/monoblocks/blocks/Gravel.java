package com.monoblocks.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class Gravel extends BlockFalling {
   public Gravel(int i, Material ground) {
      super(ground);
      this.setStepSound(soundTypeGravel);
      this.setHardness(0.5F);
      this.setBlockName("Gravel");
      this.setBlockTextureName("monoblocks:gravel");
   }
}
