package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityOrangeShoplight;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class OrangeShoplight extends BlockContainer {
   public OrangeShoplight() {
      super(Material.iron);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(3.0F);
      this.setBlockName("orangeshoplight");
      this.func_149672_a(field_149777_j);
      this.setLightLevel(1.0F);
   }

   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:gray");
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
      return new TileEntityOrangeShoplight();
   }
}
