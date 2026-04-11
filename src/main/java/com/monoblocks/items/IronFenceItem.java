package com.monoblocks.items;

import com.monoblocks.blocks.IronTiles;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class IronFenceItem extends ItemBlock {
   public IronFenceItem(Block block) {
      super(block);
      this.setHasSubtypes(true);
   }

   public String func_77667_c(ItemStack itemstack) {
      int i = itemstack.getItemDamage();
      if (i < 0 || i >= IronTiles.subBlocks.length) {
         i = 0;
      }

      return super.getUnlocalizedName() + "." + IronTiles.subBlocks[i];
   }

   public int func_77647_b(int meta) {
      return meta;
   }
}
