package com.monoblocks.blocks.signage.variable;

import com.bidahochi.BlockMod.blocks.scrolling.IFoxBlocksScrollingBlock;
import com.monoblocks.MBlocks;
import com.monoblocks.blocks.signage.tileentity.TileEntityVariableSpeedSignE;
import com.monoblocks.blocks.signage.tileentity.TileEntityVariableSpeedSignF;
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

public class VariableSpeedSignE extends BlockContainer implements IFoxBlocksScrollingBlock {

   @Override
   public int getScrollListID()
   {
      return 100;
   }
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;

   public VariableSpeedSignE() {
      super(Material.wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(1.5F);
      this.setResistance(3.0F);
      this.setLightLevel(1.0F);
      this.setBlockName("variablespeedsign");
   }

   public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
      this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      Entity entity = null;
      return entity instanceof EntityPlayer ? super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4) : null;
   }

   public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      par1World.setBlock(par2, par3, par4, MBlocks.VariableSpeedSignF, par1World.getBlockMetadata(par2, par3, par4), 3);
      return true;
   }

   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
      return new ItemStack(MBlocks.VariableSpeedSignA);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:70vkmh");
   }

   public void updateTick(World world, int x, int y, int z, Random random) {
      if (!world.isRemote) {
         world.setBlock(x, y, z, MBlocks.VariableSpeedSignE, world.getBlockMetadata(x, y, z), 2);
      }

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
      return new TileEntityVariableSpeedSignE();
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }
}
