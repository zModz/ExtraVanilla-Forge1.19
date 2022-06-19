package com.drmodsq.extravanilla.item;


import com.drmodsq.extravanilla.extravanilla;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItens {
    public static final DeferredRegister<Item> ITENS = 
        DeferredRegister.create(ForgeRegistries.ITEMS, extravanilla.MODID);

    public static final RegistryObject<Item> Titanium = ITENS.register("titanium", () -> new Item(new Item.Properties().tab(modCreativeModeTab.VANILLA_TAB)));




    public static void register(IEventBus eventBus){
        ITENS.register(eventBus);
    }
}
