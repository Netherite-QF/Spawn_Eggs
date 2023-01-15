package com.mao.morespawneggs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreSpawnEggs implements ModInitializer {
    public static final Item IRON_GOLEM_SPAWN_EGG = new SpawnEggItem(EntityType.IRON_GOLEM,13023920,6062632,new Item.Settings());
    public static final Item SNOW_GOLEM_SPAWN_EGG = new SpawnEggItem(EntityType.SNOW_GOLEM,12243152,6783875,new Item.Settings());
    public static final Item ENDER_DRAGON_SPAWN_EGG = new SpawnEggItem(EntityType.ENDER_DRAGON,12806618,1710618,new Item.Settings());
    public static final Item WITHER_SPAWN_EGG = new SpawnEggItem(EntityType.WITHER,4416395,1250067,new Item.Settings());
    public static final ItemGroup MORE_SPAWN_EGG = FabricItemGroupBuilder.create(
            new Identifier("more_spawn_eggs","more_spawn_eggs"))
            .icon(() -> new ItemStack(MoreSpawnEggs.IRON_GOLEM_SPAWN_EGG))
            .appendItems(itemStacks -> {
                itemStacks.add(new ItemStack(MoreSpawnEggs.IRON_GOLEM_SPAWN_EGG));
                itemStacks.add(new ItemStack(MoreSpawnEggs.SNOW_GOLEM_SPAWN_EGG));
                itemStacks.add(new ItemStack(MoreSpawnEggs.WITHER_SPAWN_EGG));
                itemStacks.add(new ItemStack(MoreSpawnEggs.ENDER_DRAGON_SPAWN_EGG));
            })
            .build();
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM,
                new Identifier("more_spawn_eggs","iron_golem_spawn_egg"),IRON_GOLEM_SPAWN_EGG);
        Registry.register(Registry.ITEM,
                new Identifier("more_spawn_eggs","snow_golem_spawn_egg"),SNOW_GOLEM_SPAWN_EGG);
        Registry.register(Registry.ITEM,
                new Identifier("more_spawn_eggs","ender_dragon_spawn_egg"),ENDER_DRAGON_SPAWN_EGG);
        Registry.register(Registry.ITEM,
                new Identifier("more_spawn_eggs","wither_spawn_egg"),WITHER_SPAWN_EGG);
    }
}
