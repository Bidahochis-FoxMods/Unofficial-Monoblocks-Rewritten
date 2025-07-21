package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class CyanSword extends ItemSword {
   public CyanSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("cyansword");
      this.func_111206_d("monoblocks:cyansword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
