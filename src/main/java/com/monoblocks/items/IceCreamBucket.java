package com.monoblocks.items;

import com.monoblocks.MItems;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class IceCreamBucket extends ItemFood {
   public IceCreamBucket() {
      super(6, true);
      this.func_77656_e(5);
      this.field_77777_bU = 1;
      this.setNoRepair();
      this.func_77637_a(Monoblocks.monoblocksitems);
      this.func_77655_b("icecreambox");
   }

   public void func_94581_a(IIconRegister register) {
      if (this == MItems.VanillaBox) {
         this.field_77791_bV = register.registerIcon("monoblocks:vanillabox");
      } else if (this == MItems.ChocolateBox) {
         this.field_77791_bV = register.registerIcon("monoblocks:chocolatebox");
      } else if (this == MItems.StrawberryBox) {
         this.field_77791_bV = register.registerIcon("monoblocks:strawberrybox");
      }

   }

   @SubscribeEvent
   public ItemStack onFoodEaten(ItemStack itemStack) {
      itemStack.func_77964_b(itemStack.func_77960_j() + 1);
      return itemStack;
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Who would get a brain freeze from eating all of this?");
   }
}
