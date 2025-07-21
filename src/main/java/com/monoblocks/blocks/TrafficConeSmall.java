package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityTrafficConeSmall;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TrafficConeSmall extends BlockContainer {
   public TrafficConeSmall(Material wood) {
      super(wood);
      this.func_149672_a(field_149766_f);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 0.625F, 0.66F);
      this.setBlockName("Traffic Cone");
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

   public TileEntity func_149915_a(World var1, int var2) {
      return new TileEntityTrafficConeSmall();
   }

   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:orange");
   }
}
