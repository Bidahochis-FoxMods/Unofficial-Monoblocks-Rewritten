package com.monoblocks.blocks.signage.variable;

import com.monoblocks.MBlocks;
import com.monoblocks.blocks.signage.tileentity.TileEntityVariableSpeedSignB;
import com.monoblocks.blocks.signage.tileentity.TileEntityVariableSpeedSignC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class VariableSpeedSignB extends BlockContainer {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;

   public VariableSpeedSignB() {
      super(Material.wood);
      this.func_149672_a(field_149766_f);
      this.setHardness(1.5F);
      this.setResistance(3.0F);
      this.setLightLevel(1.0F);
      this.setBlockName("variablespeedsign");
   }

   public AxisAlignedBB func_149668_a(World par1World, int par2, int par3, int par4) {
      this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      Entity entity = null;
      return entity instanceof EntityPlayer ? super.func_149668_a(par1World, par2, par3, par4) : null;
   }

   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      par1World.func_147465_d(par2, par3, par4, MBlocks.VariableSpeedSignC, par1World.func_72805_g(par2, par3, par4), 3);
      return true;
   }

   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
      return new ItemStack(MBlocks.VariableSpeedSignA);
   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:40vkmh");
   }

   public void func_149674_a(World world, int x, int y, int z, Random random) {
      if (!world.field_72995_K) {
         world.func_147465_d(x, y, z, MBlocks.VariableSpeedSignB, world.func_72805_g(x, y, z), 2);
      }

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
      return (TileEntity)(!world.field_72995_K ? new TileEntityVariableSpeedSignB() : new TileEntityVariableSpeedSignC());
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }
}
