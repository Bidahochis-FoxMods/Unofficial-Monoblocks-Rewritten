package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Insulator2 extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer Shape5;
   ModelRenderer Shape6;
   ModelRenderer Shape7;
   ModelRenderer Shape8;
   ModelRenderer Shape9;
   ModelRenderer Shape10;

   public Insulator2() {
      this.field_78090_t = 128;
      this.field_78089_u = 64;
      this.Shape1 = new ModelRenderer(this, 0, 24);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 1, 1, 6);
      this.Shape1.func_78793_a(-0.5F, 11.5F, 2.0F);
      this.Shape1.func_78787_b(128, 64);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.2617994F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 0);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 0);
      this.Shape3.func_78793_a(-1.0F, 10.4F, 4.0F);
      this.Shape3.func_78787_b(128, 64);
      this.Shape3.field_78809_i = true;
      this.setRotation(this.Shape3, 0.2443461F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 0, 0);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 0);
      this.Shape4.func_78793_a(-1.0F, 10.25F, 4.5F);
      this.Shape4.func_78787_b(128, 64);
      this.Shape4.field_78809_i = true;
      this.setRotation(this.Shape4, 0.2443461F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 0, 0);
      this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 0);
      this.Shape5.func_78793_a(-1.0F, 10.15F, 5.0F);
      this.Shape5.func_78787_b(128, 64);
      this.Shape5.field_78809_i = true;
      this.setRotation(this.Shape5, 0.2443461F, 0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 0, 0);
      this.Shape6.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 0);
      this.Shape6.func_78793_a(-1.0F, 10.0F, 5.5F);
      this.Shape6.func_78787_b(128, 64);
      this.Shape6.field_78809_i = true;
      this.setRotation(this.Shape6, 0.2443461F, 0.0F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 0, 0);
      this.Shape7.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 0);
      this.Shape7.func_78793_a(-1.0F, 9.9F, 6.0F);
      this.Shape7.func_78787_b(128, 64);
      this.Shape7.field_78809_i = true;
      this.setRotation(this.Shape7, 0.2443461F, 0.0F, 0.0F);
      this.Shape8 = new ModelRenderer(this, 0, 0);
      this.Shape8.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 0);
      this.Shape8.func_78793_a(-1.0F, 9.75F, 6.5F);
      this.Shape8.func_78787_b(128, 64);
      this.Shape8.field_78809_i = true;
      this.setRotation(this.Shape8, 0.2443461F, 0.0F, 0.0F);
      this.Shape9 = new ModelRenderer(this, 0, 0);
      this.Shape9.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 0);
      this.Shape9.func_78793_a(-1.0F, 9.65F, 7.0F);
      this.Shape9.func_78787_b(128, 64);
      this.Shape9.field_78809_i = true;
      this.setRotation(this.Shape9, 0.2443461F, 0.0F, 0.0F);
      this.Shape10 = new ModelRenderer(this, 0, 0);
      this.Shape10.func_78789_a(0.0F, 0.0F, 0.0F, 2, 2, 0);
      this.Shape10.func_78793_a(-1.0F, 9.5F, 7.5F);
      this.Shape10.func_78787_b(128, 64);
      this.Shape10.field_78809_i = true;
      this.setRotation(this.Shape10, 0.2443461F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.func_78785_a(f5);
      this.Shape3.func_78785_a(f5);
      this.Shape4.func_78785_a(f5);
      this.Shape5.func_78785_a(f5);
      this.Shape6.func_78785_a(f5);
      this.Shape7.func_78785_a(f5);
      this.Shape8.func_78785_a(f5);
      this.Shape9.func_78785_a(f5);
      this.Shape10.func_78785_a(f5);
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
