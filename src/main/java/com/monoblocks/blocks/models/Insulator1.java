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
      this.textureWidth = 128;
      this.textureHeight = 64;
      this.Shape9 = new ModelRenderer(this, 0, 24);
      this.Shape9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8);
      this.Shape9.setRotationPoint(-0.5F, 11.5F, 2.0F);
      this.Shape9.setTextureSize(128, 64);
      this.Shape9.mirror = true;
      this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
      this.Shape11 = new ModelRenderer(this, 0, 33);
      this.Shape11.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
      this.Shape11.setRotationPoint(-1.0F, 11.0F, 6.0F);
      this.Shape11.setTextureSize(128, 64);
      this.Shape11.mirror = true;
      this.setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
      this.Shape15 = new ModelRenderer(this, 0, 33);
      this.Shape15.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
      this.Shape15.setRotationPoint(-1.0F, 11.0F, 7.5F);
      this.Shape15.setTextureSize(128, 64);
      this.Shape15.mirror = true;
      this.setRotation(this.Shape15, 0.0F, 0.0F, 0.0F);
      this.Shape16 = new ModelRenderer(this, 0, 33);
      this.Shape16.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
      this.Shape16.setRotationPoint(-1.0F, 11.0F, 9.0F);
      this.Shape16.setTextureSize(128, 64);
      this.Shape16.mirror = true;
      this.setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
   }

   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.Shape9.render(f5);
   }

   public void renderTransparent(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.Shape11.render(f5);
      this.Shape15.render(f5);
      this.Shape16.render(f5);
   }

   private void setRotation(ModelRenderer model, float x, float y, float z) {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
   }

   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
      super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
   }
}
