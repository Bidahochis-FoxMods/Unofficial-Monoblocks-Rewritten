package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class VinylItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"blackvinyl", "bluevinyl", "cyanvinyl", "brownvinyl", "grayvinyl", "greenvinyl", "lbluevinyl", "lgrayvinyl", "limevinyl", "magentavinyl", "orangevinyl", "pinkvinyl", "purplevinyl", "redvinyl", "yellowvinyl", "whitevinyl"};

   public VinylItem(Block block) {
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
