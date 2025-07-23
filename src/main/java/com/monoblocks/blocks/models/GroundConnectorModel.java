package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GroundConnectorModel extends ModelBase {
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer Shape5;
   ModelRenderer Shape6;
   ModelRenderer Shape7;

   public GroundConnectorModel() {
      this.textureWidth = 64;
      this.textureHeight = 32;
      this.Shape2 = new ModelRenderer(this, 12, 0);
      this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5);
      this.Shape2.setRotationPoint(0.0F, 12.0F, -7.0F);
      this.Shape2.setTextureSize(64, 32);
      this.Shape2.mirror = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 6);
      this.Shape3.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
      this.Shape3.setRotationPoint(0.0F, 8.0F, -7.0F);
      this.Shape3.setTextureSize(64, 32);
      this.Shape3.mirror = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
      this.Shape4 = new ModelRenderer(this, 0, 0);
      this.Shape4.addBox(0.0F, 0.0F, 0.0F, 2, 0, 2);
      this.Shape4.setRotationPoint(-0.5F, 9.0F, -7.5F);
      this.Shape4.setTextureSize(64, 32);
      this.Shape4.mirror = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 0, 0);
      this.Shape5.addBox(0.0F, 0.0F, 0.0F, 2, 0, 2);
      this.Shape5.setRotationPoint(-0.5F, 10.5F, -7.5F);
      this.Shape5.setTextureSize(64, 32);
      this.Shape5.mirror = true;
      this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
      this.Shape6 = new ModelRenderer(this, 0, 21);
      this.Shape6.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
      this.Shape6.setRotationPoint(0.0F, 14.0F, -7.0F);
      this.Shape6.setTextureSize(64, 32);
      this.Shape6.mirror = true;
      this.setRotation(this.Shape6, 0.4014257F, 0.0F, 0.0F);
      this.Shape7 = new ModelRenderer(this, 0, 21);
      this.Shape7.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
      this.Shape7.setRotationPoint(0.0F, 17.0F, -6.0F);
      this.Shape7.setTextureSize(64, 32);
      this.Shape7.mirror = true;
      this.setRotation(this.Shape7, 0.6806784F, 0.0F, 0.0F);
   }

   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.Shape2.render(f5);
      this.Shape3.render(f5);
      this.Shape4.render(f5);
      this.Shape5.render(f5);
      this.Shape6.render(f5);
      this.Shape7.render(f5);
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
