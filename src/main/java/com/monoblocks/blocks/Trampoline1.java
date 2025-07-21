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
      this.func_149672_a(field_149769_e);
   }

   public boolean func_149662_c() {
      return false;
   }

   public void func_149651_a(IIconRegister reg) {
      this.blockIcon = reg.registerIcon("niftyblocks:jumppad");
   }

   public boolean func_149742_c(World world, int i, int j, int k) {
      return world.isSideSolid(i, j - 1, k, ForgeDirection.UP);
   }

   public void jump(Entity entity) {
      if ((entity instanceof Entity || entity instanceof EntityItem) && entity.field_70181_x < 1.0D) {
         entity.field_70181_x = 0.0D;
         entity.field_70143_R = 0.0F;
         entity.func_70024_g(0.0D, 1.0D, 0.0D);
      }

   }

   public void func_149724_b(World world, int i, int j, int k, Entity entity) {
      this.jump(entity);
   }

   public void func_149670_a(World world, int i, int j, int k, Entity entity) {
      if (entity.field_70163_u > (double)j) {
         this.jump(entity);
      }

   }
}
