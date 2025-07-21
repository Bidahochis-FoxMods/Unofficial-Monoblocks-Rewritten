package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SteelOre extends Block {
   public SteelOre(int i, Material rock) {
      super(rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(9.0F);
      this.setResistance(9.0F);
      this.setBlockName("Steel Ore");
      this.setBlockTextureName("monoblocks:steelore");
   }
}
