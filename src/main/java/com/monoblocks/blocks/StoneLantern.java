package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityStoneLantern;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class StoneLantern extends BlockContainer {
   public StoneLantern() {
      super(Material.rock);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(3.0F);
      this.setBlockName("Stone Lantern");
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.68F, 0.75F, 0.68F);
      this.func_149672_a(field_149769_e);
      this.setLightLevel(0.8F);
   }

   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:stone");
   }

   public int func_149645_b() {
      return -1;
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public boolean func_149716_u() {
      return true;
   }

   public TileEntity func_149915_a(World world, int meta) {
      return new TileEntityStoneLantern();
   }
}
