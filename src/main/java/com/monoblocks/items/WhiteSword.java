package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;

public class WhiteSword extends ItemSword {
   public WhiteSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("whitesword");
      this.setTextureName("monoblocks:whitesword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
