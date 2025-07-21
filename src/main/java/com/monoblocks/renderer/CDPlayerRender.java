package com.monoblocks.renderer;

import com.monoblocks.MItems;
import com.monoblocks.blocks.models.ModelDiscPlayer;
import com.monoblocks.blocks.tileentity.TileEntityCDPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class CDPlayerRender extends TileEntitySpecialRenderer {
   private ModelDiscPlayer model;
   private ItemStack cd;
   private EntityItem entityItem;

   public CDPlayerRender() {
      this.cd = new ItemStack(MItems.CD);
      this.entityItem = new EntityItem(Minecraft.func_71410_x().field_71441_e, 0.0D, 0.0D, 0.0D, this.cd);
      this.model = new ModelDiscPlayer();
   }

   public void func_147500_a(TileEntity te, double x, double y, double z, float scale) {
      TileEntityCDPlayer cdPlayer = (TileEntityCDPlayer)te;
      int direction = te.func_145831_w().func_72805_g(te.field_145851_c, te.field_145848_d, te.field_145849_e);
      if (direction == 3) {
         direction = 2;
      } else if (direction == 1) {
         direction = 4;
      } else if (direction == 0) {
         direction = 3;
      } else if (direction == 2) {
         direction = 1;
      }

      GL11.glPushMatrix();
      GL11.glTranslatef((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);
      ResourceLocation textures = new ResourceLocation("monoblocks:textures/model/cdplayer.png");
      Minecraft.func_71410_x().field_71446_o.func_110577_a(textures);
      GL11.glPushMatrix();
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef((float)direction * 90.0F, 0.0F, 1.0F, 0.0F);
      this.model.func_78088_a((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 1);
      GL11.glDisable(2884);
      this.model.renderTranslucent((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      GL11.glEnable(2884);
      GL11.glBlendFunc(770, 771);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      this.entityItem.field_70290_d = 0.0F;
      RenderItem.field_82407_g = true;
      GL11.glTranslatef((float)x + 0.5F, (float)y + 0.05F, (float)z + 0.3F);
      GL11.glRotatef(180.0F, 0.0F, 1.0F, 1.0F);
      GL11.glScalef(0.9F, 0.9F, 0.9F);
      int metadata = te.func_145831_w().func_72805_g(te.field_145851_c, te.field_145848_d, te.field_145849_e);

      for(int i = 0; i < metadata; ++i) {
         RenderManager.field_78727_a.func_147940_a(this.entityItem, 0.0D, 0.0D, 0.1D * (double)i, 0.0F, 0.0F);
      }

      RenderItem.field_82407_g = false;
      GL11.glPopMatrix();
   }
}
