package com.monoblocks.blocks;

import com.monoblocks.FenceRender;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class GlowFence extends BlockFence {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;
   static final String[] subBlocks = new String[]{"blackglow_0", "blueglow_0", "cyanglow_0", "brownglow_0", "grayglow_0", "greenglow_0", "lblueglow_0", "lgrayglow_0", "limeglow_0", "magentaglow_0", "orangeglow_0", "pinkglow_0", "purpleglow_0", "redglow_0", "yellowglow_0", "whiteglow_0"};

   public GlowFence() {
      super("", Material.glass);
      this.setStepSound(soundTypeGlass);
      this.setHardness(1.5F);
      this.setResistance(2.0F);
      this.setLightLevel(1.0F);
      this.setCreativeTab(Monoblocks.monoblocksfences);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.texture = new IIcon[subBlocks.length];

      for(int i = 0; i < subBlocks.length; ++i) {
         this.texture[i] = iconRegister.registerIcon("monoblocks:" + subBlocks[i]);
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

   public int damageDropped(int meta) {
      return meta;
   }

   public int getRenderType() {
      return FenceRender.model;
   }

   public int getRenderBlockPass() {
      return 1;
   }
}
