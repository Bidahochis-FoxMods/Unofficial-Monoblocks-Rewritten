package com.monoblocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MSmelting {
   public static void registerSmelting() {
      GameRegistry.addSmelting(MBlocks.ZincOre, new ItemStack(MItems.ZincIngot), 0.1F);
      GameRegistry.addSmelting(MBlocks.SilverOre, new ItemStack(MItems.SilverIngot), 0.3F);
      GameRegistry.addSmelting(MBlocks.CopperOre, new ItemStack(MItems.CopperIngot), 0.3F);
      GameRegistry.addSmelting(MBlocks.AluminumOre, new ItemStack(MItems.AluminumIngot), 0.5F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 7), new ItemStack(MBlocks.BlackGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 11), new ItemStack(MBlocks.BlueGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 12), new ItemStack(MBlocks.BrownGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 9), new ItemStack(MBlocks.CyanGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 8), new ItemStack(MBlocks.GrayGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 13), new ItemStack(MBlocks.GreenGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 3), new ItemStack(MBlocks.LblueGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 8), new ItemStack(MBlocks.LgrayGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 5), new ItemStack(MBlocks.LimeGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 2), new ItemStack(MBlocks.MagentaGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 1), new ItemStack(MBlocks.OrangeGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 6), new ItemStack(MBlocks.PinkGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 10), new ItemStack(MBlocks.PurpleGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 14), new ItemStack(MBlocks.RedGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 0), new ItemStack(MBlocks.WhiteGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 4), new ItemStack(MBlocks.YellowGlow), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Items.gunpowder), new ItemStack(MItems.PointlessItem), 2.0F);
      GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(MItems.SteelIngot), 0.7F);
   }

   public static void registerSteel() {
   }
}
