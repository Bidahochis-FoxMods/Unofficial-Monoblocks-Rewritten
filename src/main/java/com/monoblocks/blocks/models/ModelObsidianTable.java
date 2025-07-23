package com.monoblocks.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelObsidianTable extends ModelBase {
   ModelRenderer tabletop;
   ModelRenderer legone;
   ModelRenderer legtwo;
   ModelRenderer legthree;
   ModelRenderer legfour;

   public ModelObsidianTable() {
      this.textureWidth = 64;
      this.textureHeight = 32;
      this.tabletop = new ModelRenderer(this, 0, 0);
      this.tabletop.addBox(0.0F, 0.0F, 0.0F, 16, 4, 16);
      this.tabletop.setRotationPoint(-8.0F, 12.0F, -8.0F);
      this.tabletop.setTextureSize(64, 32);
      this.tabletop.mirror = true;
      this.setRotation(this.tabletop, 0.0F, 0.0F, 0.0F);
      this.legone = new ModelRenderer(this, 48, 20);
      this.legone.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4);
      this.legone.setRotationPoint(-8.0F, 16.0F, -8.0F);
      this.legone.setTextureSize(64, 32);
      this.legone.mirror = true;
      this.setRotation(this.legone, 0.0F, 0.0F, 0.0F);
      this.legtwo = new ModelRenderer(this, 32, 20);
      this.legtwo.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4);
      this.legtwo.setRotationPoint(4.0F, 16.0F, 4.0F);
      this.legtwo.setTextureSize(64, 32);
      this.legtwo.mirror = true;
      this.setRotation(this.legtwo, 0.0F, 0.0F, 0.0F);
      this.legthree = new ModelRenderer(this, 0, 20);
      this.legthree.addBox(4.0F, 0.0F, -8.0F, 4, 8, 4);
      this.legthree.setRotationPoint(0.0F, 16.0F, 0.0F);
      this.legthree.setTextureSize(64, 32);
      this.legthree.mirror = true;
      this.setRotation(this.legthree, 0.0F, 0.0F, 0.0F);
      this.legfour = new ModelRenderer(this, 16, 20);
      this.legfour.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4);
      this.legfour.setRotationPoint(-8.0F, 16.0F, 4.0F);
      this.legfour.setTextureSize(64, 32);
      this.legfour.mirror = true;
      this.setRotation(this.legfour, 0.0F, 0.0F, 0.0F);
   }

   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.render(entity, f, f1, f2, f3, f4, f5);
      this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      this.tabletop.render(f5);
      this.legone.render(f5);
      this.legtwo.render(f5);
      this.legthree.render(f5);
      this.legfour.render(f5);
   }

   public void renderModel(float f) {
      this.tabletop.render(f);
      this.legone.render(f);
      this.legtwo.render(f);
      this.legthree.render(f);
      this.legfour.render(f);
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
