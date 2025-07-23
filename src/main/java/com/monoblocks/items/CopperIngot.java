package com.monoblocks.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CopperIngot extends Item {
   public CopperIngot(int i) {
      this.setUnlocalizedName("Copper Ingot");
      this.setTextureName("monoblocks:copperingot");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Because Minecraft really really really needed another copper ingot.");
   }
}
