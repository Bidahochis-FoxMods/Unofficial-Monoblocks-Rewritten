package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityIronLantern;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class IronLantern extends BlockContainer {
   public IronLantern() {
      super(Material.rock);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(3.0F);
      this.setBlockName("ironlantern");
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.68F, 0.75F, 0.68F);
      this.setStepSound(soundTypeStone);
      this.setLightLevel(0.8F);
   }

   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:iron");
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
      return new TileEntityIronLantern();
   }
}
