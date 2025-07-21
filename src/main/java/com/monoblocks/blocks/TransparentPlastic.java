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
import net.minecraft.world.IBlockAccess;

public class TransparentPlastic extends Block {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;
   static final String[] subBlocks = new String[]{"blackplastic", "blueplastic", "cyanplastic", "brownplastic", "grayplastic", "greenplastic", "lblueplastic", "lgrayplastic", "limeplastic", "magentaplastic", "orangeplastic", "pinkplastic", "purpleplastic", "redplastic", "yellowplastic", "whiteplastic"};

   public TransparentPlastic(Material Mat) {
      super(Material.wood);
      this.func_149672_a(field_149766_f);
      this.setHardness(2.5F);
      this.setResistance(2.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
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
   public int func_149701_w() {
      return 1;
   }

   @SideOnly(Side.CLIENT)
   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149646_a(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
      return super.func_149646_a(par1IBlockAccess, par2, par3, par4, 1 - par5);
   }
}
