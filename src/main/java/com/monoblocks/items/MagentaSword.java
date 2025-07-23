package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class MagentaSword extends ItemSword {
   public MagentaSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("magentasword");
      this.setTextureName("monoblocks:magentasword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
