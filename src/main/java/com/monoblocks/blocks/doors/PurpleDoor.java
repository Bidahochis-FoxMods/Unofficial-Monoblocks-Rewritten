package com.monoblocks.blocks.doors;

import com.monoblocks.MItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.IconFlipped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PurpleDoor extends BlockDoor {
   public IIcon[] icons;
   public IIcon[] iconsReverse;

   public PurpleDoor(Material material) {
      super(material);
      float f = 0.5F;
      float f1 = 1.0F;
      this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
      this.setHardness(0.4F);
      this.setStepSound(Block.soundTypeGlass);
      this.disableStats();
   }

   public Item getItemDropped(int i, Random random, int j) {
      return (i & 8) != 0 ? Item.getItemFromBlock(Blocks.air) : MItems.PurpleDoorItem;
   }

   public void registerBlockIcons(IIconRegister iconRegister) {
      this.icons = new IIcon[2];
      this.icons[0] = iconRegister.registerIcon("monoblocks:glassdoorbottompurple");
      this.icons[1] = iconRegister.registerIcon("monoblocks:glassdoortoppurple");
      this.iconsReverse = new IIcon[this.icons.length];

      for(int i = 0; i < this.icons.length; ++i) {
         this.iconsReverse[i] = new IconFlipped(this.icons[i], true, false);
      }

   }

   @SideOnly(Side.CLIENT)
   public IIcon func_149673_e(IBlockAccess blockAccess, int x, int y, int z, int side) {
      if (side != 1 && side != 0) {
         int i1 = this.func_150012_g(blockAccess, x, y, z);
         int j1 = i1 & 3;
         boolean flag = (i1 & 4) != 0;
         boolean flag1 = false;
         boolean flag2 = (i1 & 8) != 0;
         if (flag) {
            if (j1 == 0 && side == 2) {
               flag1 = !flag1;
            } else if (j1 == 1 && side == 5) {
               flag1 = !flag1;
            } else if (j1 == 2 && side == 3) {
               flag1 = !flag1;
            } else if (j1 == 3 && side == 4) {
               flag1 = !flag1;
            }
         } else {
            if (j1 == 0 && side == 5) {
               flag1 = !flag1;
            } else if (j1 == 1 && side == 3) {
               flag1 = !flag1;
            } else if (j1 == 2 && side == 4) {
               flag1 = !flag1;
            } else if (j1 == 3 && side == 2) {
               flag1 = !flag1;
            }

            if ((i1 & 16) != 0) {
               flag1 = !flag1;
            }
         }

         return flag1 ? this.iconsReverse[flag2 ? 1 : 0] : this.icons[flag2 ? 1 : 0];
      } else {
         return this.icons[0];
      }
   }

   @SideOnly(Side.CLIENT)
   public IIcon getIcon(int par1, int par2) {
      return this.icons[0];
   }

   public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
      return new ItemStack(MItems.PurpleDoorItem, 1);
   }

   @SideOnly(Side.CLIENT)
   public int getRenderBlockPass() {
      return 1;
   }

   public int getRenderType() {
      return 7;
   }
}
