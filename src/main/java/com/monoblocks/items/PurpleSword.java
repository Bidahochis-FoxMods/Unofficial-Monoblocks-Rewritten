package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class PurpleSword extends ItemSword {
   public PurpleSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("purplesword");
      this.setTextureName("monoblocks:purplesword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
