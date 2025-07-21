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
      this.field_78090_t = 64;
      this.field_78089_u = 32;
      this.tabletop = new ModelRenderer(this, 0, 0);
      this.tabletop.func_78789_a(0.0F, 0.0F, 0.0F, 16, 4, 16);
      this.tabletop.func_78793_a(-8.0F, 12.0F, -8.0F);
      this.tabletop.func_78787_b(64, 32);
      this.tabletop.field_78809_i = true;
      this.setRotation(this.tabletop, 0.0F, 0.0F, 0.0F);
      this.legone = new ModelRenderer(this, 48, 20);
      this.legone.func_78789_a(0.0F, 0.0F, 0.0F, 4, 8, 4);
      this.legone.func_78793_a(-8.0F, 16.0F, -8.0F);
      this.legone.func_78787_b(64, 32);
      this.legone.field_78809_i = true;
      this.setRotation(this.legone, 0.0F, 0.0F, 0.0F);
      this.legtwo = new ModelRenderer(this, 32, 20);
      this.legtwo.func_78789_a(0.0F, 0.0F, 0.0F, 4, 8, 4);
      this.legtwo.func_78793_a(4.0F, 16.0F, 4.0F);
      this.legtwo.func_78787_b(64, 32);
      this.legtwo.field_78809_i = true;
      this.setRotation(this.legtwo, 0.0F, 0.0F, 0.0F);
      this.legthree = new ModelRenderer(this, 0, 20);
      this.legthree.func_78789_a(4.0F, 0.0F, -8.0F, 4, 8, 4);
      this.legthree.func_78793_a(0.0F, 16.0F, 0.0F);
      this.legthree.func_78787_b(64, 32);
      this.legthree.field_78809_i = true;
      this.setRotation(this.legthree, 0.0F, 0.0F, 0.0F);
      this.legfour = new ModelRenderer(this, 16, 20);
      this.legfour.func_78789_a(0.0F, 0.0F, 0.0F, 4, 8, 4);
      this.legfour.func_78793_a(-8.0F, 16.0F, 4.0F);
      this.legfour.func_78787_b(64, 32);
      this.legfour.field_78809_i = true;
      this.setRotation(this.legfour, 0.0F, 0.0F, 0.0F);
   }

   public void func_78088_a(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
      super.func_78088_a(entity, f, f1, f2, f3, f4, f5);
      this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
      this.tabletop.func_78785_a(f5);
      this.legone.func_78785_a(f5);
      this.legtwo.func_78785_a(f5);
      this.legthree.func_78785_a(f5);
      this.legfour.func_78785_a(f5);
   }

   public void renderModel(float f) {
      this.tabletop.func_78785_a(f);
      this.legone.func_78785_a(f);
      this.legtwo.func_78785_a(f);
      this.legthree.func_78785_a(f);
      this.legfour.func_78785_a(f);
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
