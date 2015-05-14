package com.siioh.MathMagician.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MathMagicianArmor extends ItemArmor {
	public static ArmorMaterial mysticLight = net.minecraftforge.common.util.EnumHelper
			.addArmorMaterial("mysticLight", 30, new int[] { 4, 9, 7, 4 }, 30);

	public MathMagicianArmor(ArmorMaterial material, int renderType,
			int armorType) {
		super(material, renderType, armorType);
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String layer) {
		if ((itemstack.getItem() == MathMagicianArmorInit.mysticLightHelm)
				|| (itemstack.getItem() == MathMagicianArmorInit.mysticLightChestplate)
				|| (itemstack.getItem() == MathMagicianArmorInit.mysticLightBoots)) {
			return "MathMagician:textures/models/armor/mysticLightArmor_1.png";
		}
		if (itemstack.getItem() == MathMagicianArmorInit.mysticLightLeggings) {
			return "MathMagician:textures/models/armor/mysticLightArmor_2.png";
		}
		
		if ((itemstack.getItem() == MathMagicianArmorInit.impureMysticLightHelm)
				|| (itemstack.getItem() == MathMagicianArmorInit.impureMysticLightChestplate)
				|| (itemstack.getItem() == MathMagicianArmorInit.impureMysticLightBoots)) {
			return "MathMagician:textures/models/armor/impureMysticLightArmor_1.png";
		}
		if (itemstack.getItem() == MathMagicianArmorInit.impureMysticLightLeggings) {
			return "MathMagician:textures/models/armor/impureMysticLightArmor_2.png";
		}
		return null;
	}
}