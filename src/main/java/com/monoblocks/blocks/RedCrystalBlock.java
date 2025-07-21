package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RedCrystalBlock extends Block {
   public RedCrystalBlock(int i, Material glass) {
      super(glass);
      this.func_149672_a(field_149778_k);
      this.setHardness(3.0F);
      this.setResistance(3.0F);
      this.setBlockName("Red Crystal Block");
      this.setBlockTextureName("monoblocks:redcrystalblock");
   }
}
