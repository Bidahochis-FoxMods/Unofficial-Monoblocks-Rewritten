package com.monoblocks.gui;

import com.monoblocks.blocks.tileentity.TileEntityFryer;
import com.monoblocks.container.ContainerFryer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiFryer extends GuiContainer {
   public static final ResourceLocation bground = new ResourceLocation("Monoblocks:textures/gui/GuiIronFurnace.png");
   public TileEntityFryer Fryer;

   public GuiFryer(InventoryPlayer inventoryPlayer, TileEntityFryer entity) {
      super(new ContainerFryer(inventoryPlayer, entity));
      this.Fryer = entity;
      this.xSize = 176;
      this.ySize = 166;
   }

   public void drawGuiContainerForegroundLayer(int par1, int par2) {
      String name = this.Fryer.hasCustomInventoryName() ? this.Fryer.getInventoryName() : I18n.format(this.Fryer.getInventoryName(), new Object[0]);
      this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
      this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 4210752);
   }

   protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
      this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
      int k;
      if (this.Fryer.isBurning()) {
         k = this.Fryer.getBurnTimeRemainingScaled(40);
         int j = 40 - k;
         this.drawTexturedModalRect(this.guiLeft + 29, this.guiTop + 65, 176, 0, 40 - j, 10);
      }

      k = this.Fryer.getCookProgressScaled(24);
      this.drawTexturedModalRect(this.guiLeft + 79, this.guiTop + 34, 176, 10, k + 1, 16);
   }
}
