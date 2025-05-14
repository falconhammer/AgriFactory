package agrifactory.block;

import agrifactory.AgriFactory;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SWEET_POTATO_BARREL = registerBlock("sweet_potato_barrel",
            new Block(FabricBlockSettings.copyOf(Blocks.BARREL)));
    public static final Block BARLEY_BALE = registerBlock("barley_bale",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AgriFactory.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AgriFactory.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void initialize() {
        AgriFactory.LOGGER.debug("Registering blocks");
    }
}
