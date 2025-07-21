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
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.Shape1 = new ModelRenderer(this, 0, 0);
      this.Shape1.func_78789_a(0.0F, 0.0F, 0.0F, 4, 16, 4);
      this.Shape1.func_78793_a(-2.0F, 8.0F, -2.0F);
      this.Shape1.func_78787_b(64, 32);
      this.Shape1.field_78809_i = true;
      this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
      this.Shape2 = new ModelRenderer(this, 0, 30);
      this.Shape2.func_78789_a(0.0F, 0.0F, 0.0F, 8, 1, 1);
      this.Shape2.func_78793_a(-9.0F, 13.0F, -0.5F);
      this.Shape2.func_78787_b(64, 32);
      this.Shape2.field_78809_i = true;
      this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
      this.Shape3 = new ModelRenderer(this, 0, 30);
      this.Shape3.func_78789_a(0.0F, 0.0F, 0.0F, 7, 1, 1);
      this.Shape3.func_78793_a(-8.0F, 13.0F, -0.5F);
      this.Shape3.func_78787_b(64, 32);
      this.Shape3.field_78809_i = true;
      this.setRotation(this.Shape3, 0.0F, 0.0F, -0.4363323F);
      this.Shape4 = new ModelRenderer(this, 19, 0);
      this.Shape4.func_78789_a(0.0F, 0.0F, 0.0F, 1, 2, 1);
      this.Shape4.func_78793_a(-9.0F, 13.0F, -0.5F);
      this.Shape4.func_78787_b(64, 32);
      this.Shape4.field_78809_i = true;
      this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
      this.Shape5 = new ModelRenderer(this, 30, 0);
      this.Shape5.func_78789_a(0.0F, 0.0F, 0.0F, 3, 0, 3);
      this.Shape5.func_78793_a(-10.0F, 14.9F, -1.5F);
      this.Shape5.func_78787_b(64, 32);
      this.Shape5.field_78809_i = true;
      this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
      this.lamp = new ModelRenderer(this, 0, 22);
      this.lamp.func_78789_a(0.0F, 0.0F, 0.0F, 2, 3, 2);
      this.lamp.func_78793_a(-9.5F, 15.0F, -1.0F);
      this.lamp.func_78787_b(64, 32);
      this.lamp.field_78809_i = true;
      this.setRotation(this.lamp, 0.0F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      GL11.glPushMatrix();
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.Shape1.func_78785_a(f5);
      this.Shape2.func_78785_a(f5);
      this.Shape3.func_78785_a(f5);
      this.Shape4.func_78785_a(f5);
      this.Shape5.func_78785_a(f5);
      GL11.glPopMatrix();
   }

   public void renderTransparent(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      GL11.glPushMatrix();
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.lamp.func_78785_a(f5);
      GL11.glPopMatrix();
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
