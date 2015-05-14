package com.siioh.MathMagician.axes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemAxe;

public class MathMagicianAxeInit {
	public static ItemAxe mysticLightAxe;
	public static ItemAxe impureMysticLightAxe;

	public static void init() {
		mysticLightAxe = new MysticLightAxe();
		GameRegistry.registerItem(mysticLightAxe, "mysticLightAxe");
		impureMysticLightAxe = new ImpureMysticLightAxe();
		GameRegistry.registerItem(impureMysticLightAxe, "impureMysticLightAxe");
	}

	public static void postInit() {
		// stub
	}
}