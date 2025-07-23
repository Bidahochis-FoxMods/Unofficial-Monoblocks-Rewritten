package com.monoblocks.blocks;

import java.util.Random;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class GoldenSand extends BlockFalling {
   public GoldenSand(int i, Material sand) {
      super(sand);
      this.setStepSound(soundTypeSand);
      this.setHardness(0.3F);
      this.setResistance(0.3F);
      this.setBlockName("Golden Sand");
      this.setBlockTextureName("monoblocks:goldensand");
   }

   public Item getItemDropped(int metadata, Random random, int fortune) {
      return Item.getItemById(371);
   }
}
