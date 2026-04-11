package com.monoblocks;

import com.bidahochi.BlockMod.plugins.fmp.ForgeMultiPart;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Level;

@Mod(
   modid = "MonoblocksMultipart",
   version = "11.7-UnofficalRewrite-TBEA",
   dependencies = "after:Monoblocks"
)
public class MonoblocksMultipart {
   @EventHandler
   public void Init(FMLInitializationEvent evt) {
      if (Loader.isModLoaded("ForgeMicroblock")) {
         try
         {
            ForgeMultiPart.registerBlocks(MBlocksEnum.values());
            //this.sendComm(new ItemStack(MBlocks.BlackBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BlueBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BrownBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.CyanBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GrayBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GreenBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.Lblue, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.Lgray, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LimeBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.MagentaBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.OrangeBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PinkBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PurpleBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.RedBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.WhiteBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.YellowBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.FleshBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.InvisibleBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.RainbowBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BlackStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BlueStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BrownStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.CyanStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GrayStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GreenStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.Lbluestone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LgrayStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LimeStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.MagentaStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.OrangeStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PinkStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PurpleStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.RedStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.WhiteStone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.YellowStone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.BlackGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.BlueGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.BrownGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.CyanGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.GrayGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.GreenGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.Lblueglowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.Lgrayglowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.LimeGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.MagentaGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.OrangeGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.PinkGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.PurpleGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.RedGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.WhiteGlowstone, 1, 0));
            ////this.sendComm(new ItemStack(MBlocks.YellowGlowstone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BlackStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BlueStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BrownStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.CyanStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GrayStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GreenStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.Lblueglowstone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.Lgrayglowstone, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LimeStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.MagentaStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.OrangeStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PinkStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PurpleStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.RedStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.WhiteStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.YellowStoneBrick, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BlackPlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BluePlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BrownPlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.CyanPlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GrayPlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GreenPlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.Lblueplanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.Lgrayplanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LimePlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.MagentaPlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.OrangePlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PinkPlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PurplePlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.RedPlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.WhitePlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.YellowPlanks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BlackIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BlueIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.BrownIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.CyanIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GrayIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.GreenIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LblueIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LgrayIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LimeIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.MagentaIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.OrangeIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PinkIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.PurpleIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.RedIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.WhiteIron, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.YellowIron, 1, 0));
            this.sendComm(new ItemStack(MBlocks.BlackGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.BlueGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.BrownGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.CyanGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.GrayGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.GreenGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.LblueGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.LgrayGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.LimeGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.MagentaGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.OrangeGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.PinkGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.PurpleGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.RedGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.WhiteGlow, 1, 0));
            this.sendComm(new ItemStack(MBlocks.YellowGlow, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.AluminumBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.CopperBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.SilverBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.SteelBlock, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.ZincBlock, 1, 0));
            this.sendComm(new ItemStack(MBlocks.BlackLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.BlueLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.BrownLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.CyanLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.GrayLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.GreenLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.LblueLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.LgrayLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.LimeLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.MagentaLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.OrangeLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.PinkLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.PurpleLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.RedLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.WhiteLamp, 1, 0));
            this.sendComm(new ItemStack(MBlocks.YellowLamp, 1, 0));
            //this.sendComm(new ItemStack(MBlocksEnum.darkstonebrick.GetBlock(), 1, 0));
            ///this.sendComm(new ItemStack(MBlocks.Granite, 1, 0));
            ///this.sendComm(new ItemStack(MBlocks.SmoothGranite, 1, 0));
            ///this.sendComm(new ItemStack(MBlocks.Andesite, 1, 0));
            ///this.sendComm(new ItemStack(MBlocks.SmoothAndesite, 1, 0));
            ///this.sendComm(new ItemStack(MBlocks.Diorite, 1, 0));
            ///this.sendComm(new ItemStack(MBlocks.SmoothDiorite, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 0));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 1));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 2));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 3));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 4));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 5));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 6));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 7));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 8));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 9));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 10));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 11));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 12));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 13));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 14));
            //this.sendComm(new ItemStack(MBlocks.LowIntensityBlocks, 1, 15));
         } catch (Throwable var4) {
            ModContainer This = FMLCommonHandler.instance().findContainerFor(this);
            FMLLog.log(This.getModId(), Level.WARN, "There was a problem loading %s.", new Object[]{This.getName()});
            var4.printStackTrace();
         }

      }
   }

   private void sendComm(ItemStack data) {
      FMLInterModComms.sendMessage("ForgeMicroblock", "microMaterial", data);
   }
}
