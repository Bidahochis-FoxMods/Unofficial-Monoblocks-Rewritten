package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;

public class OrangeSword extends ItemSword {
   public OrangeSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("orangesword");
      this.setTextureName("monoblocks:orangesword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
