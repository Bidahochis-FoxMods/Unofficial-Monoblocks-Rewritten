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

   protected void func_146979_b(int var1, int var2) {
   }

   protected void func_146976_a(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146297_k.func_110434_K().func_110577_a(gui);
      int x = (this.field_146294_l - this.field_146999_f) / 2;
      int y = (this.field_146295_m - this.field_147000_g) / 2;
      this.func_73729_b(x, y, 0, 0, this.field_146999_f, this.field_147000_g);
   }
}
