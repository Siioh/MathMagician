package com.siioh.MathMagician.swords;

import com.siioh.MathMagician.items.MathMagicianItemInit;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;

public class MathMagicianSwordInit {
	public static ItemSword mysticLightSword;
	public static ItemSword impureMysticLightSword;
	
	public static void init() {
		mysticLightSword = new MysticLightSword();
		GameRegistry.registerItem(mysticLightSword, "mysticLightSword");
		impureMysticLightSword = new ImpureMysticLightSword();
		GameRegistry.registerItem(impureMysticLightSword, "impureMysticLightSword");
	}
	
	public static void postInit() {
		GameRegistry.addRecipe(new ItemStack(mysticLightSword), new Object[] {" x ", " x ", " y ",
			'x', MathMagicianItemInit.pureLightIngot, 'y', MathMagicianItemInit.stickOfLight} );
		//Two Alternatives
		GameRegistry.addRecipe(new ItemStack(mysticLightSword), new Object[] {"x  ", "x  ", "y  ",
			'x', MathMagicianItemInit.pureLightIngot, 'y', MathMagicianItemInit.stickOfLight} );
		GameRegistry.addRecipe(new ItemStack(mysticLightSword), new Object[] {"  x", "  x", "  y",
			'x', MathMagicianItemInit.pureLightIngot, 'y', MathMagicianItemInit.stickOfLight} );
		
		GameRegistry.addRecipe(new ItemStack(impureMysticLightSword), new Object[] {" x ", " x ", " y ",
			'x', MathMagicianItemInit.pureLightIngot, 'y', MathMagicianItemInit.stickOfLight} );
		//Two Alternatives
		GameRegistry.addRecipe(new ItemStack(impureMysticLightSword), new Object[] {"x  ", "x  ", "y  ",
			'x', MathMagicianItemInit.pureLightIngot, 'y', MathMagicianItemInit.stickOfLight} );
		GameRegistry.addRecipe(new ItemStack(impureMysticLightSword), new Object[] {"  x", "  x", "  y",
			'x', MathMagicianItemInit.pureLightIngot, 'y', MathMagicianItemInit.stickOfLight} );
	}
}