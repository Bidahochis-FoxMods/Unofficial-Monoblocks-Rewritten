package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class IcedCapp extends ItemFood {
   public IcedCapp(int i, int j, boolean b) {
      super(j, b);
      this.setCreativeTab(Monoblocks.monoblocksitems);
      this.setTextureName("monoblocks:icedcapp");
      this.setUnlocalizedName("Iced Capp");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Always fresh.");
   }

   public EnumAction func_77661_b(ItemStack p_77661_1_) {
      return EnumAction.drink;
   }
}
