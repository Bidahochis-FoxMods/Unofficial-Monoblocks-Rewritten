package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GreenIron extends Block {
   public GreenIron(int i, Material Iron) {
      super(Iron);
      this.setStepSound(soundTypeMetal);
      this.setHardness(10.0F);
      this.setResistance(6.0F);
      this.setBlockName("Green Iron");
      this.setBlockTextureName("monoblocks:greeniron");
   }
}
