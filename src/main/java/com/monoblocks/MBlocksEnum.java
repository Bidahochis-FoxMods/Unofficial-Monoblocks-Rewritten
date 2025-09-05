package com.monoblocks;

import com.bidahochi.BlockMod.core.handler.IFoxBlockIDs;
import com.bidahochi.BlockMod.items.BaseItems.BaseItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public enum MBlocksEnum implements IFoxBlockIDs
{
    stucco(BaseItemBlock.class, 16),

    hardblock(BaseItemBlock.class, 16),
    colorgravel(BaseItemBlock.class, 16),
    colorsand(BaseItemBlock.class, 16),

    roughplastic(BaseItemBlock.class, 0),
    colorplastic(BaseItemBlock.class, 16),

    coloredquartz(BaseItemBlock.class, 16),
    fancybricks(BaseItemBlock.class, 16),
    fancybricks2(BaseItemBlock.class, 16),
    colorCobble(BaseItemBlock.class, 16),
    vinyl(BaseItemBlock.class, 16);


    public Block block;
    public final boolean hasItemBlock;
    public final Class itemBlockClass;
    public final String blockName;
    /** MaxMetaData for Multipart
     * -1 Disables the use of Multipart on the block
     * 0 Enabled the use of multipart on the block and will allow for only the base block to use Multipart
     */
    public final byte MaxMetadata;

    /**
     * Construct a BlockID that has metaData
     * @param itemBlockClass Class
     * @param blockName name of the block
     * @param maxMetadata how many blocks with the same baseID should be generated for Forge Multipart
     */
    MBlocksEnum(Class<? extends ItemBlock> itemBlockClass, String blockName, int maxMetadata)
    {
        this.hasItemBlock = true;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.MaxMetadata = ((byte) maxMetadata);
    }

    MBlocksEnum(Class<? extends ItemBlock> itemBlockClass, int maxMetadata)
    {
        this.hasItemBlock = true;
        this.itemBlockClass = itemBlockClass;
        this.blockName = this.name();
        this.MaxMetadata = ((byte) maxMetadata);
    }

    /**
     * Construct a BlockID that has metaData
     * @param hasItemBlock
     * @param itemBlockClass Class
     * @param blockName name of the block
     * @param maxMetadata how many blocks with the same baseID should be generated for Forge Multipart
     */
    MBlocksEnum(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName, int maxMetadata)
    {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.MaxMetadata = ((byte) maxMetadata);
    }

    /**
     * Construct a BlockID that does not have metaData
     * @param hasItemBlock
     * @param itemBlockClass
     * @param blockName
     */
    MBlocksEnum(boolean hasItemBlock, Class<? extends ItemBlock> itemBlockClass, String blockName) {
        this.hasItemBlock = hasItemBlock;
        this.itemBlockClass = itemBlockClass;
        this.blockName = blockName;
        this.MaxMetadata = 0;
    }

    @Override
    public Block GetBlock() {
        return block;
    }

    @Override
    public boolean hasItemBlock() {
        return hasItemBlock;
    }

    @Override
    public Class getItemBlockClass() {
        return itemBlockClass;
    }

    @Override
    public byte GetMaxMetaData() {
        return MaxMetadata;
    }

    @Override
    public String GetBlockName() {
        return blockName;
    }
}
