package com.monoblocks.items;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class SilverShovel extends ItemSpade {
   private double field_150934_a;

   public Multimap func_111205_h() {
      Multimap multimap = HashMultimap.create();
      multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", this.field_150934_a, 0));
      return multimap;
   }

   public SilverShovel(int id, ToolMaterial material) {
      super(material);
      this.setUnlocalizedName("Silver Shovel");
      this.setTextureName("monoblocks:silvershovel");
      this.field_150934_a = 3.0D;
   }
}
