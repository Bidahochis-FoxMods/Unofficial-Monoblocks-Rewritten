package com.monoblocks.blocks.signage;

import com.monoblocks.SignReg;
import com.monoblocks.blocks.tileentity.TileEntityWhiteSign;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class WhiteSign extends BlockContainer {
   public WhiteSign() {
      super(Material.iron);
      this.func_149672_a(field_149777_j);
      this.setHardness(2.0F);
      this.setResistance(5.0F);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.68F, 1.0F, 0.68F);
      this.setBlockName("whitesign");
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

   public TileEntity func_149915_a(World p_149915_1_, int p_149915_2_) {
      return new TileEntityWhiteSign();
   }

   @SideOnly(Side.CLIENT)
   public void func_149651_a(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:whitesign");
   }

   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.func_76128_c((double)(entity.field_70177_z * 4.0F / 360.0F) + 0.5D) & 3;
      world.func_72921_c(x, y, z, l, 2);
   }

   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
      return new ItemStack(SignReg.WhiteSignItem, 1);
   }

   public Item getItem() {
      return SignReg.WhiteSignItem;
   }
}
