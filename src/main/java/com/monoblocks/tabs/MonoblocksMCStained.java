package com.monoblocks.tabs;

import com.monoblocks.MBlocksEnum;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MonoblocksMCStained extends CreativeTabs {
   public MonoblocksMCStained(int id, String unlocalizedName) {
      super(id, unlocalizedName);
      this.setBackgroundImageName("purple.png");
   }

   @SideOnly(Side.CLIENT)
   public Item getTabIconItem() {
      return Item.getItemFromBlock(MBlocksEnum.GreenStone.GetBlock());
   }
}
