package com.monoblocks;

import com.monoblocks.fluid.BlockRedWater;
import com.monoblocks.fluid.FluidRedWater;
import com.monoblocks.fluid.RedWaterBucket;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class MFluids {
   public static Fluid redwater;
   public static Block blockredwater;
   public static Item redwaterbucket;

   public static void registerFluids() {
      redwater = new FluidRedWater("redwater");
      blockredwater = (new BlockRedWater(redwater, Material.water)).setCreativeTab(Monoblocks.monoblocksOther);
      GameRegistry.registerBlock(blockredwater, "redwater");
   }

   public static void registerBuckets() {
      redwaterbucket = (new RedWaterBucket(blockredwater)).setUnlocalizedName("redwaterbucket").setTextureName("monoblocks:redwaterbucket");
      GameRegistry.registerItem(redwaterbucket, "redwaterbucket");
      FluidContainerRegistry.registerFluidContainer(redwater, new ItemStack(redwaterbucket), new ItemStack(Items.bucket));
      MinecraftForge.EVENT_BUS.register(new BucketHandler());
   }
}
