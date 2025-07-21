package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBarrier extends ModelBase {
   public ModelRenderer shape1;
   public ModelRenderer shape2;
   public ModelRenderer shape3;
   public ModelRenderer shape4;
   public ModelRenderer shape5;
   public ModelRenderer shape6;

   public ModelBarrier() {
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.shape3 = new ModelRenderer(this, 0, 0);
      this.shape3.func_78793_a(-4.5F, 23.0F, 5.0F);
      this.shape3.func_78790_a(0.0F, 0.0F, 0.0F, 9, 1, 3, 0.0F);
      this.shape6 = new ModelRenderer(this, 0, 0);
      this.shape6.func_78793_a(-0.9F, 8.7F, -8.0F);
      this.shape6.func_78790_a(0.0F, 0.0F, 0.0F, 3, 15, 16, 0.0F);
      this.setRotateAngle(this.shape6, 0.0F, 0.0F, -0.1605703F);
      this.shape4 = new ModelRenderer(this, 0, 0);
      this.shape4.func_78793_a(-2.0F, 8.0F, -8.0F);
      this.shape4.func_78790_a(0.0F, 0.0F, 0.0F, 4, 15, 16, 0.0F);
      this.shape5 = new ModelRenderer(this, 0, 0);
      this.shape5.func_78793_a(-2.1F, 8.2F, -8.0F);
      this.shape5.func_78790_a(0.0F, 0.0F, 0.0F, 3, 15, 16, 0.0F);
      this.setRotateAngle(this.shape5, 0.0F, 0.0F, 0.1605703F);
      this.shape2 = new ModelRenderer(this, 0, 0);
      this.shape2.func_78793_a(-4.5F, 23.0F, -3.0F);
      this.shape2.func_78790_a(0.0F, 0.0F, 0.0F, 9, 1, 7, 0.0F);
      this.shape1 = new ModelRenderer(this, 0, 0);
      this.shape1.func_78793_a(-4.5F, 23.0F, -8.0F);
      this.shape1.func_78790_a(0.0F, 0.0F, 0.0F, 9, 1, 4, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      this.shape3.func_78785_a(f5);
      this.shape6.func_78785_a(f5);
      this.shape4.func_78785_a(f5);
      this.shape5.func_78785_a(f5);
      this.shape2.func_78785_a(f5);
      this.shape1.func_78785_a(f5);
   }

   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
      modelRenderer.field_78795_f = x;
      modelRenderer.field_78796_g = y;
      modelRenderer.field_78808_h = z;
   }
}
