package com.monoblocks.items;

import com.monoblocks.MItems;
import com.monoblocks.entities.BlasterEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class PinkGun extends Item {
   public PinkGun() {
      this.setUnlocalizedName("pinkgun");
      this.setTextureName("monoblocks:pinkgun");
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Making the dollar store proud, one knock off piece of merchandise at a time.");
   }

   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
      if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.consumeInventoryItem(MItems.Bullet)) {
         par2World.playSoundAtEntity(par3EntityPlayer, "monoblocks:blaster", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
         if (!par2World.isRemote) {
            par2World.spawnEntityInWorld(new BlasterEntity(par2World, par3EntityPlayer));
         }
      }

      return par1ItemStack;
   }

   @SideOnly(Side.CLIENT)
   public boolean func_77662_d() {
      return false;
   }
}
