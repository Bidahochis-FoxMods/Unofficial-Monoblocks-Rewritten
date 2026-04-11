package com.monoblocks;

import com.bidahochi.BlockMod.core.handler.IFoxBlockIDs;
import com.bidahochi.BlockMod.items.BaseItems.BaseItemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public enum MBlocksEnum implements IFoxBlockIDs
{
    stucco(BaseItemBlock.class, 15),

    darkstonebrick(BaseItemBlock.class, 0),
    bricks(BaseItemBlock.class, 0),
    eggbricks(BaseItemBlock.class, 0),
    CopperOre("Copper Ore"),
    ZincOre(),
    SilverOre("Silver Ore"),
    AluminumOre("Aluminum Ore"),

    hardblock(BaseItemBlock.class, 15),
    colorgravel(BaseItemBlock.class, 15),
    colorsand(BaseItemBlock.class, 15),

    roughplastic(BaseItemBlock.class, 0),
    colorplastic(BaseItemBlock.class, 15),

    smoothiron(BaseItemBlock.class, "iron", 0),
    gold(BaseItemBlock.class, 0),
    diamond(BaseItemBlock.class, 0),

    coloredquartz(BaseItemBlock.class, 15),
    transparentplastic(BaseItemBlock.class, 15),
    fancybricks(BaseItemBlock.class, 15),
    fancybricks2(BaseItemBlock.class, 15),
    lowintensityblocks(BaseItemBlock.class, 15),
    colorCobble(BaseItemBlock.class, 15),

    RedBlock(BaseItemBlock.class,"Red Block", 0),
    GreenBlock(BaseItemBlock.class,"Green Block", 0),
    BlueBlock(BaseItemBlock.class,"Blue Block", 0),
    PurpleBlock(BaseItemBlock.class,"Purple Block", 0),
    PinkBlock(BaseItemBlock.class,"Pink Block", 0),
    YellowBlock(BaseItemBlock.class,"Yellow Block", 0),
    BlackBlock(BaseItemBlock.class,"Black Block", 0),
    WhiteBlock(BaseItemBlock.class,"White Block", 0),
    OrangeBlock(BaseItemBlock.class,"Orange Block", 0),
    RainbowBlock(BaseItemBlock.class,"Rainbow Block", 0),
    LimeBlock(BaseItemBlock.class,"Lime Block", 0),
    BrownBlock(BaseItemBlock.class,"Brown Block", 0),
    InvisibleBlock(BaseItemBlock.class,"X-Ray Block", 0),
    GrayBlock(BaseItemBlock.class,"Gray Block", 0),
    FleshBlock(BaseItemBlock.class,"Flesh Block", 0),
    Lgray(BaseItemBlock.class,"Light Gray Block", 0),
    Lblue(BaseItemBlock.class,"Light Blue Block", 0),
    MagentaBlock(BaseItemBlock.class,"Magenta Block", 0),
    CyanBlock(BaseItemBlock.class,"Cyan Block", 0),
    colorStone(BaseItemBlock.class, 15),

    RedStone(BaseItemBlock.class, "Red Stone", 0),
    BlueStone(BaseItemBlock.class, "Blue Stone", 0),
    YellowStone(BaseItemBlock.class, "Yellow Stone", 0),
    GreenStone(BaseItemBlock.class, "Green Stone", 0),
    GrayStone(BaseItemBlock.class, "Gray Stone", 0),
    PinkStone(BaseItemBlock.class, "Pink Stone", 0),
    BlackStone(BaseItemBlock.class, "Black Stone", 0),
    WhiteStone(BaseItemBlock.class, "White Stone", 0),
    PurpleStone(BaseItemBlock.class, "Purple Stone", 0),
    LgrayStone(BaseItemBlock.class, "Light Gray Stone", 0),
    MagentaStone(BaseItemBlock.class, "Magenta Stone", 0),
    Lbluestone(BaseItemBlock.class, "Light Blue Stone", 0),
    OrangeStone(BaseItemBlock.class, "Orange Stone", 0),
    LimeStone(BaseItemBlock.class, "Lime Stone", 0),
    BrownStone(BaseItemBlock.class, "Brown Stone", 0),
    CyanStone(BaseItemBlock.class, "Cyan Stone", 0),

    BlackPlanks(BaseItemBlock.class, "Black Planks", 0),
    BluePlanks(BaseItemBlock.class, "Blue Planks", 0),
    BrownPlanks(BaseItemBlock.class, "Brown Planks", 0),
    CyanPlanks(BaseItemBlock.class, "Cyan Planks", 0),
    GrayPlanks(BaseItemBlock.class, "Gray Planks", 0),
    GreenPlanks(BaseItemBlock.class, "Green Planks", 0),
    Lblueplanks(BaseItemBlock.class, "Light Blue Planks", 0),
    Lgrayplanks(BaseItemBlock.class, "Light Gray Planks", 0),
    LimePlanks(BaseItemBlock.class, "Lime Planks", 0),
    MagentaPlanks(BaseItemBlock.class, "Magenta Planks", 0),
    OrangePlanks(BaseItemBlock.class, "Orange Planks", 0),
    PinkPlanks(BaseItemBlock.class, "Pink Planks", 0),
    PurplePlanks(BaseItemBlock.class, "Purple Planks", 0),
    RedPlanks(BaseItemBlock.class, "Red Planks", 0),
    WhitePlanks(BaseItemBlock.class, "White Planks", 0),
    YellowPlanks(BaseItemBlock.class, "Yellow Planks", 0),

    BlackStoneBrick(BaseItemBlock.class, "Black Stone Bricks", 0),
    BlueStoneBrick(BaseItemBlock.class, "Blue Stone Bricks", 0),
    BrownStoneBrick(BaseItemBlock.class, "Brown Stone Bricks", 0),
    CyanStoneBrick(BaseItemBlock.class, "Cyan Stone Bricks", 0),
    GrayStoneBrick(BaseItemBlock.class, "Gray Stone Bricks", 0),
    GreenStoneBrick(BaseItemBlock.class, "Green Stone Bricks", 0),
    LBlueStoneBrick(BaseItemBlock.class, "Light Blue Stone Bricks", 0),
    LGrayStoneBrick(BaseItemBlock.class, "Light Gray Stone Bricks", 0),
    LimeStoneBrick(BaseItemBlock.class, "Lime Stone Bricks", 0),
    MagentaStoneBrick(BaseItemBlock.class, "Magenta Stone Bricks", 0),
    OrangeStoneBrick(BaseItemBlock.class, "Orange Stone Bricks", 0),
    PinkStoneBrick(BaseItemBlock.class, "Pink Stone Bricks", 0),
    PurpleStoneBrick(BaseItemBlock.class, "Purple Stone Bricks", 0),
    RedStoneBrick(BaseItemBlock.class, "Red Stone Bricks", 0),
    WhiteStoneBrick(BaseItemBlock.class, "White Stone Bricks", 0),
    YellowStoneBrick(BaseItemBlock.class, "Yellow Stone Bricks", 0),

    BlackGlowstone(BaseItemBlock.class, "Black Glowstone", 0),
    BlueGlowstone(BaseItemBlock.class, "Blue Glowstone", 0),
    BrownGlowstone(BaseItemBlock.class, "Brown Glowstone", 0),
    CyanGlowstone(BaseItemBlock.class, "Cyan Glowstone", 0),
    GrayGlowstone(BaseItemBlock.class, "Gray Glowstone", 0),
    GreenGlowstone(BaseItemBlock.class, "Green Glowstone", 0),
    LblueGlowstone(BaseItemBlock.class, "Light Blue Glowstone", 0),
    LgrayGlowstone(BaseItemBlock.class, "Light Gray Glowstone", 0),
    LimeGlowstone(BaseItemBlock.class, "Lime Glowstone", 0),
    MagentaGlowstone(BaseItemBlock.class, "Magenta Glowstone", 0),
    PinkGlowstone(BaseItemBlock.class, "Pink Glowstone", 0),
    PurpleGlowstone(BaseItemBlock.class, "Purple Glowstone", 0),
    OrangeGlowstone(BaseItemBlock.class, "Orange Glowstone", 0),
    RedGlowstone(BaseItemBlock.class, "Red Glowstone", 0),
    WhiteGlowstone(BaseItemBlock.class, "White Glowstone", 0),
    YellowGlowstone(BaseItemBlock.class, "Yellow Glowstone", 0),

    BlackIron(BaseItemBlock.class, "Black Iron", 0),
    BlueIron(BaseItemBlock.class, "Blue Iron", 0),
    BrownIron(BaseItemBlock.class, "Brown Iron", 0),
    CyanIron(BaseItemBlock.class, "Cyan Iron", 0),
    GrayIron(BaseItemBlock.class, "Gray Iron", 0),
    GreenIron(BaseItemBlock.class, "Green Iron", 0),
    LblueIron(BaseItemBlock.class, "Light Blue Iron", 0),
    LgrayIron(BaseItemBlock.class, "Light Gray Iron", 0),
    LimeIron(BaseItemBlock.class, "Lime Iron", 0),
    MagentaIron(BaseItemBlock.class, "Magenta Iron", 0),
    OrangeIron(BaseItemBlock.class, "Orange Iron", 0),
    PinkIron(BaseItemBlock.class, "Pink Iron", 0),
    PurpleIron(BaseItemBlock.class, "Purple Iron", 0),
    RedIron(BaseItemBlock.class, "Red Iron", 0),
    WhiteIron(BaseItemBlock.class, "White Iron", 0),
    YellowIron(BaseItemBlock.class, "Yellow Iron", 0),
    Granite ("Granite"),
    SmoothGranite ("Smooth Granite"),
    Andesite("Andesite"),
    SmoothAndesite ("Smooth Andesite"),
    Diorite ("Diorite"),
    SmoothDiorite("Smooth Diorite"),

    OldLamp("Old Lamp"),
    Gravel("Gravel", false),
    ZincBlock("Zinc Block"),
    SilverBlock("Silver Block"),
    CopperBlock("Copper Block"),
    AluminumBlock("Aluminum Block"),
    SteelBlock("Steel Block"),
    YellowGlow("Yellow Glow"),
    BlueGlow("Blue Glow"),
    BlackGlow("Black Glow"),
    WhiteGlow("White Glow"),
    RedGlow("Red Glow"),
    GreenGlow("Green Glow"),
    OrangeGlow("Orange Glow"),
    CyanGlow("Cyan Glow"),
    BrownGlow("Brown Glow"),
    GrayGlow("Gray Glow"),
    LgrayGlow("LgrayGlow"),
    LblueGlow("LblueGlow"),
    MagentaGlow("Magenta Glow"),
    PinkGlow("Pink Glow"),
    PurpleGlow("Purple Glow"),
    LimeGlow("Lime Glow"),

    vinyl(BaseItemBlock.class, 15);

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
     * @param blockName name of the block
     */
    MBlocksEnum(String blockName)
    {
        this.hasItemBlock = true;
        this.itemBlockClass = BaseItemBlock.class;
        this.blockName = blockName;
        this.MaxMetadata = ((byte) 0);
    }

    MBlocksEnum(String blockName, boolean allowMicroblock)
    {
        this.hasItemBlock = true;
        this.itemBlockClass = BaseItemBlock.class;
        this.blockName = blockName;
        this.MaxMetadata = (byte) (allowMicroblock ? 0 : -1);
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

    MBlocksEnum()
    {
        this.hasItemBlock = true;
        this.blockName = this.name();
        this.itemBlockClass = BaseItemBlock.class;
        this.MaxMetadata = (byte) 0;
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
