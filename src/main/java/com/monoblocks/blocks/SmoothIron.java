package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SmoothIron extends Block {
   public SmoothIron(Material Iron) {
      super(Iron);
      this.func_149672_a(field_149777_j);
      this.setHardness(10.0F);
      this.setResistance(10.0F);
      this.setBlockName("Iron Block");
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockTextureName("monoblocks:smoothiron");
   }
}
