package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class LowIntensityBlocks extends Block {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;
   static final String[] subBlocks = new String[]{"dyeblack", "dyeblue", "dyecyan", "dyebrown", "dyegray", "dyegreen", "dyelblue", "dyelgray", "dyelime", "dyemagenta", "dyeorange", "dyepink", "dyepurple", "dyered", "dyeyellow", "dyewhite"};

   public LowIntensityBlocks() {
      super(Material.wood);
      this.func_149672_a(field_149766_f);
      this.setHardness(1.5F);
      this.setResistance(3.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockName("lowintensity");
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
}
