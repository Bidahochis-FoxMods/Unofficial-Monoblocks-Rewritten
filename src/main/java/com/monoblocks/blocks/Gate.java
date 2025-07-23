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
      this.setStepSound(soundTypeMetal);
      this.isOn = isOn;
      this.setBlockTextureName("monoblocks:gate");
   }

   public int getRenderType() {
      return -1;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean isFullCube() {
      return false;
   }

   public void onBlockAdded(World world, int x, int y, int z) {
      if (!world.isRemote) {
         if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
            world.scheduleBlockUpdate(x, y, z, this, 4);
         } else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
            world.setBlock(x, y, z, MBlocks.GateClosed, world.getBlockMetadata(x, y, z), 2);
         }
      }

   }

   public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
      if (!world.isRemote) {
         if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
            world.scheduleBlockUpdate(x, y, z, this, 4);
         } else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
            world.setBlock(x, y, z, MBlocks.GateClosed, world.getBlockMetadata(x, y, z), 2);
         }
      }

   }

   public void updateTick(World world, int x, int y, int z, Random random) {
      if (!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
         world.setBlock(x, y, z, MBlocks.Gate, world.getBlockMetadata(x, y, z), 2);
      }

   }

   public Item getItemDropped(int i, Random random, int j) {
      return Item.getItemFromBlock(MBlocks.Gate);
   }

   protected ItemStack createStackedBlock(int i) {
      return new ItemStack(MBlocks.Gate);
   }

   public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
      return (TileEntity)(this.isOn ? new TileEntityGateClosed() : new TileEntityGate());
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }
}
