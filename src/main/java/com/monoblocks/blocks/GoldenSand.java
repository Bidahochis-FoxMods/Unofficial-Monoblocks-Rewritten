package com.monoblocks.blocks;

import java.util.Random;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class GoldenSand extends BlockFalling {
   public GoldenSand(int i, Material sand) {
      super(sand);
      this.func_149672_a(field_149776_m);
      this.setHardness(0.3F);
      this.setResistance(0.3F);
      this.setBlockName("Golden Sand");
      this.setBlockTextureName("monoblocks:goldensand");
   }

   public Item func_149650_a(int metadata, Random random, int fortune) {
      return Item.func_150899_d(371);
   }
}
