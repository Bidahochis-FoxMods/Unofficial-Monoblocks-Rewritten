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

public class GlowstoneFence extends BlockFence {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;
   static final String[] subBlocks = new String[]{"blackglowstone_0", "blueglowstone_0", "cyanglowstone_0", "brownglowstone_0", "grayglowstone_0", "greenglowstone_0", "lblueglowstone_0", "lgrayglowstone_0", "limeglowstone_0", "magentaglowstone_0", "orangeglowstone_0", "pinkglowstone_0", "purpleglowstone_0", "redglowstone_0", "yellowglowstone_0", "whiteglowstone_0"};

   public GlowstoneFence() {
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
}
