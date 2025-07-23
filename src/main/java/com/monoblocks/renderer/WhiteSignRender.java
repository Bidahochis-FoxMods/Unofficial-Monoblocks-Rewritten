package com.monoblocks.renderer;

import com.monoblocks.blocks.models.Sign;
import com.monoblocks.blocks.tileentity.TileEntityWhiteSign;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class WhiteSignRender extends TileEntitySignRenderer {
   private Sign model = new Sign();

   public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
      TileEntityWhiteSign sign = (TileEntityWhiteSign)te;
      int direction = te.getWorldObj().getBlockMetadata(te.xCoord, te.yCoord, te.zCoord);
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
      ResourceLocation textures = new ResourceLocation("monoblocks:textures/signage/WhiteInfoModel.png");
      Minecraft.getMinecraft().renderEngine.bindTexture(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
      this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glDisable(2896);
      float f = 0.011111112F;
      GL11.glTranslated(x, y, z);
      GL11.glScalef(f, -f, f);
      FontRenderer fr = Minecraft.getMinecraft().fontRenderer;
      switch(te.getWorldObj().getBlockMetadata(te.xCoord, te.yCoord, te.zCoord)) {
      case 0:
         GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-83.0F, -84.0F, -33.0F);
         break;
      case 1:
         GL11.glRotatef((float)direction * 270.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-83.0F, -84.0F, 57.0F);
         break;
      case 2:
         GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(6.0F, -84.0F, 57.0F);
         break;
      case 3:
         GL11.glRotatef((float)direction * 270.0F, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(6.0F, -84.0F, -33.0F);
      }

      String[] strings = sign.getText();
      if (strings != null && strings.length > 0) {
         float lum = this.calcLuminance(te.getWorldObj().getBlock(te.xCoord, te.yCoord, te.zCoord).colorMultiplier(te.getWorldObj(), te.xCoord, te.yCoord, te.zCoord));

         for(int i = 0; i < strings.length; ++i) {
            fr.drawString((lum >= 35.0F ? EnumChatFormatting.BLACK : (lum >= 31.0F ? EnumChatFormatting.GRAY : EnumChatFormatting.WHITE)) + strings[i], -fr.getStringWidth(strings[i]) / 2 + 40, 10 * i, 0);
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
