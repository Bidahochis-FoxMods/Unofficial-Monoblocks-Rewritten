package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityStereo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Stereo extends BlockContainer {
   public static ArrayList records = new ArrayList();

   public Stereo() {
      super(Material.wood);
      this.setBlockName("stereo");
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 0.34F, 0.66F);
      records.add(new ItemStack(Items.field_151096_cd));
      records.add(new ItemStack(Items.field_151094_cf));
      records.add(new ItemStack(Items.field_151093_ce));
      records.add(new ItemStack(Items.field_151091_cg));
      records.add(new ItemStack(Items.field_151092_ch));
      records.add(new ItemStack(Items.field_151089_ci));
      records.add(new ItemStack(Items.field_151090_cj));
      records.add(new ItemStack(Items.field_151087_ck));
      records.add(new ItemStack(Items.field_151088_cl));
      records.add(new ItemStack(Items.field_151084_co));
      records.add(new ItemStack(Items.field_151085_cm));
   }

   public boolean func_149662_c() {
      return false;
   }

   public boolean func_149686_d() {
      return false;
   }

   public int func_149645_b() {
      return -1;
   }

   public void func_149749_a(World par1World, int par2, int par3, int par4, Block par5, int par6) {
      this.ejectRecord(par1World, par2, par3, par4);
      super.func_149749_a(par1World, par2, par3, par4, par5, par6);
   }

   public boolean func_149727_a(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {
      if (!par1World.field_72995_K) {
         TileEntity tile_entity = par1World.func_147438_o(par2, par3, par4);
         if (tile_entity instanceof TileEntityStereo) {
            TileEntityStereo tileEntityStereo = (TileEntityStereo)tile_entity;
            if (!par5EntityPlayer.func_70093_af()) {
               if (tileEntityStereo.count == 13) {
                  tileEntityStereo.count = records.size();
               } else {
                  ++tileEntityStereo.count;
               }

               if (tileEntityStereo.count == records.size()) {
                  tileEntityStereo.count = 0;
                  tileEntityStereo.setRecord((ItemStack)records.get(0));
               } else {
                  tileEntityStereo.setRecord((ItemStack)records.get(tileEntityStereo.count));
               }

               ItemStack itemstack = (ItemStack)records.get(tileEntityStereo.count);
               par1World.func_72889_a((EntityPlayer)null, 1005, par2, par3, par4, Item.func_150891_b(itemstack.func_77973_b()));
            } else if (tileEntityStereo.count != 13) {
               tileEntityStereo.count = 13;
               par5EntityPlayer.func_146105_b(new ChatComponentText("It's off mate."));
               par1World.func_72926_e(1005, par2, par3, par4, 0);
               par1World.func_72934_a((String)null, par2, par3, par4);
               tileEntityStereo.setRecord((ItemStack)null);
            } else {
               par5EntityPlayer.func_146105_b(new ChatComponentText("It's off mate."));
            }
         }
      }

      return true;
   }

   public void ejectRecord(World par1World, int par2, int par3, int par4) {
      if (!par1World.field_72995_K) {
         TileEntityStereo tileentitystereo = (TileEntityStereo)par1World.func_147438_o(par2, par3, par4);
         if (tileentitystereo != null) {
            par1World.func_72926_e(1005, par2, par3, par4, 0);
            par1World.func_72934_a((String)null, par2, par3, par4);
            tileentitystereo.setRecord((ItemStack)null);
         }
      }

   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:stereo");
   }

   public TileEntity func_149915_a(World var1, int var2) {
      return new TileEntityStereo();
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }
}
