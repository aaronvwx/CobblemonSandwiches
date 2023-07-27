package tech.sethi.aaronmusk.cobblemonsandwiches

import dev.architectury.event.CompoundEventResult
import dev.architectury.event.Event
import dev.architectury.event.EventFactory
import dev.architectury.event.EventResult
import dev.architectury.event.events.common.InteractionEvent
import dev.architectury.event.events.common.LifecycleEvent
import dev.architectury.event.events.common.PlayerEvent
import net.minecraft.entity.ItemEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.server.MinecraftServer
import org.apache.logging.log4j.LogManager

object CobblemonSandwiches  {


    const val MOD_ID = "cobblemonsandwiches"
    val LOGGER = LogManager.getLogger()
    public var mcserver: MinecraftServer? = null

    @JvmStatic
    fun init() {
        LOGGER.info("AaronMusk's Cobblemon Sandwiches Initialized!")

        LifecycleEvent.SERVER_STARTED.register { server ->
            mcserver = server



            EventResult.pass()

        }

        ItemConsumeEvent.CONSUME_ITEM.register { item, stack ->

            LOGGER.info(item)
            LOGGER.info(stack)

            EventResult.pass()
        }
    }

}

/* Ingredients:

    Tomato: Tamato Berry
    Banana: Nanab Berry
    Cherry Tomato: Tamato Berry
    Kiwi: Wiki Berry
    Pineapple: Pinap Berry
    Apple: Leppa Berry
    Strawberry: Rawst Berry
    Orange: Oran Berry
    Guava: Aguav Berry
    Papaya: Iapapa Berry
    Raspberry: Razz Berry
    Grape: Grepa Berry
    Watermelon: Watmel Berry
    Peach: Pecha Berry
    Cherry: Cheri Berry
    Pickle:
        Craft: (Cookie: 3000001) Furnace: 1x Sea Pickle -> 1x Pickle
    Noodles:
        Craft: (Bread: 3000001) Shaped: ",Wheat," | ",Wheat," | ",Wheat,"
    Lettuce:
        Craft: (Cookie: 3000004) Unshaped: 4x Kelpsy Berry -> Lettuce
    Lemon: Nomel Berry
    Mayonnaise:
        Craft: (Cookie: 3000006) Unshaped: 1x Egg, 1x Lemon -> 1x Mayonnaise
    Potato Salad:
        Craft: (Potato: 3000001) Unshaped: 4x Potato, 1x Mayonnaise -> 1x Potato Salad
    Bacon:
        Craft: (Porkchop: 3000001) Campfire Cooking: 1x Raw Porkchop -> 1x Bacon
    Potato Tortilla:
        Craft: (Bread: 3000002) Shaped: "Wheat,Wheat,Wheat" | "Wheat,Potato,Wheat" | "Wheat,Wheat,Wheat" -> 1x Potato Tortilla
    Egg: Egg
    Chorizo:
        Craft: (Porkchop: 3000002) Smoker: 1x Raw Porkchop -> 1x Chorizo
    Smoked Fillet:
        Craft: (Steak: 3000001) Smoker: 1x Raw Beef -> 1x Smoked Fillet
    Watercress:
        Craft: (Cookie: 3000007) Unshaped: 4x Sea Grass -> 1x Watercress
    Hamburger:
        Craft: (Steak: 3000002) Campfire Cooking: 1x Raw Beef -> 1x Hamburger
    Basil:
        Craft: (Cookie: 3000008) Unshaped: 1x Grass -> 1x Basil
    Jam:
        Craft: (Cookie: 3000009) Unshaped: 1x Glass Bottle, 1x Strawberry, 1x Sugar -> 1x Jam
    Whipped Cream:
        Craft: (Cookie: 3000010) Unshaped: 1x Whipped Dream -> 1x Whipped Cream
    Butter:
        Craft: (Cookie: 3000011) Unshaped: 1x Bucket of Milk, 1x Whipped Cream -> 1x Butter + 1x Bucket
    Cheese:
        Craft: (Cookie: 3000012) Unshaped: 1x Bucket of Milk -> 1x Cheese + 1x Bucket
    Cream Cheese:
        Craft: (Cookie: 3000013) Unshaped: 1x Cheese, 1x Whipped Cream -> 1x Cream Cheese
    Yoghurt:
        Craft: (Cookie: 3000014) Unshaped: 1x Sweet Berries, 1x Bucket of Milk, 1x Sugar -> 1x Yoghurt + 1x Bucket
    Ketchup:
        Craft: (Cookie: 3000015) Unshaped: 1x Glass Bottle, 1x Tomato, 1x Sugar -> 1x Ketchup
    Corn Oil:
        Craft: (Cookie: 3000016) Brewing: Corn (Base) + Blaze Powder (C) -> Corn Oil
    Fried Fillet:
        Craft: (Steak: 3000003) Brewing: Raw Beef (Base) + Blaze Powder (C) -> Fried Fillet
    Marmalade:
        Craft: (Cookie: 3000017) Unshaped: 1x Glass Bottle, 1x Orange, 1x Sugar -> 1x Marmalade






    Jalapeno:
        Craft: (Cookie: 3000002) Brewing: Small Dripleaf (Base) + Crimson Root (C) -> 1 Jalapeno
    Olive Oil:
        Craft: (Cookie: 3000005) Brewing: Small Dripleaf (Base) + Pickle (C) -> 1x Olive Oil
    Rice:
        Craft: (Cookie: 3000003) Shaped: ",Seeds," | "Seeds,Water Bucket,Seeds" | ",Seeds," -> 4x Rice + 1 Bucket

 */


/* Sandwiches

Jambon Beurre:
    Ingredients: ",," | ",," | ",bread,"
    Powers:
        -
        -
        -


*/