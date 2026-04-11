package com.monoblocks.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class AluminumIngot extends Item {
   public AluminumIngot(int i) {
      this.setUnlocalizedName("Aluminum Ingot");
      this.setTextureName("monoblocks:aluminumingot");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Because Minecraft should have more aluminum ingots.");
   }
}
