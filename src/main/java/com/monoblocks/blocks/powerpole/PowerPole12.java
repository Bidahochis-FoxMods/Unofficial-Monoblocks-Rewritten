package com.monoblocks.blocks.powerpole;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.baseclass.BasePowerPole;
import com.monoblocks.blocks.tileentity.TileEntityPowerPole12;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class PowerPole12 extends BasePowerPole {
   public PowerPole12() {
      super();
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(2.0F);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 1.0F, 0.66F);
      this.setBlockName("powerpole12");
      this.setStepSound(soundTypeMetal);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:powerpole12");
   }

   

   public TileEntity createNewTileEntity(World world, int meta) {
      return new TileEntityPowerPole12();
   }

   
}
