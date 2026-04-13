package com.monoblocks.blocks.powerpole;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.baseclass.BasePowerPole;
import com.monoblocks.blocks.tileentity.TileEntityPowerPole8;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class PowerPole8 extends BasePowerPole {
   public PowerPole8() {
      super();
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setHardness(2.0F);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 1.0F, 0.66F);
      this.setBlockName("powerpole8");
      this.setStepSound(soundTypeWood);
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:powerpole8");
   }

   

   public TileEntity createNewTileEntity(World world, int meta) {
      return new TileEntityPowerPole8();
   }

   
}
