package com.monoblocks.blocks.signage;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.signage.tileentity.TileEntityKmSignKNoPost;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class KmSignKNoPost extends BlockContainer {
   public KmSignKNoPost() {
      super(Material.iron);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(2.0F);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 1.0F, 0.66F);
      this.setBlockName("kmsign130nopost");
   }

   public AxisAlignedBB func_149668_a(World par1World, int par2, int par3, int par4) {
      this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      Entity entity = null;
      return entity instanceof EntityPlayer ? super.func_149668_a(par1World, par2, par3, par4) : null;
   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:130kmh");
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
      return new TileEntityKmSignKNoPost();
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }
}
