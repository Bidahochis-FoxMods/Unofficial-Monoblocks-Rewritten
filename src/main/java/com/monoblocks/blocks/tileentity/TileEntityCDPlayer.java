package com.monoblocks.blocks.tileentity;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCDPlayer extends TileEntity {
   public final ItemStack getItem;
   private ItemStack disc;

   public TileEntityCDPlayer() {
      this.getItem = this.disc;
   }

   public void readFromNBT(NBTTagCompound p_145839_1_) {
      super.readFromNBT(p_145839_1_);
      if (p_145839_1_.hasKey("RecordItem", 10)) {
         this.setRecord(ItemStack.loadItemStackFromNBT(p_145839_1_.getCompoundTag("RecordItem")));
      } else if (p_145839_1_.getInteger("Record") > 0) {
         this.setRecord(new ItemStack(Item.getItemById(p_145839_1_.getInteger("Record")), 1, 0));
      }

   }

   public void writeToNBT(NBTTagCompound p_145841_1_) {
      super.writeToNBT(p_145841_1_);
      if (this.getRecord() != null) {
         p_145841_1_.setTag("RecordItem", this.getRecord().writeToNBT(new NBTTagCompound()));
         p_145841_1_.setInteger("Record", Item.getIdFromItem(this.getRecord().getItem()));
      }

   }

   public ItemStack getRecord() {
      return this.disc;
   }

   public void setRecord(ItemStack p_145857_1_) {
      this.disc = p_145857_1_;
      this.markDirty();
   }

   public ItemStack getItem() {
      return this.disc;
   }
}
