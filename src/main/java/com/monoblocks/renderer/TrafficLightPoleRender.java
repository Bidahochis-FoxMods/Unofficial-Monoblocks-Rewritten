package com.monoblocks.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class TrafficLightPoleRender extends TileEntitySpecialRenderer {
   private IModelCustom trafficLight = AdvancedModelLoader.loadModel(new ResourceLocation("monoblocks", "textures/model/trafficlight.obj"));
   private ResourceLocation trafficLightTexture = new ResourceLocation("monoblocks", "textures/model/trafficlight.png");

   public void func_147500_a(TileEntity tileEntity, double x, double y, double z, float f) {
      GL11.glPushMatrix();
      GL11.glScalef(1.0F, 1.0F, 1.0F);
      GL11.glTranslatef((float)x + 0.0F, (float)y + 0.0F, (float)z + 1.0F);
      Minecraft.func_71410_x().field_71446_o.func_110577_a(this.trafficLightTexture);
      this.trafficLight.renderAll();
      GL11.glPopMatrix();
   }
}
