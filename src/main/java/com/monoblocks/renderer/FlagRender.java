package com.monoblocks.renderer;

import com.monoblocks.blocks.models.ModelFlag;
import com.monoblocks.blocks.tileentity.TileEntityFlag;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class FlagRender extends TileEntitySpecialRenderer {
   private ModelFlag model = new ModelFlag();
   float f1 = 0.6666667F;

   public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
      TileEntityFlag flag = (TileEntityFlag)te;
      int direction = te.getWorldObj().getBlockMetadata(te.xCoord, te.yCoord, te.zCoord);
      GL11.glTranslatef((float)x + 0.5F, (float)y + 0.75F * this.f1, (float)z + 0.5F);
      float f2 = (float)(te.getBlockMetadata() * 360) / 16.0F;
      GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("monoblocks:textures/model/flag.png");
      Minecraft.getMinecraft().renderEngine.bindTexture(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
      this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }
}
