package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RedGlowstone extends Block {
   public RedGlowstone(int i, Material glass) {
      super(glass);
      this.func_149672_a(field_149778_k);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setLightLevel(1.0F);
      this.setBlockName("Red Glowstone");
      this.setBlockTextureName("monoblocks:redglowstone");
   }
}
