package com.monoblocks.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ZincIngot extends Item {
   public ZincIngot(int i) {
      this.setUnlocalizedName("Zinc Ingot");
      this.setTextureName("monoblocks:zincingot");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Because Minecraft should have more zinc ingots.");
   }
}
