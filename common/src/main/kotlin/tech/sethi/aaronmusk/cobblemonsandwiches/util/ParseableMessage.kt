package tech.sethi.aaronmusk.cobblemonsandwiches.util

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer
import net.minecraft.text.Text
import net.kyori.adventure.text.format.TextDecoration

class ParseableMessage {
    fun parseMessageWithStyles(text: String, placeholder: String): Component {
        var mm = MiniMessage.miniMessage();
        return mm.deserialize(text.replace("{placeholder}", placeholder)).decoration(TextDecoration.ITALIC, false)
    }

    fun returnStyledText(text: String): Text {
        val component = parseMessageWithStyles(text, "placeholder")
        val gson = GsonComponentSerializer.gson()
        val json = gson.serialize(component)
        return Text.Serializer.fromJson(json) as Text
    }
}