package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;

public class PinkSword extends ItemSword {
   public PinkSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("pinksword");
      this.setTextureName("monoblocks:pinksword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
