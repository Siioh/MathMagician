package com.siioh.MathMagician.shovels;

import net.minecraft.item.ItemSpade;

public class MathMagicianShovel extends ItemSpade {

	public static ToolMaterial mysticLight = net.minecraftforge.common.util.EnumHelper
			.addToolMaterial("mysticLight", 3, 1500, 15.0F, 3.5F, 30);
	
	public MathMagicianShovel(ToolMaterial material) {
		super(material);
	}
}
