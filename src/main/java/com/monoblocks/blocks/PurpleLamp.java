package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.blocks.tileentity.TileEntityPurpleLamp;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PurpleLamp extends Block implements ITileEntityProvider {
   private final boolean isOn;

   public PurpleLamp(boolean isOn) {
      super(Material.redstoneLight);
      this.isOn = isOn;
      if (isOn) {
         this.setLightLevel(1.0F);
         this.setBlockName("Purple Lamp");
      }

   }

   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("Monoblocks:" + (this.isOn ? "purplelampon" : "purplelamp"));
   }

   public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      if (this.isOn) {
         par1World.setBlock(par2, par3, par4, MBlocks.PurpleLamp, 0, 3);
      } else {
         par1World.setBlock(par2, par3, par4, MBlocks.PurpleLampOn, 0, 3);
      }

      return true;
   }

   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
      return new ItemStack(MBlocks.PurpleLamp);
   }

   public Item getItemDropped(int i, Random random, int j) {
      return Item.getItemFromBlock(MBlocks.PurpleLamp);
   }

   protected ItemStack createStackedBlock(int i) {
      return new ItemStack(MBlocks.PurpleLamp);
   }

   @SideOnly(Side.CLIENT)
   public int getRenderBlockPass() {
      return this.isOn ? 0 : 1;
   }

   @SideOnly(Side.CLIENT)
   public boolean isOpaqueCube() {
      return false;
   }

   public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, 1 - par5);
   }

   public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
      return this.isOn ? new TileEntityPurpleLamp() : null;
   }
}
