package com.monoblocks.renderer;

import com.monoblocks.blocks.models.TrafficConeModel;
import java.util.Calendar;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class TrafficConeRenderer extends TileEntitySpecialRenderer {
   private boolean xmas;
   private static final ResourceLocation texture = new ResourceLocation("monoblocks:textures/model/trafficcone.png");
   private static final ResourceLocation texture2 = new ResourceLocation("monoblocks:textures/model/trafficconealt.png");
   private TrafficConeModel model = new TrafficConeModel();

   public TrafficConeRenderer() {
      Calendar calendar = Calendar.getInstance();
      if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 25) {
         this.xmas = true;
      }

   }

   public void func_147500_a(TileEntity tileentity, double x, double y, double z, float f) {
      int i;
      if (tileentity.func_145831_w() == null) {
         i = 0;
      } else {
         Block block = tileentity.func_145838_q();
         i = tileentity.func_145832_p();
         if (block != null && i == 0) {
            i = tileentity.func_145832_p();
         } else if (this.xmas) {
            this.func_147499_a(texture2);
         }
      }

      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(texture);
      if (this.xmas) {
         Minecraft.func_71410_x().field_71446_o.func_110577_a(texture2);
      }

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
