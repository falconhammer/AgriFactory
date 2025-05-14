package agrifactory.item;

import agrifactory.AgriFactory;
import agrifactory.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SWEET_POTATO = registerItem("sweet_potato", new Item(new FabricItemSettings().food(FoodComponents.POTATO)));
    public static final Item BARLEY = registerItem("barley", new Item(new FabricItemSettings()));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AgriFactory.MOD_ID, name), item);
    }

    public static void initialize() {
        AgriFactory.LOGGER.debug("Registering items");
    }
}
