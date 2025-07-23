package com.jadarstudios.developercapes.cape;

import com.jadarstudios.developercapes.HDImageBuffer;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.io.File;
import java.net.URL;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.util.ResourceLocation;

public class StaticCape extends AbstractCape {
   public StaticCape(String name, URL url) {
      this.setName(name);
      this.setURL(url);
   }

   public StaticCape(String name) {
      this(name, (URL)null);
   }

   public void loadTexture(AbstractClientPlayer player) {
      ResourceLocation location = this.getLocation();
      player.func_152121_a(Type.CAPE, location);
      Minecraft.getMinecraft().renderEngine.loadTexture(location, this.getTexture());
   }

   public boolean isTextureLoaded(AbstractClientPlayer player) {
      ResourceLocation location = player.getLocationCape();
      return location != null;
   }

   public void setURL(URL url) {
      if (url == null) {
         this.texture = null;
      } else {
         this.texture = new ThreadDownloadImageData((File)null, url.toString(), (ResourceLocation)null, new HDImageBuffer());
      }
   }

   public void setName(String name) {
      this.name = name;
      this.location = new ResourceLocation("DevCapes/" + name);
   }
}
