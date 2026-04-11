package com.tbea;

import com.bidahochi.BlockMod.core.handler.IFoxBlockIDs;
import com.bidahochi.BlockMod.core.handler.baseBlocks.blockPropertys.BlockProperty;
import com.monoblocks.Monoblocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Alters default to force tabs for special blocks
 */
public class MonoBlockProp extends BlockProperty
{
    public MonoBlockProp(Block block, float blockResistance, String toolClass, int harvestLevel, int totalTextureCount, String texturePath)
    {
        super(block, blockResistance, toolClass, harvestLevel, totalTextureCount, texturePath);
    }

    public MonoBlockProp(IFoxBlockIDs block, Material material, float blockHardness, float blockResistance, String toolClass, int harvestLevel, Block.SoundType soundType, int totalTextureCount, String texturePath, CreativeTabs creativeTab)
    {
        super(block, material, blockHardness, blockResistance, toolClass, harvestLevel, soundType, totalTextureCount, texturePath, creativeTab);
    }

    public MonoBlockProp(IFoxBlockIDs block, Material material, float blockHardness, float blockResistance, String toolClass, int harvestLevel, Block.SoundType soundType, int totalTextureCount, String texturePath, CreativeTabs creativeTab, boolean firstBlockHasNoIndex)
    {
        super(block, material, blockHardness, blockResistance, toolClass, harvestLevel, soundType, totalTextureCount, texturePath, creativeTab, firstBlockHasNoIndex);
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
