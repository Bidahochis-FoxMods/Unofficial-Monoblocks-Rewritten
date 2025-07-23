package com.monoblocks.gui;

import com.monoblocks.blocks.tileentity.TileEntityShowcase;
import com.monoblocks.container.ContainerShowcase;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiShowcase extends GuiContainer {
   private static final ResourceLocation gui = new ResourceLocation("monoblocks:textures/gui/showcasegui.png");

   public GuiShowcase(InventoryPlayer inventoryPlayer, TileEntityShowcase showcase) {
      super(new ContainerShowcase(inventoryPlayer, showcase));
   }

   protected void drawGuiContainerForegroundLayer(int var1, int var2) {
   }

   protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(gui);
      int x = (this.width - this.xSize) / 2;
      int y = (this.height - this.ySize) / 2;
      this.drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
   }
}
