package com.monoblocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MSmelting {
   public static void registerSmelting() {
      GameRegistry.addSmelting(MBlocksEnum.ZincOre.GetBlock(), new ItemStack(MItems.ZincIngot), 0.1F);
      GameRegistry.addSmelting(MBlocksEnum.SilverOre.GetBlock(), new ItemStack(MItems.SilverIngot), 0.3F);
      GameRegistry.addSmelting(MBlocksEnum.CopperOre.GetBlock(), new ItemStack(MItems.CopperIngot), 0.3F);
      GameRegistry.addSmelting(MBlocksEnum.AluminumOre.GetBlock(), new ItemStack(MItems.AluminumIngot), 0.5F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 7), new ItemStack (MBlocksEnum.BlackGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 11), new ItemStack(MBlocksEnum.BlueGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 12), new ItemStack(MBlocksEnum.BrownGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 9), new ItemStack (MBlocksEnum.CyanGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 8), new ItemStack (MBlocksEnum.GrayGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 13), new ItemStack(MBlocksEnum.GreenGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 3), new ItemStack (MBlocksEnum.LblueGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 8), new ItemStack (MBlocksEnum.LgrayGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 5), new ItemStack (MBlocksEnum.LimeGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 2), new ItemStack (MBlocksEnum.MagentaGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 1), new ItemStack (MBlocksEnum.OrangeGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 6), new ItemStack (MBlocksEnum.PinkGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 10), new ItemStack(MBlocksEnum.PurpleGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 14), new ItemStack(MBlocksEnum.RedGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 0), new ItemStack (MBlocksEnum.WhiteGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Blocks.stained_glass, 1, 4), new ItemStack (MBlocksEnum.YellowGlow.GetBlock()), 2.0F);
      GameRegistry.addSmelting(new ItemStack(Items.gunpowder), new ItemStack(MItems.PointlessItem), 2.0F);
      GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(MItems.SteelIngot), 0.7F);
   }

   public static void registerSteel() {
   }
}
