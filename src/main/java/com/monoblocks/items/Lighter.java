package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Lighter extends Item {
   public Lighter() {
      this.field_77777_bU = 1;
      this.func_77656_e(150);
      this.func_77637_a(Monoblocks.monoblocksitems);
      this.func_77655_b("lighter");
      this.func_111206_d("monoblocks:lighter");
   }

   public boolean func_77648_a(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
      if (p_77648_7_ == 0) {
         --p_77648_5_;
      }

      if (p_77648_7_ == 1) {
         ++p_77648_5_;
      }

      if (p_77648_7_ == 2) {
         --p_77648_6_;
      }

      if (p_77648_7_ == 3) {
         ++p_77648_6_;
      }

      if (p_77648_7_ == 4) {
         --p_77648_4_;
      }

      if (p_77648_7_ == 5) {
         ++p_77648_4_;
      }

      if (!p_77648_2_.func_82247_a(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_)) {
         return false;
      } else {
         if (p_77648_3_.func_147437_c(p_77648_4_, p_77648_5_, p_77648_6_)) {
            p_77648_3_.func_72908_a((double)p_77648_4_ + 0.5D, (double)p_77648_5_ + 0.5D, (double)p_77648_6_ + 0.5D, "fire.ignite", 1.0F, field_77697_d.nextFloat() * 0.4F + 0.8F);
            p_77648_3_.func_147449_b(p_77648_4_, p_77648_5_, p_77648_6_, Blocks.field_150480_ab);
         }

         p_77648_1_.func_77972_a(1, p_77648_2_);
         return true;
      }
   }
}
