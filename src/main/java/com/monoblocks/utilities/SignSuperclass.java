package com.monoblocks.utilities;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public abstract class SignSuperclass extends TileEntitySignHelper {
   public SignSuperclass(int invSize) {
      super(invSize);
   }

   public void setEquipmentItem(ItemStack stack) {
      this.inventory[0] = stack.copy();
   }

   public boolean hasEquipmentItem() {
      return this.inventory[0] != null;
   }

   public ItemStack getEquipmentItem() {
      return this.inventory[0];
   }


   @Override
   public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
      return null;
   }
   public void setInventorySlotContents(int slot, ItemStack stack) {
      if (slot != 0) {
         super.setInventorySlotContents(slot, stack);
      }
   }

  // public ItemStack getStackInSlot(int slot) {
  //    return slot != 0 ? this.inventory[slot] : null;
  // }

   public boolean isStackInSlot(int slot) {
      return slot != 0 ? this.inventory[slot] != null : false;
   }

   public S35PacketUpdateTileEntity getDescriptionPacket() {
      NBTTagCompound compound = new NBTTagCompound();
      this.writeToNBT(compound);
      S35PacketUpdateTileEntity packet = new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, compound);
      return packet;
   }

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
      this.readFromNBT(pkt.func_148857_g());
   }
}
