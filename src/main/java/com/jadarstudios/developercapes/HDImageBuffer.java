package com.jadarstudios.developercapes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import net.minecraft.client.renderer.IImageBuffer;

@SideOnly(Side.CLIENT)
public class HDImageBuffer implements IImageBuffer {
   public BufferedImage parseUserSkin(BufferedImage texture) {
      if (texture == null) {
         return null;
      } else {
         int imageWidth = texture.getWidth((ImageObserver)null) <= 64 ? 64 : texture.getWidth((ImageObserver)null);
         int imageHeight = texture.getHeight((ImageObserver)null) <= 32 ? 32 : texture.getHeight((ImageObserver)null);
         BufferedImage capeImage = new BufferedImage(imageWidth, imageHeight, 2);
         Graphics graphics = capeImage.getGraphics();
         graphics.drawImage(texture, 0, 0, (ImageObserver)null);
         graphics.dispose();
         return capeImage;
      }
   }

   public void func_152634_a() {
   }
}
