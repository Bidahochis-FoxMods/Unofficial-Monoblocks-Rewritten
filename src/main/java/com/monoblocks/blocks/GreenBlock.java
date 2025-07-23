package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GreenBlock extends Block {
   public GreenBlock(int i, Material wood) {
      super(wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Green Block");
      this.setBlockTextureName("monoblocks:green");
   }
}
