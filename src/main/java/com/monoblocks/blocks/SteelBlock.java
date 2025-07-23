package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SteelBlock extends Block {
   public SteelBlock(int i, Material iron) {
      super(iron);
      this.setStepSound(soundTypeMetal);
      this.setHardness(9.0F);
      this.setResistance(9.0F);
      this.setBlockName("Steel Block");
      this.setBlockTextureName("monoblocks:steelblock");
   }
}
