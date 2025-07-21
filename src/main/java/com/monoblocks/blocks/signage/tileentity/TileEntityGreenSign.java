package com.monoblocks.blocks.signage.tileentity;

import com.monoblocks.utilities.SignSuperclass;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.world.World;

public class TileEntityGreenSign extends SignSuperclass {
   protected String[] text;

   public TileEntityGreenSign() {
      super(1);
   }

   public String getDefaultName() {
      return "greensign";
   }

   public void func_145839_a(NBTTagCompound tags) {
      super.func_145839_a(tags);
      this.text = new String[tags.func_74762_e("lineCount")];

      for(int i = 0; i < this.text.length; ++i) {
         this.text[i] = tags.func_74779_i("line" + i);
      }

   }

   public void func_145841_b(NBTTagCompound tags) {
      super.func_145841_b(tags);
      if (this.text == null) {
         this.text = new String[0];
      }

      tags.func_74768_a("lineCount", this.text.length);

      for(int i = 0; i < this.text.length; ++i) {
         tags.func_74778_a("line" + i, this.text[i]);
      }

   }

   public Container getGuiContainer(InventoryPlayer inventoryplayer, World world, int x, int y, int z) {
      return null;
   }

   public String func_145825_b() {
      return null;
   }

   public void func_70295_k_() {
   }

   public void func_70305_f() {
   }

   public void setText(String[] text) {
      this.text = text;
   }

   public String[] getText() {
      return this.text;
   }

   public S35PacketUpdateTileEntity getDescriptionPacket() {
      NBTTagCompound compound = new NBTTagCompound();
      this.func_145841_b(compound);
      S35PacketUpdateTileEntity packet = new S35PacketUpdateTileEntity(this.field_145851_c, this.field_145848_d, this.field_145849_e, 1, compound);
      return packet;
   }

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
      this.func_145839_a(pkt.func_148857_g());
   }
}
