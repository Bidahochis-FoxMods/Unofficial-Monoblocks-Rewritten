package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class PurpleSword extends ItemSword {
   public PurpleSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("purplesword");
      this.func_111206_d("monoblocks:purplesword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
