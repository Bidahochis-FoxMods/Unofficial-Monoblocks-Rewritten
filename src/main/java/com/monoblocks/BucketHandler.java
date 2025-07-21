package com.monoblocks;

import com.monoblocks.fluid.BlockRedWater;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class BucketHandler {
   @SubscribeEvent
   public void onBucketFill(FillBucketEvent e) {
      if (e.world.func_147439_a(e.target.field_72311_b, e.target.field_72312_c, e.target.field_72309_d) instanceof BlockRedWater && e.world.func_72805_g(e.target.field_72311_b, e.target.field_72312_c, e.target.field_72309_d) == 0) {
         e.world.func_147468_f(e.target.field_72311_b, e.target.field_72312_c, e.target.field_72309_d);
         e.result = new ItemStack(MFluids.redwaterbucket);
         e.setResult(Result.ALLOW);
      }

   }
}
