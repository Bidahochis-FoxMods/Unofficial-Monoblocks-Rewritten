package com.monoblocks.blocks;

import com.monoblocks.entities.EntitySittableBlock;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class SittableBlock extends BlockContainer {
   public SittableBlock(Material par2Material) {
      super(par2Material);
   }

   public boolean sitOnBlock(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, double par6) {
      this.checkForExistingEntity(par1World, par2, par3, par4, par5EntityPlayer);
      EntitySittableBlock nemb = new EntitySittableBlock(par1World, (double)par2, (double)par3, (double)par4, par6);
      par1World.func_72838_d(nemb);
      par5EntityPlayer.func_70078_a(nemb);
      return true;
   }

   public boolean sitOnBlockWithRotationOffset(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, double par6, int metadata, double offset) {
      if (!this.checkForExistingEntity(par1World, par2, par3, par4, par5EntityPlayer)) {
         EntitySittableBlock nemb = new EntitySittableBlock(par1World, (double)par2, (double)par3, (double)par4, par6, metadata, offset);
         par1World.func_72838_d(nemb);
         par5EntityPlayer.func_70078_a(nemb);
      }

      return true;
   }

   public boolean checkForExistingEntity(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer) {
      List<EntitySittableBlock> listEMB = par1World.func_72872_a(EntitySittableBlock.class, AxisAlignedBB.func_72330_a((double)par2, (double)par3, (double)par4, (double)par2 + 1.0D, (double)par3 + 1.0D, (double)par4 + 1.0D).func_72314_b(1.0D, 1.0D, 1.0D));
      Iterator var7 = listEMB.iterator();

      EntitySittableBlock mount;
      do {
         if (!var7.hasNext()) {
            return false;
         }

         mount = (EntitySittableBlock)var7.next();
      } while(mount.blockPosX != par2 || mount.blockPosY != par3 || mount.blockPosZ != par4);

      if (mount.field_70153_n == null) {
         par5EntityPlayer.func_70078_a(mount);
      }

      return true;
   }

   public TileEntity func_149915_a(World p_149915_1_, int p_149915_2_) {
      return null;
   }
}
