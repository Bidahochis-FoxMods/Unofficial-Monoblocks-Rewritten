package com.monoblocks.blocks.tileentity;

import com.monoblocks.blocks.Fryer;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityFryer extends TileEntity implements ISidedInventory {
   private String localizedName;
   private static final int[] slots_top = new int[]{0};
   private static final int[] slots_bottom = new int[]{2, 1};
   private static final int[] slots_side = new int[]{1};
   private ItemStack[] slots = new ItemStack[3];
   public int furnaceSpeed = 150;
   public int burnTime;
   public int currentItemBurnTime;
   public int cookTime;
   public int direction;

   public void setGuiDisplayName(String displayName) {
      this.localizedName = displayName;
   }

   public String func_145825_b() {
      return this.func_145818_k_() ? this.localizedName : "Fryer";
   }

   public boolean func_145818_k_() {
      return this.localizedName != null && this.localizedName.length() > 0;
   }

   public int func_70302_i_() {
      return this.slots.length;
   }

   public ItemStack func_70301_a(int var1) {
      return this.slots[var1];
   }

   public ItemStack func_70298_a(int var1, int var2) {
      if (this.slots[var1] != null) {
         ItemStack itemstack;
         if (this.slots[var1].field_77994_a <= var2) {
            itemstack = this.slots[var1];
            this.slots[var1] = null;
            return itemstack;
         } else {
            itemstack = this.slots[var1].func_77979_a(var2);
            if (this.slots[var1].field_77994_a == 0) {
               this.slots[var1] = null;
            }

            return itemstack;
         }
      } else {
         return null;
      }
   }

   public ItemStack func_70304_b(int i) {
      if (this.slots[i] != null) {
         ItemStack itemstack = this.slots[i];
         this.slots[i] = null;
         return itemstack;
      } else {
         return null;
      }
   }

   public void func_70299_a(int i, ItemStack itemstack) {
      this.slots[i] = itemstack;
      if (itemstack != null && itemstack.field_77994_a > this.func_70297_j_()) {
         itemstack.field_77994_a = this.func_70297_j_();
      }

   }

   public int func_70297_j_() {
      return 64;
   }

   public boolean func_70300_a(EntityPlayer entityplayer) {
      return this.field_145850_b.func_147438_o(this.field_145851_c, this.field_145848_d, this.field_145849_e) != this ? false : entityplayer.func_70092_e((double)this.field_145851_c + 0.5D, (double)this.field_145848_d + 0.5D, (double)this.field_145849_e + 0.5D) <= 64.0D;
   }

   public void func_70295_k_() {
   }

   public void func_70305_f() {
   }

   public boolean func_94041_b(int i, ItemStack itemstack) {
      return i == 2 ? false : (i == 1 ? isItemFuel(itemstack) : true);
   }

   public static boolean isItemFuel(ItemStack itemstack) {
      return getItemBurnTime(itemstack) > 0;
   }

   private static int getItemBurnTime(ItemStack itemstack) {
      if (itemstack == null) {
         return 0;
      } else {
         Item item = itemstack.func_77973_b();
         if (item instanceof ItemBlock && Block.func_149634_a(item) != Blocks.field_150350_a) {
            Block block = Block.func_149634_a(item);
            if (block == Blocks.field_150345_g) {
               return 100;
            }

            if (block == Blocks.field_150402_ci) {
               return 14400;
            }
         }

         if (item == Items.field_151044_h) {
            return 1600;
         } else if (item == Items.field_151055_y) {
            return 100;
         } else if (item == Items.field_151129_at) {
            return 20000;
         } else {
            return item == Items.field_151072_bj ? 2400 : GameRegistry.getFuelValue(itemstack);
         }
      }
   }

   public boolean isBurning() {
      return this.burnTime > 0;
   }

   public void func_145845_h() {
      boolean flag = this.burnTime > 0;
      boolean flag1 = false;
      if (this.isBurning()) {
         --this.burnTime;
      }

      if (!this.field_145850_b.field_72995_K) {
         if (this.burnTime == 0 && this.canSmelt()) {
            this.currentItemBurnTime = this.burnTime = getItemBurnTime(this.slots[1]);
            if (this.isBurning()) {
               flag1 = true;
               if (this.slots[1] != null) {
                  --this.slots[1].field_77994_a;
                  if (this.slots[1].field_77994_a == 0) {
                     this.slots[1] = this.slots[1].func_77973_b().getContainerItem(this.slots[1]);
                  }
               }
            }
         }

         if (this.isBurning() && this.canSmelt()) {
            ++this.cookTime;
            if (this.cookTime == this.furnaceSpeed) {
               this.cookTime = 0;
               this.smeltItem();
               flag1 = true;
            }
         } else {
            this.cookTime = 0;
         }

         if (flag != this.isBurning()) {
            flag1 = true;
            Fryer.updateFryerBlockState(this.burnTime > 0, this.field_145850_b, this.field_145851_c, this.field_145848_d, this.field_145849_e);
         }
      }

      if (flag1) {
         this.func_70296_d();
      }

   }

   public boolean canSmelt() {
      if (this.slots[0] == null) {
         return false;
      } else {
         ItemStack itemstack = FurnaceRecipes.func_77602_a().func_151395_a(this.slots[0]);
         if (itemstack == null) {
            return false;
         } else if (this.slots[2] == null) {
            return true;
         } else if (!this.slots[2].func_77969_a(itemstack)) {
            return false;
         } else {
            int result = this.slots[2].field_77994_a + itemstack.field_77994_a;
            return result <= this.func_70297_j_() && result <= itemstack.func_77976_d();
         }
      }
   }

   public void smeltItem() {
      if (this.canSmelt()) {
         ItemStack itemstack = FurnaceRecipes.func_77602_a().func_151395_a(this.slots[0]);
         if (this.slots[2] == null) {
            this.slots[2] = itemstack.func_77946_l();
         } else if (this.slots[2].func_77969_a(itemstack)) {
            ItemStack var10000 = this.slots[2];
            var10000.field_77994_a += itemstack.field_77994_a;
         }

         --this.slots[0].field_77994_a;
         if (this.slots[0].field_77994_a <= 0) {
            this.slots[0] = null;
         }
      }

   }

   public int[] func_94128_d(int var1) {
      return var1 == 0 ? slots_bottom : (var1 == 1 ? slots_top : slots_side);
   }

   public boolean func_102007_a(int i, ItemStack itemstack, int j) {
      return this.func_94041_b(i, itemstack);
   }

   public boolean func_102008_b(int i, ItemStack itemstack, int j) {
      return j != 0 || i != 1 || itemstack.func_77973_b() == Items.field_151133_ar;
   }

   public int getBurnTimeRemainingScaled(int i) {
      if (this.currentItemBurnTime == 0) {
         this.currentItemBurnTime = this.furnaceSpeed;
      }

      return this.burnTime * i / this.currentItemBurnTime;
   }

   public int getCookProgressScaled(int i) {
      return this.cookTime * i / this.furnaceSpeed;
   }

   public void func_145839_a(NBTTagCompound nbt) {
      super.func_145839_a(nbt);
      NBTTagList list = nbt.func_150295_c("Items", 10);
      this.slots = new ItemStack[this.func_70302_i_()];

      for(int i = 0; i < list.func_74745_c(); ++i) {
         NBTTagCompound compound = list.func_150305_b(i);
         byte b = compound.func_74771_c("Slot");
         if (b >= 0 && b < this.slots.length) {
            this.slots[b] = ItemStack.func_77949_a(compound);
         }
      }

      this.burnTime = nbt.func_74765_d("BurnTime");
      this.cookTime = nbt.func_74765_d("CookTime");
      this.currentItemBurnTime = nbt.func_74765_d("CurrentBurnTime");
      if (nbt.func_74764_b("CustomName")) {
         this.localizedName = nbt.func_74779_i("CustomName");
      }

   }

   public void func_145841_b(NBTTagCompound nbt) {
      super.func_145841_b(nbt);
      nbt.func_74777_a("BurnTime", (short)this.burnTime);
      nbt.func_74777_a("CookTime", (short)this.cookTime);
      nbt.func_74777_a("CurrentBurnTime", (short)this.currentItemBurnTime);
      NBTTagList list = new NBTTagList();

      for(int i = 0; i < this.slots.length; ++i) {
         if (this.slots[i] != null) {
            NBTTagCompound compound = new NBTTagCompound();
            compound.func_74774_a("Slot", (byte)i);
            this.slots[i].func_77955_b(compound);
            list.func_74742_a(compound);
         }
      }

      nbt.func_74782_a("Items", list);
      if (this.func_145818_k_()) {
         nbt.func_74778_a("CustomName", this.localizedName);
      }

   }
}
