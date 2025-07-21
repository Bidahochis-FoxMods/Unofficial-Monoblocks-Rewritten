package com.monoblocks.items;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ZincPickaxe extends ItemPickaxe {
   private double field_150934_a;

   public Multimap func_111205_h() {
      Multimap multimap = HashMultimap.create();
      multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", this.field_150934_a, 0));
      return multimap;
   }

   public ZincPickaxe(int id, ToolMaterial material) {
      super(material);
      this.func_77655_b("Zinc Pickaxe");
      this.func_111206_d("monoblocks:zincpickaxe");
      this.field_150934_a = 1.0D;
   }
}
