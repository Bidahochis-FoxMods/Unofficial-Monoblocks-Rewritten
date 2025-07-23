package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class WhiteGlowstone extends Block {
   public WhiteGlowstone(int i, Material glass) {
      super(glass);
      this.setStepSound(soundTypeGlass);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setLightLevel(1.0F);
      this.setBlockName("White Glowstone");
      this.setBlockTextureName("monoblocks:whiteglowstone");
   }
}
