package agrifactory.item;

import agrifactory.AgriFactory;
import agrifactory.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    // Mod blocks group
    public static final ItemGroup AGRIFACTORY_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AgriFactory.MOD_ID, "agrifactory_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.agrifactory_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.SWEET_POTATO_BARREL)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SWEET_POTATO_BARREL);
                        entries.add(ModBlocks.BARLEY_BALE);
                    }).build());

    // Mod items group
    public static final ItemGroup AGRIFACTORY_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AgriFactory.MOD_ID, "agrifactory_items"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.agrifactory_items"))
                    .icon(() -> new ItemStack(ModItems.SWEET_POTATO)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SWEET_POTATO);
                        entries.add(ModItems.BARLEY);
                    }).build());

    public static void initialize() {
        AgriFactory.LOGGER.debug("Registering Mod Groups");
    }
}
