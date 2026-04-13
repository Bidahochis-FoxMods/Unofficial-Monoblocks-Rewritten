package com.monoblocks.blocks.signage.kmwarn;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.signage.AbstractKMWarn;
import com.monoblocks.blocks.signage.tileentity.TileEntityKm80Warn;
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

public class Km80Warn extends AbstractKMWarn {
   public Km80Warn() {
      super();
      
      this.setBlockName("80kmwarn");
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:80kmwarn");
   }

   public TileEntity createNewTileEntity(World world, int meta) {
      return new TileEntityKm80Warn();
   }
}
