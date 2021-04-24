package com.snooper.relix;

import com.snooper.relix.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Relix implements ModInitializer {

    public static final String MOD_ID = "relix";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(ModItems.WATER_SWORD)
    );

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
