package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelReflector extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer reflector1;
   ModelRenderer reflector2;

   public ModelReflector() {
      this.textureWidth = 64;
      this.textureHeight = 32;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4);
      this.Shape1.setRotationPoint(-1.5F, 23.0F, -2.0F);
      this.Shape1.setTextureSize(64, 32);
      this.Shape1.mirror = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 0, 0);
      this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4);
      this.Shape2.setRotationPoint(1.5F, 23.0F, -2.0F);
      this.Shape2.setTextureSize(64, 32);
      this.Shape2.mirror = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.3490659F);
      this.Shape3 = new ModelRenderer(this, 0, 0);
      this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 4);
      this.Shape3.setRotationPoint(-3.3F, 23.668F, -2.0F);
      this.Shape3.setTextureSize(64, 32);
      this.Shape3.mirror = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, -0.3490659F);
      this.reflector1 = new ModelRenderer(this, 0, 8);
      this.reflector1.addBox(0.0F, 0.0F, 0.0F, 2, 0, 4);
      this.reflector1.setRotationPoint(-3.4F, 23.7F, -2.0F);
      this.reflector1.setTextureSize(64, 32);
      this.reflector1.mirror = true;
      this.setRotation(this.reflector1, 0.0F, 0.0F, -0.3490659F);
      this.reflector2 = new ModelRenderer(this, 0, 8);
      this.reflector2.addBox(0.0F, 0.0F, 0.0F, 2, 0, 4);
      this.reflector2.setRotationPoint(1.6F, 23.0F, -2.0F);
      this.reflector2.setTextureSize(64, 32);
      this.reflector2.mirror = true;
      this.setRotation(this.reflector2, 0.0F, 0.0F, 0.3490659F);
   }

   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.render(f5);
      this.Shape2.render(f5);
      this.Shape3.render(f5);
   }

   public void renderReflector(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.reflector1.render(f5);
      this.reflector2.render(f5);
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
