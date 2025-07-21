package com.monoblocks;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

public class FenceRender implements ISimpleBlockRenderingHandler {
   public static int model = RenderingRegistry.getNextAvailableRenderId();

   public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
      return renderer.func_147735_a((BlockFence)block, x, y, z);
   }

   public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
      if (modelID == model) {
         Tessellator tessellator = Tessellator.field_78398_a;

         for(int k = 0; k < 4; ++k) {
            float f2 = 0.125F;
            if (k == 0) {
               renderer.func_147782_a((double)(0.5F - f2), 0.0D, 0.0D, (double)(0.5F + f2), 1.0D, (double)(f2 * 2.0F));
            }

            if (k == 1) {
               renderer.func_147782_a((double)(0.5F - f2), 0.0D, (double)(1.0F - f2 * 2.0F), (double)(0.5F + f2), 1.0D, 1.0D);
            }

            f2 = 0.0625F;
            if (k == 2) {
               renderer.func_147782_a((double)(0.5F - f2), (double)(1.0F - f2 * 3.0F), (double)(-f2 * 2.0F), (double)(0.5F + f2), (double)(1.0F - f2), (double)(1.0F + f2 * 2.0F));
            }

            if (k == 3) {
               renderer.func_147782_a((double)(0.5F - f2), (double)(0.5F - f2 * 3.0F), (double)(-f2 * 2.0F), (double)(0.5F + f2), (double)(0.5F - f2), (double)(1.0F + f2 * 2.0F));
            }

            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            tessellator.func_78382_b();
            tessellator.func_78375_b(0.0F, -1.0F, 0.0F);
            renderer.func_147768_a(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, 0, metadata));
            tessellator.func_78381_a();
            tessellator.func_78382_b();
            tessellator.func_78375_b(0.0F, 1.0F, 0.0F);
            renderer.func_147806_b(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, 1, metadata));
            tessellator.func_78381_a();
            tessellator.func_78382_b();
            tessellator.func_78375_b(0.0F, 0.0F, -1.0F);
            renderer.func_147761_c(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, 2, metadata));
            tessellator.func_78381_a();
            tessellator.func_78382_b();
            tessellator.func_78375_b(0.0F, 0.0F, 1.0F);
            renderer.func_147734_d(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, 3, metadata));
            tessellator.func_78381_a();
            tessellator.func_78382_b();
            tessellator.func_78375_b(-1.0F, 0.0F, 0.0F);
            renderer.func_147798_e(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, 4, metadata));
            tessellator.func_78381_a();
            tessellator.func_78382_b();
            tessellator.func_78375_b(1.0F, 0.0F, 0.0F);
            renderer.func_147764_f(block, 0.0D, 0.0D, 0.0D, renderer.func_147787_a(block, 5, metadata));
            tessellator.func_78381_a();
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         }

         renderer.func_147782_a(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
      }

   }

   public boolean shouldRender3DInInventory(int id) {
      return true;
   }

   public int getRenderId() {
      return model;
   }
}
