package com.jadarstudios.developercapes.cape;

import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.util.ResourceLocation;

public abstract class AbstractCape implements ICape {
   protected String name;
   protected ITextureObject texture;
   protected ResourceLocation location;

   public AbstractCape(String name) {
      this.name = name;
   }

   public AbstractCape() {
   }

   public String getName() {
      return this.name;
   }

   public ITextureObject getTexture() {
      return this.texture;
   }

   public ResourceLocation getLocation() {
      return this.location;
   }
}
