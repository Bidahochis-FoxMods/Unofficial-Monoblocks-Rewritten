package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class MonoblockStairs extends BlockStairs {
   public MonoblockStairs(Block block, int i) {
      super(block, i);
      this.setCreativeTab(Monoblocks.monoblocksTab);
   }
}
