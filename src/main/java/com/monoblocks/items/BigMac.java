package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class BigMac extends ItemFood {
   public BigMac(int i, int j, boolean b) {
      super(j, b);
      this.func_77637_a(Monoblocks.monoblocksitems);
      this.func_111206_d("monoblocks:bigmac");
      this.func_77655_b("Big Mac");
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("I'm Lovin' it!");
   }
}
