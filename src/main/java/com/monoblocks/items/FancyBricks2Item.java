package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class FancyBricks2Item extends ItemBlock {
   static final String[] subBlocks = new String[]{"fancybrick16", "fancybrick17", "fancybrick18", "fancybrick19", "fancybrick20", "fancybrick21", "fancybrick22", "fancybrick23", "fancybrick24", "fancybrick25", "fancybrick26", "fancybrick27", "fancybrick28", "fancybrick29", "fancybrick30", "fancybrick31"};

   public FancyBricks2Item(Block block) {
      super(block);
      this.setHasSubtypes(true);
   }

   public String func_77667_c(ItemStack itemstack) {
      int i = itemstack.getItemDamage();
      if (i < 0 || i >= subBlocks.length) {
         i = 0;
      }

      return super.getUnlocalizedName() + "." + subBlocks[i];
   }

   public int func_77647_b(int meta) {
      return meta;
   }
}
