package com.monoblocks.items;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class BlueSword extends ItemSword {
   public BlueSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("Blue Sword");
      this.func_111206_d("monoblocks:bluesword");
   }
}
