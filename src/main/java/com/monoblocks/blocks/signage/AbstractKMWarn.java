package com.monoblocks.blocks.signage;

import com.bidahochi.BlockMod.blocks.scrolling.IFoxBlocksScrollingBlock;
import com.monoblocks.Monoblocks;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public abstract class AbstractKMWarn extends BlockContainer implements IFoxBlocksScrollingBlock
{
    @Override
    public final int getScrollListID()
    {
        return 104;
    }

    public AbstractKMWarn()
    {
        super(Material.iron);
        this.setCreativeTab(Monoblocks.monoblocksSignage);
        this.setHardness(2.0F);
        this.setBlockBounds(0.34F, 0.0F, 0.34F, 0.66F, 1.0F, 0.66F);
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

    public final boolean hasTileEntity() {
        return true;
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);
    }
}
