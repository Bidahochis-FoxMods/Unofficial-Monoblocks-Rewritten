package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OrangeBlock extends Block {
   public OrangeBlock(int i, Material wood) {
      super(wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Orange Block");
      this.setBlockTextureName("monoblocks:orange");
   }
}
