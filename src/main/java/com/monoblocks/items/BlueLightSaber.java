package com.monoblocks.items;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class BlueLightSaber extends ItemSword {
   private double field_150934_a;

   public Multimap func_111205_h() {
      Multimap multimap = HashMultimap.create();
      multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(field_111210_e, "Weapon modifier", this.field_150934_a, 0));
      return multimap;
   }

   public BlueLightSaber(int id, ToolMaterial material) {
      super(material);
      this.func_77655_b("Blue Lightsaber");
      this.func_111206_d("monoblocks:bluelightsaber");
      this.field_150934_a = (double)(6.0F + material.func_78000_c());
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("You'll find that I'm full of surprizes...");
   }
}
