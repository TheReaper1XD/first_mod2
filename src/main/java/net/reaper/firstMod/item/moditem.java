package net.reaper.firstMod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.reaper.firstMod.FirstMod;

public class moditem {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);

    public static final RegistryObject<Item> KILLUA = ITEMS.register("killua", () -> new Item(new Item.Properties( )));

    public static final RegistryObject<Item> MOH =  ITEMS.register("moh", () -> new Item(new Item.Properties( )));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
