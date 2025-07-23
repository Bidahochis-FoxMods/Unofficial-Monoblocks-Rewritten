package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class GravelTilesItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"blackgravel", "bluegravel", "cyangravel", "browngravel", "graygravel", "greengravel", "lbluegravel", "lgraygravel", "limegravel", "magentagravel", "orangegravel", "pinkgravel", "purplegravel", "redgravel", "yellowgravel", "whitegravel"};

   public GravelTilesItem(Block block) {
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
