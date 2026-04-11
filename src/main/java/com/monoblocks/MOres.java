package com.monoblocks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class MOres
{
   public MOres()
   {
      OreDictionary.registerOre("ingotSilver", new ItemStack(MItems.SilverIngot));
      OreDictionary.registerOre("ingotZinc", new ItemStack(MItems.ZincIngot));
      OreDictionary.registerOre("ingotCopper", new ItemStack(MItems.CopperIngot));
      OreDictionary.registerOre("ingotSteel", new ItemStack(MItems.SteelIngot));
      OreDictionary.registerOre("ingotAluminum", new ItemStack(MItems.AluminumIngot));
      OreDictionary.registerOre("gemRedCrystal", new ItemStack(MItems.RedCrystal));
      OreDictionary.registerOre("gemPurpleCrystal", new ItemStack(MItems.PurpleCrystal));
      OreDictionary.registerOre("dyeFlesh", new ItemStack(MItems.FleshDye));
      OreDictionary.registerOre("dyeRainbow", new ItemStack(MItems.RainbowDye));
      OreDictionary.registerOre("oreSilver", new ItemStack(MBlocksEnum.SilverOre.GetBlock()));
      OreDictionary.registerOre("oreZinc", new ItemStack(MBlocksEnum.ZincOre.GetBlock()));
      OreDictionary.registerOre("oreCopper", new ItemStack(MBlocksEnum.CopperOre.GetBlock()));
      OreDictionary.registerOre("oreAluminum", new ItemStack(MBlocksEnum.AluminumOre.GetBlock()));
      OreDictionary.registerOre("oreRedCrystal", new ItemStack(MBlocks.RedCrystalOre));
      OreDictionary.registerOre("orePurpleCrystal", new ItemStack(MBlocks.PurpleCrystalOre));
   }
}
