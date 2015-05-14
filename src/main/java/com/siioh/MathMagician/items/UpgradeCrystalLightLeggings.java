package com.siioh.MathMagician.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class UpgradeCrystalLightLeggings extends LightUpgradeCrystal {
	
	public UpgradeCrystalLightLeggings() {
		setUnlocalizedName("upgradeCrystalLightLeggings");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player,
			@SuppressWarnings("rawtypes") List list, boolean isHeld) {
		list.add(EnumChatFormatting.AQUA
				+ StatCollector.translateToLocal("tooltip.pure"));
		list.add(EnumChatFormatting.DARK_PURPLE
				+ StatCollector.translateToLocal("tooltip.item.upgradeCrystal.desc.0"));
		list.add(EnumChatFormatting.DARK_AQUA
				+ StatCollector.translateToLocal("tooltip."
						+ getUnlocalizedName() + ".desc.0"));
	}

}
