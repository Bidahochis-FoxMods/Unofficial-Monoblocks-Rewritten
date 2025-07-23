package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class GreenSword extends ItemSword {
   public GreenSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("greensword");
      this.setTextureName("monoblocks:greensword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
