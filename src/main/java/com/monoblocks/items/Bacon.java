package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Bacon extends ItemFood {
   public Bacon(int j, boolean b) {
      super(j, b);
      this.setCreativeTab(Monoblocks.monoblocksitems);
      this.setTextureName("monoblocks:bacon");
      this.setUnlocalizedName("Bacon");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Bacon strips. Bacon strips. Bacon strips.");
   }
}
