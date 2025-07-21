package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlackGlow extends Block {
   public BlackGlow(Material par2Material) {
      super(par2Material);
      this.setCreativeTab(Monoblocks.monoblocksLighting);
      this.setBlockName("Black Glow");
      this.setHardness(2.5F);
      this.setResistance(500.0F);
      this.setLightLevel(1.0F);
      this.func_149672_a(field_149778_k);
      this.setBlockTextureName("monoblocks:blackglow");
   }

   @SideOnly(Side.CLIENT)
   public int func_149701_w() {
      return 1;
   }

   @SideOnly(Side.CLIENT)
   public boolean func_149662_c() {
      return false;
   }
}
