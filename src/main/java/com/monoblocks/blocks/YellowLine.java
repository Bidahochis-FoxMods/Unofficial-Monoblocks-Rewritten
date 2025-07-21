package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;

public class YellowLine extends Block {
   private boolean field_150181_a = true;
   private Set field_150179_b = new HashSet();
   @SideOnly(Side.CLIENT)
   public static IIcon field_150182_M;
   @SideOnly(Side.CLIENT)
   public static IIcon field_150183_N;
   @SideOnly(Side.CLIENT)
   public static IIcon field_150184_O;
   @SideOnly(Side.CLIENT)
   public static IIcon field_150180_P;

   public YellowLine() {
      super(Material.field_151580_n);
      this.func_149672_a(field_149775_l);
      this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockTextureName("monoblocks:yellowlinespot");
   }

   public AxisAlignedBB func_149668_a(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
      return null;
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public int func_149645_b() {
      return 5;
   }

   public boolean func_149742_c(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_) {
      return World.func_147466_a(p_149742_1_, p_149742_2_, p_149742_3_ - 1, p_149742_4_) || p_149742_1_.func_147439_a(p_149742_2_, p_149742_3_ - 1, p_149742_4_) == Blocks.field_150426_aN;
   }

   private void func_150177_e(World p_150177_1_, int p_150177_2_, int p_150177_3_, int p_150177_4_) {
      this.func_150175_a(p_150177_1_, p_150177_2_, p_150177_3_, p_150177_4_, p_150177_2_, p_150177_3_, p_150177_4_);
      ArrayList arraylist = new ArrayList(this.field_150179_b);
      this.field_150179_b.clear();

      for(int l = 0; l < arraylist.size(); ++l) {
         ChunkPosition chunkposition = (ChunkPosition)arraylist.get(l);
         p_150177_1_.func_147459_d(chunkposition.field_151329_a, chunkposition.field_151327_b, chunkposition.field_151328_c, this);
      }

   }

   private void func_150175_a(World p_150175_1_, int p_150175_2_, int p_150175_3_, int p_150175_4_, int p_150175_5_, int p_150175_6_, int p_150175_7_) {
      int k1 = p_150175_1_.func_72805_g(p_150175_2_, p_150175_3_, p_150175_4_);
      byte b0 = 0;
      int i3 = this.func_150178_a(p_150175_1_, p_150175_5_, p_150175_6_, p_150175_7_, b0);
      this.field_150181_a = false;
      this.field_150181_a = true;
      int i2 = 0;

      for(int j2 = 0; j2 < 4; ++j2) {
         int k2 = p_150175_2_;
         int l2 = p_150175_4_;
         if (j2 == 0) {
            k2 = p_150175_2_ - 1;
         }

         if (j2 == 1) {
            ++k2;
         }

         if (j2 == 2) {
            l2 = p_150175_4_ - 1;
         }

         if (j2 == 3) {
            ++l2;
         }

         if (k2 != p_150175_5_ || l2 != p_150175_7_) {
            i2 = this.func_150178_a(p_150175_1_, k2, p_150175_3_, l2, i2);
         }

         if (p_150175_1_.func_147439_a(k2, p_150175_3_, l2).func_149721_r() && !p_150175_1_.func_147439_a(p_150175_2_, p_150175_3_ + 1, p_150175_4_).func_149721_r()) {
            if ((k2 != p_150175_5_ || l2 != p_150175_7_) && p_150175_3_ >= p_150175_6_) {
               i2 = this.func_150178_a(p_150175_1_, k2, p_150175_3_ + 1, l2, i2);
            }
         } else if (!p_150175_1_.func_147439_a(k2, p_150175_3_, l2).func_149721_r() && (k2 != p_150175_5_ || l2 != p_150175_7_) && p_150175_3_ <= p_150175_6_) {
            i2 = this.func_150178_a(p_150175_1_, k2, p_150175_3_ - 1, l2, i2);
         }
      }

      if (i2 > i3) {
         i3 = i2 - 1;
      } else if (i3 > 0) {
         --i3;
      } else {
         i3 = 0;
      }

      if (k1 != i3) {
         p_150175_1_.func_72921_c(p_150175_2_, p_150175_3_, p_150175_4_, i3, 2);
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_ - 1, p_150175_3_, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_ + 1, p_150175_3_, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_ - 1, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_ + 1, p_150175_4_));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_, p_150175_4_ - 1));
         this.field_150179_b.add(new ChunkPosition(p_150175_2_, p_150175_3_, p_150175_4_ + 1));
      }

   }

   private void func_150172_m(World p_150172_1_, int p_150172_2_, int p_150172_3_, int p_150172_4_) {
      if (p_150172_1_.func_147439_a(p_150172_2_, p_150172_3_, p_150172_4_) == this) {
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_, p_150172_4_, this);
         p_150172_1_.func_147459_d(p_150172_2_ - 1, p_150172_3_, p_150172_4_, this);
         p_150172_1_.func_147459_d(p_150172_2_ + 1, p_150172_3_, p_150172_4_, this);
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_, p_150172_4_ - 1, this);
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_, p_150172_4_ + 1, this);
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_ - 1, p_150172_4_, this);
         p_150172_1_.func_147459_d(p_150172_2_, p_150172_3_ + 1, p_150172_4_, this);
      }

   }

   public void func_149726_b(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_) {
      super.func_149726_b(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
      if (!p_149726_1_.field_72995_K) {
         this.func_150177_e(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_);
         p_149726_1_.func_147459_d(p_149726_2_, p_149726_3_ + 1, p_149726_4_, this);
         p_149726_1_.func_147459_d(p_149726_2_, p_149726_3_ - 1, p_149726_4_, this);
         this.func_150172_m(p_149726_1_, p_149726_2_ - 1, p_149726_3_, p_149726_4_);
         this.func_150172_m(p_149726_1_, p_149726_2_ + 1, p_149726_3_, p_149726_4_);
         this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_ - 1);
         this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_ + 1);
         if (p_149726_1_.func_147439_a(p_149726_2_ - 1, p_149726_3_, p_149726_4_).func_149721_r()) {
            this.func_150172_m(p_149726_1_, p_149726_2_ - 1, p_149726_3_ + 1, p_149726_4_);
         } else {
            this.func_150172_m(p_149726_1_, p_149726_2_ - 1, p_149726_3_ - 1, p_149726_4_);
         }

         if (p_149726_1_.func_147439_a(p_149726_2_ + 1, p_149726_3_, p_149726_4_).func_149721_r()) {
            this.func_150172_m(p_149726_1_, p_149726_2_ + 1, p_149726_3_ + 1, p_149726_4_);
         } else {
            this.func_150172_m(p_149726_1_, p_149726_2_ + 1, p_149726_3_ - 1, p_149726_4_);
         }

         if (p_149726_1_.func_147439_a(p_149726_2_, p_149726_3_, p_149726_4_ - 1).func_149721_r()) {
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ + 1, p_149726_4_ - 1);
         } else {
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ - 1, p_149726_4_ - 1);
         }

         if (p_149726_1_.func_147439_a(p_149726_2_, p_149726_3_, p_149726_4_ + 1).func_149721_r()) {
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ + 1, p_149726_4_ + 1);
         } else {
            this.func_150172_m(p_149726_1_, p_149726_2_, p_149726_3_ - 1, p_149726_4_ + 1);
         }
      }

   }

   public void func_149749_a(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_) {
      super.func_149749_a(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
      if (!p_149749_1_.field_72995_K) {
         p_149749_1_.func_147459_d(p_149749_2_, p_149749_3_ + 1, p_149749_4_, this);
         p_149749_1_.func_147459_d(p_149749_2_, p_149749_3_ - 1, p_149749_4_, this);
         p_149749_1_.func_147459_d(p_149749_2_ + 1, p_149749_3_, p_149749_4_, this);
         p_149749_1_.func_147459_d(p_149749_2_ - 1, p_149749_3_, p_149749_4_, this);
         p_149749_1_.func_147459_d(p_149749_2_, p_149749_3_, p_149749_4_ + 1, this);
         p_149749_1_.func_147459_d(p_149749_2_, p_149749_3_, p_149749_4_ - 1, this);
         this.func_150177_e(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_);
         this.func_150172_m(p_149749_1_, p_149749_2_ - 1, p_149749_3_, p_149749_4_);
         this.func_150172_m(p_149749_1_, p_149749_2_ + 1, p_149749_3_, p_149749_4_);
         this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_ - 1);
         this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_ + 1);
         if (p_149749_1_.func_147439_a(p_149749_2_ - 1, p_149749_3_, p_149749_4_).func_149721_r()) {
            this.func_150172_m(p_149749_1_, p_149749_2_ - 1, p_149749_3_ + 1, p_149749_4_);
         } else {
            this.func_150172_m(p_149749_1_, p_149749_2_ - 1, p_149749_3_ - 1, p_149749_4_);
         }

         if (p_149749_1_.func_147439_a(p_149749_2_ + 1, p_149749_3_, p_149749_4_).func_149721_r()) {
            this.func_150172_m(p_149749_1_, p_149749_2_ + 1, p_149749_3_ + 1, p_149749_4_);
         } else {
            this.func_150172_m(p_149749_1_, p_149749_2_ + 1, p_149749_3_ - 1, p_149749_4_);
         }

         if (p_149749_1_.func_147439_a(p_149749_2_, p_149749_3_, p_149749_4_ - 1).func_149721_r()) {
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ + 1, p_149749_4_ - 1);
         } else {
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ - 1, p_149749_4_ - 1);
         }

         if (p_149749_1_.func_147439_a(p_149749_2_, p_149749_3_, p_149749_4_ + 1).func_149721_r()) {
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ + 1, p_149749_4_ + 1);
         } else {
            this.func_150172_m(p_149749_1_, p_149749_2_, p_149749_3_ - 1, p_149749_4_ + 1);
         }
      }

   }

   private int func_150178_a(World p_150178_1_, int p_150178_2_, int p_150178_3_, int p_150178_4_, int p_150178_5_) {
      if (p_150178_1_.func_147439_a(p_150178_2_, p_150178_3_, p_150178_4_) != this) {
         return p_150178_5_;
      } else {
         int i1 = p_150178_1_.func_72805_g(p_150178_2_, p_150178_3_, p_150178_4_);
         return i1 > p_150178_5_ ? i1 : p_150178_5_;
      }
   }

   public void func_149695_a(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_) {
      if (!p_149695_1_.field_72995_K) {
         boolean flag = this.func_149742_c(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
         if (flag) {
            this.func_150177_e(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
         } else {
            this.func_149697_b(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, 0, 0);
            p_149695_1_.func_147468_f(p_149695_2_, p_149695_3_, p_149695_4_);
         }

         super.func_149695_a(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_5_);
      }

   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister p_149651_1_) {
      field_150182_M = p_149651_1_.registerIcon("monoblocks:yellowline_cross");
      field_150183_N = p_149651_1_.registerIcon("monoblocks:yellowline");
      this.blockIcon = field_150182_M;
   }

   @SideOnly(Side.CLIENT)
   public static IIcon getYellowLineIcon(String p_150173_0_) {
      return p_150173_0_.equals("monoblocks:yellowline_cross") ? field_150182_M : (p_150173_0_.equals("monoblocks:yellowline") ? field_150183_N : null);
   }
}
