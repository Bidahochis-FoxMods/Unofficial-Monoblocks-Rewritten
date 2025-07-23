package com.monoblocks.utilities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class TileEntitySignHelper extends TileEntity implements IInventory {
   protected ItemStack[] inventory;
   protected String invName;
   protected int stackSizeLimit;

   public TileEntitySignHelper(int invSize) {
      this(invSize, 64);
   }

   public TileEntitySignHelper(int invSize, int maxStackSize) {
      this.inventory = new ItemStack[invSize];
      this.stackSizeLimit = maxStackSize;
   }

   public ItemStack getStackInSlot(int slot) {
      return slot < this.inventory.length ? this.inventory[slot] : null;
   }

   public boolean isStackInSlot(int slot) {
      return slot < this.inventory.length && this.inventory[slot] != null;
   }

   public int getSizeInventory() {
      return this.inventory.length;
   }

   public int getInventoryStackLimit() {
      return this.stackSizeLimit;
   }

   public boolean canDropInventorySlot(int slot) {
      return true;
   }

   public void setInventorySlotContents(int slot, ItemStack itemstack) {
      this.inventory[slot] = itemstack;
      if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
         itemstack.stackSize = this.getInventoryStackLimit();
      }

   }

   public ItemStack decrStackSize(int slot, int quantity) {
      if (this.inventory[slot] != null) {
         ItemStack split;
         if (this.inventory[slot].stackSize <= quantity) {
            split = this.inventory[slot];
            this.inventory[slot] = null;
            return split;
         } else {
            split = this.inventory[slot].splitStack(quantity);
            if (this.inventory[slot].stackSize == 0) {
               this.inventory[slot] = null;
            }

            return split;
         }
      } else {
         return null;
      }
   }

   public boolean isUseableByPlayer(EntityPlayer entityplayer) {
      if (this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this) {
         return false;
      } else {
         return entityplayer.getDistance((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
      }
   }

   public abstract Container getGuiContainer(InventoryPlayer var1, World var2, int var3, int var4, int var5);

   public void readFromNBT(NBTTagCompound tags) {
      super.readFromNBT(tags);
      this.readInventoryFromNBT(tags);
   }

   public void readInventoryFromNBT(NBTTagCompound tags) {
      super.readFromNBT(tags);
      NBTTagList nbttaglist = tags.getTagList("Items", 10);
      this.inventory = new ItemStack[this.getSizeInventory()];
      if (tags.hasKey("CustomName", 8)) {
         this.invName = tags.getString("CustomName");
      }

      for(int i = 0; i < nbttaglist.tagCount(); ++i) {
         NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
         int j = nbttagcompound1.getByte("Slot") & 255;
         if (j >= 0 && j < this.inventory.length) {
            this.inventory[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
         }
      }

   }

   public void writeToNBT(NBTTagCompound tags) {
      super.writeToNBT(tags);
      this.writeInventoryToNBT(tags);
   }

   public void writeInventoryToNBT(NBTTagCompound tags) {
      super.writeToNBT(tags);
      NBTTagList nbttaglist = new NBTTagList();

      for(int i = 0; i < this.inventory.length; ++i) {
         if (this.inventory[i] != null) {
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            nbttagcompound1.setByte("Slot", (byte)i);
            this.inventory[i].writeToNBT(nbttagcompound1);
            nbttaglist.appendTag(nbttagcompound1);
         }
      }

      tags.setTag("Items", nbttaglist);
      if (this.isInvNameLocalized()) {
         tags.setString("CustomName", this.invName);
      }

   }

   public ItemStack getStackInSlotOnClosing(int slot) {
      return null;
   }

   public void openInventory() {
   }

   public void closeInventory() {
   }

   protected abstract String getDefaultName();

   public void setInvName(String name) {
      this.invName = name;
   }

   public String getInventoryName() {
      return this.isInvNameLocalized() ? this.invName : this.getDefaultName();
   }

   public boolean hasCustomInventoryName() {
      return this.isInvNameLocalized();
   }

   public boolean isInvNameLocalized() {
      return this.invName != null && this.invName.length() > 0;
   }

   public boolean isItemValidForSlot(int slot, ItemStack itemstack) {
      return slot < this.getSizeInventory() && (this.inventory[slot] == null || itemstack.stackSize + this.inventory[slot].stackSize <= this.getInventoryStackLimit());
   }

   public void placeBlock(EntityLivingBase entity, ItemStack stack) {
   }

   public void removeBlock() {
   }
}
