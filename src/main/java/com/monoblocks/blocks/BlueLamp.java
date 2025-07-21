package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.blocks.tileentity.TileEntityBlueLamp;
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

public class BlueLamp extends Block implements ITileEntityProvider {
   private final boolean isOn;

   public BlueLamp(boolean isOn) {
      super(Material.redstoneLight);
      this.isOn = isOn;
      if (isOn) {
         this.setLightLevel(1.0F);
         this.setBlockName("Blue Lamp");
      }

   }

   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("Monoblocks:" + (this.isOn ? "bluelampon" : "bluelamp"));
   }

   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      if (this.isOn) {
         par1World.func_147465_d(par2, par3, par4, MBlocks.BlueLamp, 0, 3);
      } else {
         par1World.func_147465_d(par2, par3, par4, MBlocks.BlueLampOn, 0, 3);
      }

      return true;
   }

   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
      return new ItemStack(MBlocks.BlueLamp);
   }

   public Item func_149650_a(int i, Random random, int j) {
      return Item.getItemFromBlock(MBlocks.BlueLamp);
   }

   protected ItemStack func_149644_j(int i) {
      return new ItemStack(MBlocks.BlueLamp);
   }

   @SideOnly(Side.CLIENT)
   public int func_149701_w() {
      return this.isOn ? 0 : 1;
   }

   @SideOnly(Side.CLIENT)
   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149646_a(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return super.func_149646_a(par1IBlockAccess, par2, par3, par4, 1 - par5);
   }

   public TileEntity func_149915_a(World p_149915_1_, int p_149915_2_) {
      return this.isOn ? new TileEntityBlueLamp() : null;
   }
}
