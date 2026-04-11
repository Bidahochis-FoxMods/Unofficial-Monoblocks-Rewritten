package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.BlockCarpet;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class IronTiles extends BlockCarpet {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;
   public static final String[] subBlocks = new String[]{"blackiron_0", "blueiron_0", "cyaniron_0", "browniron_0", "grayiron_0", "greeniron_0", "lblueiron_0", "lgrayiron_0", "limeiron_0", "magentairon_0", "orangeiron_0", "pinkiron_0", "purpleiron_0", "rediron_0", "yellowiron_0", "whiteiron_0"};

   public IronTiles() {
      this.setStepSound(soundTypeMetal);
      this.setHardness(1.5F);
      this.setResistance(3.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockName("tile");
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.texture = new IIcon[subBlocks.length];

      for(int i = 0; i < subBlocks.length; ++i) {
         this.texture[i] = iconRegister.registerIcon("monoblocks:" + "colorIron/" + subBlocks[i]);
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
