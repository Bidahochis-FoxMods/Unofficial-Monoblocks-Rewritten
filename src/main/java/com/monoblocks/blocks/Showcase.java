package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityShowcase;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Showcase extends BlockContainer {
   public static Block instance;
   private Random random;

   public Showcase(Material material) {
      super(material);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockName("showcase");
      this.setBlockTextureName("glass");
      this.random = new Random();
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public int getRenderType() {
      return -1;
   }

   public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return true;
   }

   public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6) {
      TileEntityShowcase var7 = (TileEntityShowcase)par1World.getTileEntity(par2, par3, par4);
      if (var7 != null) {
         for(int var8 = 0; var8 < var7.getSizeInventory(); ++var8) {
            ItemStack var9 = var7.getStackInSlot(var8);
            if (var9 != null) {
               float var10 = this.random.nextFloat() * 0.8F + 0.1F;
               float var11 = this.random.nextFloat() * 0.8F + 0.1F;

               EntityItem var14;
               for(float var12 = this.random.nextFloat() * 0.8F + 0.1F; var9.stackSize > 0; par1World.spawnEntityInWorld(var14)) {
                  int var13 = this.random.nextInt(21) + 10;
                  if (var13 > var9.stackSize) {
                     var13 = var9.stackSize;
                  }

                  var9.stackSize -= var13;
                  var14 = new EntityItem(par1World, (double)((float)par2 + var10), (double)((float)par3 + var11), (double)((float)par4 + var12), new ItemStack(var9.getItem(), var13, var9.getItemDamage()));
                  float var15 = 0.05F;
                  var14.motionX = (double)((float)this.random.nextGaussian() * var15);
                  var14.motionY = (double)((float)this.random.nextGaussian() * var15 + 0.2F);
                  var14.motionZ = (double)((float)this.random.nextGaussian() * var15);
                  if (var9.hasTagCompound()) {
                     var14.getEntityItem().setTagCompound((NBTTagCompound)var9.getTagCompound().copy());
                  }
               }
            }
         }
      }

      super.breakBlock(par1World, par2, par3, par4, par5, par6);
   }

   public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      TileEntity tile_entity = par1World.getTileEntity(par2, par3, par4);
      if (tile_entity != null && !par5EntityPlayer.isSneaking()) {
         par5EntityPlayer.openGui(Monoblocks.instance, 0, par1World, par2, par3, par4);
         return true;
      } else {
         return false;
      }
   }

   public TileEntity createNewTileEntity(World var1, int var2) {
      return new TileEntityShowcase();
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }
}
