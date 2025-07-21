package com.monoblocks.blocks.tileentity;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityStereo extends TileEntity {
   private ItemStack record;
   public int count;

   public void func_145839_a(NBTTagCompound par1NBTTagCompound) {
      super.func_145839_a(par1NBTTagCompound);
      if (par1NBTTagCompound.func_74764_b("RecordItem")) {
         this.setRecord(ItemStack.func_77949_a(par1NBTTagCompound.func_74775_l("RecordItem")));
      } else if (par1NBTTagCompound.func_74762_e("Record") > 0) {
         this.setRecord(new ItemStack(Item.func_150899_d(par1NBTTagCompound.func_74762_e("Record")), 1, 0));
      }

      this.count = par1NBTTagCompound.func_74762_e("count");
   }

   public void func_145841_b(NBTTagCompound par1NBTTagCompound) {
      super.func_145841_b(par1NBTTagCompound);
      if (this.getRecordStack() != null) {
         par1NBTTagCompound.func_74782_a("RecordItem", this.getRecordStack().func_77955_b(new NBTTagCompound()));
         par1NBTTagCompound.func_74768_a("Record", Item.func_150891_b(this.getRecordStack().func_77973_b()));
      }

      par1NBTTagCompound.func_74768_a("count", this.count);
   }

   public ItemStack getRecordStack() {
      return this.record;
   }

   public void setRecord(ItemStack par1ItemStack) {
      this.record = par1ItemStack;
      this.func_70296_d();
   }

   public boolean canUpdate() {
      return false;
   }
}
