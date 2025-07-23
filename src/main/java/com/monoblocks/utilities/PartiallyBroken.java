package com.monoblocks.utilities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class PartiallyBroken extends ItemBlock {
   public PartiallyBroken(Block p_i45328_1_) {
      super(p_i45328_1_);
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add(EnumChatFormatting.YELLOW + "I somewhat work!");
   }
}
