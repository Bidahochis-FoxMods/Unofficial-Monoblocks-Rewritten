package com.monoblocks.renderer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.item.Item;

@SideOnly(Side.CLIENT)
public class BlasterRender extends RenderSnowball {
   public BlasterRender(Item item) {
      this(item, 0);
   }

   public BlasterRender(Item item, int par2) {
      super(item, par2);
   }
}
