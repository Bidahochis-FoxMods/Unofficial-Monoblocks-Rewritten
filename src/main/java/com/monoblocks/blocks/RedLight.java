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

   public int func_149645_b() {
      return -1;
   }

   public int func_149701_w() {
      return 1;
   }

   public boolean func_149662_c() {
      return true;
   }

   public boolean func_149686_d() {
      return false;
   }

   public boolean func_149716_u() {
      return true;
   }

   public TileEntity func_149915_a(World var1, int var2) {
      return new TileEntityRedLight();
   }

   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:redlighton");
   }
}
