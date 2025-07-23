package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityFryer;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Fryer extends BlockContainer {
   private final boolean isActive;
   private static boolean keepInventory;
   private Random rand = new Random();

   public Fryer(Material material, boolean isActive) {
      super(material);
      this.setHardness(2.0F);
      this.setResistance(5.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.isActive = isActive;
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
      return new TileEntityFryer();
   }

   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:fryer");
   }

   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
      if (!world.isRemote) {
         FMLNetworkHandler.openGui(player, Monoblocks.instance, 0, world, x, y, z);
      }

      return true;
   }

   public static void updateFryerBlockState(boolean active, World worldObj, int xCoord, int yCoord, int zCoord) {
      int i = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
      TileEntity tileentity = worldObj.getTileEntity(xCoord, yCoord, zCoord);
      keepInventory = true;
      if (active) {
         worldObj.setBlock(xCoord, yCoord, zCoord, MBlocks.Fryer);
      } else {
         worldObj.setBlock(xCoord, yCoord, zCoord, MBlocks.Fryer);
      }

      keepInventory = false;
      worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);
      if (tileentity != null) {
         tileentity.validate();
         worldObj.setTileEntity(xCoord, yCoord, zCoord, tileentity);
      }

   }

   public void breakBlock(World world, int x, int y, int z, Block oldblock, int oldMetadata) {
      if (!keepInventory) {
         TileEntityFryer tileentity = (TileEntityFryer)world.getTileEntity(x, y, z);
         if (tileentity != null) {
            for(int i = 0; i < tileentity.getSizeInventory(); ++i) {
               ItemStack itemstack = tileentity.getStackInSlot(i);
               if (itemstack != null) {
                  float f = this.rand.nextFloat() * 0.8F + 0.1F;
                  float f1 = this.rand.nextFloat() * 0.8F + 0.1F;

                  EntityItem item;
                  for(float f2 = this.rand.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; world.spawnEntityInWorld(item)) {
                     int j = this.rand.nextInt(21) + 10;
                     if (j > itemstack.stackSize) {
                        j = itemstack.stackSize;
                     }

                     itemstack.stackSize -= j;
                     item = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));
                     if (itemstack.hasTagCompound()) {
                        item.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                     }
                  }
               }
            }

            world.func_147453_f(x, y, z, oldblock);
         }
      }

      super.breakBlock(world, x, y, z, oldblock, oldMetadata);
   }

   public Item func_149694_d(World world, int x, int y, int z) {
      return Item.getItemFromBlock(MBlocks.Fryer);
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }
}
