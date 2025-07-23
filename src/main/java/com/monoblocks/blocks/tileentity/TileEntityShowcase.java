package com.monoblocks.blocks.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityShowcase extends TileEntity implements IInventory {
   private ItemStack[] showcaseContents = new ItemStack[4];

   public int getSizeInventory() {
      return 4;
   }

   public ItemStack getStackInSlot(int par1) {
      return this.showcaseContents[par1];
   }

   public ItemStack decrStackSize(int par1, int par2) {
      if (this.showcaseContents[par1] != null) {
         ItemStack var3;
         if (this.showcaseContents[par1].stackSize <= par2) {
            var3 = this.showcaseContents[par1];
            this.showcaseContents[par1] = null;
            this.markDirty();
            return var3;
         } else {
            var3 = this.showcaseContents[par1].splitStack(par2);
            if (this.showcaseContents[par1].stackSize == 0) {
               this.showcaseContents[par1] = null;
            }

            this.markDirty();
            return var3;
         }
      } else {
         return null;
      }
   }

   public ItemStack getStackInSlotOnClosing(int par1) {
      if (this.showcaseContents[par1] != null) {
         ItemStack var2 = this.showcaseContents[par1];
         this.showcaseContents[par1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void setInventorySlotContents(int par1, ItemStack par2ItemStack) {
      this.showcaseContents[par1] = par2ItemStack;
      if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit()) {
         par2ItemStack.stackSize = this.getInventoryStackLimit();
      }

      this.markDirty();
   }
   
   public String getInventoryName() {
      return "Showcase";
   }

   public void readFromNBT(NBTTagCompound par1NBTTagCompound) {
      super.readFromNBT(par1NBTTagCompound);
      NBTTagList var2 = (NBTTagList)par1NBTTagCompound.getTag("cabinetItems");
      this.showcaseContents = new ItemStack[this.getSizeInventory()];

      for(int var3 = 0; var3 < var2.tagCount(); ++var3) {
         NBTTagCompound var4 = var2.getCompoundTagAt(var3);
         int var5 = var4.getByte("cabinetSlot") & 255;
         if (var5 >= 0 && var5 < this.showcaseContents.length) {
            this.showcaseContents[var5] = ItemStack.loadItemStackFromNBT(var4);
         }
      }

   }

   public void writeToNBT(NBTTagCompound par1NBTTagCompound) {
      super.writeToNBT(par1NBTTagCompound);
      NBTTagList var2 = new NBTTagList();

      for(int var3 = 0; var3 < this.showcaseContents.length; ++var3) {
         if (this.showcaseContents[var3] != null) {
            NBTTagCompound var4 = new NBTTagCompound();
            var4.setByte("cabinetSlot", (byte)var3);
            this.showcaseContents[var3].writeToNBT(var4);
            var2.appendTag(var4);
         }
      }

      par1NBTTagCompound.setTag("cabinetItems", var2);
   }

   public int getInventoryStackLimit() {
      return 64;
   }

   public ItemStack[] getContents() {
      return this.showcaseContents;
   }

   public boolean isUseableByPlayer(EntityPlayer par1EntityPlayer) {
      return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this;
   }

   public void updateContainingBlockInfo() {
      super.updateContainingBlockInfo();
   }

   public void updateEntity() {
      super.updateEntity();
   }

   public void openInventory() {
   }

   public void closeInventory() {
   }

   public void invalidate() {
      this.updateContainingBlockInfo();
      super.invalidate();
   }

   public boolean isItemValidForSlot(int par1, ItemStack par2ItemStack) {
      return true;
   }

   public boolean hasCustomInventoryName() {
      return false;
   }
}
