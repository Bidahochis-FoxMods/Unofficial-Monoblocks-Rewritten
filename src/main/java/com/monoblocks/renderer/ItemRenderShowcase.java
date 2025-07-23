package com.monoblocks.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import org.lwjgl.opengl.GL11;

public class ItemRenderShowcase implements IItemRenderer {
   TileEntitySpecialRenderer render;
   private TileEntity dummytile;

   public ItemRenderShowcase(TileEntitySpecialRenderer render, TileEntity dummy) {
      this.render = render;
      this.dummytile = dummy;
   }

   public boolean handleRenderType(ItemStack item, ItemRenderType type) {
      return true;
   }

   public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
      return true;
   }

   public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
      if (type == ItemRenderType.ENTITY) {
         GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
      }

      GL11.glDisable(2884);
      this.render.renderTileEntityAt(this.dummytile, 0.0D, 0.0D, 0.0D, 0.0F);
      GL11.glEnable(2884);
   }
}
