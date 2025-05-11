package agrifactory.client;

import agrifactory.AgriFactory;
import net.fabricmc.api.ClientModInitializer;

public class AgriFactoryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AgriFactory.LOGGER.info("Initializing client");
    }
}
