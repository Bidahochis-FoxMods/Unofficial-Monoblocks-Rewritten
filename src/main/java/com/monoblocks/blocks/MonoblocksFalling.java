package com.monoblocks.blocks;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class MonoblocksFalling extends BlockFalling {
   public MonoblocksFalling() {
      super(Material.sand);
      this.func_149672_a(field_149776_m);
      this.setHardness(0.3F);
      this.setResistance(0.3F);
      this.setBlockName("Golden Sand");
      this.setBlockTextureName("monoblocks:goldensand");
   }
}
