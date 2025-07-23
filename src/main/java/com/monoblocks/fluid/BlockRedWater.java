package com.monoblocks.fluid;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockRedWater extends BlockFluidClassic {
   @SideOnly(Side.CLIENT)
   protected IIcon[] fluidIcons;

   public BlockRedWater(Fluid fluid, Material material) {
      super(fluid, material);
      this.setCreativeTab(Monoblocks.monoblocksTab);
   }

   public String getUnlocalizedName() {
      return "redwater";
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister register) {
      this.fluidIcons = new IIcon[]{register.registerIcon("monoblocks:redwaterstill"), register.registerIcon("monoblocks:redwaterflowing")};
   }

   public IIcon getIcon(int side, int meta) {
      return side != 0 && side != 1 ? this.fluidIcons[1] : this.fluidIcons[0];
   }
}
