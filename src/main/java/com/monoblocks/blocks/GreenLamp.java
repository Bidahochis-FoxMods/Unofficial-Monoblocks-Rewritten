package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.blocks.tileentity.TileEntityGreenLamp;
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
import net.minecraft.world.World;

public class GreenLamp extends Block implements ITileEntityProvider {
   private final boolean isOn;

   public GreenLamp(boolean isOn) {
      super(Material.redstoneLight);
      this.isOn = isOn;
      if (isOn) {
         this.setLightLevel(1.0F);
         this.setBlockName("Green Lamp");
      }

   }

   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("Monoblocks:" + (this.isOn ? "greenlampon" : "greenlamp"));
   }

   public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      if (this.isOn) {
         par1World.setBlock(par2, par3, par4, MBlocks.GreenLamp, 0, 3);
      } else {
         par1World.setBlock(par2, par3, par4, MBlocks.GreenLampOn, 0, 3);
      }

      return true;
   }

   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
      return new ItemStack(MBlocks.GreenLamp);
   }

   public Item getItemDropped(int i, Random random, int j) {
      return Item.getItemFromBlock(MBlocks.GreenLamp);
   }

   protected ItemStack func_149644_j(int i) {
      return new ItemStack(MBlocks.GreenLamp);
   }

   public int func_149701_w() {
      return this.isOn ? 0 : 1;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean isFullCube() {
      return false;
   }

   public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
      return this.isOn ? new TileEntityGreenLamp() : null;
   }
}
