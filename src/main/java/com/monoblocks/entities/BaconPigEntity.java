package com.monoblocks.entities;

import com.monoblocks.MItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;

public class BaconPigEntity extends EntityAnimal {
   private final EntityAIControlledByPlayer aiControlledByPlayer;
   private static final String __OBFID = "CL_00001647";

   public BaconPigEntity(World p_i1689_1_) {
      super(p_i1689_1_);
      this.setSize(0.9F, 0.9F);
      this.getNavigator().setAvoidsWater(true);
      this.tasks.addTask(0, new EntityAISwimming(this));
      this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
      this.tasks.addTask(2, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.3F));
      this.tasks.addTask(3, new EntityAIMate(this, 1.0D));
      this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.carrot_on_a_stick, false));
      this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.carrot, false));
      this.tasks.addTask(5, new EntityAIFollowParent(this, 1.1D));
      this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
      this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
      this.tasks.addTask(8, new EntityAILookIdle(this));
   }

   public boolean isAIEnabled() {
      return true;
   }

   protected void applyEntityAttributes() {
      super.applyEntityAttributes();
      this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
      this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
   }

   protected void updateAITasks() {
      super.updateAITasks();
   }

   public boolean func_82171_bF() {
      ItemStack itemstack = ((EntityPlayer)this.riddenByEntity).getHeldItem();
      return itemstack != null && itemstack.getItem() == Items.carrot_on_a_stick;
   }

   protected void entityInit() {
      super.entityInit();
      this.dataWatcher.addObject(16, (byte)0);
   }

   public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
      super.writeEntityToNBT(p_70014_1_);
      p_70014_1_.setBoolean("Saddle", this.getSaddled());
   }

   public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
      super.readEntityFromNBT(p_70037_1_);
      this.setSaddled(p_70037_1_.getBoolean("Saddle"));
   }

   protected String func_70639_aQ() {
      return "mob.pig.say";
   }

   protected String func_70621_aR() {
      return "mob.pig.say";
   }

   protected String func_70673_aS() {
      return "mob.pig.death";
   }

   protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_) {
      this.playSound("mob.pig.step", 0.15F, 1.0F);
   }

   public boolean interact(EntityPlayer p_70085_1_) {
      if (super.interact(p_70085_1_)) {
         return true;
      } else if (!this.getSaddled() || this.worldObj.isRemote || this.riddenByEntity != null && this.riddenByEntity != p_70085_1_) {
         return false;
      } else {
         p_70085_1_.mountEntity(this);
         return true;
      }
   }

   protected Item func_146068_u() {
      return this.isBurning() ? Items.cooked_porkchop : Items.porkchop;
   }

   protected void func_70628_a(boolean p_70628_1_, int p_70628_2_) {
      int j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_);

      for(int k = 0; k < j; ++k) {
         if (this.isBurning()) {
            this.dropItem(Items.cooked_porkchop, 1);
         } else {
            this.dropItem(Items.porkchop, 1);
            this.dropItem(MItems.Bacon, 16);
         }
      }

      if (this.getSaddled()) {
         this.dropItem(Items.saddle, 1);
      }

   }

   public boolean getSaddled() {
      return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
   }

   public void setSaddled(boolean p_70900_1_) {
      if (p_70900_1_) {
         this.dataWatcher.updateObject(16, (byte)1);
      } else {
         this.dataWatcher.updateObject(16, (byte)0);
      }

   }

   public void func_70077_a(EntityLightningBolt p_70077_1_) {
      if (!this.worldObj.isRemote) {
         EntityPigZombie entitypigzombie = new EntityPigZombie(this.worldObj);
         entitypigzombie.setCurrentItemOrArmor(0, new ItemStack(Items.golden_sword));
         entitypigzombie.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
         this.worldObj.spawnEntityInWorld(entitypigzombie);
         this.setDead();
      }

   }

   protected void fall(float p_70069_1_) {
      super.fall(p_70069_1_);
      if (p_70069_1_ > 5.0F && this.riddenByEntity instanceof EntityPlayer) {
         ((EntityPlayer)this.riddenByEntity).triggerAchievement(AchievementList.flyPig);
      }

   }

   public BaconPigEntity createChild(EntityAgeable p_90011_1_) {
      return new BaconPigEntity(this.worldObj);
   }

   public boolean func_70877_b(ItemStack p_70877_1_) {
      return p_70877_1_ != null && p_70877_1_.getItem() == Items.carrot;
   }

   public EntityAIControlledByPlayer getAIControlledByPlayer() {
      return this.aiControlledByPlayer;
   }
}
