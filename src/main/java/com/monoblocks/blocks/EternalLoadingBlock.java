package com.monoblocks.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EternalLoadingBlock extends BlockDirectional {
   @SideOnly(Side.CLIENT)
   private IIcon top;
   @SideOnly(Side.CLIENT)
   private IIcon front;
   public IIcon Side0;
   public IIcon Side1;
   public IIcon Side2;
   public IIcon Side3;
   public IIcon Side4;
   public IIcon Side5;

   public EternalLoadingBlock(int i, Material iron) {
      super(iron);
      this.setBlockName("Block of Eternal Loading");
      this.func_149672_a(field_149777_j);
      this.setResistance(5.0F);
      this.setHardness(5.0F);
   }

   public void func_149651_a(IIconRegister icon) {
      this.Side3 = icon.registerIcon("monoblocks:loading");
      this.Side1 = icon.registerIcon("monoblocks:iron");
      this.Side2 = icon.registerIcon("monoblocks:iron");
      this.Side0 = icon.registerIcon("monoblocks:iron");
      this.Side4 = icon.registerIcon("monoblocks:iron");
      this.Side5 = icon.registerIcon("monoblocks:iron");
   }

   public IIcon getIcon(int side, int meta) {
      if (side == 0) {
         return this.Side0;
      } else if (side == 1) {
         return this.Side1;
      } else if (side == 2) {
         return this.Side2;
      } else if (side == 3) {
         return this.Side3;
      } else if (side == 4) {
         return this.Side4;
      } else {
         return side == 5 ? this.Side5 : null;
      }
   }

   public void func_149726_b(World world, int x, int y, int z) {
      super.func_149726_b(world, x, y, z);
      this.setDefaultDirection(world, x, y, z);
   }

   private void setDefaultDirection(World world, int x, int y, int z) {
      if (!world.field_72995_K) {
         Block b1 = world.func_147439_a(x, y, z - 1);
         Block b2 = world.func_147439_a(x, y, z + 1);
         Block b3 = world.func_147439_a(x - 1, y, z);
         Block b4 = world.func_147439_a(x + 1, y, z);
         byte b0 = 3;
         if (b1.func_149730_j() && !b2.func_149730_j()) {
            b0 = 3;
         }

         if (b2.func_149730_j() && !b1.func_149730_j()) {
            b0 = 2;
         }

         if (b3.func_149730_j() && !b4.func_149730_j()) {
            b0 = 5;
         }

         if (b4.func_149730_j() && !b3.func_149730_j()) {
            b0 = 4;
         }

         world.func_72921_c(x, y, x, b0, 2);
      }

   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entityplayer, ItemStack itemstack) {
      int l = MathHelper.func_76128_c((double)(entityplayer.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      if (l == 0) {
         world.func_72921_c(x, y, z, 2, 2);
      }

      if (l == 1) {
         world.func_72921_c(x, y, z, 5, 2);
      }

      if (l == 2) {
         world.func_72921_c(x, y, z, 3, 2);
      }

      if (l == 3) {
         world.func_72921_c(x, y, z, 4, 2);
      }

   }

   @SideOnly(Side.CLIENT)
   public IIcon func_149673_e(IBlockAccess world, int x, int y, int z, int side) {
      return side == world.func_72805_g(x, y, z) ? this.Side3 : this.Side2;
   }

   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Loading... Loading...");
   }
}
