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
      this.setStepSound(soundTypeGravel);
      this.setHardness(0.5F);
      this.setResistance(0.5F);
      this.setBlockName("Mud");
      this.setBlockTextureName("monoblocks:mud");
   }

   public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
      float f = 0.125F;
      return AxisAlignedBB.getBoundingBox((double)p_149668_2_, (double)p_149668_3_, (double)p_149668_4_, (double)(p_149668_2_ + 1), (double)((float)(p_149668_3_ + 1) - f), (double)(p_149668_4_ + 1));
   }

   public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
      p_149670_5_.motionX *= 0.4D;
      p_149670_5_.motionZ *= 0.4D;
   }

   public Item getItemDropped(int metadata, Random random, int fortune) {
      return MItems.MudBall;
   }
}
