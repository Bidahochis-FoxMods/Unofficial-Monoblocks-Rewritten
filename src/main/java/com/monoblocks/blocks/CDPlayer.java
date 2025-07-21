package com.monoblocks.blocks;

import com.monoblocks.blocks.tileentity.TileEntityCDPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CDPlayer extends BlockContainer {
   @SideOnly(Side.CLIENT)
   private ItemRecord itemRecord;

   public CDPlayer() {
      super(Material.wood);
      this.setBlockName("cdplayer");
      this.setBlockTextureName("monoblocks:cdplayer");
   }

   public int func_149645_b() {
      return -1;
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }

   public boolean onBlockActivated(World par1World, EntityPlayer par5EntityPlayer, int par1, int par2, int par3, int par4, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
      if (par1World.func_72805_g(par1, par2, par3) == 0) {
         return false;
      } else {
         this.play(par1World, par1, par2, par3, par4, par5EntityPlayer);
         return true;
      }
   }

   public void func_149926_b(World p_149926_1_, int p_149926_2_, int p_149926_3_, int p_149926_4_, ItemStack p_149926_5_) {
      if (!p_149926_1_.field_72995_K) {
         TileEntityCDPlayer tileentityjukebox = (TileEntityCDPlayer)p_149926_1_.func_147438_o(p_149926_2_, p_149926_3_, p_149926_4_);
         if (tileentityjukebox != null) {
            tileentityjukebox.func_145857_a(p_149926_5_.func_77946_l());
            p_149926_1_.func_72921_c(p_149926_2_, p_149926_3_, p_149926_4_, 1, 2);
         }
      }

   }

   public void play(World world, int p_149925_2_, int p_149925_3_, int p_149925_4_, int par4, EntityPlayer par5EntityPlayer) {
      if (!world.field_72995_K) {
         TileEntityCDPlayer tileentityjukebox = (TileEntityCDPlayer)world.func_147438_o(p_149925_2_, p_149925_3_, p_149925_4_);
         if (tileentityjukebox != null) {
            ItemStack itemstack = tileentityjukebox.func_145856_a();
            if (itemstack != null) {
               world.func_72926_e(1005, p_149925_2_, p_149925_3_, p_149925_4_, 0);
               world.func_72934_a((String)null, p_149925_2_, p_149925_3_, p_149925_4_);
               tileentityjukebox.func_145857_a((ItemStack)null);
               world.func_72921_c(p_149925_2_, p_149925_3_, p_149925_4_, 0, 2);
               float f = 0.7F;
               double d0 = (double)(world.field_73012_v.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
               double d1 = (double)(world.field_73012_v.nextFloat() * f) + (double)(1.0F - f) * 0.2D + 0.6D;
               double d2 = (double)(world.field_73012_v.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
               ItemStack itemstack1 = itemstack.func_77946_l();
               EntityItem entityitem = new EntityItem(world, (double)p_149925_2_ + d0, (double)p_149925_3_ + d1, (double)p_149925_4_ + d2, itemstack1);
               entityitem.field_145804_b = 10;
               world.func_72838_d(entityitem);
               int metadata = world.func_72805_g(p_149925_2_, p_149925_4_, par4);
               ItemStack currentItem = par5EntityPlayer.func_71045_bC();
               if (currentItem != null && currentItem.func_77973_b() == this.itemRecord && metadata < 6) {
                  world.func_72921_c(p_149925_3_, p_149925_4_, par4, metadata + 1, 2);
               }
            }
         }
      }

   }

   public void func_149749_a(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
      this.play(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_6_, (EntityPlayer)null);
      super.func_149749_a(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
   }

   public void func_149690_a(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_) {
      if (!p_149690_1_.field_72995_K) {
         super.func_149690_a(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, 0);
      }

   }

   public TileEntity func_149915_a(World p_149915_1_, int p_149915_2_) {
      return new TileEntityCDPlayer();
   }

   public boolean func_149740_M() {
      return true;
   }

   public int func_149736_g(World p_149736_1_, int p_149736_2_, int p_149736_3_, int p_149736_4_, int p_149736_5_) {
      ItemStack itemstack = ((TileEntityCDPlayer)p_149736_1_.func_147438_o(p_149736_2_, p_149736_3_, p_149736_4_)).func_145856_a();
      return itemstack == null ? 0 : Item.func_150891_b(itemstack.func_77973_b()) + 1 - Item.func_150891_b(Items.field_151096_cd);
   }
}
