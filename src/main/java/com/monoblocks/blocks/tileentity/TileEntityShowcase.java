package com.monoblocks.blocks.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityShowcase extends TileEntity implements IInventory {
   private ItemStack[] showcaseContents = new ItemStack[4];

   public int func_70302_i_() {
      return 4;
   }

   public ItemStack func_70301_a(int par1) {
      return this.showcaseContents[par1];
   }

   public ItemStack func_70298_a(int par1, int par2) {
      if (this.showcaseContents[par1] != null) {
         ItemStack var3;
         if (this.showcaseContents[par1].field_77994_a <= par2) {
            var3 = this.showcaseContents[par1];
            this.showcaseContents[par1] = null;
            this.func_70296_d();
            return var3;
         } else {
            var3 = this.showcaseContents[par1].func_77979_a(par2);
            if (this.showcaseContents[par1].field_77994_a == 0) {
               this.showcaseContents[par1] = null;
            }

            this.func_70296_d();
            return var3;
         }
      } else {
         return null;
      }
   }

   public ItemStack func_70304_b(int par1) {
      if (this.showcaseContents[par1] != null) {
         ItemStack var2 = this.showcaseContents[par1];
         this.showcaseContents[par1] = null;
         return var2;
      } else {
         return null;
      }
   }

   public void func_70299_a(int par1, ItemStack par2ItemStack) {
      this.showcaseContents[par1] = par2ItemStack;
      if (par2ItemStack != null && par2ItemStack.field_77994_a > this.func_70297_j_()) {
         par2ItemStack.field_77994_a = this.func_70297_j_();
      }

      this.func_70296_d();
   }

   public String func_145825_b() {
      return "Showcase";
   }

   public void func_145839_a(NBTTagCompound par1NBTTagCompound) {
      super.func_145839_a(par1NBTTagCompound);
      NBTTagList var2 = (NBTTagList)par1NBTTagCompound.func_74781_a("cabinetItems");
      this.showcaseContents = new ItemStack[this.func_70302_i_()];

      for(int var3 = 0; var3 < var2.func_74745_c(); ++var3) {
         NBTTagCompound var4 = var2.func_150305_b(var3);
         int var5 = var4.func_74771_c("cabinetSlot") & 255;
         if (var5 >= 0 && var5 < this.showcaseContents.length) {
            this.showcaseContents[var5] = ItemStack.func_77949_a(var4);
         }
      }

   }

   public void func_145841_b(NBTTagCompound par1NBTTagCompound) {
      super.func_145841_b(par1NBTTagCompound);
      NBTTagList var2 = new NBTTagList();

      for(int var3 = 0; var3 < this.showcaseContents.length; ++var3) {
         if (this.showcaseContents[var3] != null) {
            NBTTagCompound var4 = new NBTTagCompound();
            var4.func_74774_a("cabinetSlot", (byte)var3);
            this.showcaseContents[var3].func_77955_b(var4);
            var2.func_74742_a(var4);
         }
      }

      par1NBTTagCompound.func_74782_a("cabinetItems", var2);
   }

   public int func_70297_j_() {
      return 64;
   }

   public ItemStack[] getContents() {
      return this.showcaseContents;
   }

   public boolean func_70300_a(EntityPlayer par1EntityPlayer) {
      return this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e) == this;
   }

   public void func_145836_u() {
      super.func_145836_u();
   }

   public void func_145845_h() {
      super.func_145845_h();
   }

   public void func_70295_k_() {
   }

   public void func_70305_f() {
   }

   public void func_145843_s() {
      this.func_145836_u();
      super.func_145843_s();
   }

   public boolean func_94041_b(int par1, ItemStack par2ItemStack) {
      return true;
   }

   public boolean func_145818_k_() {
      return false;
   }
}
