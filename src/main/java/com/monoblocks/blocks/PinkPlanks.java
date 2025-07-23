package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PinkPlanks extends Block {
   public PinkPlanks(int i, Material wood) {
      super(wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Pink Planks");
      this.setBlockTextureName("monoblocks:pinkplanks");
   }
}
