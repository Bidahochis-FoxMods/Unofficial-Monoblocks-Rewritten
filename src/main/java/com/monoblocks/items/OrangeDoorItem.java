package com.monoblocks.items;

import com.monoblocks.MBlocks;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.List;

public class OrangeDoorItem extends Item {
   public IIcon[] icons;

   public OrangeDoorItem() {
      this.maxStackSize = 64;
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setUnlocalizedName("Glass Door");
      this.setTextureName("monoblocks:orangedooritem");
   }

   public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float clickX, float clickY, float clickZ) {
      if (side != 1) {
         return false;
      } else {
         ++y;
         Block block;
         switch(itemstack.getItemDamage()) {
         case 0:
            block = MBlocks.OrangeDoor;
            break;
         default:
            block = Blocks.wooden_door;
         }

         if (player.canPlayerEdit(x, y, z, side, itemstack) && player.canPlayerEdit(x, y + 1, z, side, itemstack)) {
            if (!block.canPlaceBlockAt(world, x, y, z)) {
               return false;
            } else {
               int rotate = MathHelper.floor_double((double)((player.rotationYaw + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;
               placeDoorBlock(world, x, y, z, rotate, block);
               --itemstack.stackSize;
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

      int var8 = (world.getBlock(x - var6, y, z - var7).isNormalCube() ? 1 : 0) + (world.getBlock(x - var6, y + 1, z - var7).isNormalCube() ? 1 : 0);
      int var9 = (world.getBlock(x + var6, y, z + var7).isNormalCube() ? 1 : 0) + (world.getBlock(x + var6, y + 1, z + var7).isNormalCube() ? 1 : 0);
      boolean var10 = world.getBlock(x - var6, y, z - var7) == block || world.getBlock(x - var6, y + 1, z - var7) == block;
      boolean var11 = world.getBlock(x + var6, y, z + var7) == block || world.getBlock(x + var6, y + 1, z + var7) == block;
      boolean var12 = false;
      if (var10 && !var11) {
         var12 = true;
      } else if (var9 > var8) {
         var12 = true;
      }

      world.setBlock(x, y, z, block, rotate, 2);
      world.setBlock(x, y + 1, z, block, 8 | (var12 ? 1 : 0), 2);
      world.notifyBlocksOfNeighborChange(x, y, z, block);
      world.notifyBlocksOfNeighborChange(x, y + 1, z, block);
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack itemStack, EntityPlayer player, List datalist, boolean b) {
      datalist.add("Orange stained glass");
   }
}
