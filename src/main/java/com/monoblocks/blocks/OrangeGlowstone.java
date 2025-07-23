package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OrangeGlowstone extends Block {
   public OrangeGlowstone(int i, Material glass) {
      super(glass);
      this.setStepSound(soundTypeGlass);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setLightLevel(1.0F);
      this.setBlockName("Orange Glowstone");
      this.setBlockTextureName("monoblocks:orangeglowstone");
   }
}
