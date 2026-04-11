package com.monoblocks.blocks;

import com.monoblocks.FenceRender;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class IronFence extends BlockFence {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;

   public IronFence() {
      super("", Material.iron);
      this.setStepSound(soundTypeMetal);
      this.setHardness(5.5F);
      this.setResistance(7.0F);
      this.setCreativeTab(Monoblocks.monoblocksfences);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.texture = new IIcon[IronTiles.subBlocks.length];

      for(int i = 0; i < IronTiles.subBlocks.length; ++i) {
         this.texture[i] = iconRegister.registerIcon("monoblocks:" + "colorIron/" + IronTiles.subBlocks[i]);
      }

   }

   @SideOnly(Side.CLIENT)
   public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list) {
      for(int i = 0; i < IronTiles.subBlocks.length; ++i) {
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
}
