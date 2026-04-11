package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Fries extends ItemFood {
   public Fries(int i, int j, boolean b) {
      super(j, b);
      this.setCreativeTab(Monoblocks.monoblocksitems);
      this.setTextureName("monoblocks:fries");
      this.setUnlocalizedName("Fries");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("I'm still lovin' it!");
   }
}
