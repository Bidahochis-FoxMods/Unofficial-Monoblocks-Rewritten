package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Diamond extends Block {
   public Diamond(Material Iron) {
      super(Iron);
      this.setStepSound(soundTypeMetal);
      this.setHardness(10.0F);
      this.setResistance(10.0F);
      this.setBlockName("Diamond Block");
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockTextureName("monoblocks:diamond");
   }
}
