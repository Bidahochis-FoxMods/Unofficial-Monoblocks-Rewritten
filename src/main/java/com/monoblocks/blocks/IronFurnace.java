package com.monoblocks.blocks;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityIronFurnace;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class IronFurnace extends BlockContainer {
   private final boolean isActive;
   @SideOnly(Side.CLIENT)
   private IIcon iconFront;
   @SideOnly(Side.CLIENT)
   private IIcon iconTop;
   private static boolean keepInventory;
   private Random rand = new Random();

   public IronFurnace(boolean isActive) {
      super(Material.iron);
      this.isActive = isActive;
   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("Monoblocks:iron");
      this.iconFront = iconRegister.registerIcon("Monoblocks:" + (this.isActive ? "IronFurnaceFrontOn" : "IronFurnaceFrontOff"));
      this.iconTop = iconRegister.registerIcon("Monoblocks:iron");
   }

   @SideOnly(Side.CLIENT)
   public IIcon getIcon(int side, int metadata) {
      return metadata == 0 && side == 3 ? this.iconFront : (side == 1 ? this.iconTop : (side == 0 ? this.iconTop : (side == metadata ? this.iconFront : this.blockIcon)));
   }

   public Item func_149650_a(int i, Random random, int j) {
      return Item.getItemFromBlock(MBlocks.blockIronFurnaceIdle);
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

   public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
      if (!world.field_72995_K) {
         FMLNetworkHandler.openGui(player, Monoblocks.instance, 0, world, x, y, z);
      }

      return true;
   }

   public TileEntity func_149915_a(World world, int i) {
      return new TileEntityIronFurnace();
   }

   @SideOnly(Side.CLIENT)
   public void func_149734_b(World world, int x, int y, int z, Random random) {
      if (this.isActive) {
         int direction = world.func_72805_g(x, y, z);
         float x1 = (float)x + 0.5F;
         float y1 = (float)y + random.nextFloat();
         float z1 = (float)z + 0.5F;
         float f = 0.52F;
         float f1 = random.nextFloat() * 0.6F - 0.3F;
         if (direction == 4) {
            world.func_72869_a("smoke", (double)(x1 - f), (double)y1, (double)(z1 + f1), 0.0D, 0.0D, 0.0D);
            world.func_72869_a("flame", (double)(x1 - f), (double)y1, (double)(z1 + f1), 0.0D, 0.0D, 0.0D);
         }

         if (direction == 5) {
            world.func_72869_a("smoke", (double)(x1 + f), (double)y1, (double)(z1 + f1), 0.0D, 0.0D, 0.0D);
            world.func_72869_a("flame", (double)(x1 + f), (double)y1, (double)(z1 + f1), 0.0D, 0.0D, 0.0D);
         }

         if (direction == 2) {
            world.func_72869_a("smoke", (double)(x1 + f1), (double)y1, (double)(z1 - f), 0.0D, 0.0D, 0.0D);
            world.func_72869_a("flame", (double)(x1 + f1), (double)y1, (double)(z1 - f), 0.0D, 0.0D, 0.0D);
         }

         if (direction == 3) {
            world.func_72869_a("smoke", (double)(x1 + f1), (double)y1, (double)(z1 + f), 0.0D, 0.0D, 0.0D);
            world.func_72869_a("flame", (double)(x1 + f1), (double)y1, (double)(z1 + f), 0.0D, 0.0D, 0.0D);
         }
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

      if (itemstack.func_82837_s()) {
         ((TileEntityIronFurnace)world.func_147438_o(x, y, z)).setGuiDisplayName(itemstack.func_82833_r());
      }

   }

   public static void updateIronFurnaceBlockState(boolean active, World worldObj, int xCoord, int yCoord, int zCoord) {
      int i = worldObj.func_72805_g(xCoord, yCoord, zCoord);
      TileEntity tileentity = worldObj.func_147438_o(xCoord, yCoord, zCoord);
      keepInventory = true;
      if (active) {
         worldObj.func_147449_b(xCoord, yCoord, zCoord, MBlocks.blockIronFurnaceActive);
      } else {
         worldObj.func_147449_b(xCoord, yCoord, zCoord, MBlocks.blockIronFurnaceIdle);
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
         TileEntityIronFurnace tileentity = (TileEntityIronFurnace)world.func_147438_o(x, y, z);
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
      return Item.getItemFromBlock(MBlocks.blockIronFurnaceIdle);
   }
}
