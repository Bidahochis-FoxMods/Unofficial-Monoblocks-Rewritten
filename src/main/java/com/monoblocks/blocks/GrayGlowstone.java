package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GrayGlowstone extends Block {
   public GrayGlowstone(int i, Material glass) {
      super(glass);
      this.setStepSound(soundTypeGlass);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setLightLevel(0.3F);
      this.setBlockName("Gray Glowstone");
      this.setBlockTextureName("monoblocks:grayglowstone");
   }
}
