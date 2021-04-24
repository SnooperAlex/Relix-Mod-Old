package com.snooper.relix.registry;

import com.snooper.relix.Relix;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item WATER_SWORD = new Item(new FabricItemSettings().group(Relix.ITEM_GROUP));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier("relix", "water_sword"), WATER_SWORD);
    }
}
