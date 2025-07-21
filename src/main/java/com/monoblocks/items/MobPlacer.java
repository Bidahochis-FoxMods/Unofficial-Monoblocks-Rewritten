package com.monoblocks.items;

import com.monoblocks.entities.BaconPigEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class MobPlacer extends Item {
   int[] primaryColor = new int[]{9063176};
   int[] secondaryColor = new int[]{14395649};
   String[] mobNames = new String[]{"Monoblocks.Baconpig"};

   public MobPlacer() {
      this.func_77637_a(CreativeTabs.field_78026_f);
      this.func_77627_a(true);
   }

   public void func_94581_a(IIconRegister iconRegister) {
   }

   @SideOnly(Side.CLIENT)
   public boolean func_77623_v() {
      return true;
   }

   @SideOnly(Side.CLIENT)
   public IIcon func_77618_c(int par1, int par2) {
      return Items.field_151063_bx.func_77618_c(par1, par2);
   }

   public String func_77653_i(ItemStack par1ItemStack) {
      String s = ("" + StatCollector.func_74838_a(this.func_77658_a() + ".name")).trim();
      String s1 = this.mobNames[par1ItemStack.func_77960_j()];
      if (s1 != null) {
         s = s + " " + StatCollector.func_74838_a("entity." + s1 + ".name");
      }

      return s;
   }

   public void func_150895_a(Item id, CreativeTabs tab, List list) {
      for(int i = 0; i < this.mobNames.length; ++i) {
         list.add(new ItemStack(id, 1, i));
      }

   }

   @SideOnly(Side.CLIENT)
   public int func_82790_a(ItemStack stack, int pass) {
      int damage = stack.func_77960_j();
      return pass == 0 ? this.primaryColor[damage] : this.secondaryColor[damage];
   }

   public boolean func_77648_a(ItemStack stack, EntityPlayer player, World world, int posX, int posY, int posZ, int par7, float par8, float par9, float par10) {
      if (!world.field_72995_K) {
         activateSpawnEgg(stack, world, (double)posX, (double)posY, (double)posZ, par7);
         if (!player.field_71075_bZ.field_75098_d) {
            --stack.field_77994_a;
         }
      }

      return true;
   }

   public static EntityLiving activateSpawnEgg(ItemStack stack, World world, double posX, double posY, double posZ, int par7) {
      Block i1 = world.func_147439_a((int)posX, (int)posY, (int)posZ);
      posX += (double)Facing.field_71586_b[par7];
      posY += (double)Facing.field_71587_c[par7];
      posZ += (double)Facing.field_71585_d[par7];
      double d0 = 0.0D;
      if (par7 == 1 && i1 != null && i1.func_149645_b() == 11) {
         d0 = 0.5D;
      }

      int damage = stack.func_77960_j();
      EntityLiving entity = null;
      switch(damage) {
      case 0:
         entity = new BaconPigEntity(world);
         spawnEntity(posX, posY, posZ, entity, world);
      default:
         return entity;
      }
   }

   public static void spawnEntity(double x, double y, double z, EntityLiving entity, World world) {
      if (!world.field_72995_K) {
         entity.func_70107_b(x, y, z);
         world.func_72838_d(entity);
      }

   }
}
