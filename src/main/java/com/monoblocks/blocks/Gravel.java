package com.monoblocks.blocks;

import com.bidahochi.BlockMod.core.handler.BlockIDs;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

import java.util.Random;

public class Gravel extends BlockFalling
{
   public Gravel(int i, Material ground) {
      super(ground);
      this.setStepSound(soundTypeGravel);
      this.setHardness(0.5F);
      this.setBlockName("Gravel");
      this.setBlockTextureName("monoblocks:gravel");
   }

   /** Added To Eventually just remvoe monoblocks:gravel*/
   public void updateTick(World world, int x, int y, int z, Random random) {
      if (!world.isRemote) {
         world.setBlock(x, y, z, BlockIDs.peagravel.block, world.getBlockMetadata(x, y, z), 2);
      }
   }
}
