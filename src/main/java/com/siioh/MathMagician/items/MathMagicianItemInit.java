package com.siioh.MathMagician.items;

import com.siioh.MathMagician.armor.MathMagicianArmorInit;
import com.siioh.MathMagician.swords.MathMagicianSwordInit;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MathMagicianItemInit {
	public static Item impureClumpOfLight;
	public static Item pureClumpOfLight;
	public static Item impureLightIngot;
	public static Item pureLightIngot;
	public static Item stickOfLight;
	public static Item upgradeCrystalLightHelm;
	public static Item upgradeCrystalLightChestplate;
	public static Item upgradeCrystalLightLeggings;
	public static Item upgradeCrystalLightBoots;
	public static Item upgradeCrystalLightSword;
	public static Item blankCrystal;
	public static Item diamondClump;

	public static void init() {
		impureClumpOfLight = new ImpureClumpOfLight();
		GameRegistry.registerItem(impureClumpOfLight, "impureClumpOfLight");
		pureClumpOfLight = new PureClumpOfLight();
		GameRegistry.registerItem(pureClumpOfLight, "pureClumpOfLight");
		impureLightIngot = new ImpureLightIngot();
		GameRegistry.registerItem(impureLightIngot, "impureLightIngot");
		pureLightIngot = new PureLightIngot();
		GameRegistry.registerItem(pureLightIngot, "pureLightIngot");
		stickOfLight = new StickOfLight();
		GameRegistry.registerItem(stickOfLight, "stickOfLight");
		upgradeCrystalLightHelm = new UpgradeCrystalLightHelm();
		GameRegistry.registerItem(upgradeCrystalLightHelm,
				"upgradeCrystalLightHelm");
		upgradeCrystalLightChestplate = new UpgradeCrystalLightChestplate();
		GameRegistry.registerItem(upgradeCrystalLightChestplate,
				"upgradeCrystalLightChestplate");
		upgradeCrystalLightLeggings = new UpgradeCrystalLightLeggings();
		GameRegistry.registerItem(upgradeCrystalLightLeggings,
				"upgradeCrystalLightLeggings");
		upgradeCrystalLightBoots = new UpgradeCrystalLightBoots();
		GameRegistry.registerItem(upgradeCrystalLightBoots,
				"upgradeCrystalLightBoots");
		upgradeCrystalLightSword = new UpgradeCrystalLightSword();
		GameRegistry.registerItem(upgradeCrystalLightSword,
				"upgradeCrystalLightSword");
		blankCrystal = new BlankCrystal();
		GameRegistry.registerItem(blankCrystal, "blankCrystal");
		diamondClump = new DiamondClump();
		GameRegistry.registerItem(diamondClump, "diamondClump");
	}

	public static void postInit() {
		GameRegistry.addRecipe(new ItemStack(impureClumpOfLight), new Object[] {
				"xxx", "xyx", "xxx", 'x', Blocks.daylight_detector, 'y',
				Blocks.redstone_block });
		GameRegistry.addRecipe(new ItemStack(pureClumpOfLight), new Object[] {
				" y ", "yxy", " x ", 'x', impureClumpOfLight, 'y',
				Items.diamond });
		GameRegistry.addRecipe(new ItemStack(stickOfLight), new Object[] {
				"  y", " x ", "y  ", 'x', Items.stick, 'y',
				Blocks.daylight_detector });
		GameRegistry.addRecipe(new ItemStack(blankCrystal), new Object[] {
				" x ", "x x", " x ", 'x', Blocks.glass });
		GameRegistry.addShapelessRecipe(new ItemStack(diamondClump),
				new ItemStack(Items.diamond, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2),
				new ItemStack(diamondClump));

		GameRegistry.addRecipe(new ItemStack(upgradeCrystalLightHelm),
				new Object[] { "xxx", "x x", " y ", 'x', diamondClump, 'y',
						blankCrystal });
		GameRegistry.addRecipe(new ItemStack(upgradeCrystalLightChestplate),
				new Object[] { "xyx", "xxx", "xxx", 'x', diamondClump, 'y',
						blankCrystal });
		GameRegistry.addRecipe(new ItemStack(upgradeCrystalLightLeggings),
				new Object[] {"xxx", "x x", "xyx", 'x', diamondClump, 'y',
						blankCrystal });
		GameRegistry.addRecipe(new ItemStack(upgradeCrystalLightBoots),
				new Object[] {"xyx", "x x", "   ", 'x', diamondClump, 'y',
						blankCrystal });

		GameRegistry.addShapelessRecipe(new ItemStack(
				MathMagicianArmorInit.mysticLightHelm), new ItemStack(
				upgradeCrystalLightHelm), new ItemStack(
				MathMagicianArmorInit.impureMysticLightHelm));
		GameRegistry.addShapelessRecipe(new ItemStack(
				MathMagicianArmorInit.mysticLightChestplate), new ItemStack(
				upgradeCrystalLightChestplate), new ItemStack(
				MathMagicianArmorInit.impureMysticLightChestplate));
		GameRegistry.addShapelessRecipe(new ItemStack(
				MathMagicianArmorInit.mysticLightLeggings), new ItemStack(
				upgradeCrystalLightLeggings), new ItemStack(
				MathMagicianArmorInit.impureMysticLightLeggings));
		GameRegistry.addShapelessRecipe(new ItemStack(
				MathMagicianArmorInit.mysticLightBoots), new ItemStack(
				upgradeCrystalLightBoots), new ItemStack(
				MathMagicianArmorInit.impureMysticLightBoots));
		GameRegistry.addShapelessRecipe(new ItemStack(
				MathMagicianSwordInit.mysticLightSword), new ItemStack(
				upgradeCrystalLightSword), new ItemStack(
				MathMagicianSwordInit.impureMysticLightSword));

		GameRegistry.addSmelting(impureClumpOfLight, new ItemStack(
				impureLightIngot), 1.0F);
		GameRegistry.addSmelting(pureClumpOfLight,
				new ItemStack(pureLightIngot), 2.0F);
	}
}
