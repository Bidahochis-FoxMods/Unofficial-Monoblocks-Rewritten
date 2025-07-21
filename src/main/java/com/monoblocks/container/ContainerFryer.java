package com.monoblocks.container;

import com.monoblocks.blocks.tileentity.TileEntityFryer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class ContainerFryer extends Container {
   private TileEntityFryer Fryer;
   public int lastBurnTime;
   public int lastCurrentItemBurnTime;
   public int lastCookTime;

   public ContainerFryer(InventoryPlayer inventory, TileEntityFryer tileentity) {
      this.Fryer = tileentity;
      this.func_75146_a(new Slot(tileentity, 0, 56, 35));
      this.func_75146_a(new Slot(tileentity, 1, 8, 62));
      this.func_75146_a(new SlotFurnace(inventory.field_70458_d, tileentity, 2, 116, 35));

      int i;
      for(i = 0; i < 3; ++i) {
         for(int j = 0; j < 9; ++j) {
            this.func_75146_a(new Slot(inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
         }
      }

      for(i = 0; i < 9; ++i) {
         this.func_75146_a(new Slot(inventory, i, 8 + i * 18, 142));
      }

   }

   public void func_75132_a(ICrafting icrafting) {
      super.func_75132_a(icrafting);
      icrafting.func_71112_a(this, 0, this.Fryer.cookTime);
      icrafting.func_71112_a(this, 1, this.Fryer.burnTime);
      icrafting.func_71112_a(this, 2, this.Fryer.currentItemBurnTime);
   }

   public void func_75142_b() {
      super.func_75142_b();

      for(int i = 0; i < this.field_75149_d.size(); ++i) {
         ICrafting icrafting = (ICrafting)this.field_75149_d.get(i);
         if (this.lastCookTime != this.Fryer.cookTime) {
            icrafting.func_71112_a(this, 0, this.Fryer.cookTime);
         }

         if (this.lastBurnTime != this.Fryer.burnTime) {
            icrafting.func_71112_a(this, 1, this.Fryer.burnTime);
         }

         if (this.lastCurrentItemBurnTime != this.Fryer.currentItemBurnTime) {
            icrafting.func_71112_a(this, 2, this.Fryer.currentItemBurnTime);
         }
      }

      this.lastCookTime = this.Fryer.cookTime;
      this.lastBurnTime = this.Fryer.burnTime;
      this.lastCurrentItemBurnTime = this.Fryer.currentItemBurnTime;
   }

   @SideOnly(Side.CLIENT)
   public void func_75137_b(int par1, int par2) {
      if (par1 == 0) {
         this.Fryer.cookTime = par2;
      }

      if (par1 == 1) {
         this.Fryer.burnTime = par2;
      }

      if (par1 == 2) {
         this.Fryer.currentItemBurnTime = par2;
      }

   }

   public ItemStack func_82846_b(EntityPlayer par1EntityPlayer, int par2) {
      ItemStack itemstack = null;
      Slot slot = (Slot)this.field_75151_b.get(par2);
      if (slot != null && slot.func_75216_d()) {
         ItemStack itemstack1 = slot.func_75211_c();
         itemstack = itemstack1.func_77946_l();
         if (par2 == 2) {
            if (!this.func_75135_a(itemstack1, 3, 39, true)) {
               return null;
            }

            slot.func_75220_a(itemstack1, itemstack);
         } else if (par2 != 1 && par2 != 0) {
            if (FurnaceRecipes.func_77602_a().func_151395_a(itemstack1) != null) {
               if (!this.func_75135_a(itemstack1, 0, 1, false)) {
                  return null;
               }
            } else if (TileEntityFryer.isItemFuel(itemstack1)) {
               if (!this.func_75135_a(itemstack1, 1, 2, false)) {
                  return null;
               }
            } else if (par2 >= 3 && par2 < 30) {
               if (!this.func_75135_a(itemstack1, 30, 39, false)) {
                  return null;
               }
            } else if (par2 >= 30 && par2 < 39 && !this.func_75135_a(itemstack1, 3, 30, false)) {
               return null;
            }
         } else if (!this.func_75135_a(itemstack1, 3, 39, false)) {
            return null;
         }

         if (itemstack1.field_77994_a == 0) {
            slot.func_75215_d((ItemStack)null);
         } else {
            slot.func_75218_e();
         }

         if (itemstack1.field_77994_a == itemstack.field_77994_a) {
            return null;
         }

         slot.func_82870_a(par1EntityPlayer, itemstack1);
      }

      return itemstack;
   }

   public boolean func_75145_c(EntityPlayer var1) {
      return true;
   }
}
