package com.monoblocks.blocks.signage.kmwarn;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.signage.AbstractKMWarn;
import com.monoblocks.blocks.signage.tileentity.TileEntityKm20Warn;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Km20Warn extends AbstractKMWarn {
   public Km20Warn() {
      super();
      
      this.setBlockName("20kmwarn");
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:20kmwarn");
   }

   public TileEntity createNewTileEntity(World world, int meta) {
      return new TileEntityKm20Warn();
   }
}
