package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class IceCream extends ItemFood {
   public IceCream(int j, boolean b) {
      super(j, b);
      this.setMaxDamage(5);
      this.maxStackSize = 1;
      this.setNoRepair();
      this.setCreativeTab(Monoblocks.monoblocksitems);
      this.setTextureName("monoblocks:icecream");
      this.setUnlocalizedName("icecream");
   }

   public ItemStack onEaten(ItemStack itemStack) {
      itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      return itemStack;
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("I wonder if you can hold these upside down...");
   }
}
