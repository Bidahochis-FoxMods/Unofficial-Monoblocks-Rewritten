package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Sign extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape2;

   public Sign() {
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 4, 16, 4);
      this.Shape1.func_78793_a(-2.0F, 8.0F, -2.0F);
      this.Shape1.func_78787_b(64, 32);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 24, 0);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 0, 16, 16);
      this.Shape2.func_78793_a(-8.0F, 8.0F, 2.1F);
      this.Shape2.func_78787_b(64, 32);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.0F, 1.570796F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.func_78785_a(f5);
      this.Shape2.func_78785_a(f5);
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
