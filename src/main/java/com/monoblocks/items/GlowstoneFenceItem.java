package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class GlowstoneFenceItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"blackglowstone_0", "blueglowstone_0", "cyanglowstone_0", "brownglowstone_0", "grayglowstone_0", "greenglowstone_0", "lblueglowstone_0", "lgrayglowstone_0", "limeglowstone_0", "magentaglowstone_0", "orangeglowstone_0", "pinkglowstone_0", "purpleglowstone_0", "redglowstone_0", "yellowglowstone_0", "whiteglowstone_0"};

   public GlowstoneFenceItem(Block block) {
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
