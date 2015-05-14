package com.siioh.MathMagician;

import com.siioh.MathMagician.armor.MathMagicianArmorInit;
import com.siioh.MathMagician.axes.MathMagicianAxeInit;
import com.siioh.MathMagician.items.MathMagicianItemInit;
import com.siioh.MathMagician.pickaxes.MathMagicianPickaxeInit;
import com.siioh.MathMagician.shovels.MathMagicianShovelInit;
import com.siioh.MathMagician.swords.MathMagicianSwordInit;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

public class CommonProxy {

	public void registerRenderers() {
		// Stub
	}

	public void preInit(FMLInitializationEvent event) {
		MathMagicianItemInit.init();
		MathMagicianSwordInit.init();
		MathMagicianArmorInit.init();
		MathMagicianAxeInit.init();
		MathMagicianPickaxeInit.init();
		MathMagicianShovelInit.init();
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		MathMagicianSwordInit.postInit();
		MathMagicianArmorInit.postInit();
		MathMagicianItemInit.postInit();
		MathMagicianAxeInit.postInit();
		MathMagicianPickaxeInit.postInit();
		MathMagicianShovelInit.postInit();
	}
}