package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BigMac extends ItemFood {
   public BigMac(int i, int j, boolean b) {
      super(j, b);
      this.setCreativeTab(Monoblocks.monoblocksitems);
      this.setTextureName("monoblocks:bigmac");
      this.setUnlocalizedName("Big Mac");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("I'm Lovin' it!");
   }
}
