package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntitySifter;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Sifter extends BlockContainer {
   public Sifter(Material iron) {
      super(iron);
      this.setHardness(2.0F);
      this.setResistance(5.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
   }

   public int getRenderType() {
      return -1;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean isFullCube() {
      return false;
   }

   public boolean hasTileEntity() {
      return true;
   }

   public TileEntity createNewTileEntity(World var1, int var2) {
      return new TileEntitySifter();
   }

   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:iron");
   }

   public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entity, int l, float m, float n, float o) {
      EntityItem entityitem;
      if (entity.inventory.getCurrentItem() != null && entity.inventory.getCurrentItem().getItem() == Item.getItemFromBlock(MBlocks.Mud)) {
         if (entity instanceof EntityPlayer) {
            entity.inventory.consumeInventoryItem(Item.getItemFromBlock(MBlocks.Mud));
         }

         if (!world.isRemote) {
            entityitem = new EntityItem(world, (double)i, (double)j, (double)k, new ItemStack(Item.getItemFromBlock(MBlocks.GoldenSand)));
            entityitem.delayBeforeCanPickup = 5;
            world.spawnEntityInWorld(entityitem);
         }
      }

      if (entity.inventory.getCurrentItem() != null && entity.inventory.getCurrentItem().getItem() == Item.getItemFromBlock(MBlocks.GoldenSand)) {
         if (entity instanceof EntityPlayer) {
            entity.inventory.consumeInventoryItem(Item.getItemFromBlock(MBlocks.GoldenSand));
         }

         if (!world.isRemote) {
            entityitem = new EntityItem(world, (double)i, (double)j, (double)k, new ItemStack(Items.gold_nugget, 2));
            entityitem.delayBeforeCanPickup = 5;
            world.spawnEntityInWorld(entityitem);
         }
      }

      if (entity.inventory.getCurrentItem() != null && entity.inventory.getCurrentItem().getItem() == Item.getItemFromBlock(Blocks.gravel)) {
         if (entity instanceof EntityPlayer) {
            entity.inventory.consumeInventoryItem(Item.getItemFromBlock(Blocks.gravel));
         }

         if (!world.isRemote) {
            entityitem = new EntityItem(world, (double)i, (double)j, (double)k, new ItemStack(Item.getItemFromBlock(MBlocks.Gravel)));
            entityitem.delayBeforeCanPickup = 5;
            world.spawnEntityInWorld(entityitem);
         }
      }

      if (entity.inventory.getCurrentItem() != null && entity.inventory.getCurrentItem().getItem() == Item.getItemFromBlock(Blocks.soul_sand)) {
         if (entity instanceof EntityPlayer) {
            entity.inventory.consumeInventoryItem(Item.getItemFromBlock(Blocks.soul_sand));
         }

         if (!world.isRemote) {
            entityitem = new EntityItem(world, (double)i, (double)j, (double)k, new ItemStack(Item.getItemFromBlock(Blocks.dirt)));
            entityitem.delayBeforeCanPickup = 5;
            world.spawnEntityInWorld(entityitem);
         }
      }

      return true;
   }
}
