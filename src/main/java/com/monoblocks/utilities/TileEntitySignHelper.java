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

   public ItemStack func_70301_a(int slot) {
      return slot < this.inventory.length ? this.inventory[slot] : null;
   }

   public boolean isStackInSlot(int slot) {
      return slot < this.inventory.length && this.inventory[slot] != null;
   }

   public int func_70302_i_() {
      return this.inventory.length;
   }

   public int func_70297_j_() {
      return this.stackSizeLimit;
   }

   public boolean canDropInventorySlot(int slot) {
      return true;
   }

   public void func_70299_a(int slot, ItemStack itemstack) {
      this.inventory[slot] = itemstack;
      if (itemstack != null && itemstack.field_77994_a > this.func_70297_j_()) {
         itemstack.field_77994_a = this.func_70297_j_();
      }

   }

   public ItemStack func_70298_a(int slot, int quantity) {
      if (this.inventory[slot] != null) {
         ItemStack split;
         if (this.inventory[slot].field_77994_a <= quantity) {
            split = this.inventory[slot];
            this.inventory[slot] = null;
            return split;
         } else {
            split = this.inventory[slot].func_77979_a(quantity);
            if (this.inventory[slot].field_77994_a == 0) {
               this.inventory[slot] = null;
            }

            return split;
         }
      } else {
         return null;
      }
   }

   public boolean func_70300_a(EntityPlayer entityplayer) {
      if (this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e) != this) {
         return false;
      } else {
         return entityplayer.func_70011_f((double)this.field_145851_c + 0.5D, (double)this.field_145848_d + 0.5D, (double)this.field_145849_e + 0.5D) <= 64.0D;
      }
   }

   public abstract Container getGuiContainer(InventoryPlayer var1, World var2, int var3, int var4, int var5);

   public void func_145839_a(NBTTagCompound tags) {
      super.func_145839_a(tags);
      this.readInventoryFromNBT(tags);
   }

   public void readInventoryFromNBT(NBTTagCompound tags) {
      super.func_145839_a(tags);
      NBTTagList nbttaglist = tags.func_150295_c("Items", 10);
      this.inventory = new ItemStack[this.func_70302_i_()];
      if (tags.func_150297_b("CustomName", 8)) {
         this.invName = tags.func_74779_i("CustomName");
      }

      for(int i = 0; i < nbttaglist.func_74745_c(); ++i) {
         NBTTagCompound nbttagcompound1 = nbttaglist.func_150305_b(i);
         int j = nbttagcompound1.func_74771_c("Slot") & 255;
         if (j >= 0 && j < this.inventory.length) {
            this.inventory[j] = ItemStack.func_77949_a(nbttagcompound1);
         }
      }

   }

   public void func_145841_b(NBTTagCompound tags) {
      super.func_145841_b(tags);
      this.writeInventoryToNBT(tags);
   }

   public void writeInventoryToNBT(NBTTagCompound tags) {
      super.func_145841_b(tags);
      NBTTagList nbttaglist = new NBTTagList();

      for(int i = 0; i < this.inventory.length; ++i) {
         if (this.inventory[i] != null) {
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            nbttagcompound1.func_74774_a("Slot", (byte)i);
            this.inventory[i].func_77955_b(nbttagcompound1);
            nbttaglist.func_74742_a(nbttagcompound1);
         }
      }

      tags.func_74782_a("Items", nbttaglist);
      if (this.isInvNameLocalized()) {
         tags.func_74778_a("CustomName", this.invName);
      }

   }

   public ItemStack func_70304_b(int slot) {
      return null;
   }

   public void openChest() {
   }

   public void closeChest() {
   }

   protected abstract String getDefaultName();

   public void setInvName(String name) {
      this.invName = name;
   }

   public String getInvName() {
      return this.isInvNameLocalized() ? this.invName : this.getDefaultName();
   }

   public boolean func_145818_k_() {
      return this.isInvNameLocalized();
   }

   public boolean isInvNameLocalized() {
      return this.invName != null && this.invName.length() > 0;
   }

   public boolean func_94041_b(int slot, ItemStack itemstack) {
      return slot < this.func_70302_i_() && (this.inventory[slot] == null || itemstack.field_77994_a + this.inventory[slot].field_77994_a <= this.func_70297_j_());
   }

   public void placeBlock(EntityLivingBase entity, ItemStack stack) {
   }

   public void removeBlock() {
   }
}
