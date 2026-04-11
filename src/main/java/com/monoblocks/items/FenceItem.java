package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class FenceItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"black_0", "blue_0", "cyan_0", "brown_0", "gray_0", "green_0", "lightblue_0", "lightgray_0", "lime_0", "magenta_0", "orange_0", "pink_0", "purple_0", "red_0", "yellow_0", "white_0"};

   public FenceItem(Block block) {
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
