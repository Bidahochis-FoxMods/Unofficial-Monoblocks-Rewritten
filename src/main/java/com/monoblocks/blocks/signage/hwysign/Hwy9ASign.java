package com.monoblocks.blocks.signage.hwysign;

import com.monoblocks.blocks.signage.AbstractHwySign;
import com.monoblocks.blocks.signage.tileentity.TileEntityHwy9A;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Hwy9ASign extends AbstractHwySign {
    public Hwy9ASign()
    {
        super();

        this.setBlockName("hwy9a");
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon("monoblocks:9a");
    }


    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityHwy9A();
    }


}
