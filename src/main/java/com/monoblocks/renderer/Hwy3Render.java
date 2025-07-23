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

   public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float scale) {
      TileEntityHwySign3 stopSign = (TileEntityHwySign3)tileentity;
      int direction = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord);
      if (direction == 3) {
         direction = 1;
      } else if (direction == 1) {
         direction = 3;
      } else if (direction == 0) {
         direction = 2;
      } else if (direction == 2) {
         direction = 0;
      }

      if (tileentity.getWorldObj() == null) {
         boolean var11 = false;
      } else {
         Block block = tileentity.getBlockType();
         int i = tileentity.getBlockMetadata();
         if (block != null && i == 0) {
            i = tileentity.getBlockMetadata();
         } else if (this.xmas) {
            this.bindTexture(texture2);
         }
      }

      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      Minecraft.getMinecraft().renderEngine.bindTexture(texture);
      if (this.xmas) {
         Minecraft.getMinecraft().renderEngine.bindTexture(texture2);
      }

      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
      this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }
}
