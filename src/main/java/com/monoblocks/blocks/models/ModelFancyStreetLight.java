package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelFancyStreetLight extends ModelBase {
   ModelRenderer Shape1;
   ModelRenderer Shape2;
   ModelRenderer Shape3;
   ModelRenderer Shape4;
   ModelRenderer Shape5;
   ModelRenderer lamp;

   public ModelFancyStreetLight() {
      this.textureWidth = 64;
      this.textureHeight = 32;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.addBox(0.0F, 0.0F, 0.0F, 4, 16, 4);
      this.Shape1.setRotationPoint(-2.0F, 8.0F, -2.0F);
      this.Shape1.setTextureSize(64, 32);
      this.Shape1.mirror = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 0, 30);
      this.Shape2.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1);
      this.Shape2.setRotationPoint(-9.0F, 13.0F, -0.5F);
      this.Shape2.setTextureSize(64, 32);
      this.Shape2.mirror = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 30);
      this.Shape3.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1);
      this.Shape3.setRotationPoint(-8.0F, 13.0F, -0.5F);
      this.Shape3.setTextureSize(64, 32);
      this.Shape3.mirror = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, -0.4363323F);
      this.Shape4 = new ModelRenderer(this, 19, 0);
      this.Shape4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
      this.Shape4.setRotationPoint(-9.0F, 13.0F, -0.5F);
      this.Shape4.setTextureSize(64, 32);
      this.Shape4.mirror = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 30, 0);
      this.Shape5.addBox(0.0F, 0.0F, 0.0F, 3, 0, 3);
      this.Shape5.setRotationPoint(-10.0F, 14.9F, -1.5F);
      this.Shape5.setTextureSize(64, 32);
      this.Shape5.mirror = true;
      this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
      this.lamp = new ModelRenderer(this, 0, 22);
      this.lamp.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
      this.lamp.setRotationPoint(-9.5F, 15.0F, -1.0F);
      this.lamp.setTextureSize(64, 32);
      this.lamp.mirror = true;
      this.setRotation(this.lamp, 0.0F, 0.0F, 0.0F);
   }

   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      GL11.glPushMatrix();
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.render(f5);
      this.Shape2.render(f5);
      this.Shape3.render(f5);
      this.Shape4.render(f5);
      this.Shape5.render(f5);
      GL11.glPopMatrix();
   }

   public void renderTransparent(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      GL11.glPushMatrix();
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.lamp.render(f5);
      GL11.glPopMatrix();
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
