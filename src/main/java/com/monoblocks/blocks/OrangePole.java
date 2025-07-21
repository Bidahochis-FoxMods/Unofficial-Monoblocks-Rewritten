package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityOrangePost;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class OrangePole extends BlockContainer {
   public OrangePole() {
      super(Material.wood);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(2.0F);
      this.setBlockName("Orange Pole");
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 1.0F, 0.66F);
      this.func_149672_a(field_149766_f);
   }

   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:orange");
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
      return new TileEntityOrangePost();
   }
}
