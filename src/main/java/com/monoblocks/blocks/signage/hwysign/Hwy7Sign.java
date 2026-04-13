package com.monoblocks.blocks.signage.hwysign;

import com.monoblocks.blocks.signage.AbstractHwySign;
import com.monoblocks.blocks.signage.tileentity.TileEntityHwySign7;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Hwy7Sign extends AbstractHwySign {
    public Hwy7Sign()
    {
        super();

        this.setBlockName("Highway 7 Sign");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon("monoblocks:7");
    }


    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityHwySign7();
    }


}
