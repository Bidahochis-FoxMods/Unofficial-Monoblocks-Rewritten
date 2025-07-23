package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStreetLight extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer Shape5;
   ModelRenderer Shape6;
   ModelRenderer Shape7;
   ModelRenderer Shape9;
   ModelRenderer Shape10;
   ModelRenderer Shape11;
   ModelRenderer Shape12;
   ModelRenderer Shape13;

   public ModelStreetLight() {
      this.textureWidth = 256;
      this.textureHeight = 128;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.addBox(0.0F, 0.0F, 0.0F, 2, 80, 2);
      this.Shape1.setRotationPoint(-1.0F, -56.0F, -1.0F);
      this.Shape1.setTextureSize(256, 128);
      this.Shape1.mirror = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 0, 0);
      this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
      this.Shape2.setRotationPoint(-1.0F, -58.5F, -1.5F);
      this.Shape2.setTextureSize(256, 128);
      this.Shape2.mirror = true;
      this.setRotation(this.Shape2, 0.1396263F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 0);
      this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
      this.Shape3.setRotationPoint(-1.0F, -61.0F, -2.6F);
      this.Shape3.setTextureSize(256, 128);
      this.Shape3.mirror = true;
      this.setRotation(this.Shape3, 0.4014257F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 0, 0);
      this.Shape4.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
      this.Shape4.setRotationPoint(-1.0F, -63.0F, -4.4F);
      this.Shape4.setTextureSize(256, 128);
      this.Shape4.mirror = true;
      this.setRotation(this.Shape4, 0.6981317F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 0, 0);
      this.Shape5.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
      this.Shape5.setRotationPoint(-1.0F, -64.38F, -6.5F);
      this.Shape5.setTextureSize(256, 128);
      this.Shape5.mirror = true;
      this.setRotation(this.Shape5, 0.9948377F, 0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 0, 0);
      this.Shape6.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
      this.Shape6.setRotationPoint(-1.0F, -65.0F, -9.0F);
      this.Shape6.setTextureSize(256, 128);
      this.Shape6.mirror = true;
      this.setRotation(this.Shape6, 1.291544F, 0.0F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 0, 0);
      this.Shape7.addBox(0.0F, 0.0F, 0.0F, 2, 12, 2);
      this.Shape7.setRotationPoint(-1.0F, -65.1F, -20.5F);
      this.Shape7.setTextureSize(256, 128);
      this.Shape7.mirror = true;
      this.setRotation(this.Shape7, 1.570796F, 0.0F, 0.0F);
      this.Shape9 = new ModelRenderer(this, 0, 0);
      this.Shape9.addBox(0.0F, 0.0F, 0.0F, 1, 3, 6);
      this.Shape9.setRotationPoint(-2.0F, -67.0F, -21.0F);
      this.Shape9.setTextureSize(256, 128);
      this.Shape9.mirror = true;
      this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
      this.Shape10 = new ModelRenderer(this, 0, 0);
      this.Shape10.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1);
      this.Shape10.setRotationPoint(-2.0F, -67.0F, -16.0F);
      this.Shape10.setTextureSize(256, 128);
      this.Shape10.mirror = true;
      this.setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
      this.Shape11 = new ModelRenderer(this, 0, 0);
      this.Shape11.addBox(0.0F, 0.0F, 0.0F, 1, 3, 6);
      this.Shape11.setRotationPoint(1.0F, -67.0F, -21.0F);
      this.Shape11.setTextureSize(256, 128);
      this.Shape11.mirror = true;
      this.setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
      this.Shape12 = new ModelRenderer(this, 0, 0);
      this.Shape12.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1);
      this.Shape12.setRotationPoint(-2.0F, -67.0F, -21.0F);
      this.Shape12.setTextureSize(256, 128);
      this.Shape12.mirror = true;
      this.setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
      this.Shape13 = new ModelRenderer(this, 39, 58);
      this.Shape13.addBox(0.0F, 0.0F, 0.0F, 2, 0, 4);
      this.Shape13.setRotationPoint(-1.0F, -64.5F, -20.0F);
      this.Shape13.setTextureSize(256, 128);
      this.Shape13.mirror = true;
      this.setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
   }

   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.render(f5);
      this.Shape2.render(f5);
      this.Shape3.render(f5);
      this.Shape4.render(f5);
      this.Shape5.render(f5);
      this.Shape6.render(f5);
      this.Shape7.render(f5);
      this.Shape9.render(f5);
      this.Shape10.render(f5);
      this.Shape11.render(f5);
      this.Shape12.render(f5);
      this.Shape13.render(f5);
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
