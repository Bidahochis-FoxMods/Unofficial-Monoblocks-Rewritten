package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DarkStoneBrick extends Block {
   public DarkStoneBrick() {
      super(Material.rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("darkstonebrick");
      this.setBlockTextureName("monoblocks:darkstonebrick");
      this.setCreativeTab(Monoblocks.monoblocksTab);
   }
}
