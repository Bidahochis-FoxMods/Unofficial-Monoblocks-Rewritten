package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class LblueSword extends ItemSword {
   public LblueSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("lbluesword");
      this.setTextureName("monoblocks:lbluesword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
