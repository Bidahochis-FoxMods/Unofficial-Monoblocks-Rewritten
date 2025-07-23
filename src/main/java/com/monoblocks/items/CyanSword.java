package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class CyanSword extends ItemSword {
   public CyanSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("cyansword");
      this.setTextureName("monoblocks:cyansword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
