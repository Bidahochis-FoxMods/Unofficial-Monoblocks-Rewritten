package com.monoblocks.fluid;

import com.monoblocks.Monoblocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class RedWaterBucket extends ItemBucket {
   public RedWaterBucket(Block block) {
      super(block);
      this.setCreativeTab(Monoblocks.monoblocksitems);
   }
}
