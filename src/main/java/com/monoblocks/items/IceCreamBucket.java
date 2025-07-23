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
      this.setMaxDamage(5);
      this.maxStackSize = 1;
      this.setNoRepair();
      this.setCreativeTab(Monoblocks.monoblocksitems);
      this.setUnlocalizedName("icecreambox");
   }

   public void registerIcons(IIconRegister register) {
      if (this == MItems.VanillaBox) {
         this.itemIcon = register.registerIcon("monoblocks:vanillabox");
      } else if (this == MItems.ChocolateBox) {
         this.itemIcon = register.registerIcon("monoblocks:chocolatebox");
      } else if (this == MItems.StrawberryBox) {
         this.itemIcon = register.registerIcon("monoblocks:strawberrybox");
      }

   }

   @SubscribeEvent
   public ItemStack onFoodEaten(ItemStack itemStack) {
      itemStack.setItemDamage(itemStack.getItemDamage() + 1);
      return itemStack;
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Who would get a brain freeze from eating all of this?");
   }
}
