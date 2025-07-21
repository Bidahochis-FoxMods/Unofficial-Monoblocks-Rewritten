package com.monoblocks.utilities;

import net.minecraft.util.ResourceLocation;

public class ResourceLocationUtility {
   public static ResourceLocation getResourceLocation(String modId, String path) {
      return new ResourceLocation(modId, path);
   }

   public static ResourceLocation getResourceLocation(String path) {
      return getResourceLocation("monoblocks", path);
   }
}
