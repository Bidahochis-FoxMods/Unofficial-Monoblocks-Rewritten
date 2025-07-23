package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RoughPlastic extends Block {
   public RoughPlastic(Material wood) {
      super(wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("roughplastic");
      this.setBlockTextureName("monoblocks:plastic");
      this.setCreativeTab(Monoblocks.monoblocksTab);
   }
}
