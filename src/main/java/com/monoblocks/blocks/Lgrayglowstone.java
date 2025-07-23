package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Lgrayglowstone extends Block {
   public Lgrayglowstone(int i, Material glass) {
      super(glass);
      this.setStepSound(soundTypeGlass);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setLightLevel(0.5F);
      this.setBlockName("Light Gray Glowstone");
      this.setBlockTextureName("monoblocks:lgrayglowstone");
   }
}
