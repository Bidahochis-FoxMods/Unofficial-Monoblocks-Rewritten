package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PurplePlanks extends Block {
   public PurplePlanks(int i, Material wood) {
      super(wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Purple Planks");
      this.setBlockTextureName("monoblocks:purpleplanks");
   }
}
