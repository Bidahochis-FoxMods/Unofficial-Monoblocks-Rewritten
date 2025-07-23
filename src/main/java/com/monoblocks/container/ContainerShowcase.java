package com.monoblocks.container;

import com.monoblocks.blocks.tileentity.TileEntityShowcase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ContainerShowcase extends Container {
   protected TileEntityShowcase tileEntity;
   protected ShowcaseSlot genericSlot;

   public ContainerShowcase(InventoryPlayer inventoryPlayer, TileEntityShowcase tile) {
      this.tileEntity = tile;
      this.addSlotToContainer(this.genericSlot = new ShowcaseSlot(this, this.tileEntity, 2, 64, 22));
      this.addSlotToContainer(this.genericSlot = new ShowcaseSlot(this, this.tileEntity, 3, 96, 22));
      this.addSlotToContainer(this.genericSlot = new ShowcaseSlot(this, this.tileEntity, 0, 64, 51));
      this.addSlotToContainer(this.genericSlot = new ShowcaseSlot(this, this.tileEntity, 1, 96, 51));
      this.bindPlayerInventory(inventoryPlayer);
   }

   public boolean canInteractWith(EntityPlayer player) {
      return this.tileEntity.isUseableByPlayer(player);
   }

   protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
      int i;
      for(i = 0; i < 3; ++i) {
         for(int j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
         }
      }

      for(i = 0; i < 9; ++i) {
         this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
      }

   }

   public ItemStack transferStackInSlot(EntityPlayer player, int slot) {
      ItemStack stack = null;
      Slot slotObject = (Slot)this.inventorySlots.get(slot);
      if (slotObject != null && slotObject.getHasStack()) {
         ItemStack stackInSlot = slotObject.getStack();
         stack = stackInSlot.copy();
         Item potionTest = stack.getItem();
         if (slot < 4) {
            if (!this.mergeItemStack(stackInSlot, 4, 40, true)) {
               return null;
            }
         } else if (!this.mergeItemStack(stackInSlot, 0, 4, false)) {
            return null;
         }

         if (stackInSlot.stackSize == 0) {
            slotObject.putStack((ItemStack)null);
         } else {
            slotObject.onSlotChanged();
         }

         if (stackInSlot.stackSize == stack.stackSize) {
            return null;
         }

         slotObject.onPickupFromSlot(player, stackInSlot);
      }

      return stack;
   }
}
