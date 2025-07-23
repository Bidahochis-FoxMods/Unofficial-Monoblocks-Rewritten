package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.item.ItemSnowball;

public class MudBall extends ItemSnowball {
   public MudBall() {
      this.maxStackSize = 16;
      this.setCreativeTab(Monoblocks.monoblocksitems);
      this.setUnlocalizedName("Mud Ball");
      this.setTextureName("monoblocks:mudball");
   }
}
