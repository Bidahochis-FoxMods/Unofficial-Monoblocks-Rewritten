package com.monoblocks.tabs;

import com.monoblocks.MItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MonoblocksDoors extends CreativeTabs {
   public MonoblocksDoors(int id, String unlocalizedName) {
      super(id, unlocalizedName);
      this.setBackgroundImageName("lime.png");
   }

   @SideOnly(Side.CLIENT)
   public Item getTabIconItem() {
      return MItems.GlassDoorItem;
   }
}
