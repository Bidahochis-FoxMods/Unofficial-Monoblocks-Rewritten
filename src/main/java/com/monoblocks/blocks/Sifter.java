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

   public int func_149645_b() {
      return -1;
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public boolean func_149716_u() {
      return true;
   }

   public TileEntity func_149915_a(World var1, int var2) {
      return new TileEntitySifter();
   }

   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:iron");
   }

   public boolean func_149727_a(World world, int i, int j, int k, EntityPlayer entity, int l, float m, float n, float o) {
      EntityItem entityitem;
      if (entity.field_71071_by.func_70448_g() != null && entity.field_71071_by.func_70448_g().func_77973_b() == Item.getItemFromBlock(MBlocks.Mud)) {
         if (entity instanceof EntityPlayer) {
            entity.field_71071_by.func_146026_a(Item.getItemFromBlock(MBlocks.Mud));
         }

         if (!world.field_72995_K) {
            entityitem = new EntityItem(world, (double)i, (double)j, (double)k, new ItemStack(Item.getItemFromBlock(MBlocks.GoldenSand)));
            entityitem.field_145804_b = 5;
            world.func_72838_d(entityitem);
         }
      }

      if (entity.field_71071_by.func_70448_g() != null && entity.field_71071_by.func_70448_g().func_77973_b() == Item.getItemFromBlock(MBlocks.GoldenSand)) {
         if (entity instanceof EntityPlayer) {
            entity.field_71071_by.func_146026_a(Item.getItemFromBlock(MBlocks.GoldenSand));
         }

         if (!world.field_72995_K) {
            entityitem = new EntityItem(world, (double)i, (double)j, (double)k, new ItemStack(Items.field_151074_bl, 2));
            entityitem.field_145804_b = 5;
            world.func_72838_d(entityitem);
         }
      }

      if (entity.field_71071_by.func_70448_g() != null && entity.field_71071_by.func_70448_g().func_77973_b() == Item.getItemFromBlock(Blocks.field_150351_n)) {
         if (entity instanceof EntityPlayer) {
            entity.field_71071_by.func_146026_a(Item.getItemFromBlock(Blocks.field_150351_n));
         }

         if (!world.field_72995_K) {
            entityitem = new EntityItem(world, (double)i, (double)j, (double)k, new ItemStack(Item.getItemFromBlock(MBlocks.Gravel)));
            entityitem.field_145804_b = 5;
            world.func_72838_d(entityitem);
         }
      }

      if (entity.field_71071_by.func_70448_g() != null && entity.field_71071_by.func_70448_g().func_77973_b() == Item.getItemFromBlock(Blocks.field_150425_aM)) {
         if (entity instanceof EntityPlayer) {
            entity.field_71071_by.func_146026_a(Item.getItemFromBlock(Blocks.field_150425_aM));
         }

         if (!world.field_72995_K) {
            entityitem = new EntityItem(world, (double)i, (double)j, (double)k, new ItemStack(Item.getItemFromBlock(Blocks.field_150346_d)));
            entityitem.field_145804_b = 5;
            world.func_72838_d(entityitem);
         }
      }

      return true;
   }
}
