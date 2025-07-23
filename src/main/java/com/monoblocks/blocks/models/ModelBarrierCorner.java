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
      this.textureWidth = 64;
      this.textureHeight = 32;
      this.shape6 = new ModelRenderer(this, 0, 0);
      this.shape6.setRotationPoint(-0.9F, 8.7F, -8.0F);
      this.shape6.addBox(0.0F, 0.0F, 0.0F, 3, 15, 8, 0.0F);
      this.setRotateAngle(this.shape6, 0.0F, 0.0F, -0.1605703F);
      this.shape8 = new ModelRenderer(this, 0, 0);
      this.shape8.setRotationPoint(-2.0F, 8.7F, -0.9F);
      this.shape8.addBox(0.0F, 0.0F, 0.0F, 10, 15, 3, 0.0F);
      this.setRotateAngle(this.shape8, 0.1605703F, 0.0F, 0.0F);
      this.shape2 = new ModelRenderer(this, 0, 0);
      this.shape2.setRotationPoint(-4.5F, 23.0F, -8.0F);
      this.shape2.addBox(0.0F, 0.0F, 0.0F, 9, 1, 10, 0.0F);
      this.shape4 = new ModelRenderer(this, 0, 0);
      this.shape4.setRotationPoint(-2.0F, 8.0F, -8.0F);
      this.shape4.addBox(0.0F, 0.0F, 0.0F, 4, 15, 8, 0.0F);
      this.shape9 = new ModelRenderer(this, 0, 0);
      this.shape9.setRotationPoint(0.0F, 8.2F, -2.1F);
      this.shape9.addBox(0.0F, 0.0F, 0.0F, 8, 15, 3, 0.0F);
      this.setRotateAngle(this.shape9, -0.1605703F, 0.0F, 0.0F);
      this.shape5 = new ModelRenderer(this, 0, 0);
      this.shape5.setRotationPoint(-2.1F, 8.2F, -8.0F);
      this.shape5.addBox(0.0F, 0.0F, 0.0F, 3, 15, 10, 0.0F);
      this.setRotateAngle(this.shape5, 0.0F, 0.0F, 0.1605703F);
      this.shape7 = new ModelRenderer(this, 0, 0);
      this.shape7.setRotationPoint(-2.0F, 8.0F, -2.0F);
      this.shape7.addBox(0.0F, 0.0F, 0.0F, 10, 15, 4, 0.0F);
      this.shape10 = new ModelRenderer(this, 0, 0);
      this.shape10.setRotationPoint(-2.0F, 23.0F, -4.5F);
      this.shape10.addBox(0.0F, 0.0F, 0.0F, 10, 1, 9, 0.0F);
   }

   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      this.shape6.render(f5);
      this.shape8.render(f5);
      this.shape2.render(f5);
      this.shape4.render(f5);
      this.shape9.render(f5);
      this.shape5.render(f5);
      this.shape7.render(f5);
      this.shape10.render(f5);
   }

   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
      modelRenderer.rotateAngleX = x;
      modelRenderer.rotateAngleY = y;
      modelRenderer.rotateAngleZ = z;
   }
}
