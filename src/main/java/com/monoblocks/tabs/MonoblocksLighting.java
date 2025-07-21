package com.monoblocks.tabs;

import com.monoblocks.MBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MonoblocksLighting extends CreativeTabs {
   public MonoblocksLighting(int id, String unlocalizedName) {
      super(id, unlocalizedName);
      this.setBackgroundImageName("cyan.png");
   }

   @SideOnly(Side.CLIENT)
   public Item getTabIconItem() {
      return Item.getItemFromBlock(MBlocks.BlueLamp);
   }
}
