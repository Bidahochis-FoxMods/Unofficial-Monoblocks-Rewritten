package com.monoblocks.blocks.lampblocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OldLamp extends Block {
   public OldLamp(int i, Material redstoneLight) {
      super(redstoneLight);
      this.setStepSound(soundTypeGlass);
      this.setHardness(3.0F);
      this.setResistance(3.0F);
      this.setBlockName("Old Lamp");
      this.setBlockTextureName("monoblocks:oldlamp");
      this.setLightLevel(1.0F);
   }

   public boolean isOpaqueCube() {
      return false;
   }
}
