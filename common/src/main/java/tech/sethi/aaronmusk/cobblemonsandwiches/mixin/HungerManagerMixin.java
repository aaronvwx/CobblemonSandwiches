package tech.sethi.aaronmusk.cobblemonsandwiches.mixin;

import net.minecraft.entity.player.HungerManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tech.sethi.aaronmusk.cobblemonsandwiches.EventHandler;

@Mixin(value = HungerManager.class, remap = false)
public abstract class HungerManagerMixin {


    @Inject(method = "eat", at = @At("HEAD"), cancellable = true)
    private void addPowers(Item item, ItemStack stack, CallbackInfo ci) {
        EventHandler.event(item, stack);
        System.out.println("test");
    }
}
