package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlackGlowstone extends Block {
   public BlackGlowstone(int i, Material glass) {
      super(glass);
      this.setStepSound(soundTypeGlass);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Black Glowstone");
      this.setLightLevel(1.0F);
      this.setBlockTextureName("monoblocks:blackglowstone");
   }
}
