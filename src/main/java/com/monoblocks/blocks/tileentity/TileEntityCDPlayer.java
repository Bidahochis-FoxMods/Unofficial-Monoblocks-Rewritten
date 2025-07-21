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

   public void func_145839_a(NBTTagCompound p_145839_1_) {
      super.func_145839_a(p_145839_1_);
      if (p_145839_1_.func_150297_b("RecordItem", 10)) {
         this.func_145857_a(ItemStack.func_77949_a(p_145839_1_.func_74775_l("RecordItem")));
      } else if (p_145839_1_.func_74762_e("Record") > 0) {
         this.func_145857_a(new ItemStack(Item.func_150899_d(p_145839_1_.func_74762_e("Record")), 1, 0));
      }

   }

   public void func_145841_b(NBTTagCompound p_145841_1_) {
      super.func_145841_b(p_145841_1_);
      if (this.func_145856_a() != null) {
         p_145841_1_.func_74782_a("RecordItem", this.func_145856_a().func_77955_b(new NBTTagCompound()));
         p_145841_1_.func_74768_a("Record", Item.func_150891_b(this.func_145856_a().func_77973_b()));
      }

   }

   public ItemStack func_145856_a() {
      return this.disc;
   }

   public void func_145857_a(ItemStack p_145857_1_) {
      this.disc = p_145857_1_;
      this.func_70296_d();
   }

   public ItemStack getItem() {
      return this.disc;
   }
}
