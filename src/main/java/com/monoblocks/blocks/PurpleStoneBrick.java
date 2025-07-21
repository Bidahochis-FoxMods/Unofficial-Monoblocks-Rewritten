package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PurpleStoneBrick extends Block {
   public PurpleStoneBrick(int i, Material rock) {
      super(rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Purple Stone Bricks");
      this.setBlockTextureName("monoblocks:purplestonebrick");
   }
}
