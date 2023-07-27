package tech.sethi.aaronmusk.cobblemonsandwiches;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.bukkit.event.EventPriority;

public class EventHandler {

    public static void event(Item item, ItemStack stack) {
        ItemConsumeEvent.CONSUME_ITEM.invoker().consume(item, stack);
    }
}
