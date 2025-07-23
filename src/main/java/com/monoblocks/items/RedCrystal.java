package com.monoblocks.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RedCrystal extends Item {
   public RedCrystal(int i) {
      this.setUnlocalizedName("Red Crystal");
      this.setTextureName("monoblocks:redcrystal");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Dude are you evil or something?");
   }
}
