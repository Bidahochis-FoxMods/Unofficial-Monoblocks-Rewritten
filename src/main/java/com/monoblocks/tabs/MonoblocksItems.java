package com.monoblocks.tabs;

import com.monoblocks.MItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MonoblocksItems extends CreativeTabs {
   public MonoblocksItems(int id, String unlocalizedName) {
      super(id, unlocalizedName);
      this.setBackgroundImageName("red.png");
   }

   @SideOnly(Side.CLIENT)
   public Item getTabIconItem() {
      return MItems.IcedCapp;
   }
}
