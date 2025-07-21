package com.monoblocks.blocks;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.tileentity.TileEntityYellowStoplightPole;
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

public class YellowStoplightPole extends BlockContainer {
   public YellowStoplightPole() {
      super(Material.iron);
      this.func_149672_a(field_149777_j);
      this.setHardness(2.0F);
      this.setResistance(5.0F);
      this.setCreativeTab(Monoblocks.monoblocksTab);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.68F, 4.0F, 0.68F);
      this.setLightLevel(0.5F);
      this.setBlockName("YellowStoplightPole");
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

   public TileEntity func_149915_a(World var1, int var2) {
      return new TileEntityYellowStoplightPole();
   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:yellowstoplightwithpole");
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }
}
