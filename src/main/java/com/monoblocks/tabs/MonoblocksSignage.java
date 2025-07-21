package com.monoblocks.tabs;

import com.monoblocks.SignReg;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MonoblocksSignage extends CreativeTabs {
   public MonoblocksSignage(int id, String unlocalizedName) {
      super(id, unlocalizedName);
      this.setBackgroundImageName("yellow.png");
   }

   @SideOnly(Side.CLIENT)
   public Item getTabIconItem() {
      return Item.getItemFromBlock(SignReg.StopSign);
   }
}
