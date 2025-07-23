package com.monoblocks.blocks.signage;

import com.monoblocks.Monoblocks;
import com.monoblocks.SignReg;
import com.monoblocks.utilities.SignSuperclass;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WhiteSignItem extends Item {
   public WhiteSignItem() {
      this.setCreativeTab(Monoblocks.monoblocksSignage);
      this.setUnlocalizedName("whitesign");
      this.setTextureName("monoblocks:whitesign");
   }

   public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float clickX, float clickY, float clickZ) {
      if (side == 0) {
         return false;
      } else if (!world.getBlock(x, y, z).getMaterial().isSolid()) {
         return false;
      } else {
         if (side == 1) {
            ++y;
         }

         if (side == 2) {
            --z;
         }

         if (side == 3) {
            ++z;
         }

         if (side == 4) {
            --x;
         }

         if (side == 5) {
            ++x;
         }

         if (!player.canPlayerEdit(x, y, z, side, stack)) {
            return false;
         } else if (!SignReg.WhiteSign.canPlaceBlockAt(world, x, y, z)) {
            return false;
         } else {
            world.setBlock(x, y, z, SignReg.WhiteSign, 0, 3);
            SignReg.WhiteSign.onBlockPlacedBy(world, x, y, z, player, stack);
            SignSuperclass logic = (SignSuperclass)world.getTileEntity(x, y, z);
            logic.setEquipmentItem(stack);
            --stack.stackSize;
            if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
               player.openGui(Monoblocks.instance, 0, world, x, y, z);
            }

            return true;
         }
      }
   }
}
