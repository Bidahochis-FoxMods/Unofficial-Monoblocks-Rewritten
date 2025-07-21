package com.monoblocks.renderer;

import com.monoblocks.blocks.models.ModelShoplight;
import com.monoblocks.blocks.tileentity.TileEntityShoplight;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ShoplightRender extends TileEntitySpecialRenderer {
   private ModelShoplight model = new ModelShoplight();

   public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
      TileEntityShoplight stopSign = (TileEntityShoplight)te;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("monoblocks:textures/model/shoplight.png");
      Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 180.0F, 0.0F, 0.0F);
      GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
      this.model.func_78088_a((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(2896);
      this.model.renderBulb((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glDisable(3042);
      GL11.glEnable(2896);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }
}
