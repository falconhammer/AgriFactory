package agrifactory;

import agrifactory.block.ModBlocks;
import agrifactory.item.ModItemGroup;
import agrifactory.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgriFactory implements ModInitializer {
	public static final String MOD_ID = "agrifactory";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.initialize();
		ModItems.initialize();
		ModBlocks.initialize();
	}
}