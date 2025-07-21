package com.jadarstudios.developercapes.user;

import com.jadarstudios.developercapes.DevCapes;
import com.jadarstudios.developercapes.cape.CapeManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public enum GroupManager {
   INSTANCE;

   private HashMap<String, Group> groups = new HashMap();

   public void addGroup(Group group) {
      this.groups.put(group.name, group);

      try {
         UserManager.INSTANCE.addUsers(new HashSet(group.users.values()));
         CapeManager.INSTANCE.addCape(group.cape);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public Group getGroup(String capeName) {
      return (Group)this.groups.get(capeName);
   }

   public Group newInstance(String name) {
      if (this.getGroup(name) != null) {
         return this.getGroup(name);
      } else {
         Group group = new Group(name);
         return group;
      }
   }

   public Group parse(String name, Map<String, Object> data) {
      Group group = new Group(name);
      Object usersObj = data.get("users");
      Object capeUrlObj = data.get("capeUrl");
      if (usersObj instanceof ArrayList && capeUrlObj instanceof String) {
         ArrayList users = (ArrayList)usersObj;
         String capeUrl = (String)capeUrlObj;
         group.cape = CapeManager.INSTANCE.parse(name, capeUrl);
         Iterator var8 = users.iterator();

         while(var8.hasNext()) {
            Object obj = var8.next();
            User user = UserManager.INSTANCE.parse(obj, group.cape);
            if (user != null) {
               group.addUser(user);
            }
         }

         return group;
      } else {
         DevCapes.logger.error(String.format("Group %s could not be parsed because it either is invalid or missing elements.", name));
         return null;
      }
   }
}
