package com.monoblocks.renderer;

import com.monoblocks.blocks.models.Sign;
import com.monoblocks.blocks.signage.tileentity.TileEntityHwySign3;
import java.util.Calendar;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class Hwy3Render extends TileEntitySpecialRenderer {
   private Sign model = new Sign();
   private boolean xmas;
   private static final ResourceLocation texture = new ResourceLocation("monoblocks:textures/signage/Hwy3Model.png");
   private static final ResourceLocation texture2 = new ResourceLocation("monoblocks:textures/signage/hwy3modelalt.png");

   public Hwy3Render() {
      Calendar calendar = Calendar.getInstance();
      if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 25) {
         this.xmas = true;
      }

   }

   public void func_147500_a(TileEntity tileentity, double x, double y, double z, float scale) {
      TileEntityHwySign3 stopSign = (TileEntityHwySign3)tileentity;
      int direction = tileentity.func_145831_w().func_72805_g(tileentity.field_145851_c, tileentity.field_145848_d, tileentity.field_145849_e);
      if (direction == 3) {
         direction = 1;
      } else if (direction == 1) {
         direction = 3;
      } else if (direction == 0) {
         direction = 2;
      } else if (direction == 2) {
         direction = 0;
      }

      if (tileentity.func_145831_w() == null) {
         boolean var11 = false;
      } else {
         Block block = tileentity.func_145838_q();
         int i = tileentity.func_145832_p();
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
      GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
      this.model.func_78088_a((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }
}
