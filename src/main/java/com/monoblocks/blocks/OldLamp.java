package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OldLamp extends Block {
   public OldLamp(int i, Material redstoneLight) {
      super(redstoneLight);
      this.func_149672_a(field_149778_k);
      this.setHardness(3.0F);
      this.setResistance(3.0F);
      this.setBlockName("Old Lamp");
      this.setBlockTextureName("monoblocks:oldlamp");
      this.setLightLevel(1.0F);
   }

   public boolean func_149662_c() {
      return false;
   }
}
