package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AluminumOre extends Block {
   public AluminumOre(int i, Material rock) {
      super(rock);
      this.setStepSound(soundTypeStone);
      this.setHardness(9.0F);
      this.setResistance(9.0F);
      this.setBlockName("Aluminum Ore");
      this.setBlockTextureName("monoblocks:aluminumore");
   }
}
