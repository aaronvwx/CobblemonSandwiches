package tech.sethi.aaronmusk.cobblemonsandwiches.fabric;

import net.fabricmc.api.ModInitializer;
import tech.sethi.aaronmusk.cobblemonsandwiches.cobblemonsandwiches;

public class CobbledItemDropFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        cobblemonsandwiches.init();
    }
}