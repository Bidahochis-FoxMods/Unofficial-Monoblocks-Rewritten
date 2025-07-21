package com.monoblocks.utilities;

import com.monoblocks.Monoblocks;
import com.monoblocks.blocks.signage.tileentity.TileEntityBlueNameSign;
import com.monoblocks.blocks.signage.tileentity.TileEntityGreenNameSign;
import com.monoblocks.blocks.signage.tileentity.TileEntityGreenSign;
import com.monoblocks.blocks.tileentity.TileEntityWhiteSign;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

public class SignDataPacket extends AbstractPacket {
   private int dimension;
   private int x;
   private int y;
   private int z;
   private int length;
   private String[] text;

   public SignDataPacket() {
   }

   public SignDataPacket(int dimension, int x, int y, int z, String[] text) {
      this.text = text;
      this.dimension = dimension;
      this.x = x;
      this.y = y;
      this.z = z;
      this.length = text.length;
   }

   public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
      buffer.writeInt(this.dimension);
      buffer.writeInt(this.x);
      buffer.writeInt(this.y);
      buffer.writeInt(this.z);
      buffer.writeInt(this.length);

      for(int i = 0; i < this.length; ++i) {
         ByteBufUtils.writeUTF8String(buffer, this.text[i]);
      }

   }

   public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
      this.dimension = buffer.readInt();
      this.x = buffer.readInt();
      this.y = buffer.readInt();
      this.z = buffer.readInt();
      this.length = buffer.readInt();
      this.text = new String[this.length];

      for(int i = 0; i < this.length; ++i) {
         this.text[i] = ByteBufUtils.readUTF8String(buffer);
      }

   }

   public void handleClientSide(EntityPlayer player) {
      TileEntity te = player.field_70170_p.func_147438_o(this.x, this.y, this.z);
      if (te != null && te instanceof TileEntityWhiteSign) {
         TileEntityWhiteSign logic = (TileEntityWhiteSign)te;
         logic.setText(this.text);
      }

      if (te != null && te instanceof TileEntityGreenSign) {
         TileEntityGreenSign logic = (TileEntityGreenSign)te;
         logic.setText(this.text);
      }

      if (te != null && te instanceof TileEntityBlueNameSign) {
         TileEntityBlueNameSign logic = (TileEntityBlueNameSign)te;
         logic.setText(this.text);
      }

      if (te != null && te instanceof TileEntityGreenNameSign) {
         TileEntityGreenNameSign logic = (TileEntityGreenNameSign)te;
         logic.setText(this.text);
      }

   }

   public void handleServerSide(EntityPlayer player) {
      TileEntity te = player.field_70170_p.func_147438_o(this.x, this.y, this.z);
      if (te != null && te instanceof TileEntityWhiteSign) {
         TileEntityWhiteSign logic = (TileEntityWhiteSign)te;
         logic.setText(this.text);
      }

      if (te != null && te instanceof TileEntityGreenSign) {
         TileEntityGreenSign logic = (TileEntityGreenSign)te;
         logic.setText(this.text);
      }

      if (te != null && te instanceof TileEntityBlueNameSign) {
         TileEntityBlueNameSign logic = (TileEntityBlueNameSign)te;
         logic.setText(this.text);
      }

      if (te != null && te instanceof TileEntityGreenNameSign) {
         TileEntityGreenNameSign logic = (TileEntityGreenNameSign)te;
         logic.setText(this.text);
      }

      Monoblocks.packetPipeline.sendToDimension(new SignDataPacket(this.dimension, this.x, this.y, this.z, this.text), this.dimension);
   }
}
