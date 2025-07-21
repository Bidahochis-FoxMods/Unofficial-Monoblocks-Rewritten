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
      this.func_75146_a(this.genericSlot = new ShowcaseSlot(this, this.tileEntity, 2, 64, 22));
      this.func_75146_a(this.genericSlot = new ShowcaseSlot(this, this.tileEntity, 3, 96, 22));
      this.func_75146_a(this.genericSlot = new ShowcaseSlot(this, this.tileEntity, 0, 64, 51));
      this.func_75146_a(this.genericSlot = new ShowcaseSlot(this, this.tileEntity, 1, 96, 51));
      this.bindPlayerInventory(inventoryPlayer);
   }

   public boolean func_75145_c(EntityPlayer player) {
      return this.tileEntity.func_70300_a(player);
   }

   protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
      int i;
      for(i = 0; i < 3; ++i) {
         for(int j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
         }
      }

      for(i = 0; i < 9; ++i) {
         this.func_75146_a(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
      }

   }

   public ItemStack func_82846_b(EntityPlayer player, int slot) {
      ItemStack stack = null;
      Slot slotObject = (Slot)this.field_75151_b.get(slot);
      if (slotObject != null && slotObject.func_75216_d()) {
         ItemStack stackInSlot = slotObject.func_75211_c();
         stack = stackInSlot.func_77946_l();
         Item potionTest = stack.func_77973_b();
         if (slot < 4) {
            if (!this.func_75135_a(stackInSlot, 4, 40, true)) {
               return null;
            }
         } else if (!this.func_75135_a(stackInSlot, 0, 4, false)) {
            return null;
         }

         if (stackInSlot.field_77994_a == 0) {
            slotObject.func_75215_d((ItemStack)null);
         } else {
            slotObject.func_75218_e();
         }

         if (stackInSlot.field_77994_a == stack.field_77994_a) {
            return null;
         }

         slotObject.func_82870_a(player, stackInSlot);
      }

      return stack;
   }
}
