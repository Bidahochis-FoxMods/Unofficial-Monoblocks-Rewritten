package com.monoblocks.blocks;

import com.monoblocks.MItems;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class PurpleCrystalOre extends Block {
   public PurpleCrystalOre(int i, Material rock) {
      super(rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(10.0F);
      this.setResistance(10.0F);
      this.setBlockName("Purple Crystal Ore");
      this.setBlockTextureName("monoblocks:purplecrystalore");
   }

   public Item func_149650_a(int metadata, Random random, int fortune) {
      return MItems.PurpleCrystal;
   }
}
