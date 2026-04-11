package com.monoblocks;

import cpw.mods.fml.common.IWorldGenerator;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class MonoblocksWorldGen implements IWorldGenerator {
   public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
      switch(world.provider.dimensionId) {
      case 0:
         this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
      default:
      }
   }

   private void generateSurface(World world, Random random, int x, int z) {
      this.addOreSpawn(MBlocksEnum.CopperOre.GetBlock(), world, random, x, z, 16, 16, 4 + random.nextInt(6), 20, 38, 62);
      this.addOreSpawn(MBlocksEnum.SilverOre.GetBlock(), world, random, x, z, 16, 16, 4 + random.nextInt(6), 16, 38, 62);
      this.addOreSpawn(MBlocksEnum.ZincOre.GetBlock(), world, random, x, z, 16, 16, 4 + random.nextInt(6), 27, 38, 62);
      this.addOreSpawn(MBlocksEnum.AluminumOre.GetBlock(), world, random, x, z, 16, 16, 4 + random.nextInt(6), 14, 38, 62);
      this.addOreSpawn(MBlocks.PurpleCrystalOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 15, 38, 62);
      this.addOreSpawn(MBlocks.RedCrystalOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 14, 38, 62);
   }

   private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
      for(int i = 0; i < chanceToSpawn; ++i) {
         int posX = blockXPos + random.nextInt(maxX);
         int posY = minY + random.nextInt(maxY - minY);
         int posZ = blockZPos + random.nextInt(maxZ);
         (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
      }

   }
}
