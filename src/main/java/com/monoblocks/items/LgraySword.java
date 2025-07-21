package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class LgraySword extends ItemSword {
   public LgraySword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("lgraysword");
      this.func_111206_d("monoblocks:lgraysword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
