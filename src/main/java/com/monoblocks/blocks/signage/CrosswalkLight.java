package com.monoblocks.blocks.signage;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityCrosswalkLight;
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

public class CrosswalkLight extends BlockContainer {
   public CrosswalkLight() {
      super(Material.iron);
      this.setCreativeTab(Monoblocks.monoblocksSignage);
      this.setHardness(2.0F);
      this.setStepSound(soundTypeMetal);
      this.setLightLevel(0.5F);
      this.setBlockName("crosswalklight");
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:crosswalklight");
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

   public boolean hasTileEntity() {
      return true;
   }

   public TileEntity createNewTileEntity(World world, int meta) {
      return new TileEntityCrosswalkLight();
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }
}
