package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class StoneFenceItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"blackstone_0", "bluestone_0", "cyanstone_0", "brownstone_0", "graystone_0", "greenstone_0", "lbluestone_0", "lgraystone_0", "limestone_0", "magentastone_0", "orangestone_0", "pinkstone_0", "purplestone_0", "redstone_0", "yellowstone_0", "whitestone_0"};

   public StoneFenceItem(Block block) {
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
