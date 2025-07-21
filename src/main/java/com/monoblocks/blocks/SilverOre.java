package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SilverOre extends Block {
   public SilverOre(int i, Material rock) {
      super(rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(6.0F);
      this.setResistance(6.0F);
      this.setBlockName("Silver Ore");
      this.setBlockTextureName("monoblocks:silverore");
   }
}
