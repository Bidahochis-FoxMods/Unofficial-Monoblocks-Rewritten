package com.monoblocks.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class Gravel extends BlockFalling {
   public Gravel(int i, Material ground) {
      super(ground);
      this.func_149672_a(field_149767_g);
      this.setHardness(0.5F);
      this.setBlockName("Gravel");
      this.setBlockTextureName("monoblocks:gravel");
   }
}
