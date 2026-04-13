package com.monoblocks.blocks.signage.hwysign;

import com.monoblocks.blocks.signage.AbstractHwySign;
import com.monoblocks.blocks.signage.tileentity.TileEntityHwySign10;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Hwy10Sign extends AbstractHwySign {
    public Hwy10Sign()
    {
        super();

        this.setBlockName("Highway 10 Sign");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon("monoblocks:10");
    }


    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityHwySign10();
    }


}
