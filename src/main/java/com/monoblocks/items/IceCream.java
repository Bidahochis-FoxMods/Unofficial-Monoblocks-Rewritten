package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class IceCream extends ItemFood {
   public IceCream(int j, boolean b) {
      super(j, b);
      this.func_77656_e(5);
      this.field_77777_bU = 1;
      this.setNoRepair();
      this.func_77637_a(Monoblocks.monoblocksitems);
      this.func_111206_d("monoblocks:icecream");
      this.func_77655_b("icecream");
   }

   public ItemStack onEaten(ItemStack itemStack) {
      itemStack.func_77964_b(itemStack.func_77960_j() + 1);
      return itemStack;
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("I wonder if you can hold these upside down...");
   }
}
