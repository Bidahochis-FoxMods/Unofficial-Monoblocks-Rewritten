package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RainbowBlock extends Block {
   public RainbowBlock(int i, Material wood) {
      super(wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Rainbow Block");
      this.setBlockTextureName("monoblocks:rainbow");
   }
}
