package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class PlankFenceItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"blackplanks_0", "blueplanks_0", "cyanplanks_0", "brownplanks_0", "grayplanks_0", "greenplanks_0", "lblueplanks_0", "lgrayplanks_0", "limeplanks_0", "magentaplanks_0", "orangeplanks_0", "pinkplanks_0", "purpleplanks_0", "redplanks_0", "yellowplanks_0", "whiteplanks_0"};

   public PlankFenceItem(Block block) {
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
