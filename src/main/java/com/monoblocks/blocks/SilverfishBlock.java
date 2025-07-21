package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.world.World;

public class SilverfishBlock extends Block {
   public SilverfishBlock() {
      super(Material.rock);
      this.func_149672_a(field_149769_e);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
   }

   public void func_149664_b(World p_149664_1_, int p_149664_2_, int p_149664_3_, int p_149664_4_, int p_149664_5_) {
      if (!p_149664_1_.field_72995_K) {
         EntitySilverfish entitysilverfish = new EntitySilverfish(p_149664_1_);
         entitysilverfish.func_70012_b((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
         p_149664_1_.func_72838_d(entitysilverfish);
         entitysilverfish.func_70656_aK();
      }

      super.func_149664_b(p_149664_1_, p_149664_2_, p_149664_3_, p_149664_4_, p_149664_5_);
   }

   public int func_149745_a(Random p_149745_1_) {
      return 0;
   }

   public void func_149690_a(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_) {
      if (!p_149690_1_.field_72995_K) {
         EntitySilverfish entitysilverfish = new EntitySilverfish(p_149690_1_);
         entitysilverfish.func_70012_b((double)p_149690_2_ + 0.5D, (double)p_149690_3_, (double)p_149690_4_ + 0.5D, 0.0F, 0.0F);
         p_149690_1_.func_72838_d(entitysilverfish);
         entitysilverfish.func_70656_aK();
      }

   }
}
