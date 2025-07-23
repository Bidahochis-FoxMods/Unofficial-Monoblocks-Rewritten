package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AluminumBlock extends Block {
   public AluminumBlock(int i, Material iron) {
      super(iron);
      this.setStepSound(soundTypeMetal);
      this.setHardness(9.0F);
      this.setResistance(9.0F);
      this.setBlockName("Aluminum Block");
      this.setBlockTextureName("monoblocks:aluminumblock");
   }
}
