package com.siioh.MathMagician.swords;

import net.minecraft.item.ItemSword;

public class MathMagicianSword extends ItemSword {
	
	public static ToolMaterial mysticLight = net.minecraftforge.common.util.EnumHelper
			.addToolMaterial("mysticLight", 3, 1500, 15.0F, 3.5F, 30);
	
	public MathMagicianSword(ToolMaterial material) {
		super(material);
	}
}