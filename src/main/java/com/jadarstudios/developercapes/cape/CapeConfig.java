package com.jadarstudios.developercapes.cape;

import com.google.gson.Gson;
import com.jadarstudios.developercapes.user.Group;
import com.jadarstudios.developercapes.user.User;
import java.util.HashMap;

public class CapeConfig {
   private Gson parser = new Gson();
   public HashMap<String, Group> groups = new HashMap();
   public HashMap<String, User> users = new HashMap();
}
