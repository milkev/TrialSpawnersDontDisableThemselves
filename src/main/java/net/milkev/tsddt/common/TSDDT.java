package net.milkev.tsddt.common;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class TSDDT implements ModInitializer {


	public static final String MOD_ID = "tsddt";
	
	@Override
	public void onInitialize() {
		
		System.out.println(MOD_ID + " Initialized");
	}


}
