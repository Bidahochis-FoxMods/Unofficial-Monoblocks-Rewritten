package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PurpleCrystalBlock extends Block {
   public PurpleCrystalBlock(int i, Material glass) {
      super(glass);
      this.setStepSound(soundTypeGlass);
      this.setHardness(3.0F);
      this.setResistance(3.0F);
      this.setBlockName("Purple Crystal Block");
      this.setBlockTextureName("monoblocks:purplecrystalblock");
   }
}
