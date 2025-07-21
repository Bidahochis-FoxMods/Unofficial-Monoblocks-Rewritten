package com.monoblocks.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class FallingStone extends BlockFalling {
   public FallingStone(Material rock) {
      super(rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(1.0F);
      this.setBlockName("Stone");
      this.setBlockTextureName("monoblocks:stone");
   }
}
