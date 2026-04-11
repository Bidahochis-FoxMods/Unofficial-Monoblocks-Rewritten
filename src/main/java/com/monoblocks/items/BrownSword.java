package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;

public class BrownSword extends ItemSword {
   public BrownSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("brownsword");
      this.setTextureName("monoblocks:brownsword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
