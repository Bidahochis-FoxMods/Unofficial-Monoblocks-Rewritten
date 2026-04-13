package com.monoblocks.blocks.signage.hwysign;

import com.monoblocks.blocks.signage.AbstractHwySign;
import com.monoblocks.blocks.signage.tileentity.TileEntityHwy27;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Hwy27Sign extends AbstractHwySign {
    public Hwy27Sign()
    {
        super();

        this.setBlockName("hwy27");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon("monoblocks:27");
    }


    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityHwy27();
    }


}
