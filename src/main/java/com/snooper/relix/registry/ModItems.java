package com.snooper.relix.registry;

import com.snooper.relix.Relix;
import com.snooper.relix.items.EarthHammer;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final ToolItem WATER_SWORD = new SwordItem(ToolMaterials.NETHERITE, 13, 6.0F, new Item.Settings().group(Relix.ITEM_GROUP));
    public static final BowItem WIND_BOW = new BowItem(new Item.Settings().group(Relix.ITEM_GROUP));
    public static final EarthHammer EARTH_HAMMER = new EarthHammer(ToolMaterials.NETHERITE, 5, 5.0F, new Item.Settings().group(Relix.ITEM_GROUP));
    public static final ToolItem FIRE_DAGGER = new SwordItem(ToolMaterials.NETHERITE, 10, 15.0F, new Item.Settings().group(Relix.ITEM_GROUP));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Relix.MOD_ID, "water_sword"), WATER_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Relix.MOD_ID, "wind_bow"), WIND_BOW);
        Registry.register(Registry.ITEM, new Identifier(Relix.MOD_ID, "earth_hammer"), EARTH_HAMMER);
        Registry.register(Registry.ITEM, new Identifier(Relix.MOD_ID, "fire_dagger"), FIRE_DAGGER);
    }
}
