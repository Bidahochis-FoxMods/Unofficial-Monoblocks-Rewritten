package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class YellowSword extends ItemSword {
   public YellowSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("yellowsword");
      this.setTextureName("monoblocks:yellowsword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
