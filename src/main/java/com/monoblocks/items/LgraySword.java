package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class LgraySword extends ItemSword {
   public LgraySword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("lgraysword");
      this.setTextureName("monoblocks:lgraysword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
