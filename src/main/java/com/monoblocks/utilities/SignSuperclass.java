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
      this.inventory[0] = stack.func_77946_l();
   }

   public boolean hasEquipmentItem() {
      return this.inventory[0] != null;
   }

   public ItemStack getEquipmentItem() {
      return this.inventory[0];
   }

   public void func_70299_a(int slot, ItemStack stack) {
      if (slot != 0) {
         super.func_70299_a(slot, stack);
      }
   }

   public ItemStack func_70301_a(int slot) {
      return slot != 0 ? this.inventory[slot] : null;
   }

   public boolean isStackInSlot(int slot) {
      return slot != 0 ? this.inventory[slot] != null : false;
   }

   public S35PacketUpdateTileEntity getDescriptionPacket() {
      NBTTagCompound compound = new NBTTagCompound();
      this.func_145841_b(compound);
      S35PacketUpdateTileEntity packet = new S35PacketUpdateTileEntity(this.field_145851_c, this.field_145848_d, this.field_145849_e, 1, compound);
      return packet;
   }

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
      this.func_145839_a(pkt.func_148857_g());
   }
}
