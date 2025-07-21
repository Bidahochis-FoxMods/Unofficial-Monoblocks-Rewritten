package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityWoodTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class WoodTable extends BlockContainer {
   public WoodTable(Material material) {
      super(material);
      this.func_149672_a(field_149766_f);
      this.setHardness(2.0F);
      this.setResistance(5.0F);
      this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockName("Wooden Table");
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
      return new TileEntityWoodTable();
   }

   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:woodoak");
   }
}
