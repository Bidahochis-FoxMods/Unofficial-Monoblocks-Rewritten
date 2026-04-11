package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;

public class BlackSword extends ItemSword {
   public BlackSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("blacksword");
      this.setTextureName("monoblocks:blacksword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
