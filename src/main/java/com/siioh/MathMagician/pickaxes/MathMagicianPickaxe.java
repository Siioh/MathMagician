package com.siioh.MathMagician.pickaxes;

import net.minecraft.item.ItemPickaxe;

public class MathMagicianPickaxe extends ItemPickaxe {

	public static ToolMaterial mysticLight = net.minecraftforge.common.util.EnumHelper
			.addToolMaterial("mysticLight", 3, 1500, 15.0F, 3.5F, 30);
	
	public MathMagicianPickaxe(ToolMaterial material) {
		super(material);
	}
}
