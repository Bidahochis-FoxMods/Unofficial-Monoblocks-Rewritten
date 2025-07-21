package com.monoblocks.blocks;

import net.minecraft.block.BlockSnow;
import net.minecraft.block.material.Material;

public class YellowSnow extends BlockSnow {
   public YellowSnow(Material snow) {
      this.func_149672_a(field_149773_n);
      this.setHardness(10.0F);
      this.setResistance(10.0F);
      this.setBlockName("YellowSnow");
      this.setBlockTextureName("monoblocks:yellowsnow");
   }
}
