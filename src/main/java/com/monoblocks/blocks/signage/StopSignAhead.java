package com.monoblocks.blocks.signage;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityStopAhead;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class StopSignAhead extends BlockContainer {
   public StopSignAhead() {
      super(Material.iron);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(2.0F);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 1.0F, 0.66F);
      this.setBlockName("Stop Ahead Sign");
   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:stopahead");
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

   public TileEntity func_149915_a(World world, int meta) {
      return new TileEntityStopAhead();
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }
}
