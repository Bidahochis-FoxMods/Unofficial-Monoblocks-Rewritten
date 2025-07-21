package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class BlackSword extends ItemSword {
   public BlackSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("blacksword");
      this.func_111206_d("monoblocks:blacksword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
