package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBarrierCorner extends ModelBase {
   public ModelRenderer shape2;
   public ModelRenderer shape4;
   public ModelRenderer shape5;
   public ModelRenderer shape6;
   public ModelRenderer shape7;
   public ModelRenderer shape8;
   public ModelRenderer shape9;
   public ModelRenderer shape10;

   public ModelBarrierCorner() {
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.shape6 = new ModelRenderer(this, 0, 0);
      this.shape6.func_78793_a(-0.9F, 8.7F, -8.0F);
      this.shape6.func_78790_a(0.0F, 0.0F, 0.0F, 3, 15, 8, 0.0F);
      this.setRotateAngle(this.shape6, 0.0F, 0.0F, -0.1605703F);
      this.shape8 = new ModelRenderer(this, 0, 0);
      this.shape8.func_78793_a(-2.0F, 8.7F, -0.9F);
      this.shape8.func_78790_a(0.0F, 0.0F, 0.0F, 10, 15, 3, 0.0F);
      this.setRotateAngle(this.shape8, 0.1605703F, 0.0F, 0.0F);
      this.shape2 = new ModelRenderer(this, 0, 0);
      this.shape2.func_78793_a(-4.5F, 23.0F, -8.0F);
      this.shape2.func_78790_a(0.0F, 0.0F, 0.0F, 9, 1, 10, 0.0F);
      this.shape4 = new ModelRenderer(this, 0, 0);
      this.shape4.func_78793_a(-2.0F, 8.0F, -8.0F);
      this.shape4.func_78790_a(0.0F, 0.0F, 0.0F, 4, 15, 8, 0.0F);
      this.shape9 = new ModelRenderer(this, 0, 0);
      this.shape9.func_78793_a(0.0F, 8.2F, -2.1F);
      this.shape9.func_78790_a(0.0F, 0.0F, 0.0F, 8, 15, 3, 0.0F);
      this.setRotateAngle(this.shape9, -0.1605703F, 0.0F, 0.0F);
      this.shape5 = new ModelRenderer(this, 0, 0);
      this.shape5.func_78793_a(-2.1F, 8.2F, -8.0F);
      this.shape5.func_78790_a(0.0F, 0.0F, 0.0F, 3, 15, 10, 0.0F);
      this.setRotateAngle(this.shape5, 0.0F, 0.0F, 0.1605703F);
      this.shape7 = new ModelRenderer(this, 0, 0);
      this.shape7.func_78793_a(-2.0F, 8.0F, -2.0F);
      this.shape7.func_78790_a(0.0F, 0.0F, 0.0F, 10, 15, 4, 0.0F);
      this.shape10 = new ModelRenderer(this, 0, 0);
      this.shape10.func_78793_a(-2.0F, 23.0F, -4.5F);
      this.shape10.func_78790_a(0.0F, 0.0F, 0.0F, 10, 1, 9, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      this.shape6.func_78785_a(f5);
      this.shape8.func_78785_a(f5);
      this.shape2.func_78785_a(f5);
      this.shape4.func_78785_a(f5);
      this.shape9.func_78785_a(f5);
      this.shape5.func_78785_a(f5);
      this.shape7.func_78785_a(f5);
      this.shape10.func_78785_a(f5);
   }

   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
      modelRenderer.field_78795_f = x;
      modelRenderer.field_78796_g = y;
      modelRenderer.field_78808_h = z;
   }
}
