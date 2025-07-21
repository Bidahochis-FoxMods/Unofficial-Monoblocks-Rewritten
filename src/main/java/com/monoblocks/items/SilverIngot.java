package com.monoblocks.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SilverIngot extends Item {
   public SilverIngot(int i) {
      this.func_77655_b("Silver Ingot");
      this.func_111206_d("monoblocks:silveringot");
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Because Minecraft needed another silver ingot.");
   }
}
