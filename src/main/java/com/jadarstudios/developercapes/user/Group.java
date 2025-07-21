package com.jadarstudios.developercapes.user;

import com.jadarstudios.developercapes.cape.ICape;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Group {
   protected HashMap<String, User> users = new HashMap();
   protected ICape cape;
   public final String name;

   public Group(String name) {
      this.name = name;
   }

   public void addUser(User user) {
      if (!this.users.containsValue(user)) {
         user.capes.add(this.cape);
         this.users.put(user.username, user);
      }

   }

   public void addUsers(Set<User> users) {
      Iterator var2 = users.iterator();

      while(var2.hasNext()) {
         User user = (User)var2.next();
         this.addUser(user);
      }

   }

   public void removeUser(User user) {
      if (this.users.containsValue(user)) {
         this.users.remove(user);
         user.capes.remove(this.cape);
      }

   }

   public ICape getCape() {
      return this.cape;
   }

   public void setCape(ICape cape) {
      Iterator var2 = this.users.values().iterator();

      while(var2.hasNext()) {
         User user = (User)var2.next();
         user.capes.remove(this.cape);
      }

      this.cape = cape;
   }
}
