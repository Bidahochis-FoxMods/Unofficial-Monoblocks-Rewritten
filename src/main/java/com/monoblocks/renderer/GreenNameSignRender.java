package com.monoblocks.renderer;

import com.monoblocks.blocks.models.ModelNameSign;
import com.monoblocks.blocks.signage.tileentity.TileEntityGreenNameSign;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GreenNameSignRender extends TileEntitySignRenderer {
   private ModelNameSign model = new ModelNameSign();

   public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
      TileEntityGreenNameSign sign = (TileEntityGreenNameSign)te;
      int direction = te.func_145831_w().func_72805_g(te.field_145851_c, te.field_145848_d, te.field_145849_e);
      if (direction == 3) {
         direction = 1;
      } else if (direction == 1) {
         direction = 3;
      } else if (direction == 0) {
         direction = 2;
      } else if (direction == 2) {
         direction = 0;
      }

      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("monoblocks:textures/signage/greennamesign.png");
      Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, -0.7F);
      if (direction == 1) {
         GL11.glTranslatef(0.0F, 0.5F, 0.0F);
      }

      if (direction == 3) {
         GL11.glTranslatef(0.0F, 0.5F, 0.0F);
      }

      this.model.func_78088_a((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glDisable(2896);
      float f = 0.011111112F;
      GL11.glTranslated(x, y, z);
      GL11.glScalef(f, -f, f);
      FontRenderer fr = Minecraft.func_71410_x().field_71466_p;
      switch(te.func_145831_w().func_72805_g(te.field_145851_c, te.field_145848_d, te.field_145849_e)) {
      case 0:
         GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-83.0F, -84.0F, -117.0F);
         break;
      case 1:
         GL11.glRotatef((float)direction * 270.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-83.0F, -38.0F, -28.0F);
         break;
      case 2:
         GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(6.0F, -84.0F, -28.0F);
         break;
      case 3:
         GL11.glRotatef((float)direction * 270.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(6.0F, -38.0F, -117.0F);
      }

      String[] strings = sign.getText();
      if (strings != null && strings.length > 0) {
         float lum = this.calcLuminance(te.func_145831_w().func_147439_a(te.field_145851_c, te.field_145848_d, te.field_145849_e).func_149720_d(te.func_145831_w(), te.field_145851_c, te.field_145848_d, te.field_145849_e));

         for(int i = 0; i < strings.length; ++i) {
            fr.func_78276_b((lum >= 35.0F ? EnumChatFormatting.WHITE : (lum >= 31.0F ? EnumChatFormatting.GRAY : EnumChatFormatting.WHITE)) + strings[i], -fr.func_78256_a(strings[i]) / 2 + 40, 10 * i, 0);
         }
      }

      GL11.glEnable(2896);
      GL11.glPopMatrix();
   }

   private float calcLuminance(int rgb) {
      int r = (rgb & 16711680) >> 16;
      int g = (rgb & '\uff00') >> 8;
      int b = rgb & 255;
      return ((float)r * 0.299F + (float)g * 0.587F + (float)b * 0.114F) / 3.0F;
   }
}
