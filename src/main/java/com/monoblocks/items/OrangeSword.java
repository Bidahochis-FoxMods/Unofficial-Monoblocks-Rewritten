package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class OrangeSword extends ItemSword {
   public OrangeSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("orangesword");
      this.func_111206_d("monoblocks:orangesword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
