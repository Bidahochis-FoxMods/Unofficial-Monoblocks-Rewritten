package com.monoblocks.blocks;

import com.monoblocks.blocks.tileentity.TileEntityRedLight;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class RedLight extends BlockContainer {
   public RedLight(Material iron) {
      super(iron);
      this.setHardness(6.0F);
      this.setResistance(8.0F);
      this.setLightLevel(1.0F);
   }

   public int getRenderType() {
      return -1;
   }

   public int getRenderBlockPass() {
      return 1;
   }

   public boolean isOpaqueCube() {
      return true;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public boolean hasTileEntity() {
      return true;
   }

   public TileEntity createNewTileEntity(World var1, int var2) {
      return new TileEntityRedLight();
   }

   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:redlighton");
   }
}
