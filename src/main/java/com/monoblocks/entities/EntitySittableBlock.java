package com.monoblocks.entities;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntitySittableBlock extends Entity {
   public int blockPosX;
   public int blockPosY;
   public int blockPosZ;

   public EntitySittableBlock(World world) {
      super(world);
      this.noClip = true;
      this.height = 0.01F;
      this.width = 0.01F;
   }

   public EntitySittableBlock(World world, double x, double y, double z, double y0ffset) {
      this(world);
      this.blockPosX = (int)x;
      this.blockPosY = (int)y;
      this.blockPosZ = (int)z;
      this.setPosition(x + 0.5D, y + y0ffset, z + 0.5D);
   }

   public EntitySittableBlock(World world, double x, double y, double z, double y0ffset, int rotation, double rotationOffset) {
      this(world);
      this.blockPosX = (int)x;
      this.blockPosY = (int)y;
      this.blockPosZ = (int)z;
      this.setPostionConsideringRotation(x + 0.5D, y + y0ffset, z + 0.5D, rotation, rotationOffset);
   }

   public void setPostionConsideringRotation(double x, double y, double z, int rotation, double rotationOffset) {
      switch(rotation) {
      case 0:
         z -= rotationOffset;
         break;
      case 1:
         x += rotationOffset;
         break;
      case 2:
         z += rotationOffset;
         break;
      case 3:
         x -= rotationOffset;
      }

      this.setPosition(x, y, z);
   }

   public double getMountedYOffset() {
      return (double)this.height * 0.0D;
   }

   protected boolean shouldSetPosAfterLoading() {
      return false;
   }

   public void onEntityUpdate() {
      if (!this.worldObj.isRemote && this.riddenByEntity == null | this.worldObj.isAirBlock(this.blockPosX, this.blockPosY, this.blockPosZ)) {
         this.setDead();
      }

   }

   protected void entityInit() {
   }

   public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
   }

   public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
   }
}
