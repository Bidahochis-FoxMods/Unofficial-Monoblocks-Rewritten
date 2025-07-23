package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class GraySword extends ItemSword {
   public GraySword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("graysword");
      this.setTextureName("monoblocks:graysword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
