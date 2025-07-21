package com.monoblocks;

import com.monoblocks.blocks.StoneChest;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ChestReg {
   public static Block StoneChest;

   public static void mainRegistry() {
      initialiseBlock();
      registerBlock();
   }

   public static void initialiseBlock() {
      StoneChest = (new StoneChest(0)).setBlockName("Stone Chest").setCreativeTab(Monoblocks.monoblocksTab).setBlockTextureName("monoblocks:stonechest");
   }

   public static void registerBlock() {
      GameRegistry.registerBlock(StoneChest, StoneChest.func_149739_a());
      GameRegistry.addRecipe(new ItemStack(StoneChest, 2), new Object[]{"AAA", "AXA", "AAA", 'X', new ItemStack(Blocks.field_150486_ae), 'A', new ItemStack(Blocks.field_150347_e)});
   }
}
