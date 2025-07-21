package com.monoblocks.blocks;

import com.monoblocks.blocks.tileentity.TileEntityStoneChest;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class StoneChest extends BlockChest {
   private final Random field_149955_b = new Random();

   public StoneChest(int chest) {
      super(chest);
   }

   public void func_149689_a(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
      Block block = p_149689_1_.func_147439_a(p_149689_2_, p_149689_3_, p_149689_4_ - 1);
      Block block1 = p_149689_1_.func_147439_a(p_149689_2_, p_149689_3_, p_149689_4_ + 1);
      Block block2 = p_149689_1_.func_147439_a(p_149689_2_ - 1, p_149689_3_, p_149689_4_);
      Block block3 = p_149689_1_.func_147439_a(p_149689_2_ + 1, p_149689_3_, p_149689_4_);
      byte b0 = 0;
      int l = MathHelper.func_76128_c((double)(p_149689_5_.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      if (l == 0) {
         b0 = 2;
      }

      if (l == 1) {
         b0 = 5;
      }

      if (l == 2) {
         b0 = 3;
      }

      if (l == 3) {
         b0 = 4;
      }

      if (block != this && block1 != this && block2 != this && block3 != this) {
         p_149689_1_.func_72921_c(p_149689_2_, p_149689_3_, p_149689_4_, b0, 3);
      } else {
         if ((block == this || block1 == this) && (b0 == 4 || b0 == 5)) {
            if (block == this) {
               p_149689_1_.func_72921_c(p_149689_2_, p_149689_3_, p_149689_4_ - 1, b0, 3);
            } else {
               p_149689_1_.func_72921_c(p_149689_2_, p_149689_3_, p_149689_4_ + 1, b0, 3);
            }

            p_149689_1_.func_72921_c(p_149689_2_, p_149689_3_, p_149689_4_, b0, 3);
         }

         if ((block2 == this || block3 == this) && (b0 == 2 || b0 == 3)) {
            if (block2 == this) {
               p_149689_1_.func_72921_c(p_149689_2_ - 1, p_149689_3_, p_149689_4_, b0, 3);
            } else {
               p_149689_1_.func_72921_c(p_149689_2_ + 1, p_149689_3_, p_149689_4_, b0, 3);
            }

            p_149689_1_.func_72921_c(p_149689_2_, p_149689_3_, p_149689_4_, b0, 3);
         }
      }

      if (p_149689_6_.func_82837_s()) {
         ((TileEntityStoneChest)p_149689_1_.func_147438_o(p_149689_2_, p_149689_3_, p_149689_4_)).func_145976_a(p_149689_6_.func_82833_r());
      }

   }

   public void func_149695_a(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_) {
      super.func_149695_a(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_5_);
      TileEntityStoneChest tileentitychest = (TileEntityStoneChest)p_149695_1_.func_147438_o(p_149695_2_, p_149695_3_, p_149695_4_);
      if (tileentitychest != null) {
         tileentitychest.func_145836_u();
      }

   }

   public void func_149749_a(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
      TileEntityStoneChest tileentitychest = (TileEntityStoneChest)p_149749_1_.func_147438_o(p_149749_2_, p_149749_3_, p_149749_4_);
      if (tileentitychest != null) {
         for(int i1 = 0; i1 < tileentitychest.func_70302_i_(); ++i1) {
            ItemStack itemstack = tileentitychest.func_70301_a(i1);
            if (itemstack != null) {
               float f = this.field_149955_b.nextFloat() * 0.8F + 0.1F;
               float f1 = this.field_149955_b.nextFloat() * 0.8F + 0.1F;

               EntityItem entityitem;
               for(float f2 = this.field_149955_b.nextFloat() * 0.8F + 0.1F; itemstack.field_77994_a > 0; p_149749_1_.func_72838_d(entityitem)) {
                  int j1 = this.field_149955_b.nextInt(21) + 10;
                  if (j1 > itemstack.field_77994_a) {
                     j1 = itemstack.field_77994_a;
                  }

                  itemstack.field_77994_a -= j1;
                  entityitem = new EntityItem(p_149749_1_, (double)((float)p_149749_2_ + f), (double)((float)p_149749_3_ + f1), (double)((float)p_149749_4_ + f2), new ItemStack(itemstack.func_77973_b(), j1, itemstack.func_77960_j()));
                  float f3 = 0.05F;
                  entityitem.field_70159_w = (double)((float)this.field_149955_b.nextGaussian() * f3);
                  entityitem.field_70181_x = (double)((float)this.field_149955_b.nextGaussian() * f3 + 0.2F);
                  entityitem.field_70179_y = (double)((float)this.field_149955_b.nextGaussian() * f3);
                  if (itemstack.func_77942_o()) {
                     entityitem.func_92059_d().func_77982_d((NBTTagCompound)itemstack.func_77978_p().func_74737_b());
                  }
               }
            }
         }

         p_149749_1_.func_147453_f(p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_);
      }

      super.func_149749_a(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
   }

   public IInventory func_149951_m(World p_149951_1_, int p_149951_2_, int p_149951_3_, int p_149951_4_) {
      Object object = (TileEntityStoneChest)p_149951_1_.func_147438_o(p_149951_2_, p_149951_3_, p_149951_4_);
      if (object == null) {
         return null;
      } else if (p_149951_1_.isSideSolid(p_149951_2_, p_149951_3_ + 1, p_149951_4_, ForgeDirection.DOWN)) {
         return null;
      } else if (func_149953_o(p_149951_1_, p_149951_2_, p_149951_3_, p_149951_4_)) {
         return null;
      } else if (p_149951_1_.func_147439_a(p_149951_2_ - 1, p_149951_3_, p_149951_4_) == this && (p_149951_1_.isSideSolid(p_149951_2_ - 1, p_149951_3_ + 1, p_149951_4_, ForgeDirection.DOWN) || func_149953_o(p_149951_1_, p_149951_2_ - 1, p_149951_3_, p_149951_4_))) {
         return null;
      } else if (p_149951_1_.func_147439_a(p_149951_2_ + 1, p_149951_3_, p_149951_4_) == this && (p_149951_1_.isSideSolid(p_149951_2_ + 1, p_149951_3_ + 1, p_149951_4_, ForgeDirection.DOWN) || func_149953_o(p_149951_1_, p_149951_2_ + 1, p_149951_3_, p_149951_4_))) {
         return null;
      } else if (p_149951_1_.func_147439_a(p_149951_2_, p_149951_3_, p_149951_4_ - 1) != this || !p_149951_1_.isSideSolid(p_149951_2_, p_149951_3_ + 1, p_149951_4_ - 1, ForgeDirection.DOWN) && !func_149953_o(p_149951_1_, p_149951_2_, p_149951_3_, p_149951_4_ - 1)) {
         if (p_149951_1_.func_147439_a(p_149951_2_, p_149951_3_, p_149951_4_ + 1) != this || !p_149951_1_.isSideSolid(p_149951_2_, p_149951_3_ + 1, p_149951_4_ + 1, ForgeDirection.DOWN) && !func_149953_o(p_149951_1_, p_149951_2_, p_149951_3_, p_149951_4_ + 1)) {
            if (p_149951_1_.func_147439_a(p_149951_2_ - 1, p_149951_3_, p_149951_4_) == this) {
               object = new InventoryLargeChest("Large Stone Chest", (TileEntityStoneChest)p_149951_1_.func_147438_o(p_149951_2_ - 1, p_149951_3_, p_149951_4_), (IInventory)object);
            }

            if (p_149951_1_.func_147439_a(p_149951_2_ + 1, p_149951_3_, p_149951_4_) == this) {
               object = new InventoryLargeChest("Large Stone Chest", (IInventory)object, (TileEntityStoneChest)p_149951_1_.func_147438_o(p_149951_2_ + 1, p_149951_3_, p_149951_4_));
            }

            if (p_149951_1_.func_147439_a(p_149951_2_, p_149951_3_, p_149951_4_ - 1) == this) {
               object = new InventoryLargeChest("Large Stone Chest", (TileEntityStoneChest)p_149951_1_.func_147438_o(p_149951_2_, p_149951_3_, p_149951_4_ - 1), (IInventory)object);
            }

            if (p_149951_1_.func_147439_a(p_149951_2_, p_149951_3_, p_149951_4_ + 1) == this) {
               object = new InventoryLargeChest("Large Stone Chest", (IInventory)object, (TileEntityStoneChest)p_149951_1_.func_147438_o(p_149951_2_, p_149951_3_, p_149951_4_ + 1));
            }

            return (IInventory)object;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static boolean func_149953_o(World p_149953_0_, int p_149953_1_, int p_149953_2_, int p_149953_3_) {
      Iterator iterator = p_149953_0_.func_72872_a(EntityOcelot.class, AxisAlignedBB.func_72330_a((double)p_149953_1_, (double)(p_149953_2_ + 1), (double)p_149953_3_, (double)(p_149953_1_ + 1), (double)(p_149953_2_ + 2), (double)(p_149953_3_ + 1))).iterator();

      while(iterator.hasNext()) {
         Entity entity = (Entity)iterator.next();
         EntityOcelot entityocelot = (EntityOcelot)entity;
         if (entityocelot.func_70906_o()) {
            return true;
         }
      }

      return false;
   }

   public TileEntity func_149915_a(World p_149915_1_, int p_149915_2_) {
      TileEntityStoneChest tileentitychest = new TileEntityStoneChest();
      return tileentitychest;
   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister p_149651_1_) {
      this.blockIcon = p_149651_1_.registerIcon("Monoblocks:stonechest");
   }
}
