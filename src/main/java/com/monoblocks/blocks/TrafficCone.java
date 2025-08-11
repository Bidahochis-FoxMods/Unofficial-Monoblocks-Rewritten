package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityTrafficCone;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TrafficCone extends BlockContainer {
   public TrafficCone() {
      super(Material.wood);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(2.0F);
      this.setBlockName("Traffic Cone");
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 1.0F, 0.66F);
      this.setStepSound(soundTypeWood);
   }

   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:orange");
   }

   public int getRenderType() {
      return -1;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public boolean hasTileEntity() {
      return true;
   }

   public TileEntity createNewTileEntity(World world, int meta) {
      return new TileEntityTrafficCone();
   }
}
