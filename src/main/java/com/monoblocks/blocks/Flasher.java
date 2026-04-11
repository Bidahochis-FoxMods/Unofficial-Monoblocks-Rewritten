package com.monoblocks.blocks;

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

public class Flasher extends Block {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;
   static final String[] subBlocks = new String[]{"whiteflasher", "blueflasher", "cyanflasher", "brownflasher", "grayflasher", "greenflasher", "lblueflasher", "lgrayflasher", "limeflasher", "magentaflasher", "orangeflasher", "pinkflasher", "purpleflasher", "redflasher", "yellowflasher", "blackflasher"};

   public Flasher(int i, Material glass) {
      super(glass);
      this.setStepSound(soundTypeGlass);
      this.setHardness(2.0F);
      this.setResistance(2.0F);
      this.setBlockName("Flasher");
      this.setLightLevel(1.0F);
      this.setBlockTextureName("monoblocks:flasher");
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
}
