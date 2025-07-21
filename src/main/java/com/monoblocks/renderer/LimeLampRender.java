package com.monoblocks.renderer;

import com.monoblocks.blocks.models.ModelGlow;
import com.monoblocks.blocks.tileentity.TileEntityLimeLamp;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class LimeLampRender extends TileEntitySpecialRenderer {
   private ModelGlow model = new ModelGlow();

   public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
      TileEntityLimeLamp stopSign = (TileEntityLimeLamp)te;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 1);
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glDisable(2884);
      GL11.glDepthMask(false);
      GL11.glColor4f(0.7F, 1.0F, 0.0F, 0.35F);
      this.model.func_78088_a((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glDepthMask(true);
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      GL11.glEnable(2884);
      GL11.glEnable(2896);
      GL11.glEnable(3553);
      GL11.glBlendFunc(770, 771);
      GL11.glDisable(3042);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }
}
