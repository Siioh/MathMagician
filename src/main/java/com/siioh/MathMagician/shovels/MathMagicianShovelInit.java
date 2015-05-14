package com.siioh.MathMagician.shovels;

import net.minecraft.item.ItemSpade;
import cpw.mods.fml.common.registry.GameRegistry;

public class MathMagicianShovelInit {
	public static ItemSpade mysticLightShovel;
	public static ItemSpade impureMysticLightShovel;

	public static void init() {
		mysticLightShovel = new MysticLightShovel();
		GameRegistry.registerItem(mysticLightShovel, "mysticLightShovel");
		impureMysticLightShovel = new ImpureMysticLightShovel();
		GameRegistry.registerItem(impureMysticLightShovel, "impureMysticLightShovel");
	}
	
	public static void postInit() {
		// stub
	}
}
