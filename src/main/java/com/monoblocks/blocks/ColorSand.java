package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ColorSand extends BlockFalling {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;
   static final String[] subBlocks = new String[]{"blacksand", "bluesand", "cyansand", "brownsand", "graysand", "greensand", "lbluesand", "lgraysand", "limesand", "magentasand", "orangesand", "pinksand", "purplesand", "redsand", "yellowsand", "whitesand"};

   public ColorSand() {
      super(Material.sand);
      this.func_149672_a(field_149776_m);
      this.setHardness(2.5F);
      this.setResistance(2.0F);
      this.setCreativeTab(Monoblocks.monoblocksmcstained);
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
