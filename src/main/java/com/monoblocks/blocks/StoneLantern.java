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
      this.setStepSound(soundTypeStone);
      this.setLightLevel(0.8F);
   }

   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:stone");
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
      return new TileEntityStoneLantern();
   }
}
