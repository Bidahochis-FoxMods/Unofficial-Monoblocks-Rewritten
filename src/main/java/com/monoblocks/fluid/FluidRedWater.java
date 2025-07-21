package com.monoblocks.fluid;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class FluidRedWater extends Fluid {
   public FluidRedWater(String fluidName) {
      super(fluidName);
      FluidRegistry.registerFluid(this);
   }
}
