package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.blocks.tileentity.TileEntityGate;
import com.monoblocks.blocks.tileentity.TileEntityGateClosed;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Gate extends BlockContainer {
   private boolean isOn = false;

   public Gate(Material mat, boolean isOn) {
      super(mat);
      this.setHardness(3.5F);
      this.setBlockName("gate");
      this.func_149672_a(field_149777_j);
      this.isOn = isOn;
      this.setBlockTextureName("monoblocks:gate");
   }

   public int func_149645_b() {
      return -1;
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public void func_149726_b(World world, int x, int y, int z) {
      if (!world.field_72995_K) {
         if (this.isOn && !world.func_72864_z(x, y, z)) {
            world.func_147464_a(x, y, z, this, 4);
         } else if (!this.isOn && world.func_72864_z(x, y, z)) {
            world.func_147465_d(x, y, z, MBlocks.GateClosed, world.func_72805_g(x, y, z), 2);
         }
      }

   }

   public void func_149695_a(World world, int x, int y, int z, Block block) {
      if (!world.field_72995_K) {
         if (this.isOn && !world.func_72864_z(x, y, z)) {
            world.func_147464_a(x, y, z, this, 4);
         } else if (!this.isOn && world.func_72864_z(x, y, z)) {
            world.func_147465_d(x, y, z, MBlocks.GateClosed, world.func_72805_g(x, y, z), 2);
         }
      }

   }

   public void func_149674_a(World world, int x, int y, int z, Random random) {
      if (!world.field_72995_K && this.isOn && !world.func_72864_z(x, y, z)) {
         world.func_147465_d(x, y, z, MBlocks.Gate, world.func_72805_g(x, y, z), 2);
      }

   }

   public Item func_149650_a(int i, Random random, int j) {
      return Item.getItemFromBlock(MBlocks.Gate);
   }

   protected ItemStack func_149644_j(int i) {
      return new ItemStack(MBlocks.Gate);
   }

   public TileEntity func_149915_a(World p_149915_1_, int p_149915_2_) {
      return (TileEntity)(this.isOn ? new TileEntityGateClosed() : new TileEntityGate());
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }
}
