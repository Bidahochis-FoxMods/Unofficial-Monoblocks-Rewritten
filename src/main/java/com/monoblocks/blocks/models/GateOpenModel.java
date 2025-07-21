package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GateOpenModel extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer Shape5;
   ModelRenderer Shape6;

   public GateOpenModel() {
      this.field_78090_t = 128;
      this.field_78089_u = 64;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 12, 2, 12);
      this.Shape1.func_78793_a(-6.0F, 22.0F, -6.0F);
      this.Shape1.func_78787_b(128, 64);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 0, 0);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 8, 11, 8);
      this.Shape2.func_78793_a(-4.0F, 11.0F, -4.0F);
      this.Shape2.func_78787_b(128, 64);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 0);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 8, 8, 1);
      this.Shape3.func_78793_a(-4.0F, 11.0F, -6.0F);
      this.Shape3.func_78787_b(128, 64);
      this.Shape3.field_78809_i = true;
      this.setRotation(this.Shape3, 0.2617994F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 67, 0);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 1, 48, 2);
      this.Shape4.func_78793_a(0.0F, -37.0F, -6.0F);
      this.Shape4.func_78787_b(128, 64);
      this.Shape4.field_78809_i = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 0, 34);
      this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 0, 8, 8);
      this.Shape5.func_78793_a(1.0F, -6.0F, -4.0F);
      this.Shape5.func_78787_b(128, 64);
      this.Shape5.field_78809_i = true;
      this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 0, 34);
      this.Shape6.func_78789_a(0.0F, -32.0F, 0.0F, 0, 8, 8);
      this.Shape6.func_78793_a(0.0F, 2.0F, -4.0F);
      this.Shape6.func_78787_b(128, 64);
      this.Shape6.field_78809_i = true;
      this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.func_78785_a(f5);
      this.Shape2.func_78785_a(f5);
      this.Shape3.func_78785_a(f5);
      this.Shape4.func_78785_a(f5);
      this.Shape5.func_78785_a(f5);
      this.Shape6.func_78785_a(f5);
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
