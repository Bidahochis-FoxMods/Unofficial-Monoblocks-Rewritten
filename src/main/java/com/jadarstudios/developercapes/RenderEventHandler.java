package com.jadarstudios.developercapes;

import com.jadarstudios.developercapes.cape.ICape;
import com.jadarstudios.developercapes.user.User;
import com.jadarstudios.developercapes.user.UserManager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent.Specials.Pre;

public class RenderEventHandler {
   @SubscribeEvent
   public void renderPlayer(Pre event) {
      AbstractClientPlayer player = (AbstractClientPlayer)event.entityPlayer;
      UserManager manager = UserManager.INSTANCE;
      User user = manager.getUser(player.getCommandSenderName());
      if (user != null) {
         ICape cape = (ICape)user.capes.get(0);
         if (cape != null) {
            boolean flag = cape.isTextureLoaded(player);
            if (!flag) {
               cape.loadTexture(player);
            }

         }
      }
   }
}
