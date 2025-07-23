package com.monoblocks.renderer;

import com.monoblocks.entities.BaconPigEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class BaconPigRender extends RenderLiving {
   private static final ResourceLocation saddledPigTextures = new ResourceLocation("textures/entity/pig/pig_saddle.png");
   private static final ResourceLocation pigTextures = new ResourceLocation("monoblocks", "textures/model/baconpig.png");
   private static final String __OBFID = "CL_00001019";

   public BaconPigRender(ModelBase par1ModelBase, ModelBase par2ModelBase, float par3)
   {
      super(par1ModelBase, par3);
      this.setRenderPassModel(par2ModelBase);
   }

   protected int shouldRenderPass(BaconPigEntity p_77032_1_, int p_77032_2_, float p_77032_3_)
   {
      if (p_77032_2_ == 0 && p_77032_1_.getSaddled())
      {
         this.bindTexture(saddledPigTextures);
         return 1;
      }
      else
      {
         return -1;
      }
   }

   protected ResourceLocation getEntityTexture(BaconPigEntity p_110775_1_) {
      return pigTextures;
   }

   protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_) {
      return this.shouldRenderPass((BaconPigEntity)p_77032_1_, p_77032_2_, p_77032_3_);
   }

   protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
      return this.getEntityTexture((BaconPigEntity)p_110775_1_);
   }
}
