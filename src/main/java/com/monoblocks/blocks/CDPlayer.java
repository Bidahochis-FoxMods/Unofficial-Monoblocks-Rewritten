package com.monoblocks.blocks;

import com.monoblocks.blocks.tileentity.TileEntityCDPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CDPlayer extends BlockContainer {
   @SideOnly(Side.CLIENT)
   private ItemRecord itemRecord;

   public CDPlayer() {
      super(Material.wood);
      this.setBlockName("cdplayer");
      this.setBlockTextureName("monoblocks:cdplayer");
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

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }

   public boolean onBlockActivated(World par1World, EntityPlayer par5EntityPlayer, int par1, int par2, int par3, int par4, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
      if (par1World.getBlockMetadata(par1, par2, par3) == 0) {
         return false;
      } else {
         this.play(par1World, par1, par2, par3, par4, par5EntityPlayer);
         return true;
      }
   }

   public void func_149926_b(World p_149926_1_, int p_149926_2_, int p_149926_3_, int p_149926_4_, ItemStack p_149926_5_) {
      if (!p_149926_1_.isRemote) {
         TileEntityCDPlayer tileentityjukebox = (TileEntityCDPlayer)p_149926_1_.getTileEntity(p_149926_2_, p_149926_3_, p_149926_4_);
         if (tileentityjukebox != null) {
            tileentityjukebox.setRecord(p_149926_5_.copy());
            p_149926_1_.setBlockMetadataWithNotify(p_149926_2_, p_149926_3_, p_149926_4_, 1, 2);
         }
      }

   }

   public void play(World world, int p_149925_2_, int p_149925_3_, int p_149925_4_, int par4, EntityPlayer par5EntityPlayer) {
      if (!world.isRemote) {
         TileEntityCDPlayer tileentityjukebox = (TileEntityCDPlayer)world.getTileEntity(p_149925_2_, p_149925_3_, p_149925_4_);
         if (tileentityjukebox != null) {
            ItemStack itemstack = tileentityjukebox.getRecord();
            if (itemstack != null) {
               world.playAuxSFX(1005, p_149925_2_, p_149925_3_, p_149925_4_, 0);
               world.playRecord((String)null, p_149925_2_, p_149925_3_, p_149925_4_);
               tileentityjukebox.setRecord((ItemStack)null);
               world.setBlockMetadataWithNotify(p_149925_2_, p_149925_3_, p_149925_4_, 0, 2);
               float f = 0.7F;
               double d0 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
               double d1 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.2D + 0.6D;
               double d2 = (double)(world.rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
               ItemStack itemstack1 = itemstack.copy();
               EntityItem entityitem = new EntityItem(world, (double)p_149925_2_ + d0, (double)p_149925_3_ + d1, (double)p_149925_4_ + d2, itemstack1);
               entityitem.delayBeforeCanPickup = 10;
               world.spawnEntityInWorld(entityitem);
               int metadata = world.getBlockMetadata(p_149925_2_, p_149925_4_, par4);
               ItemStack currentItem = par5EntityPlayer.getCurrentEquippedItem();
               if (currentItem != null && currentItem.getItem() == this.itemRecord && metadata < 6) {
                  world.setBlockMetadataWithNotify(p_149925_3_, p_149925_4_, par4, metadata + 1, 2);
               }
            }
         }
      }

   }

   public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
      this.play(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_6_, (EntityPlayer)null);
      super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
   }

   public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_) {
      if (!p_149690_1_.isRemote) {
         super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, 0);
      }

   }

   public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
      return new TileEntityCDPlayer();
   }

   public boolean hasComparatorInputOverride() {
      return true;
   }

   public int func_149736_g(World p_149736_1_, int p_149736_2_, int p_149736_3_, int p_149736_4_, int p_149736_5_) {
      ItemStack itemstack = ((TileEntityCDPlayer)p_149736_1_.getTileEntity(p_149736_2_, p_149736_3_, p_149736_4_)).getRecord();
      return itemstack == null ? 0 : Item.getIdFromItem(itemstack.getItem()) + 1 - Item.getIdFromItem(Items.record_13);
   }
}
