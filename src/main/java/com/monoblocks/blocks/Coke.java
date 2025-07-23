package com.monoblocks.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class Coke extends BlockFluidClassic {
   @SideOnly(Side.CLIENT)
   protected IIcon stillIcon;
   @SideOnly(Side.CLIENT)
   protected IIcon flowingIcon;

   public Coke(Fluid fluid, Material material) {
      super(fluid, material);
      this.setCreativeTab(CreativeTabs.tabMisc);
   }

   public IIcon getIcon(int side, int meta) {
      return side != 0 && side != 1 ? this.flowingIcon : this.stillIcon;
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister register) {
      this.stillIcon = register.registerIcon("monoblocks:redwaterstill");
      this.flowingIcon = register.registerIcon("modid:fluidFlowing");
   }

   public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
      return world.getBlock(x, y, z).getMaterial().isLiquid() ? false : super.canDisplace(world, x, y, z);
   }

   public boolean displaceIfPossible(World world, int x, int y, int z) {
      return world.getBlock(x, y, z).getMaterial().isLiquid() ? false : super.displaceIfPossible(world, x, y, z);
   }
}
