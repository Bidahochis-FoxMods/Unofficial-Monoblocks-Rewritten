package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPlayer extends ModelBase {
   public ModelRenderer bipedHeadwear;
   public ModelRenderer bipedLeftLeg;
   public ModelRenderer bipedEars;
   public ModelRenderer bipedRightLeg;
   public ModelRenderer bipedLeftArm;
   public ModelRenderer bipedRightArm;
   public ModelRenderer bipedBody;
   public ModelRenderer bipedHead;

   public ModelPlayer() {
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.bipedRightArm = new ModelRenderer(this, 40, 16);
      this.bipedRightArm.func_78793_a(-5.0F, 2.0F, 0.0F);
      this.bipedRightArm.func_78790_a(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
      this.bipedLeftArm = new ModelRenderer(this, 40, 16);
      this.bipedLeftArm.field_78809_i = true;
      this.bipedLeftArm.func_78793_a(5.0F, 2.0F, 0.0F);
      this.bipedLeftArm.func_78790_a(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
      this.bipedHead = new ModelRenderer(this, 0, 0);
      this.bipedHead.func_78793_a(0.0F, 0.0F, 0.0F);
      this.bipedHead.func_78790_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
      this.bipedBody = new ModelRenderer(this, 16, 16);
      this.bipedBody.func_78793_a(0.0F, 0.0F, 0.0F);
      this.bipedBody.func_78790_a(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
      this.bipedRightLeg = new ModelRenderer(this, 0, 16);
      this.bipedRightLeg.func_78793_a(-1.9F, 12.0F, 0.0F);
      this.bipedRightLeg.func_78790_a(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
      this.bipedEars = new ModelRenderer(this, 24, 0);
      this.bipedEars.func_78793_a(0.0F, 0.0F, 0.0F);
      this.bipedEars.func_78790_a(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
      this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
      this.bipedLeftLeg.field_78809_i = true;
      this.bipedLeftLeg.func_78793_a(1.9F, 12.0F, 0.0F);
      this.bipedLeftLeg.func_78790_a(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
      this.bipedHeadwear = new ModelRenderer(this, 32, 0);
      this.bipedHeadwear.func_78793_a(0.0F, 0.0F, 0.0F);
      this.bipedHeadwear.func_78790_a(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      this.bipedRightArm.func_78785_a(f5);
      this.bipedLeftArm.func_78785_a(f5);
      this.bipedHead.func_78785_a(f5);
      this.bipedBody.func_78785_a(f5);
      this.bipedRightLeg.func_78785_a(f5);
      this.bipedEars.func_78785_a(f5);
      this.bipedLeftLeg.func_78785_a(f5);
      this.bipedHeadwear.func_78785_a(f5);
   }

   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
      modelRenderer.field_78795_f = x;
      modelRenderer.field_78796_g = y;
      modelRenderer.field_78808_h = z;
   }
}
