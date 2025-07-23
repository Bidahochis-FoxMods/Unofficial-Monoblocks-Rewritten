package com.monoblocks.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SiftingSheet extends Item {
   public SiftingSheet(int i) {
      this.setUnlocalizedName("Sifting Sheet");
      this.setTextureName("monoblocks:siftingsheet");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Single use sifter");
   }
}
