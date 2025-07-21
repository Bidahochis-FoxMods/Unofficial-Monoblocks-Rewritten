package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFlag extends ModelBase {
   public ModelRenderer shape1;
   public ModelRenderer shape2;

   public ModelFlag() {
      this.field_78090_t = 64;
      this.field_78089_u = 48;
      this.shape2 = new ModelRenderer(this, 12, 0);
      this.shape2.func_78793_a(1.0F, -22.0F, 0.6F);
      this.shape2.func_78790_a(0.0F, 0.0F, 0.0F, 18, 12, 0, 0.0F);
      this.shape1 = new ModelRenderer(this, 0, 0);
      this.shape1.func_78793_a(0.0F, -22.0F, 0.0F);
      this.shape1.func_78790_a(0.0F, 0.0F, 0.0F, 1, 46, 1, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      this.shape2.func_78785_a(f5);
      this.shape1.func_78785_a(f5);
   }

   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
      modelRenderer.field_78795_f = x;
      modelRenderer.field_78796_g = y;
      modelRenderer.field_78808_h = z;
   }
}
