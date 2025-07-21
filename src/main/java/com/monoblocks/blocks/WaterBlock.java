package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class WaterBlock extends Block {
   public WaterBlock(Material water) {
      super(water);
      this.func_149672_a(field_149773_n);
      this.setHardness(1.0F);
      this.setResistance(1.0F);
      this.setBlockName("Block Of Water");
      this.setBlockTextureName("water_still");
   }
}
