package com.monoblocks.renderer;

import com.monoblocks.blocks.models.TrafficConeSmallModel;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class TrafficConeSmallRenderer extends TileEntitySpecialRenderer {
   private static final ResourceLocation texture = new ResourceLocation("Monoblocks:textures/model/trafficconesmall.png");
   private TrafficConeSmallModel model = new TrafficConeSmallModel();

   public void func_147500_a(TileEntity tileentity, double x, double y, double z, float f) {
      int i;
      if (tileentity.func_145831_w() == null) {
         i = 0;
      } else {
         Block block = tileentity.func_145838_q();
         i = tileentity.func_145832_p();
         if (block != null && i == 0) {
            i = tileentity.func_145832_p();
         }
      }

      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(texture);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      int j = 0;
      if (i == 3) {
         j = 270;
      }

      if (i == 2) {
         j = 180;
      }

      if (i == 1) {
         j = 90;
      }

      if (i == 0) {
         j = 360;
      }

      GL11.glRotatef((float)j, 0.0F, 1.0F, 0.0F);
      this.model.func_78088_a((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }
}
