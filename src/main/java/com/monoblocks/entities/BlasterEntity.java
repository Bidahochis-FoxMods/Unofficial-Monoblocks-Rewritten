package com.monoblocks.entities;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlasterEntity extends EntityThrowable {
   private double field_150934_a;
   private double explosionRadius = 2.0D;

   public Multimap getItemAttributeModifiers() {
      Multimap multimap = HashMultimap.create();
      multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(this.entityUniqueID, "Weapon modifier", this.field_150934_a, 0));
      return multimap;
   }

   public BlasterEntity(World par1World) {
      super(par1World);
   }

   public BlasterEntity(World par1World, double arg1Double, double arg2Double, double arg3Double) {
      super(par1World, arg1Double, arg2Double, arg3Double);
   }

   public BlasterEntity(World par1World, EntityLivingBase arg1EntityLivingBase) {
      super(par1World, arg1EntityLivingBase);
   }

   public void onUpdate() {
      super.onUpdate();
      if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
         float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
         this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / 3.141592653589793D);
         this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(this.motionY, (double)f) * 180.0D / 3.141592653589793D);
      }

   }

   @SideOnly(Side.CLIENT)
   public void func_70056_a(double p_70056_1_, double p_70056_3_, double p_70056_5_, float p_70056_7_, float p_70056_8_, int p_70056_9_) {
      this.setPosition(p_70056_1_, p_70056_3_, p_70056_5_);
      this.setRotation(p_70056_7_, p_70056_8_);
   }

   protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
      if (par1MovingObjectPosition.entityHit != null) {
         byte b0 = 10;
         par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)b0);
      }

      for(int l = 0; l < 4; ++l) {
         this.worldObj.spawnParticle("reddust", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      }

      if (!this.worldObj.isRemote) {
         this.setDead();
      }

      if (this.ticksExisted > 20) {
         this.setDead();
      }

   }

   protected float func_70185_h() {
      return 0.0F;
   }
}
