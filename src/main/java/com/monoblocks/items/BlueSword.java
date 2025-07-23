package com.monoblocks.items;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class BlueSword extends ItemSword {
   public BlueSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("Blue Sword");
      this.setTextureName("monoblocks:bluesword");
   }
}
