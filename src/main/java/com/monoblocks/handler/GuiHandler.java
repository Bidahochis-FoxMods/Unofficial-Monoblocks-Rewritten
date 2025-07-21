package com.monoblocks.handler;

import com.monoblocks.blocks.signage.tileentity.TileEntityBlueNameSign;
import com.monoblocks.blocks.signage.tileentity.TileEntityGreenNameSign;
import com.monoblocks.blocks.signage.tileentity.TileEntityGreenSign;
import com.monoblocks.blocks.tileentity.TileEntityFryer;
import com.monoblocks.blocks.tileentity.TileEntityIronFurnace;
import com.monoblocks.blocks.tileentity.TileEntityRoundBBQ;
import com.monoblocks.blocks.tileentity.TileEntityShowcase;
import com.monoblocks.blocks.tileentity.TileEntityWhiteSign;
import com.monoblocks.container.ContainerFryer;
import com.monoblocks.container.ContainerIronFurnace;
import com.monoblocks.container.ContainerRoundBBQ;
import com.monoblocks.container.ContainerShowcase;
import com.monoblocks.gui.GuiBlueNameSign;
import com.monoblocks.gui.GuiFryer;
import com.monoblocks.gui.GuiGreenNameSign;
import com.monoblocks.gui.GuiGreenSign;
import com.monoblocks.gui.GuiIronFurnace;
import com.monoblocks.gui.GuiRoundBBQ;
import com.monoblocks.gui.GuiShowcase;
import com.monoblocks.gui.GuiWhiteSign;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
   public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      TileEntity entity = world.func_147438_o(x, y, z);
      if (entity instanceof TileEntityIronFurnace) {
         return new ContainerIronFurnace(player.field_71071_by, (TileEntityIronFurnace)entity);
      } else if (entity instanceof TileEntityFryer) {
         return new ContainerFryer(player.field_71071_by, (TileEntityFryer)entity);
      } else if (entity instanceof TileEntityRoundBBQ) {
         return new ContainerRoundBBQ(player.field_71071_by, (TileEntityRoundBBQ)entity);
      } else {
         return entity instanceof TileEntityShowcase ? new ContainerShowcase(player.field_71071_by, (TileEntityShowcase)entity) : null;
      }
   }

   public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
      TileEntity entity = world.func_147438_o(x, y, z);
      if (entity instanceof TileEntityIronFurnace) {
         return new GuiIronFurnace(player.field_71071_by, (TileEntityIronFurnace)entity);
      } else if (entity instanceof TileEntityFryer) {
         return new GuiFryer(player.field_71071_by, (TileEntityFryer)entity);
      } else if (entity instanceof TileEntityRoundBBQ) {
         return new GuiRoundBBQ(player.field_71071_by, (TileEntityRoundBBQ)entity);
      } else if (entity instanceof TileEntityShowcase) {
         return new GuiShowcase(player.field_71071_by, (TileEntityShowcase)entity);
      } else if (entity instanceof TileEntityWhiteSign) {
         return new GuiWhiteSign((TileEntityWhiteSign)entity);
      } else if (entity instanceof TileEntityGreenSign) {
         return new GuiGreenSign((TileEntityGreenSign)entity);
      } else if (entity instanceof TileEntityBlueNameSign) {
         return new GuiBlueNameSign((TileEntityBlueNameSign)entity);
      } else {
         return entity instanceof TileEntityGreenNameSign ? new GuiGreenNameSign((TileEntityGreenNameSign)entity) : null;
      }
   }
}
