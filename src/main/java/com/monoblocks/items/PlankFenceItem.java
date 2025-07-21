package com.monoblocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class PlankFenceItem extends ItemBlock {
   static final String[] subBlocks = new String[]{"blackplanks", "blueplanks", "cyanplanks", "brownplanks", "grayplanks", "greenplanks", "lblueplanks", "lgrayplanks", "limeplanks", "magentaplanks", "orangeplanks", "pinkplanks", "purpleplanks", "redplanks", "yellowplanks", "whiteplanks"};

   public PlankFenceItem(Block block) {
      super(block);
      this.func_77627_a(true);
   }

   public String func_77667_c(ItemStack itemstack) {
      int i = itemstack.func_77960_j();
      if (i < 0 || i >= subBlocks.length) {
         i = 0;
      }

      return super.func_77658_a() + "." + subBlocks[i];
   }

   public int func_77647_b(int meta) {
      return meta;
   }
}
