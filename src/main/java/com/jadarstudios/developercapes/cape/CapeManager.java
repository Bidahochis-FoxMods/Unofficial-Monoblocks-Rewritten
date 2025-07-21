package com.jadarstudios.developercapes.cape;

import com.jadarstudios.developercapes.DevCapes;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public enum CapeManager {
   INSTANCE;

   private HashMap<String, ICape> capes = new HashMap();

   public void addCape(ICape cape) {
      if (!this.capes.containsValue(cape)) {
         this.capes.put(cape.getName(), cape);
      }

   }

   public void addCapes(Collection<ICape> capes) {
      Iterator var2 = capes.iterator();

      while(var2.hasNext()) {
         ICape c = (ICape)var2.next();
         this.addCape(c);
      }

   }

   public ICape getCape(String capeName) {
      return (ICape)this.capes.get(capeName);
   }

   public ICape newInstance(String name) {
      StaticCape cape = new StaticCape(name);
      this.capes.put(name, cape);
      return cape;
   }

   public ICape parse(String name, Object object) {
      ICape cape = null;
      if (!(object instanceof String)) {
         DevCapes.logger.error(String.format("Cape, %s, could not be parsed because it is not a String!", object));
         return cape;
      } else {
         try {
            cape = new StaticCape(name, new URL((String)object));
            return cape;
         } catch (MalformedURLException var8) {
            DevCapes.logger.error(String.format("Are you crazy?? %s is not a valid URL!", (String)object));
            var8.printStackTrace();
            return cape;
         } finally {
            ;
         }
      }
   }
}
