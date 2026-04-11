package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;

public class PurpleSword extends ItemSword {
   public PurpleSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("purplesword");
      this.setTextureName("monoblocks:purplesword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
