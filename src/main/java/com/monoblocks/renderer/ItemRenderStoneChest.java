package com.monoblocks.renderer;

import com.monoblocks.blocks.tileentity.TileEntityStoneChest;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

public class ItemRenderStoneChest implements IItemRenderer {
   private ModelChest chestModel = new ModelChest();

   public boolean handleRenderType(ItemStack item, ItemRenderType type) {
      return true;
   }

   public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
      return true;
   }

   public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
      TileEntityRendererDispatcher.field_147556_a.func_147549_a(new TileEntityStoneChest(), 0.0D, 0.0D, 0.0D, 0.0F);
   }
}
