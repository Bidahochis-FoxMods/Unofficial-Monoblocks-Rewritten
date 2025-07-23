package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PinkGlowstone extends Block {
   public PinkGlowstone(int i, Material glass) {
      super(glass);
      this.setStepSound(soundTypeGlass);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setLightLevel(1.0F);
      this.setBlockName("Pink Glowstone");
      this.setBlockTextureName("monoblocks:pinkglowstone");
   }
}
