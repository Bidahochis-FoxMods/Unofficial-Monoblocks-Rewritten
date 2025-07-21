package com.monoblocks.utilities;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public interface IMonoblocksTileEntityProvider {
   TileEntity createNewTileEntity(World var1, int var2, int var3, int var4);
}
