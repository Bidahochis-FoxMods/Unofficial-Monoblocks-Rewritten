package com.monoblocks.container;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class ShowcaseSlot extends Slot {
   final ContainerShowcase showcase;

   public ShowcaseSlot(ContainerShowcase showcaseContainer, IInventory iInventory, int i, int j, int k) {
      super(iInventory, i, j, k);
      this.showcase = showcaseContainer;
   }

   public int func_75219_a() {
      return 64;
   }
}
