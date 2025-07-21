package com.jadarstudios.developercapes.cape;

import com.google.common.collect.HashBiMap;
import com.google.common.primitives.UnsignedBytes;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.jadarstudios.developercapes.DevCapes;
import com.jadarstudios.developercapes.user.Group;
import com.jadarstudios.developercapes.user.GroupManager;
import com.jadarstudios.developercapes.user.User;
import com.jadarstudios.developercapes.user.UserManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public enum CapeConfigManager {
   INSTANCE;

   protected static BitSet availableIds = new BitSet(256);
   protected HashBiMap<Integer, CapeConfig> configs = HashBiMap.create();

   public void addConfig(int id, CapeConfig config) {
      int realId = claimId(id);
      this.configs.put(id, config);

      try {
         Iterator var4 = config.users.values().iterator();

         while(var4.hasNext()) {
            User u = (User)var4.next();
            UserManager.INSTANCE.addUser(u);
         }

         var4 = config.groups.values().iterator();

         while(var4.hasNext()) {
            Group g = (Group)var4.next();
            GroupManager.INSTANCE.addGroup(g);
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public CapeConfig getConfig(int id) {
      return (CapeConfig)this.configs.get(id);
   }

   public int getIdForConfig(CapeConfig config) {
      return (Integer)this.configs.inverse().get(config);
   }

   public static int getUniqueId() {
      return availableIds.nextClearBit(0);
   }

   public static int claimId(int id) {
      try {
         UnsignedBytes.checkedCast((long)id);
      } catch (IllegalArgumentException var2) {
         var2.printStackTrace();
      }

      boolean isRegistered = availableIds.get(id);
      if (isRegistered) {
         DevCapes.logger.error(String.format("The config ID %d was attempted to be claimed but is already claimed.", id));
      }

      availableIds.set(id);
      return id;
   }

   public CapeConfig parse(String config) {
      CapeConfig instance = new CapeConfig();

      try {
         Map<String, Object> entries = (Map)(new Gson()).fromJson(config, Map.class);
         Iterator var4 = entries.entrySet().iterator();

         while(var4.hasNext()) {
            Entry<String, Object> entry = (Entry)var4.next();
            String nodeName = (String)entry.getKey();
            Object obj = entry.getValue();
            if (obj instanceof Map) {
               Map group = (Map)obj;
               Group g = GroupManager.INSTANCE.parse(nodeName, group);
               if (g != null) {
                  instance.groups.put(g.name, g);
               }
            } else if (obj instanceof String) {
               User u = UserManager.INSTANCE.parse(nodeName, obj);
               if (u != null) {
                  instance.users.put(nodeName, u);
               }
            }
         }
      } catch (JsonSyntaxException var10) {
         var10.printStackTrace();
      }

      return instance;
   }

   public CapeConfig parseFromStream(InputStream is) {
      if (is == null) {
         DevCapes.logger.error("Can't parse a null input stream!");
         return null;
      } else {
         CapeConfig instance = null;

         try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String json;
            for(json = ""; reader.ready(); json = json + reader.readLine()) {
            }

            instance = INSTANCE.parse(json);
         } catch (IOException var13) {
            var13.printStackTrace();
         } finally {
            try {
               is.close();
            } catch (IOException var12) {
            }

         }

         return instance;
      }
   }

   static {
      availableIds.clear(availableIds.size());
   }
}
