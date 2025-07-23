package com.monoblocks.items;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.BlockJukebox;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class Record extends Item {
   private static final Map field_150928_b = new HashMap();
   public final String recordName;
   private static final String __OBFID = "CL_00000057";

   public Record(String p_i45350_1_) {
      this.recordName = p_i45350_1_;
      this.maxStackSize = 1;
      this.setCreativeTab(Monoblocks.monoblocksitems);
      field_150928_b.put("records." + p_i45350_1_, this);
   }

   @SideOnly(Side.CLIENT)
   public IIcon getIconFromDamage(int par1) {
      return this.itemIcon;
   }

   public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
      if (par3World.getBlock(par4, par5, par6) == Blocks.jukebox && par3World.getBlockMetadata(par4, par5, par6) == 0) {
         if (par3World.isRemote) {
            return true;
         } else {
            ((BlockJukebox)Blocks.jukebox).func_149926_b(par3World, par4, par5, par6, par1ItemStack);
            par3World.playAuxSFXAtEntity((EntityPlayer)null, 1005, par4, par5, par6, Item.getIdFromItem(this));
            --par1ItemStack.stackSize;
            return true;
         }
      } else {
         return false;
      }
   }

   @SideOnly(Side.CLIENT)
   public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
      par3List.add(this.getRecordNameLocal());
   }

   @SideOnly(Side.CLIENT)
   public String getRecordNameLocal() {
      return StatCollector.translateToLocal("item.record." + this.recordName + ".desc");
   }

   public EnumRarity getRarity(ItemStack par1ItemStack) {
      return EnumRarity.rare;
   }

   @SideOnly(Side.CLIENT)
   public static Record getRecord(String p_150926_0_) {
      return (Record)field_150928_b.get(p_150926_0_);
   }

   public ResourceLocation getRecordResource(String name) {
      return new ResourceLocation(name);
   }
}
