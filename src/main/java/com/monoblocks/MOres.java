package com.monoblocks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MOres {
   public static void registerOres() {
      OreDictionary.registerOre("ingotSilver", new ItemStack(MItems.SilverIngot));
      OreDictionary.registerOre("ingotZinc", new ItemStack(MItems.ZincIngot));
      OreDictionary.registerOre("ingotCopper", new ItemStack(MItems.CopperIngot));
      OreDictionary.registerOre("ingotSteel", new ItemStack(MItems.SteelIngot));
      OreDictionary.registerOre("ingotAluminum", new ItemStack(MItems.AluminumIngot));
      OreDictionary.registerOre("gemRedCrystal", new ItemStack(MItems.RedCrystal));
      OreDictionary.registerOre("gemPurpleCrystal", new ItemStack(MItems.PurpleCrystal));
      OreDictionary.registerOre("dyeFlesh", new ItemStack(MItems.FleshDye));
      OreDictionary.registerOre("dyeRainbow", new ItemStack(MItems.RainbowDye));
      OreDictionary.registerOre("oreSilver", new ItemStack(MBlocks.SilverOre));
      OreDictionary.registerOre("oreZinc", new ItemStack(MBlocks.ZincOre));
      OreDictionary.registerOre("oreCopper", new ItemStack(MBlocks.CopperOre));
      OreDictionary.registerOre("oreAluminum", new ItemStack(MBlocks.AluminumOre));
      OreDictionary.registerOre("oreRedCrystal", new ItemStack(MBlocks.RedCrystalOre));
      OreDictionary.registerOre("orePurpleCrystal", new ItemStack(MBlocks.PurpleCrystalOre));
   }
}
