package com.monoblocks.tabs;

import com.monoblocks.MBlocksEnum;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MonoblocksTab extends CreativeTabs {
   public MonoblocksTab(int id, String unlocalizedName) {
      super(id, unlocalizedName);
      this.setBackgroundImageName("blue.png");
   }

   @SideOnly(Side.CLIENT)
   public Item getTabIconItem() {
      return Item.getItemFromBlock(MBlocksEnum.RedBlock.GetBlock());
   }
}
