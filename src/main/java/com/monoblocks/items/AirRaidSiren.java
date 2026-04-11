package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class AirRaidSiren extends Item {
   public AirRaidSiren() {
      this.setUnlocalizedName("Siren");
      this.setTextureName("monoblocks:siren");
      this.setCreativeTab(Monoblocks.monoblocksitems);
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Hand-Cranked Air Raid Siren");
   }

   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
      par2World.playSoundAtEntity(par3EntityPlayer, "monoblocks:siren", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
      return par1ItemStack;
   }
}
