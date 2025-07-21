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
      multimap.put(SharedMonsterAttributes.field_111264_e.func_111108_a(), new AttributeModifier(this.field_96093_i, "Weapon modifier", this.field_150934_a, 0));
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

   public void func_70071_h_() {
      super.func_70071_h_();
      if (this.field_70127_C == 0.0F && this.field_70126_B == 0.0F) {
         float f = MathHelper.func_76133_a(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
         this.field_70126_B = this.field_70177_z = (float)(Math.atan2(this.field_70159_w, this.field_70179_y) * 180.0D / 3.141592653589793D);
         this.field_70127_C = this.field_70125_A = (float)(Math.atan2(this.field_70181_x, (double)f) * 180.0D / 3.141592653589793D);
      }

   }

   @SideOnly(Side.CLIENT)
   public void func_70056_a(double p_70056_1_, double p_70056_3_, double p_70056_5_, float p_70056_7_, float p_70056_8_, int p_70056_9_) {
      this.func_70107_b(p_70056_1_, p_70056_3_, p_70056_5_);
      this.func_70101_b(p_70056_7_, p_70056_8_);
   }

   protected void func_70184_a(MovingObjectPosition par1MovingObjectPosition) {
      if (par1MovingObjectPosition.field_72308_g != null) {
         byte b0 = 10;
         par1MovingObjectPosition.field_72308_g.func_70097_a(DamageSource.func_76356_a(this, this.func_85052_h()), (float)b0);
      }

      for(int l = 0; l < 4; ++l) {
         this.field_70170_p.func_72869_a("reddust", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0D, 0.0D, 0.0D);
      }

      if (!this.field_70170_p.field_72995_K) {
         this.func_70106_y();
      }

      if (this.field_70173_aa > 20) {
         this.func_70106_y();
      }

   }

   protected float func_70185_h() {
      return 0.0F;
   }
}
