package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Lblueglowstone extends Block {
   public Lblueglowstone(int i, Material glass) {
      super(glass);
      this.func_149672_a(field_149778_k);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setLightLevel(1.0F);
      this.setBlockName("Light Blue Glowstone");
      this.setBlockTextureName("monoblocks:lblueglowstone");
   }
}
