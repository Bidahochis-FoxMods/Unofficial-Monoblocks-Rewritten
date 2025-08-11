package com.monoblocks.blocks.powerpole;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityPowerPole2;
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

public class PowerPole2 extends BlockContainer {
   public PowerPole2() {
      super(Material.wood);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(2.0F);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 1.0F, 0.66F);
      this.setBlockName("powerpole2");
      this.setStepSound(soundTypeWood);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:powerpole2");
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

   public TileEntity createNewTileEntity(World world, int meta) {
      return new TileEntityPowerPole2();
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }
}
