package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Pizza extends ItemFood {
   public Pizza(int i, int j, boolean b) {
      super(j, b);
      this.func_77637_a(Monoblocks.monoblocksitems);
      this.func_111206_d("monoblocks:pizza");
      this.func_77655_b("Pizza");
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Gold is happy that there is a new Pizza hut in his town.");
   }
}
