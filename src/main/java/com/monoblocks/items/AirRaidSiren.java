package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AirRaidSiren extends Item {
   public AirRaidSiren() {
      this.func_77655_b("Siren");
      this.func_111206_d("monoblocks:siren");
      this.func_77637_a(Monoblocks.monoblocksitems);
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Hand-Cranked Air Raid Siren");
   }

   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
      par2World.func_72956_a(par3EntityPlayer, "monoblocks:siren", 0.5F, 0.4F / (field_77697_d.nextFloat() * 0.4F + 0.8F));
      return par1ItemStack;
   }
}
