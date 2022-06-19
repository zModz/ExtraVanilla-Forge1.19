package com.drmodsq.extravanilla.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class modCreativeModeTab {
    public static final CreativeModeTab VANILLA_TAB = new CreativeModeTab("ExtraVanilla") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(modItens.Titanium.get());
        }
    };
}
