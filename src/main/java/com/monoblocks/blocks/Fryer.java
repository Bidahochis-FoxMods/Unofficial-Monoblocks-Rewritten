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
      return new TileEntityFryer();
   }

   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:fryer");
   }

   public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
      if (!world.field_72995_K) {
         FMLNetworkHandler.openGui(player, Monoblocks.instance, 0, world, x, y, z);
      }

      return true;
   }

   public static void updateFryerBlockState(boolean active, World worldObj, int xCoord, int yCoord, int zCoord) {
      int i = worldObj.func_72805_g(xCoord, yCoord, zCoord);
      TileEntity tileentity = worldObj.func_147438_o(xCoord, yCoord, zCoord);
      keepInventory = true;
      if (active) {
         worldObj.func_147449_b(xCoord, yCoord, zCoord, MBlocks.Fryer);
      } else {
         worldObj.func_147449_b(xCoord, yCoord, zCoord, MBlocks.Fryer);
      }

      keepInventory = false;
      worldObj.func_72921_c(xCoord, yCoord, zCoord, i, 2);
      if (tileentity != null) {
         tileentity.func_145829_t();
         worldObj.func_147455_a(xCoord, yCoord, zCoord, tileentity);
      }

   }

   public void func_149749_a(World world, int x, int y, int z, Block oldblock, int oldMetadata) {
      if (!keepInventory) {
         TileEntityFryer tileentity = (TileEntityFryer)world.func_147438_o(x, y, z);
         if (tileentity != null) {
            for(int i = 0; i < tileentity.func_70302_i_(); ++i) {
               ItemStack itemstack = tileentity.func_70301_a(i);
               if (itemstack != null) {
                  float f = this.rand.nextFloat() * 0.8F + 0.1F;
                  float f1 = this.rand.nextFloat() * 0.8F + 0.1F;

                  EntityItem item;
                  for(float f2 = this.rand.nextFloat() * 0.8F + 0.1F; itemstack.field_77994_a > 0; world.func_72838_d(item)) {
                     int j = this.rand.nextInt(21) + 10;
                     if (j > itemstack.field_77994_a) {
                        j = itemstack.field_77994_a;
                     }

                     itemstack.field_77994_a -= j;
                     item = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.func_77973_b(), j, itemstack.func_77960_j()));
                     if (itemstack.func_77942_o()) {
                        item.func_92059_d().func_77982_d((NBTTagCompound)itemstack.func_77978_p().func_74737_b());
                     }
                  }
               }
            }

            world.func_147453_f(x, y, z, oldblock);
         }
      }

      super.func_149749_a(world, x, y, z, oldblock, oldMetadata);
   }

   public Item func_149694_d(World world, int x, int y, int z) {
      return Item.getItemFromBlock(MBlocks.Fryer);
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }
}
