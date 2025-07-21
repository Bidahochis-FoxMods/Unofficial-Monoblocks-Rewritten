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

public class BlueNameSignItem extends Item {
   public BlueNameSignItem() {
      this.func_77637_a(Monoblocks.monoblocksSignage);
      this.func_77655_b("bluenamesign");
      this.func_111206_d("monoblocks:bluenamesign");
   }

   public boolean func_77648_a(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float clickX, float clickY, float clickZ) {
      if (side == 0) {
         return false;
      } else if (!world.func_147439_a(x, y, z).func_149688_o().func_76220_a()) {
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

         if (!player.func_82247_a(x, y, z, side, stack)) {
            return false;
         } else if (!SignReg.BlueNameSign.func_149742_c(world, x, y, z)) {
            return false;
         } else {
            world.func_147465_d(x, y, z, SignReg.BlueNameSign, 0, 3);
            SignReg.BlueNameSign.func_149689_a(world, x, y, z, player, stack);
            SignSuperclass logic = (SignSuperclass)world.func_147438_o(x, y, z);
            logic.setEquipmentItem(stack);
            --stack.field_77994_a;
            if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
               player.openGui(Monoblocks.instance, 0, world, x, y, z);
            }

            return true;
         }
      }
   }
}
