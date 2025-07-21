package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Insulator1 extends ModelBase {
   ModelRenderer Shape9;
   ModelRenderer Shape11;
   ModelRenderer Shape15;
   ModelRenderer Shape16;

   public Insulator1() {
      this.field_78090_t = 128;
      this.field_78089_u = 64;
      this.Shape9 = new ModelRenderer(this, 0, 24);
      this.Shape9.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 8);
      this.Shape9.func_78793_a(-0.5F, 11.5F, 2.0F);
      this.Shape9.func_78787_b(128, 64);
      this.Shape9.field_78809_i = true;
      this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
      this.Shape11 = new ModelRenderer(this, 0, 33);
      this.Shape11.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 1);
      this.Shape11.func_78793_a(-1.0F, 11.0F, 6.0F);
      this.Shape11.func_78787_b(128, 64);
      this.Shape11.field_78809_i = true;
      this.setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
      this.Shape15 = new ModelRenderer(this, 0, 33);
      this.Shape15.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 1);
      this.Shape15.func_78793_a(-1.0F, 11.0F, 7.5F);
      this.Shape15.func_78787_b(128, 64);
      this.Shape15.field_78809_i = true;
      this.setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
      this.Shape16 = new ModelRenderer(this, 0, 33);
      this.Shape16.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 1);
      this.Shape16.func_78793_a(-1.0F, 11.0F, 9.0F);
      this.Shape16.func_78787_b(128, 64);
      this.Shape16.field_78809_i = true;
      this.setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape9.func_78785_a(f5);
   }

   public void renderTransparent(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape11.func_78785_a(f5);
      this.Shape15.func_78785_a(f5);
      this.Shape16.func_78785_a(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.field_78795_f = x;
      model.field_78796_g = y;
      model.field_78808_h = z;
   }

   public void func_78087_a(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
      super.func_78087_a(f, f1, f2, f3, f4, f5, entity);
   }
}
