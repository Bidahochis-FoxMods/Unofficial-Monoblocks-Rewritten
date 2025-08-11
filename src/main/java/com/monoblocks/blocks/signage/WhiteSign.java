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
      this.setStepSound(soundTypeMetal);
      this.setHardness(2.0F);
      this.setResistance(5.0F);
      this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.68F, 1.0F, 0.68F);
      this.setBlockName("whitesign");
   }

   public int getRenderType() {
      return -1;
   }

   public boolean isOpaqueCube() {
      return false;
   }

   public boolean renderAsNormalBlock() {
      return false;
   }

   public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
      return new TileEntityWhiteSign();
   }

   @SideOnly(Side.CLIENT)
   public void registerBlockIcons(IIconRegister iconRegister) {
      this.blockIcon = iconRegister.registerIcon("monoblocks:whitesign");
   }

   public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
      int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
      world.setBlockMetadataWithNotify(x, y, z, l, 2);
   }

   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
      return new ItemStack(SignReg.WhiteSignItem, 1);
   }

   public Item getItem() {
      return SignReg.WhiteSignItem;
   }
}
