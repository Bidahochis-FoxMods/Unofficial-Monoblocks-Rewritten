package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class PlasticItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"blackplastic", "blueplastic", "cyanplastic", "brownplastic", "grayplastic", "greenplastic", "lblueplastic", "lgrayplastic", "limeplastic", "magentaplastic", "orangeplastic", "pinkplastic", "purpleplastic", "redplastic", "yellowplastic", "whiteplastic"};

   public PlasticItem(Block block) {
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
