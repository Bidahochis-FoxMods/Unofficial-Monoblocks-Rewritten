package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class LimeSword extends ItemSword {
   public LimeSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("limesword");
      this.func_111206_d("monoblocks:limesword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
