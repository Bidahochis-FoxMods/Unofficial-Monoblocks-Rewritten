package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class MagentaSword extends ItemSword {
   public MagentaSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("magentasword");
      this.func_111206_d("monoblocks:magentasword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
