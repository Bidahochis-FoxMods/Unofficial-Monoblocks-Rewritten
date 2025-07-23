package com.jadarstudios.developercapes;

import com.jadarstudios.developercapes.cape.CapeConfig;
import com.jadarstudios.developercapes.cape.CapeConfigManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import net.minecraftforge.common.MinecraftForge;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DevCapes {
   private static DevCapes instance;
   public static final Logger logger = LogManager.getLogger("DevCapes");

   protected DevCapes() {
      MinecraftForge.EVENT_BUS.register(new RenderEventHandler());
   }

   public static DevCapes getInstance() {
      if (instance == null) {
         instance = new DevCapes();
      }

      return instance;
   }

   public InputStream getStreamForURL(URL url) {
      InputStream is = null;

      try {
         URLConnection connection = url.openConnection();
         connection.setRequestProperty("User-Agent", System.getProperty("java.version"));
         connection.connect();
         is = connection.getInputStream();
         return is;
      } catch (IOException var7) {
         var7.printStackTrace();
         return is;
      } finally {
         ;
      }
   }

   public InputStream getStreamForFile(File file) {
      FileInputStream is = null;

      try {
         is = new FileInputStream(file);
         return is;
      } catch (FileNotFoundException var7) {
         var7.printStackTrace();
         return is;
      } finally {
         ;
      }
   }

   /** @deprecated */
   @Deprecated
   public int registerConfig(String jsonURL, String identifier) {
      return this.registerConfig(jsonURL);
   }

   public int registerConfig(String jsonUrl) {
      byte id = -1;

      try {
         URL url = new URL(jsonUrl);
          return this.registerConfig(url);
      } catch (MalformedURLException var7) {
         var7.printStackTrace();
         return id;
      } finally {
         ;
      }
   }

   /** @deprecated */
   @Deprecated
   public int registerConfig(URL url, String identifier) {
      return this.registerConfig(url);
   }

   public int registerConfig(URL jsonUrl) {
      InputStream is = this.getStreamForURL(jsonUrl);
      CapeConfig config = CapeConfigManager.INSTANCE.parseFromStream(is);
      int id = CapeConfigManager.getUniqueId();
      CapeConfigManager.INSTANCE.addConfig(id, config);
      return id;
   }
}
