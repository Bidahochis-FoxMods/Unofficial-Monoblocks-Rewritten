package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class InvisibleBlock extends Block {
   public InvisibleBlock(int i, Material wood) {
      super(wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("X-Ray Block");
      this.setBlockTextureName("monoblocks:invisible");
   }
}
