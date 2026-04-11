package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;

public class LimeSword extends ItemSword {
   public LimeSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("limesword");
      this.setTextureName("monoblocks:limesword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
