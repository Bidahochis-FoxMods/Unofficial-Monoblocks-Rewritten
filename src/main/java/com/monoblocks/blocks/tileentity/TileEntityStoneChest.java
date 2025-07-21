package com.monoblocks.blocks.tileentity;

import com.monoblocks.blocks.StoneChest;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntityChest;

public class TileEntityStoneChest extends TileEntityChest {
   private String customName;
   private ItemStack[] chestContents = new ItemStack[27];
   private int cachedChestType;
   public TileEntityStoneChest field_145992_i;
   public TileEntityStoneChest field_145990_j;
   public TileEntityStoneChest field_145991_k;
   public TileEntityStoneChest field_145988_l;

   public String func_145825_b() {
      return this.func_145818_k_() ? this.customName : "Stone Chest";
   }

   public boolean func_145818_k_() {
      return this.customName != null && this.customName.length() > 0;
   }

   public int func_70302_i_() {
      return 27;
   }

   public void func_145976_a(String p_145976_1_) {
      this.customName = p_145976_1_;
   }

   public void func_145839_a(NBTTagCompound p_145839_1_) {
      super.func_145839_a(p_145839_1_);
      NBTTagList nbttaglist = p_145839_1_.func_150295_c("Items", 10);
      this.chestContents = new ItemStack[this.func_70302_i_()];
      if (p_145839_1_.func_150297_b("Stone Chest", 8)) {
         this.customName = p_145839_1_.func_74779_i("Stone Chest");
      }

      for(int i = 0; i < nbttaglist.func_74745_c(); ++i) {
         NBTTagCompound nbttagcompound1 = nbttaglist.func_150305_b(i);
         int j = nbttagcompound1.func_74771_c("Slot") & 255;
         if (j >= 0 && j < this.chestContents.length) {
            this.chestContents[j] = ItemStack.func_77949_a(nbttagcompound1);
         }
      }

   }

   public void func_145841_b(NBTTagCompound p_145841_1_) {
      super.func_145841_b(p_145841_1_);
      NBTTagList nbttaglist = new NBTTagList();

      for(int i = 0; i < this.chestContents.length; ++i) {
         if (this.chestContents[i] != null) {
            NBTTagCompound nbttagcompound1 = new NBTTagCompound();
            nbttagcompound1.func_74774_a("Slot", (byte)i);
            this.chestContents[i].func_77955_b(nbttagcompound1);
            nbttaglist.func_74742_a(nbttagcompound1);
         }
      }

      p_145841_1_.func_74782_a("Items", nbttaglist);
      if (this.func_145818_k_()) {
         p_145841_1_.func_74778_a("Stone Chest", this.customName);
      }

   }

   private void func_145978_a(TileEntityStoneChest p_145978_1_, int p_145978_2_) {
      if (p_145978_1_.func_145837_r()) {
         this.field_145984_a = false;
      } else if (this.field_145984_a) {
         switch(p_145978_2_) {
         case 0:
            if (this.field_145988_l != p_145978_1_) {
               this.field_145984_a = false;
            }
            break;
         case 1:
            if (this.field_145991_k != p_145978_1_) {
               this.field_145984_a = false;
            }
            break;
         case 2:
            if (this.field_145992_i != p_145978_1_) {
               this.field_145984_a = false;
            }
            break;
         case 3:
            if (this.field_145990_j != p_145978_1_) {
               this.field_145984_a = false;
            }
         }
      }

   }

   public void func_145979_i() {
      if (!this.field_145984_a) {
         this.field_145984_a = true;
         this.field_145992_i = null;
         this.field_145990_j = null;
         this.field_145991_k = null;
         this.field_145988_l = null;
         if (this.func_145977_a(this.field_145851_c - 1, this.field_145848_d, this.field_145849_e)) {
            this.field_145991_k = (TileEntityStoneChest)this.field_145850_b.func_147438_o(this.field_145851_c - 1, this.field_145848_d, this.field_145849_e);
         }

         if (this.func_145977_a(this.field_145851_c + 1, this.field_145848_d, this.field_145849_e)) {
            this.field_145990_j = (TileEntityStoneChest)this.field_145850_b.func_147438_o(this.field_145851_c + 1, this.field_145848_d, this.field_145849_e);
         }

         if (this.func_145977_a(this.field_145851_c, this.field_145848_d, this.field_145849_e - 1)) {
            this.field_145992_i = (TileEntityStoneChest)this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e - 1);
         }

         if (this.func_145977_a(this.field_145851_c, this.field_145848_d, this.field_145849_e + 1)) {
            this.field_145988_l = (TileEntityStoneChest)this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e + 1);
         }

         if (this.field_145992_i != null) {
            this.field_145992_i.func_145978_a(this, 0);
         }

         if (this.field_145988_l != null) {
            this.field_145988_l.func_145978_a(this, 2);
         }

         if (this.field_145990_j != null) {
            this.field_145990_j.func_145978_a(this, 1);
         }

         if (this.field_145991_k != null) {
            this.field_145991_k.func_145978_a(this, 3);
         }
      }

   }

   private boolean func_145977_a(int p_145977_1_, int p_145977_2_, int p_145977_3_) {
      Block block = this.field_145850_b.func_147439_a(p_145977_1_, p_145977_2_, p_145977_3_);
      return block instanceof StoneChest && ((StoneChest)block).field_149956_a == this.func_145980_j();
   }

   public int func_145980_j() {
      if (this.cachedChestType == -1) {
         if (this.field_145850_b == null || !(this.func_145838_q() instanceof StoneChest)) {
            return 0;
         }

         this.cachedChestType = ((StoneChest)this.func_145838_q()).field_149956_a;
      }

      return this.cachedChestType;
   }

   public ItemStack func_70301_a(int par1) {
      return this.chestContents[par1];
   }

   public ItemStack func_70298_a(int par1, int par2) {
      if (this.chestContents[par1] != null) {
         ItemStack itemstack;
         if (this.chestContents[par1].field_77994_a <= par2) {
            itemstack = this.chestContents[par1];
            this.chestContents[par1] = null;
            this.func_70296_d();
            return itemstack;
         } else {
            itemstack = this.chestContents[par1].func_77979_a(par2);
            if (this.chestContents[par1].field_77994_a == 0) {
               this.chestContents[par1] = null;
            }

            this.func_70296_d();
            return itemstack;
         }
      } else {
         return null;
      }
   }

   public ItemStack func_70304_b(int par1) {
      if (this.chestContents[par1] != null) {
         ItemStack itemstack = this.chestContents[par1];
         this.chestContents[par1] = null;
         return itemstack;
      } else {
         return null;
      }
   }

   public void func_70299_a(int par1, ItemStack itemstack) {
      this.chestContents[par1] = itemstack;
      if (itemstack != null && itemstack.field_77994_a > this.func_70297_j_()) {
         itemstack.field_77994_a = this.func_70297_j_();
      }

      this.func_70296_d();
   }

   public int func_70297_j_() {
      return 64;
   }
}
