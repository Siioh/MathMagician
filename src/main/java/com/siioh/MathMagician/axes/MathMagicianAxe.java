package com.siioh.MathMagician.axes;

import net.minecraft.item.ItemAxe;

public class MathMagicianAxe extends ItemAxe {

	public static ToolMaterial mysticLight = net.minecraftforge.common.util.EnumHelper
			.addToolMaterial("mysticLight", 3, 1500, 15.0F, 3.5F, 30);
	
	public MathMagicianAxe(ToolMaterial material) {
		super(material);
	}
}