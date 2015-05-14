package com.siioh.MathMagician.armor;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.siioh.MathMagician.items.MathMagicianItemInit;

import cpw.mods.fml.common.registry.GameRegistry;

public class MathMagicianArmorInit {
	
	public static ItemArmor mysticLightHelm;
	public static ItemArmor mysticLightChestplate;
	public static ItemArmor mysticLightLeggings;
	public static ItemArmor mysticLightBoots;
	
	public static ItemArmor impureMysticLightHelm;
	public static ItemArmor impureMysticLightChestplate;
	public static ItemArmor impureMysticLightLeggings;
	public static ItemArmor impureMysticLightBoots;

	public static void init() {
		mysticLightHelm = new MysticLightHelm();
		GameRegistry.registerItem(mysticLightHelm, "mysticLightHelm");
		mysticLightChestplate = new MysticLightChestplate();
		GameRegistry.registerItem(mysticLightChestplate, "mysticLightChestplate");
		mysticLightLeggings = new MysticLightLeggings();
		GameRegistry.registerItem(mysticLightLeggings, "mysticLightLeggings");
		mysticLightBoots = new MysticLightBoots();
		GameRegistry.registerItem(mysticLightBoots, "mysticLightBoots");
		
		impureMysticLightHelm = new ImpureMysticLightHelm();
		GameRegistry.registerItem(impureMysticLightHelm, "impureMysticLightHelm");
		impureMysticLightChestplate = new ImpureMysticLightChestplate();
		GameRegistry.registerItem(impureMysticLightChestplate, "impureMysticLightChestplate");
		impureMysticLightLeggings = new ImpureMysticLightLeggings();
		GameRegistry.registerItem(impureMysticLightLeggings, "impureMysticLightLeggings");
		impureMysticLightBoots = new ImpureMysticLightBoots();
		GameRegistry.registerItem(impureMysticLightBoots, "impureMysticBoots");
		
		//RenderingRegistry.addNewArmourRendererPrefix("5");
	}

	public static final void postInit() {
		GameRegistry.addRecipe(new ItemStack(mysticLightHelm), new Object[] {"xxx", "x x", "   ",
		'x', MathMagicianItemInit.pureLightIngot});
		//Alternate Helm Recipe
		GameRegistry.addRecipe(new ItemStack(mysticLightHelm), new Object[] {"   ", "xxx", "x x",
		'x', MathMagicianItemInit.pureLightIngot});
		GameRegistry.addRecipe(new ItemStack(mysticLightChestplate), new Object[] {"x x", "xxx", "xxx",
		'x', MathMagicianItemInit.pureLightIngot});
		GameRegistry.addRecipe(new ItemStack(mysticLightLeggings), new Object[] {"xxx", "x x", "x x",
		'x', MathMagicianItemInit.pureLightIngot});
		GameRegistry.addRecipe(new ItemStack(mysticLightBoots), new Object[] {"x x", "x x", "   ",
		'x', MathMagicianItemInit.pureLightIngot});
		//Alternate Boots Recipe
		GameRegistry.addRecipe(new ItemStack(mysticLightBoots), new Object[] {"   ", "x x", "x x",
		'x', MathMagicianItemInit.pureLightIngot});
		
		GameRegistry.addRecipe(new ItemStack(impureMysticLightHelm), new Object[] {"xxx", "x x", "   ",
		'x', MathMagicianItemInit.impureLightIngot});
		//Alternate Helm Recipe
		GameRegistry.addRecipe(new ItemStack(impureMysticLightHelm), new Object[] {"   ", "xxx", "x x",
		'x', MathMagicianItemInit.impureLightIngot});
		GameRegistry.addRecipe(new ItemStack(impureMysticLightChestplate), new Object[] {"x x", "xxx", "xxx",
		'x', MathMagicianItemInit.impureLightIngot});
		GameRegistry.addRecipe(new ItemStack(impureMysticLightLeggings), new Object[] {"xxx", "x x", "x x",
		'x', MathMagicianItemInit.impureLightIngot});
		GameRegistry.addRecipe(new ItemStack(impureMysticLightBoots), new Object[] {"x x", "x x", "   ",
		'x', MathMagicianItemInit.impureLightIngot});
		//Alternate Boots Recipe
		GameRegistry.addRecipe(new ItemStack(impureMysticLightBoots), new Object[] {"   ", "x x", "x x",
		'x', MathMagicianItemInit.impureLightIngot});
			
	}
}