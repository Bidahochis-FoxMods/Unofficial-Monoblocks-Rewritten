package com.monoblocks.tabs;

import com.monoblocks.MItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MonoblocksWeapons extends CreativeTabs {
   public MonoblocksWeapons(int id, String unlocalizedName) {
      super(id, unlocalizedName);
      this.setBackgroundImageName("green.png");
   }

   @SideOnly(Side.CLIENT)
   public Item getTabIconItem() {
      return MItems.Blaster;
   }
}
