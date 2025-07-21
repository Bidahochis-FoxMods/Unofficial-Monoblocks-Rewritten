package com.monoblocks.blocks;

import com.monoblocks.MItems;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class Mud extends Block {
   public Mud(int i, Material ground) {
      super(ground);
      this.func_149672_a(field_149767_g);
      this.setHardness(0.5F);
      this.setResistance(0.5F);
      this.setBlockName("Mud");
      this.setBlockTextureName("monoblocks:mud");
   }

   public AxisAlignedBB func_149668_a(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
      float f = 0.125F;
      return AxisAlignedBB.func_72330_a((double)p_149668_2_, (double)p_149668_3_, (double)p_149668_4_, (double)(p_149668_2_ + 1), (double)((float)(p_149668_3_ + 1) - f), (double)(p_149668_4_ + 1));
   }

   public void func_149670_a(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
      p_149670_5_.field_70159_w *= 0.4D;
      p_149670_5_.field_70179_y *= 0.4D;
   }

   public Item func_149650_a(int metadata, Random random, int fortune) {
      return MItems.MudBall;
   }
}
