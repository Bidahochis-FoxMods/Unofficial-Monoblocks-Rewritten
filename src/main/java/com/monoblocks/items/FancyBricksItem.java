package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class FancyBricksItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"fancybrick0", "fancybrick1", "fancybrick2", "fancybrick3", "fancybrick4", "fancybrick5", "fancybrick6", "fancybrick7", "fancybrick8", "fancybrick9", "fancybrick10", "fancybrick11", "fancybrick12", "fancybrick13", "fancybrick14", "fancybrick15"};

   public FancyBricksItem(Block block) {
      super(block);
      this.func_77627_a(true);
   }

   public String func_77667_c(ItemStack itemstack) {
      int i = itemstack.func_77960_j();
      if (i < 0 || i >= subBlocks.length) {
         i = 0;
      }

      return super.func_77658_a() + "." + subBlocks[i];
   }

   public int func_77647_b(int meta) {
      return meta;
   }
}
