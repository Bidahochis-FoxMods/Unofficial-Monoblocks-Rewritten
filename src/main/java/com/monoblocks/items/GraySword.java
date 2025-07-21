package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class GraySword extends ItemSword {
   public GraySword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("graysword");
      this.func_111206_d("monoblocks:graysword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
