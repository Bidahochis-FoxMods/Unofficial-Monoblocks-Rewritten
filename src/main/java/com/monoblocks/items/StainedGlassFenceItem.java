package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class StainedGlassFenceItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"glass_black", "glass_blue", "glass_cyan", "glass_brown", "glass_gray", "glass_green", "glass_light_blue", "glass_light_gray", "glass_lime", "glass_magenta", "glass_orange", "glass_pink", "glass_purple", "glass_red", "glass_yellow", "glass_white"};

   public StainedGlassFenceItem(Block block) {
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
