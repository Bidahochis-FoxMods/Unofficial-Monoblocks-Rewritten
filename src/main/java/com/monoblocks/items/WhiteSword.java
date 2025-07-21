package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class WhiteSword extends ItemSword {
   public WhiteSword(int id, ToolMaterial mat) {
      super(mat);
      this.func_77655_b("whitesword");
      this.func_111206_d("monoblocks:whitesword");
      this.func_77637_a(Monoblocks.monoblocksweapons);
   }
}
