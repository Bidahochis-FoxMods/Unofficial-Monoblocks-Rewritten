package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class OrangeSword extends ItemSword {
   public OrangeSword(int id, ToolMaterial mat) {
      super(mat);
      this.setUnlocalizedName("orangesword");
      this.setTextureName("monoblocks:orangesword");
      this.setCreativeTab(Monoblocks.monoblocksweapons);
   }
}
