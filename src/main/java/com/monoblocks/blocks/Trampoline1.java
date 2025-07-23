package com.monoblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class Trampoline1 extends Block {
   public Trampoline1() {
      super(Material.rock);
      this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
      this.setBlockName("trampoline1");
      this.setHardness(0.6F);
      this.setStepSound(soundTypeStone);
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public void registerBlockIcons(IIconRegister reg) {
      this.blockIcon = reg.registerIcon("niftyblocks:jumppad");
   }

   public boolean canPlaceBlockAt(World world, int i, int j, int k) {
      return world.isSideSolid(i, j - 1, k, ForgeDirection.UP);
   }

   public void jump(Entity entity) {
      if ((entity instanceof Entity || entity instanceof EntityItem) && entity.motionY < 1.0D) {
         entity.motionY = 0.0D;
         entity.fallDistance = 0.0F;
         entity.addVelocity(0.0D, 1.0D, 0.0D);
      }

   }

   public void onEntityWalking(World world, int i, int j, int k, Entity entity) {
      this.jump(entity);
   }

   public void onEntityCollidedWithBlock(World world, int i, int j, int k, Entity entity) {
      if (entity.posY > (double)j) {
         this.jump(entity);
      }

   }
}
