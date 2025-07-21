package com.monoblocks.items;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class RedSword extends ItemSword {
   public RedSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("Red Sword");
      this.func_111206_d("monoblocks:redsword");
   }
}
