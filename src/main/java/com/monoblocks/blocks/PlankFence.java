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

public class PlankFence extends BlockFence {
   @SideOnly(Side.CLIENT)
   private IIcon[] texture;
   static final String[] subBlocks = new String[]{"blackplanks_0", "blueplanks_0", "cyanplanks_0", "brownplanks_0", "grayplanks_0", "greenplanks_0", "lblueplanks_0", "lgrayplanks_0", "limeplanks_0", "magentaplanks_0", "orangeplanks_0", "pinkplanks_0", "purpleplanks_0", "redplanks_0", "yellowplanks_0", "whiteplanks_0"};

   public PlankFence() {
      super("", Material.wood);
      this.setStepSound(soundTypeWood);
      this.setHardness(1.5F);
      this.setResistance(3.0F);
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
