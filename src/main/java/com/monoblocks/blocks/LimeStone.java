package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LimeStone extends Block {
   public LimeStone(int i, Material rock) {
      super(rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Lime Stone");
      this.setBlockTextureName("monoblocks:limestone");
   }
}
