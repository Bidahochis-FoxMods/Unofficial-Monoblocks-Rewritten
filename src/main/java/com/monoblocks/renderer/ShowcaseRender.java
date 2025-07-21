package com.monoblocks.renderer;

import com.monoblocks.blocks.models.ModelShowcase;
import com.monoblocks.blocks.tileentity.TileEntityShowcase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ShowcaseRender extends TileEntitySpecialRenderer {
   public ModelShowcase model;
   private EntityItem entityItem;

   public ShowcaseRender() {
      this.entityItem = new EntityItem(Minecraft.func_71410_x().field_71441_e, 0.0D, 0.0D, 0.0D) {
      };
      this.model = new ModelShowcase();
   }

   public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
      TileEntityShowcase showcase = (TileEntityShowcase)te;
      ItemStack itemToRender = showcase.func_70301_a(0);
      ItemStack itemToRender1 = showcase.func_70301_a(2);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("monoblocks:textures/model/showcase.png");
      Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
      this.model.func_78088_a((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      EntityItem entityitem;
      float ticks;
      float h;
      ItemStack is;
      if (showcase != null && showcase.func_145831_w() != null && showcase.func_70301_a(0) != null) {
         entityitem = null;
         ticks = (float)Minecraft.func_71410_x().field_71451_h.field_70173_aa + scale;
         GL11.glPushMatrix();
         h = MathHelper.func_76126_a(ticks % 32767.0F / 16.0F) * 0.05F;
         GL11.glTranslatef((float)x + 0.75F, (float)y + 0.1F, (float)z + 0.25F);
         GL11.glRotatef(ticks % 360.0F, 0.0F, 1.0F, 0.0F);
         if (showcase.func_70301_a(0).func_77973_b() instanceof ItemBlock) {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         } else {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         }

         is = showcase.func_70301_a(0).func_77946_l();
         is.field_77994_a = 1;
         entityitem = new EntityItem(showcase.func_145831_w(), 0.0D, 0.3D, 0.0D, is);
         entityitem.field_70290_d = 0.0F;
         RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         if (!Minecraft.func_71375_t()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         }

         GL11.glPopMatrix();
      }

      if (showcase != null && showcase.func_145831_w() != null && showcase.func_70301_a(1) != null) {
         entityitem = null;
         ticks = (float)Minecraft.func_71410_x().field_71451_h.field_70173_aa + scale;
         GL11.glPushMatrix();
         h = MathHelper.func_76126_a(ticks % 32767.0F / 16.0F) * 0.05F;
         GL11.glTranslatef((float)x + 0.25F, (float)y + 0.1F, (float)z + 0.75F);
         GL11.glRotatef(ticks % 360.0F, 0.0F, 1.0F, 0.0F);
         if (showcase.func_70301_a(1).func_77973_b() instanceof ItemBlock) {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         } else {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         }

         is = showcase.func_70301_a(1).func_77946_l();
         is.field_77994_a = 1;
         entityitem = new EntityItem(showcase.func_145831_w(), 0.0D, 0.0D, 0.0D, is);
         entityitem.field_70290_d = 0.0F;
         RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         if (!Minecraft.func_71375_t()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         }

         GL11.glPopMatrix();
      }

      if (showcase != null && showcase.func_145831_w() != null && showcase.func_70301_a(2) != null) {
         entityitem = null;
         ticks = (float)Minecraft.func_71410_x().field_71451_h.field_70173_aa + scale;
         GL11.glPushMatrix();
         h = MathHelper.func_76126_a(ticks % 32767.0F / 16.0F) * 0.05F;
         GL11.glTranslatef((float)x + 0.25F, (float)y + 0.52F, (float)z + 0.75F);
         GL11.glRotatef(ticks % 360.0F, 0.0F, 1.0F, 0.0F);
         if (showcase.func_70301_a(2).func_77973_b() instanceof ItemBlock) {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         } else {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         }

         is = showcase.func_70301_a(2).func_77946_l();
         is.field_77994_a = 1;
         entityitem = new EntityItem(showcase.func_145831_w(), 0.0D, 0.0D, 0.0D, is);
         entityitem.field_70290_d = 0.0F;
         RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         if (!Minecraft.func_71375_t()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         }

         GL11.glPopMatrix();
      }

      if (showcase != null && showcase.func_145831_w() != null && showcase.func_70301_a(3) != null) {
         entityitem = null;
         ticks = (float)Minecraft.func_71410_x().field_71451_h.field_70173_aa + scale;
         GL11.glPushMatrix();
         h = MathHelper.func_76126_a(ticks % 32767.0F / 16.0F) * 0.05F;
         GL11.glTranslatef((float)x + 0.75F, (float)y + 0.52F, (float)z + 0.25F);
         GL11.glRotatef(ticks % 360.0F, 0.0F, 1.0F, 0.0F);
         if (showcase.func_70301_a(3).func_77973_b() instanceof ItemBlock) {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         } else {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         }

         is = showcase.func_70301_a(3).func_77946_l();
         is.field_77994_a = 1;
         entityitem = new EntityItem(showcase.func_145831_w(), 0.0D, 0.0D, 0.0D, is);
         entityitem.field_70290_d = 0.0F;
         RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         if (!Minecraft.func_71375_t()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            RenderManager.field_78727_a.func_147940_a(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         }

         GL11.glPopMatrix();
      }

   }
}
