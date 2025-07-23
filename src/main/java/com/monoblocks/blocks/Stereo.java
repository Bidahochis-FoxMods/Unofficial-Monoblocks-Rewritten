package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityStereo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Stereo extends BlockContainer {
   public static ArrayList records = new ArrayList();

   public Stereo() {
      super(Material.wood);
      this.setBlockName("stereo");
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 0.34F, 0.66F);
      records.add(new ItemStack(Items.record_13));
      records.add(new ItemStack(Items.record_blocks));
      records.add(new ItemStack(Items.record_cat));
      records.add(new ItemStack(Items.record_chirp));
      records.add(new ItemStack(Items.record_far));
      records.add(new ItemStack(Items.record_mall));
      records.add(new ItemStack(Items.record_mellohi));
      records.add(new ItemStack(Items.record_stal));
      records.add(new ItemStack(Items.record_strad));
      records.add(new ItemStack(Items.record_wait));
      records.add(new ItemStack(Items.record_ward));
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean isFullCube() {
      return false;
   }

   public int getRenderType() {
      return -1;
   }

   public void breakBlock(World par1World, int par2, int par3, int par4, Block par5, int par6) {
      this.ejectRecord(par1World, par2, par3, par4);
      super.breakBlock(par1World, par2, par3, par4, par5, par6);
   }

   public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      if (!par1World.isRemote) {
         TileEntity tile_entity = par1World.getTileEntity(par2, par3, par4);
         if (tile_entity instanceof TileEntityStereo) {
            TileEntityStereo tileEntityStereo = (TileEntityStereo)tile_entity;
            if (!par5EntityPlayer.isSneaking()) {
               if (tileEntityStereo.count == 13) {
                  tileEntityStereo.count = records.size();
               } else {
                  ++tileEntityStereo.count;
               }

               if (tileEntityStereo.count == records.size()) {
                  tileEntityStereo.count = 0;
                  tileEntityStereo.setRecord((ItemStack)records.get(0));
               } else {
                  tileEntityStereo.setRecord((ItemStack)records.get(tileEntityStereo.count));
               }

               ItemStack itemstack = (ItemStack)records.get(tileEntityStereo.count);
               par1World.playAuxSFXAtEntity((EntityPlayer)null, 1005, par2, par3, par4, Item.getIdFromItem(itemstack.getItem()));
            } else if (tileEntityStereo.count != 13) {
               tileEntityStereo.count = 13;
               par5EntityPlayer.addChatComponentMessage(new ChatComponentText("It's off mate."));
               par1World.playAuxSFX(1005, par2, par3, par4, 0);
               par1World.playRecord((String)null, par2, par3, par4);
               tileEntityStereo.setRecord((ItemStack)null);
            } else {
               par5EntityPlayer.addChatComponentMessage(new ChatComponentText("It's off mate."));
            }
         }
      }

      return true;
   }

   public void ejectRecord(World par1World, int par2, int par3, int par4) {
      if (!par1World.isRemote) {
         TileEntityStereo tileentitystereo = (TileEntityStereo)par1World.getTileEntity(par2, par3, par4);
         if (tileentitystereo != null) {
            par1World.playAuxSFX(1005, par2, par3, par4, 0);
            par1World.playRecord((String)null, par2, par3, par4);
            tileentitystereo.setRecord((ItemStack)null);
         }
      }

   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:stereo");
   }

   public TileEntity createNewTileEntity(World var1, int var2) {
      return new TileEntityStereo();
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }
}
