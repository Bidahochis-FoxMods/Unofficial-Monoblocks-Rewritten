package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class GrayGlow extends Block {
   public GrayGlow(Material par2Material) {
      super(par2Material);
      this.setCreativeTab(Monoblocks.monoblocksLighting);
      this.setBlockName("Gray Glow");
      this.setHardness(2.5F);
      this.setResistance(500.0F);
      this.setLightLevel(1.0F);
      this.func_149672_a(field_149778_k);
      this.setBlockTextureName("monoblocks:grayglow");
   }

   @SideOnly(Side.CLIENT)
   public int func_149701_w() {
      return 1;
   }

   @SideOnly(Side.CLIENT)
   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149646_a(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return super.func_149646_a(par1IBlockAccess, par2, par3, par4, 1 - par5);
   }
}
