package com.jadarstudios.developercapes.cape;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.util.ResourceLocation;

public interface ICape {
   String getName();

   ITextureObject getTexture();

   ResourceLocation getLocation();

   void loadTexture(AbstractClientPlayer var1);

   boolean isTextureLoaded(AbstractClientPlayer var1);
}
