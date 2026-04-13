package com.monoblocks.blocks.signage.hwysign;

import com.monoblocks.blocks.signage.AbstractHwySign;
import com.monoblocks.blocks.signage.tileentity.TileEntityHwySign3A;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Hwy3ASign extends AbstractHwySign {
    public Hwy3ASign()
    {
        super();
        this.setBlockName("Highway 3A Sign");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon("monoblocks:3a");
    }

    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityHwySign3A();
    }
}
