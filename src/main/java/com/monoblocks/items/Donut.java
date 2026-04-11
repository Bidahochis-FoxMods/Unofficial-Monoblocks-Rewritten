package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Donut extends ItemFood {
   public Donut(int j, boolean b) {
      super(j, b);
      this.setCreativeTab(Monoblocks.monoblocksitems);
      this.setTextureName("monoblocks:donut");
      this.setUnlocalizedName("Donut");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Always fresh.");
   }
}
