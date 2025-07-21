package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class InsulatorModel6 extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape6;
   ModelRenderer Shape7;
   ModelRenderer Shape11;
   ModelRenderer Shape12;
   ModelRenderer Shape13;
   ModelRenderer Shape14;
   ModelRenderer Shape15;
   ModelRenderer Shape16;
   ModelRenderer Shape17;
   ModelRenderer Shape3;

   public InsulatorModel6() {
      this.field_78090_t = 128;
      this.field_78089_u = 64;
      this.Shape1 = new ModelRenderer(this, 0, 3);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 4, 16, 4);
      this.Shape1.func_78793_a(-2.0F, 8.0F, -2.0F);
      this.Shape1.func_78787_b(128, 64);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 0, 0);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 32, 2, 1);
      this.Shape2.func_78793_a(-30.0F, 11.0F, -3.0F);
      this.Shape2.func_78787_b(128, 64);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 75, 0);
      this.Shape6.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
      this.Shape6.func_78793_a(-19.0F, 9.0F, -3.0F);
      this.Shape6.func_78787_b(128, 64);
      this.Shape6.field_78809_i = true;
      this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 75, 0);
      this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
      this.Shape7.func_78793_a(-9.0F, 9.0F, -3.0F);
      this.Shape7.func_78787_b(128, 64);
      this.Shape7.field_78809_i = true;
      this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
      this.Shape11 = new ModelRenderer(this, 20, 5);
      this.Shape11.func_78789_a(0.0F, 0.0F, 0.0F, 2, 1, 2);
      this.Shape11.func_78793_a(-9.5F, 9.0F, -3.5F);
      this.Shape11.func_78787_b(128, 64);
      this.Shape11.field_78809_i = true;
      this.setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
      this.Shape12 = new ModelRenderer(this, 20, 5);
      this.Shape12.func_78789_a(0.0F, 0.0F, 0.0F, 2, 1, 2);
      this.Shape12.func_78793_a(-19.5F, 9.0F, -3.5F);
      this.Shape12.func_78787_b(128, 64);
      this.Shape12.field_78809_i = true;
      this.setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
      this.Shape13 = new ModelRenderer(this, 20, 11);
      this.Shape13.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape13.func_78793_a(-9.0F, 8.0F, -3.0F);
      this.Shape13.func_78787_b(128, 64);
      this.Shape13.field_78809_i = true;
      this.setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
      this.Shape14 = new ModelRenderer(this, 20, 11);
      this.Shape14.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape14.func_78793_a(-19.0F, 8.0F, -3.0F);
      this.Shape14.func_78787_b(128, 64);
      this.Shape14.field_78809_i = true;
      this.setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
      this.Shape15 = new ModelRenderer(this, 75, 0);
      this.Shape15.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
      this.Shape15.func_78793_a(-29.0F, 9.0F, -3.0F);
      this.Shape15.func_78787_b(128, 64);
      this.Shape15.field_78809_i = true;
      this.setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
      this.Shape16 = new ModelRenderer(this, 20, 5);
      this.Shape16.func_78789_a(0.0F, 0.0F, 0.0F, 2, 1, 2);
      this.Shape16.func_78793_a(-29.5F, 9.0F, -3.5F);
      this.Shape16.func_78787_b(128, 64);
      this.Shape16.field_78809_i = true;
      this.setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
      this.Shape17 = new ModelRenderer(this, 20, 11);
      this.Shape17.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 1);
      this.Shape17.func_78793_a(-29.0F, 8.0F, -3.0F);
      this.Shape17.func_78787_b(128, 64);
      this.Shape17.field_78809_i = true;
      this.setRotation(this.Shape17, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 67, 0);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 15, 1, 1);
      this.Shape3.func_78793_a(-10.0F, 12.0F, -2.9F);
      this.Shape3.func_78787_b(128, 64);
      this.Shape3.field_78809_i = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.7853982F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.func_78785_a(f5);
      this.Shape2.func_78785_a(f5);
      this.Shape6.func_78785_a(f5);
      this.Shape7.func_78785_a(f5);
      this.Shape11.func_78785_a(f5);
      this.Shape12.func_78785_a(f5);
      this.Shape13.func_78785_a(f5);
      this.Shape14.func_78785_a(f5);
      this.Shape15.func_78785_a(f5);
      this.Shape16.func_78785_a(f5);
      this.Shape17.func_78785_a(f5);
      this.Shape3.func_78785_a(f5);
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
