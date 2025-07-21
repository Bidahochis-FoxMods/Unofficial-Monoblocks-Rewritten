package com.monoblocks.items;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class CopperHoe extends ItemHoe {
   private double field_150934_a;

   public Multimap func_111205_h() {
      Multimap multimap = HashMultimap.create();
      multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", this.field_150934_a, 0));
      return multimap;
   }

   public CopperHoe(int id, ToolMaterial material) {
      super(material);
      this.func_77655_b("Copper Hoe");
      this.func_111206_d("monoblocks:copperhoe");
      this.field_150934_a = 4.0D;
   }
}
