package com.pulsesapphire.testmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Item item1 = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier("testItem", "test_item"), item1);
	}
}