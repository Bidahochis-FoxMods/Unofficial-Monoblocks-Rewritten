package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class GreenGlow extends Block {
   public GreenGlow(Material par2Material) {
      super(par2Material);
      this.setCreativeTab(Monoblocks.monoblocksLighting);
      this.setBlockName("Green Glow");
      this.setHardness(2.5F);
      this.setResistance(500.0F);
      this.setLightLevel(1.0F);
      this.setStepSound(soundTypeGlass);
      this.setBlockTextureName("monoblocks:greenglow");
   }

   @SideOnly(Side.CLIENT)
   public int getRenderBlockPass() {
      return 1;
   }

   @SideOnly(Side.CLIENT)
   public boolean isOpaqueCube() {
      return false;
   }

   public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, 1 - par5);
   }
}
