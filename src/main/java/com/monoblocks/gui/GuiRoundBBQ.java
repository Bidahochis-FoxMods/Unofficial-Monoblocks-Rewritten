package com.monoblocks.gui;

import com.monoblocks.blocks.tileentity.TileEntityRoundBBQ;
import com.monoblocks.container.ContainerRoundBBQ;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiRoundBBQ extends GuiContainer {
   public static final ResourceLocation bground = new ResourceLocation("Monoblocks:textures/gui/GuiRoundBBQ.png");
   public TileEntityRoundBBQ RoundBBQ;

   public GuiRoundBBQ(InventoryPlayer inventoryPlayer, TileEntityRoundBBQ entity) {
      super(new ContainerRoundBBQ(inventoryPlayer, entity));
      this.RoundBBQ = entity;
      this.field_146999_f = 176;
      this.field_147000_g = 166;
   }

   public void func_146979_b(int par1, int par2) {
      String name = this.RoundBBQ.func_145818_k_() ? this.RoundBBQ.func_145825_b() : I18n.func_135052_a(this.RoundBBQ.func_145825_b(), new Object[0]);
      this.field_146289_q.func_78276_b(name, this.field_146999_f / 2 - this.field_146289_q.func_78256_a(name) / 2, 6, 4210752);
      this.field_146289_q.func_78276_b(I18n.func_135052_a("container.inventory", new Object[0]), 118, this.field_147000_g - 96 + 2, 4210752);
   }

   protected void func_146976_a(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      Minecraft.func_71410_x().func_110434_K().func_110577_a(bground);
      this.func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
      int k;
      if (this.RoundBBQ.isBurning()) {
         k = this.RoundBBQ.getBurnTimeRemainingScaled(40);
         int j = 40 - k;
         this.func_73729_b(this.field_147003_i + 29, this.field_147009_r + 65, 176, 0, 40 - j, 10);
      }

      k = this.RoundBBQ.getCookProgressScaled(24);
      this.func_73729_b(this.field_147003_i + 79, this.field_147009_r + 34, 176, 10, k + 1, 16);
   }
}
