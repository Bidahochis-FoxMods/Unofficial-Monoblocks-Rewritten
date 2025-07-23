package com.monoblocks.blocks;

import net.minecraft.block.BlockSnowBlock;
import net.minecraft.block.material.Material;

public class YellowSnowBlock extends BlockSnowBlock {
   public YellowSnowBlock(Material snow) {
      this.setStepSound(soundTypeSnow);
      this.setBlockName("YellowSnow");
      this.setBlockTextureName("monoblocks:yellowsnow");
   }
}
