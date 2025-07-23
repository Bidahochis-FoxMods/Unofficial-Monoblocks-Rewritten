package com.monoblocks.renderer;

import com.monoblocks.blocks.models.ModelSingleInsulator;
import com.monoblocks.blocks.tileentity.TileEntityPowerPole13;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class PowerPole13Render extends TileEntitySpecialRenderer {
   private ModelSingleInsulator model = new ModelSingleInsulator();

   public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
      TileEntityPowerPole13 stopSign = (TileEntityPowerPole13)te;
      int direction = te.getWorldObj().getBlockMetadata(te.xCoord, te.yCoord, te.zCoord);
      if (direction == 3) {
         direction = 1;
      } else if (direction == 1) {
         direction = 3;
      } else if (direction == 4) {
         direction = 0;
      } else if (direction == 0) {
         direction = 4;
      }

      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("monoblocks:textures/model/InsulatorModel16.png");
      Minecraft.getMinecraft().renderEngine.bindTexture(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
      this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0645F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }
}
