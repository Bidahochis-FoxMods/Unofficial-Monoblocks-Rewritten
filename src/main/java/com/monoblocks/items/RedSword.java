package com.monoblocks.items;

import net.minecraft.item.ItemSword;

public class RedSword extends ItemSword {
   public RedSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("Red Sword");
      this.setTextureName("monoblocks:redsword");
   }
}
