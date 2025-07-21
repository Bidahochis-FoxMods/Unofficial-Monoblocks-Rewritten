package com.monoblocks.items;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class OrangeDoorItem extends Item {
   public IIcon[] icons;

   public OrangeDoorItem() {
      this.field_77777_bU = 64;
      this.func_77637_a(Monoblocks.monoblocksTab);
      this.func_77655_b("Glass Door");
      this.func_111206_d("monoblocks:orangedooritem");
   }

   public boolean func_77648_a(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float clickX, float clickY, float clickZ) {
      if (side != 1) {
         return false;
      } else {
         ++y;
         Block block;
         switch(itemstack.func_77960_j()) {
         case 0:
            block = MBlocks.OrangeDoor;
            break;
         default:
            block = Blocks.field_150466_ao;
         }

         if (player.func_82247_a(x, y, z, side, itemstack) && player.func_82247_a(x, y + 1, z, side, itemstack)) {
            if (!block.func_149742_c(world, x, y, z)) {
               return false;
            } else {
               int rotate = MathHelper.func_76128_c((double)((player.field_70177_z + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
               placeDoorBlock(world, x, y, z, rotate, block);
               --itemstack.field_77994_a;
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public static void placeDoorBlock(World world, int x, int y, int z, int rotate, Block block) {
      byte var6 = 0;
      byte var7 = 0;
      if (rotate == 0) {
         var7 = 1;
      }

      if (rotate == 1) {
         var6 = -1;
      }

      if (rotate == 2) {
         var7 = -1;
      }

      if (rotate == 3) {
         var6 = 1;
      }

      int var8 = (world.func_147439_a(x - var6, y, z - var7).func_149721_r() ? 1 : 0) + (world.func_147439_a(x - var6, y + 1, z - var7).func_149721_r() ? 1 : 0);
      int var9 = (world.func_147439_a(x + var6, y, z + var7).func_149721_r() ? 1 : 0) + (world.func_147439_a(x + var6, y + 1, z + var7).func_149721_r() ? 1 : 0);
      boolean var10 = world.func_147439_a(x - var6, y, z - var7) == block || world.func_147439_a(x - var6, y + 1, z - var7) == block;
      boolean var11 = world.func_147439_a(x + var6, y, z + var7) == block || world.func_147439_a(x + var6, y + 1, z + var7) == block;
      boolean var12 = false;
      if (var10 && !var11) {
         var12 = true;
      } else if (var9 > var8) {
         var12 = true;
      }

      world.func_147465_d(x, y, z, block, rotate, 2);
      world.func_147465_d(x, y + 1, z, block, 8 | (var12 ? 1 : 0), 2);
      world.func_147459_d(x, y, z, block);
      world.func_147459_d(x, y + 1, z, block);
   }

   @SideOnly(Side.CLIENT)
   public void func_77624_a(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Orange stained glass");
   }
}
