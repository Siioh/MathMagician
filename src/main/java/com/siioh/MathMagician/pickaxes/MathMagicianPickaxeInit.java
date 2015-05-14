package com.siioh.MathMagician.pickaxes;

import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.common.registry.GameRegistry;

public class MathMagicianPickaxeInit {
	public static ItemPickaxe mysticLightPickaxe;
	public static ItemPickaxe impureMysticLightPickaxe;
	
	public static void init() {
		mysticLightPickaxe = new MysticLightPickaxe();
		GameRegistry.registerItem(mysticLightPickaxe, "mysticLightPickaxe");
		impureMysticLightPickaxe = new ImpureMysticLightPickaxe();
		GameRegistry.registerItem(impureMysticLightPickaxe, "impureMysticLightPickaxe");
	}
	
	public static void postInit() {
		// Stub
	}
}