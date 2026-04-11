package com.monoblocks.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class PurpleCrystal extends Item {
   public PurpleCrystal(int i) {
      this.setUnlocalizedName("Purple Crystal");
      this.setTextureName("monoblocks:purplecrystal");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Yes, with this new found energy source, I shall construct an army of chickens");
   }
}
