package com.monoblocks.renderer;

import com.monoblocks.blocks.StoneChest;
import com.monoblocks.blocks.tileentity.TileEntityStoneChest;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Calendar;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.model.ModelLargeChest;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class StoneChestRenderer extends TileEntitySpecialRenderer {
   private static final ResourceLocation field_147505_d = new ResourceLocation("Monoblocks:textures/blocks/largestonechest.png");
   private static final ResourceLocation field_147504_g = new ResourceLocation("Monoblocks:textures/blocks/stonechest.png");
   private ModelChest field_147510_h = new ModelChest();
   private ModelChest field_147511_i = new ModelLargeChest();
   private boolean field_147509_j;
   private static final String __OBFID = "CL_00000965";

   public StoneChestRenderer() {
      Calendar calendar = Calendar.getInstance();
      if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
         this.field_147509_j = true;
      }

   }

   public void renderTileEntityAt(TileEntityStoneChest p_147502_1_, double p_147502_2_, double p_147502_4_, double p_147502_6_, float p_147502_8_) {
      int i;
      if (!p_147502_1_.func_145830_o()) {
         i = 0;
      } else {
         Block block = p_147502_1_.func_145838_q();
         i = p_147502_1_.func_145832_p();
         if (block instanceof StoneChest && i == 0) {
            try {
               ((StoneChest)block).func_149954_e(p_147502_1_.func_145831_w(), p_147502_1_.field_145851_c, p_147502_1_.field_145848_d, p_147502_1_.field_145849_e);
            } catch (ClassCastException var14) {
               FMLLog.severe("Attempted to render a chest at %d,  %d, %d that was not a chest", new Object[]{p_147502_1_.field_145851_c, p_147502_1_.field_145848_d, p_147502_1_.field_145849_e});
            }

            i = p_147502_1_.func_145832_p();
         }

         p_147502_1_.func_145979_i();
      }

      if (p_147502_1_.field_145992_i == null && p_147502_1_.field_145991_k == null) {
         ModelChest modelchest;
         if (p_147502_1_.field_145990_j == null && p_147502_1_.field_145988_l == null) {
            modelchest = this.field_147510_h;
            this.func_147499_a(field_147504_g);
         } else {
            modelchest = this.field_147511_i;
            this.func_147499_a(field_147505_d);
         }

         GL11.glPushMatrix();
         GL11.glEnable(32826);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glTranslatef((float)p_147502_2_, (float)p_147502_4_ + 1.0F, (float)p_147502_6_ + 1.0F);
         GL11.glScalef(1.0F, -1.0F, -1.0F);
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         short short1 = 0;
         if (i == 2) {
            short1 = 180;
         }

         if (i == 3) {
            short1 = 0;
         }

         if (i == 4) {
            short1 = 90;
         }

         if (i == 5) {
            short1 = -90;
         }

         if (i == 2 && p_147502_1_.field_145990_j != null) {
            GL11.glTranslatef(1.0F, 0.0F, 0.0F);
         }

         if (i == 5 && p_147502_1_.field_145988_l != null) {
            GL11.glTranslatef(0.0F, 0.0F, -1.0F);
         }

         GL11.glRotatef((float)short1, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         float f1 = p_147502_1_.field_145986_n + (p_147502_1_.field_145989_m - p_147502_1_.field_145986_n) * p_147502_8_;
         float f2;
         if (p_147502_1_.field_145992_i != null) {
            f2 = p_147502_1_.field_145992_i.field_145986_n + (p_147502_1_.field_145992_i.field_145989_m - p_147502_1_.field_145992_i.field_145986_n) * p_147502_8_;
            if (f2 > f1) {
               f1 = f2;
            }
         }

         if (p_147502_1_.field_145991_k != null) {
            f2 = p_147502_1_.field_145991_k.field_145986_n + (p_147502_1_.field_145991_k.field_145989_m - p_147502_1_.field_145991_k.field_145986_n) * p_147502_8_;
            if (f2 > f1) {
               f1 = f2;
            }
         }

         f1 = 1.0F - f1;
         f1 = 1.0F - f1 * f1 * f1;
         modelchest.field_78234_a.field_78795_f = -(f1 * 3.1415927F / 2.0F);
         modelchest.func_78231_a();
         GL11.glDisable(32826);
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   public void func_147500_a(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_) {
      this.renderTileEntityAt((TileEntityStoneChest)p_147500_1_, p_147500_2_, p_147500_4_, p_147500_6_, p_147500_8_);
   }
}
