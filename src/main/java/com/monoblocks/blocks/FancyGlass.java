package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class FancyGlass extends BlockBreakable {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;
   static final String[] subBlocks = new String[]{"blackfancyglass", "bluefancyglass", "cyanfancyglass", "brownfancyglass", "grayfancyglass", "greenfancyglass", "lbluefancyglass", "lgrayfancyglass", "limefancyglass", "magentafancyglass", "orangefancyglass", "pinkfancyglass", "purplefancyglass", "redfancyglass", "yellowfancyglass", "whitefancyglass"};

   public FancyGlass() {
      super("glass", Material.glass, false);
      this.func_149672_a(field_149778_k);
      this.setHardness(2.5F);
      this.setResistance(2.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockName("glass");
   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister iconRegister) {
      this.texture = new IIcon[subBlocks.length];

      for(int i = 0; i < subBlocks.length; ++i) {
         this.texture[i] = iconRegister.registerIcon("Monoblocks:" + subBlocks[i]);
      }

   }

   @SideOnly(Side.CLIENT)
   public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
      for(int i = 0; i < subBlocks.length; ++i) {
         list.add(new ItemStack(block, 1, i));
      }

   }

   @SideOnly(Side.CLIENT)
   public IIcon getIcon(int side, int meta) {
      return this.texture[meta];
   }

   public int func_149692_a(int meta) {
      return meta;
   }

   @SideOnly(Side.CLIENT)
   public static int func_149997_b(int p_149997_0_) {
      return ~p_149997_0_ & 15;
   }

   public int func_149701_w() {
      return 1;
   }

   public boolean func_149686_d() {
      return false;
   }

   public boolean func_149662_c() {
      return false;
   }
}
