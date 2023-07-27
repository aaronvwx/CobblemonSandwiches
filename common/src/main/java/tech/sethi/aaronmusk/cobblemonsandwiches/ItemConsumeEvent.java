package tech.sethi.aaronmusk.cobblemonsandwiches;

import dev.architectury.event.Event;
import dev.architectury.event.EventFactory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface ItemConsumeEvent {

    Event<ItemConsume> CONSUME_ITEM = EventFactory.createEventResult();

    interface ItemConsume {
        void consume(Item item, ItemStack stack);
    }
}
