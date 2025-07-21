package com.monoblocks.items;

import com.monoblocks.MItems;
import com.monoblocks.entities.BlasterEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PinkGun extends Item {
   public PinkGun() {
      this.func_77655_b("pinkgun");
      this.func_111206_d("monoblocks:pinkgun");
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Making the dollar store proud, one knock off piece of merchandise at a time.");
   }

   public ItemStack func_77659_a(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
      if (par3EntityPlayer.field_71075_bZ.field_75098_d || par3EntityPlayer.field_71071_by.func_146026_a(MItems.Bullet)) {
         par2World.func_72956_a(par3EntityPlayer, "monoblocks:blaster", 0.5F, 0.4F / (field_77697_d.nextFloat() * 0.4F + 0.8F));
         if (!par2World.field_72995_K) {
            par2World.func_72838_d(new BlasterEntity(par2World, par3EntityPlayer));
         }
      }

      return par1ItemStack;
   }

   @SideOnly(Side.CLIENT)
   public boolean func_77662_d() {
      return false;
   }
}
