package tech.sethi.aaronmusk.cobblemonsandwiches.forge;

import dev.architectury.platform.forge.EventBuses;
import tech.sethi.aaronmusk.cobblemonsandwiches.CobblemonSandwiches;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CobblemonSandwiches.MOD_ID)
public class CobbledItemDropForge {
    public CobbledItemDropForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(CobblemonSandwiches.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        CobblemonSandwiches.init();
    }
}