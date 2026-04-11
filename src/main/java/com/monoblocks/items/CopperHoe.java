package com.monoblocks.items;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemHoe;

public class CopperHoe extends ItemHoe {
   private double field_150934_a;

   public Multimap func_111205_h() {
      Multimap multimap = HashMultimap.create();
      multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", this.field_150934_a, 0));
      return multimap;
   }

   public CopperHoe(int id, ToolMaterial material) {
      super(material);
      this.setUnlocalizedName("Copper Hoe");
      this.setTextureName("monoblocks:copperhoe");
      this.field_150934_a = 4.0D;
   }
}
