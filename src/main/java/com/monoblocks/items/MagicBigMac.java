package com.monoblocks.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MagicBigMac extends Item {
   public MagicBigMac(int i) {
      this.func_111206_d("monoblocks:bigmac");
      this.func_77655_b("Big Mac");
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("I'm lovin' the magic!");
   }

   public boolean func_111207_a(ItemStack itemstack, EntityPlayer player, EntityLivingBase target) {
      if (!target.field_70170_p.field_72995_K && (target instanceof EntityLiving || target instanceof Entity || target instanceof EntityPlayer || target instanceof EntityPlayerMP || target instanceof EntityPlayerSP)) {
         target.field_70181_x = 2.5D;
         target.field_70725_aQ = 1000000000;
      }

      return false;
   }
}
