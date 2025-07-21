package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class PinkSword extends ItemSword {
   public PinkSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("pinksword");
      this.func_111206_d("monoblocks:pinksword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
