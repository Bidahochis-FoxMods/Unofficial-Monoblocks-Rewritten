package com.monoblocks.renderer;

import com.monoblocks.blocks.models.ModelStreetlight2;
import com.monoblocks.blocks.tileentity.TileEntityStreetLightPole;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

public class StreetlightPoleRender extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler {
   private ModelStreetlight2 model = new ModelStreetlight2();

   public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
      TileEntityStreetLightPole stopSign = (TileEntityStreetLightPole)te;
      int direction = te.func_145831_w().func_72805_g(te.field_145851_c, te.field_145848_d, te.field_145849_e);
      if (direction == 1) {
         direction = 1;
      } else if (direction == 3) {
         direction = 3;
      } else if (direction == 2) {
         direction = 2;
      } else if (direction == 0) {
         direction = 0;
      }

      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("monoblocks:textures/model/streetlightpole.png");
      Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.9F);
      this.model.func_78088_a((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
   }

   public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
   }

   public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
      return true;
   }

   public boolean shouldRender3DInInventory(int modelId) {
      return false;
   }

   public int getRenderId() {
      return 0;
   }
}
