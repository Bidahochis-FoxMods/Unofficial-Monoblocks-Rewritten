package com.monoblocks.blocks.baseclass;

import com.bidahochi.BlockMod.blocks.scrolling.IFoxBlocksScrollingBlock;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public abstract class BasePowerPole extends BlockContainer implements IFoxBlocksScrollingBlock
{
    public final int getScrollListID()
    {
        return 103;
    }

    public BasePowerPole()
    {
        super(Material.wood);
        this.setStepSound(soundTypeWood);
    }

    public final int getRenderType() {
        return -1;
    }

    public final boolean isOpaqueCube() {
        return false;
    }

    public final boolean renderAsNormalBlock() {
        return false;
    }

    public final void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);
    }
}
