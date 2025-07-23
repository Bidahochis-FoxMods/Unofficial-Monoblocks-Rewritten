package com.monoblocks;

import com.monoblocks.fluid.BlockRedWater;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.FillBucketEvent;

public class BucketHandler {
   @SubscribeEvent
   public void onBucketFill(FillBucketEvent e) {
      if (e.world.getBlock(e.target.blockX, e.target.blockY, e.target.blockZ) instanceof BlockRedWater && e.world.getBlockMetadata(e.target.blockX, e.target.blockY, e.target.blockZ) == 0) {
         e.world.setBlockToAir(e.target.blockX, e.target.blockY, e.target.blockZ);
         e.result = new ItemStack(MFluids.redwaterbucket);
         e.setResult(Result.ALLOW);
      }

   }
}
