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
      this.entityItem = new EntityItem(Minecraft.getMinecraft().theWorld, 0.0D, 0.0D, 0.0D) {
      };
      this.model = new ModelShowcase();
   }

   public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
      TileEntityShowcase showcase = (TileEntityShowcase)te;
      ItemStack itemToRender = showcase.getStackInSlot(0);
      ItemStack itemToRender1 = showcase.getStackInSlot(2);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("monoblocks:textures/model/showcase.png");
      Minecraft.getMinecraft().renderEngine.bindTexture(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
      this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      EntityItem entityitem;
      float ticks;
      float h;
      ItemStack is;
      if (showcase != null && showcase.getWorldObj() != null && showcase.getStackInSlot(0) != null) {
         entityitem = null;
         ticks = (float)Minecraft.getMinecraft().renderViewEntity.ticksExisted + scale;
         GL11.glPushMatrix();
         h = MathHelper.sin(ticks % 32767.0F / 16.0F) * 0.05F;
         GL11.glTranslatef((float)x + 0.75F, (float)y + 0.1F, (float)z + 0.25F);
         GL11.glRotatef(ticks % 360.0F, 0.0F, 1.0F, 0.0F);
         if (showcase.getStackInSlot(0).getItem() instanceof ItemBlock) {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         } else {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         }

         is = showcase.getStackInSlot(0).copy();
         is.stackSize = 1;
         entityitem = new EntityItem(showcase.getWorldObj(), 0.0D, 0.3D, 0.0D, is);
         entityitem.hoverStart = 0.0F;
         RenderManager.instance.renderEntityWithPosYaw(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         if (!Minecraft.isFancyGraphicsEnabled()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            RenderManager.instance.renderEntityWithPosYaw(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         }

         GL11.glPopMatrix();
      }

      if (showcase != null && showcase.getWorldObj() != null && showcase.getStackInSlot(1) != null) {
         entityitem = null;
         ticks = (float)Minecraft.getMinecraft().renderViewEntity.ticksExisted + scale;
         GL11.glPushMatrix();
         h = MathHelper.sin(ticks % 32767.0F / 16.0F) * 0.05F;
         GL11.glTranslatef((float)x + 0.25F, (float)y + 0.1F, (float)z + 0.75F);
         GL11.glRotatef(ticks % 360.0F, 0.0F, 1.0F, 0.0F);
         if (showcase.getStackInSlot(1).getItem() instanceof ItemBlock) {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         } else {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         }

         is = showcase.getStackInSlot(1).copy();
         is.stackSize = 1;
         entityitem = new EntityItem(showcase.getWorldObj(), 0.0D, 0.0D, 0.0D, is);
         entityitem.hoverStart = 0.0F;
         RenderManager.instance.renderEntityWithPosYaw(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         if (!Minecraft.isFancyGraphicsEnabled()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            RenderManager.instance.renderEntityWithPosYaw(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         }

         GL11.glPopMatrix();
      }

      if (showcase != null && showcase.getWorldObj() != null && showcase.getStackInSlot(2) != null) {
         entityitem = null;
         ticks = (float)Minecraft.getMinecraft().renderViewEntity.ticksExisted + scale;
         GL11.glPushMatrix();
         h = MathHelper.sin(ticks % 32767.0F / 16.0F) * 0.05F;
         GL11.glTranslatef((float)x + 0.25F, (float)y + 0.52F, (float)z + 0.75F);
         GL11.glRotatef(ticks % 360.0F, 0.0F, 1.0F, 0.0F);
         if (showcase.getStackInSlot(2).getItem() instanceof ItemBlock) {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         } else {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         }

         is = showcase.getStackInSlot(2).copy();
         is.stackSize = 1;
         entityitem = new EntityItem(showcase.getWorldObj(), 0.0D, 0.0D, 0.0D, is);
         entityitem.hoverStart = 0.0F;
         RenderManager.instance.renderEntityWithPosYaw(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         if (!Minecraft.isFancyGraphicsEnabled()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            RenderManager.instance.renderEntityWithPosYaw(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         }

         GL11.glPopMatrix();
      }

      if (showcase != null && showcase.getWorldObj() != null && showcase.getStackInSlot(3) != null) {
         entityitem = null;
         ticks = (float)Minecraft.getMinecraft().renderViewEntity.ticksExisted + scale;
         GL11.glPushMatrix();
         h = MathHelper.sin(ticks % 32767.0F / 16.0F) * 0.05F;
         GL11.glTranslatef((float)x + 0.75F, (float)y + 0.52F, (float)z + 0.25F);
         GL11.glRotatef(ticks % 360.0F, 0.0F, 1.0F, 0.0F);
         if (showcase.getStackInSlot(3).getItem() instanceof ItemBlock) {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         } else {
            GL11.glScalef(0.65F, 0.65F, 0.65F);
         }

         is = showcase.getStackInSlot(3).copy();
         is.stackSize = 1;
         entityitem = new EntityItem(showcase.getWorldObj(), 0.0D, 0.0D, 0.0D, is);
         entityitem.hoverStart = 0.0F;
         RenderManager.instance.renderEntityWithPosYaw(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         if (!Minecraft.isFancyGraphicsEnabled()) {
            GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
            RenderManager.instance.renderEntityWithPosYaw(entityitem, 0.0D, 0.0D, 0.0D, 0.0F, 0.0F);
         }

         GL11.glPopMatrix();
      }

   }
}
