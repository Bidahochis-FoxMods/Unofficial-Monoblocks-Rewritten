package com.tbea;

import com.bidahochi.BlockMod.core.handler.IFoxBlockIDs;
import com.bidahochi.BlockMod.core.handler.baseBlocks.BaseBlock;
import com.bidahochi.BlockMod.core.handler.baseBlocks.blockPropertys.BlockProperty;
import com.monoblocks.Monoblocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class TransparentMonoBlockProp extends BlockProperty
{
    public TransparentMonoBlockProp(Block block, float blockResistance, String toolClass, int harvestLevel, int totalTextureCount, String texturePath)
    {
        super(block, blockResistance, toolClass, harvestLevel, totalTextureCount, texturePath);
    }

    public TransparentMonoBlockProp(IFoxBlockIDs block, Material material, float blockHardness, float blockResistance, String toolClass, int harvestLevel, Block.SoundType soundType, int totalTextureCount, String texturePath, CreativeTabs creativeTab)
    {
        super(block, material, blockHardness, blockResistance, toolClass, harvestLevel, soundType, totalTextureCount, texturePath, creativeTab);
    }

    public TransparentMonoBlockProp(IFoxBlockIDs block, Material material, float blockHardness, float blockResistance, String toolClass, int harvestLevel, Block.SoundType soundType, int totalTextureCount, String texturePath, CreativeTabs creativeTab, boolean firstBlockHasNoIndex)
    {
        super(block, material, blockHardness, blockResistance, toolClass, harvestLevel, soundType, totalTextureCount, texturePath, creativeTab, firstBlockHasNoIndex);
    }

    @Override
    public Block getNewBlock() {
        this.block = new BaseBlock(this)
        {
            @SideOnly(Side.CLIENT)
            public int getRenderBlockPass() {
                return 1;
            }

            @SideOnly(Side.CLIENT)
            public boolean isOpaqueCube() {
                return false;
            }

            public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
                return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, 1 - par5);
            }
        };
        return this.block;
    }

    @Override
    public CreativeTabs getFenceCreativeTab() {
        return Monoblocks.monoblocksfences;
    }

    @Override
    public CreativeTabs getExtraBlocksCreativeTab()
    {
        return Monoblocks.monoblocksTiles;
    }
}
