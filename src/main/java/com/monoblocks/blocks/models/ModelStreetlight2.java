package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStreetlight2 extends ModelBase {
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer Shape5;
   ModelRenderer Shape6;
   ModelRenderer Shape7;
   ModelRenderer Shape1;

   public ModelStreetlight2() {
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.Shape2 = new ModelRenderer(this, 0, 0);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 16);
      this.Shape2.func_78793_a(1.0F, 13.0F, 0.0F);
      this.Shape2.func_78787_b(64, 32);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.3490659F, 3.141593F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 0);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 4, 2, 1);
      this.Shape3.func_78793_a(-2.0F, 7.7F, -16.0F);
      this.Shape3.func_78787_b(64, 32);
      this.Shape3.field_78809_i = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 0, 0);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 4);
      this.Shape4.func_78793_a(-2.0F, 7.7F, -20.0F);
      this.Shape4.func_78787_b(64, 32);
      this.Shape4.field_78809_i = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 0, 0);
      this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 4);
      this.Shape5.func_78793_a(1.0F, 7.7F, -20.0F);
      this.Shape5.func_78787_b(64, 32);
      this.Shape5.field_78809_i = true;
      this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 0, 0);
      this.Shape6.func_78789_a(0.0F, 0.0F, 0.0F, 4, 2, 1);
      this.Shape6.func_78793_a(-2.0F, 7.7F, -21.0F);
      this.Shape6.func_78787_b(64, 32);
      this.Shape6.field_78809_i = true;
      this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 0, 0);
      this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 4, 1, 6);
      this.Shape7.func_78793_a(-2.0F, 6.7F, -21.0F);
      this.Shape7.func_78787_b(64, 32);
      this.Shape7.field_78809_i = true;
      this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
      this.Shape1 = new ModelRenderer(this, 0, 11);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 2, 0, 4);
      this.Shape1.func_78793_a(-1.0F, 9.0F, -20.0F);
      this.Shape1.func_78787_b(64, 32);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape2.func_78785_a(f5);
      this.Shape3.func_78785_a(f5);
      this.Shape4.func_78785_a(f5);
      this.Shape5.func_78785_a(f5);
      this.Shape6.func_78785_a(f5);
      this.Shape7.func_78785_a(f5);
      this.Shape1.func_78785_a(f5);
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
