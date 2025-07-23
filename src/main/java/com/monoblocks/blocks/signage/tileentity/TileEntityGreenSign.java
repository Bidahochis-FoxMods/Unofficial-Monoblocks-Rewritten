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

   public void readFromNBT(NBTTagCompound tags) {
      super.readFromNBT(tags);
      this.text = new String[tags.getInteger("lineCount")];

      for(int i = 0; i < this.text.length; ++i) {
         this.text[i] = tags.getString("line" + i);
      }

   }

   public void writeToNBT(NBTTagCompound tags) {
      super.writeToNBT(tags);
      if (this.text == null) {
         this.text = new String[0];
      }

      tags.setInteger("lineCount", this.text.length);

      for(int i = 0; i < this.text.length; ++i) {
         tags.setString("line" + i, this.text[i]);
      }

   }

   public Container getGuiContainer(InventoryPlayer inventoryplayer, World world, int x, int y, int z) {
      return null;
   }

   public String getInventoryName() {
      return null;
   }

   public void openInventory() {
   }

   public void closeInventory() {
   }

   public void setText(String[] text) {
      this.text = text;
   }

   public String[] getText() {
      return this.text;
   }

   public S35PacketUpdateTileEntity getDescriptionPacket() {
      NBTTagCompound compound = new NBTTagCompound();
      this.writeToNBT(compound);
      S35PacketUpdateTileEntity packet = new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, compound);
      return packet;
   }

   public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
      this.readFromNBT(pkt.func_148857_g());
   }
}
