package com.monoblocks.blocks.models;

import com.monoblocks.utilities.Models;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

@SideOnly(Side.CLIENT)
public class FryerObjModel {
   private IModelCustom modelFryer;

   public FryerObjModel() {
      this.modelFryer = AdvancedModelLoader.loadModel(Models.FRYER);
   }

   public void render() {
      this.modelFryer.renderAll();
   }
}
