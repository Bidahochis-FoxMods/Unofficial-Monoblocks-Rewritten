package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class GreenSword extends ItemSword {
   public GreenSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("greensword");
      this.func_111206_d("monoblocks:greensword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
