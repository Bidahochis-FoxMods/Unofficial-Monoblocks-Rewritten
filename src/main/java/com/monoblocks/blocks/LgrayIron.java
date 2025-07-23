package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LgrayIron extends Block {
   public LgrayIron(int i, Material Iron) {
      super(Iron);
      this.setStepSound(soundTypeMetal);
      this.setHardness(10.0F);
      this.setResistance(6.0F);
      this.setBlockName("Lgray Iron");
      this.setBlockTextureName("monoblocks:lgrayiron");
   }
}
