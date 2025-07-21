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

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public int func_149645_b() {
      return -1;
   }

   public boolean func_149646_a(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return true;
   }

   public void func_149749_a(World par1World, int par2, int par3, int par4, Block par5, int par6) {
      TileEntityShowcase var7 = (TileEntityShowcase)par1World.func_147438_o(par2, par3, par4);
      if (var7 != null) {
         for(int var8 = 0; var8 < var7.func_70302_i_(); ++var8) {
            ItemStack var9 = var7.func_70301_a(var8);
            if (var9 != null) {
               float var10 = this.random.nextFloat() * 0.8F + 0.1F;
               float var11 = this.random.nextFloat() * 0.8F + 0.1F;

               EntityItem var14;
               for(float var12 = this.random.nextFloat() * 0.8F + 0.1F; var9.field_77994_a > 0; par1World.func_72838_d(var14)) {
                  int var13 = this.random.nextInt(21) + 10;
                  if (var13 > var9.field_77994_a) {
                     var13 = var9.field_77994_a;
                  }

                  var9.field_77994_a -= var13;
                  var14 = new EntityItem(par1World, (double)((float)par2 + var10), (double)((float)par3 + var11), (double)((float)par4 + var12), new ItemStack(var9.func_77973_b(), var13, var9.func_77960_j()));
                  float var15 = 0.05F;
                  var14.field_70159_w = (double)((float)this.random.nextGaussian() * var15);
                  var14.field_70181_x = (double)((float)this.random.nextGaussian() * var15 + 0.2F);
                  var14.field_70179_y = (double)((float)this.random.nextGaussian() * var15);
                  if (var9.func_77942_o()) {
                     var14.func_92059_d().func_77982_d((NBTTagCompound)var9.func_77978_p().func_74737_b());
                  }
               }
            }
         }
      }

      super.func_149749_a(par1World, par2, par3, par4, par5, par6);
   }

   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      TileEntity tile_entity = par1World.func_147438_o(par2, par3, par4);
      if (tile_entity != null && !par5EntityPlayer.func_70093_af()) {
         par5EntityPlayer.openGui(Monoblocks.instance, 0, par1World, par2, par3, par4);
         return true;
      } else {
         return false;
      }
   }

   public TileEntity func_149915_a(World var1, int var2) {
      return new TileEntityShowcase();
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }
}
