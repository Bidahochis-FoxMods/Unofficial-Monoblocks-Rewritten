package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class GlowstoneTileItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"blackglowstone", "blueglowstone", "cyanglowstone", "brownglowstone", "grayglowstone", "greenglowstone", "lblueglowstone", "lgrayglowstone", "limeglowstone", "magentaglowstone", "orangeglowstone", "pinkglowstone", "purpleglowstone", "redglowstone", "yellowglowstone", "whiteglowstone"};

   public GlowstoneTileItem(Block block) {
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
