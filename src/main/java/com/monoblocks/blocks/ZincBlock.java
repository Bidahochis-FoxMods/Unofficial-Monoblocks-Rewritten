package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ZincBlock extends Block {
   public ZincBlock(int i, Material Iron) {
      super(Iron);
      this.setStepSound(soundTypeMetal);
      this.setHardness(10.0F);
      this.setResistance(10.0F);
      this.setBlockName("Zinc Block");
      this.setBlockTextureName("monoblocks:zincblock");
   }
}
