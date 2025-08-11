package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityStreetLightPole;
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

public class StreetlightPole extends BlockContainer {
   public StreetlightPole() {
      super(Material.iron);
      this.setStepSound(soundTypeMetal);
      this.setHardness(2.0F);
      this.setResistance(5.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setLightLevel(1.0F);
      this.setBlockName("streetlight");
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

   public TileEntity createNewTileEntity(World var1, int var2) {
      return new TileEntityStreetLightPole();
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:streetlightpole");
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }

   public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
      this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      Entity entity = null;
      return entity instanceof EntityPlayer ? super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4) : null;
   }
}
