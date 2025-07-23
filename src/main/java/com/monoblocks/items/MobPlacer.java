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
      this.setCreativeTab(CreativeTabs.tabMisc);
      this.setHasSubtypes(true);
   }

   public void registerIcons(IIconRegister iconRegister) {
   }

   @SideOnly(Side.CLIENT)
   public boolean requiresMultipleRenderPasses() {
      return true;
   }

   @SideOnly(Side.CLIENT)
   public IIcon getIconFromDamageForRenderPass(int par1, int par2) {
      return Items.spawn_egg.getIconFromDamageForRenderPass(par1, par2);
   }

   public String getItemStackDisplayName(ItemStack par1ItemStack) {
      String s = ("" + StatCollector.translateToLocal(this.getUnlocalizedName() + ".name")).trim();
      String s1 = this.mobNames[par1ItemStack.getItemDamage()];
      if (s1 != null) {
         s = s + " " + StatCollector.translateToLocal("entity." + s1 + ".name");
      }

      return s;
   }

   public void getSubItems(Item id, CreativeTabs tab, List list) {
      for(int i = 0; i < this.mobNames.length; ++i) {
         list.add(new ItemStack(id, 1, i));
      }

   }

   @SideOnly(Side.CLIENT)
   public int getColorFromItemStack(ItemStack stack, int pass) {
      int damage = stack.getItemDamage();
      return pass == 0 ? this.primaryColor[damage] : this.secondaryColor[damage];
   }

   public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int posX, int posY, int posZ, int par7, float par8, float par9, float par10) {
      if (!world.isRemote) {
         activateSpawnEgg(stack, world, (double)posX, (double)posY, (double)posZ, par7);
         if (!player.capabilities.isCreativeMode) {
            --stack.stackSize;
         }
      }

      return true;
   }

   public static EntityLiving activateSpawnEgg(ItemStack stack, World world, double posX, double posY, double posZ, int par7) {
      Block i1 = world.getBlock((int)posX, (int)posY, (int)posZ);
      posX += (double)Facing.offsetsXForSide[par7];
      posY += (double)Facing.offsetsYForSide[par7];
      posZ += (double)Facing.offsetsZForSide[par7];
      double d0 = 0.0D;
      if (par7 == 1 && i1 != null && i1.getRenderType() == 11) {
         d0 = 0.5D;
      }

      int damage = stack.getItemDamage();
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
      if (!world.isRemote) {
         entity.setPosition(x, y, z);
         world.spawnEntityInWorld(entity);
      }

   }
}
