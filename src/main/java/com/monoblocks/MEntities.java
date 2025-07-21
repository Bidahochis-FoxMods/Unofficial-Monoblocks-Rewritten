package com.monoblocks;

import com.monoblocks.entities.BaconPigEntity;
import com.monoblocks.entities.BlasterEntity;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class MEntities {
   public static void registerEntities() {
      BiomeGenBase[] forest = BiomeDictionary.getBiomesForType(Type.FOREST);
      EntityRegistry.registerModEntity(BlasterEntity.class, "BlasterEntity", 0, Monoblocks.instance, 106, 5, true);
      EntityRegistry.registerModEntity(BaconPigEntity.class, "Baconpig", 1, Monoblocks.instance, 1, 5, true);
      EntityRegistry.addSpawn(BaconPigEntity.class, 10, 8, 12, EnumCreatureType.creature, forest);
   }
}
