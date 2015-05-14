package com.siioh.MathMagician.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import com.siioh.MathMagician.MathMagician;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DiamondClump extends MathMagicianItem {

	public DiamondClump() {
		setUnlocalizedName("diamondClump");
		setTextureName("MathMagician:diamondClump");
		setCreativeTab(MathMagician.tabStandard);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player,
			@SuppressWarnings("rawtypes") List list, boolean isHeld) {
		list.add(EnumChatFormatting.GREEN
				+ StatCollector.translateToLocal("tooltip."
						+ getUnlocalizedName() + ".desc.0"));
	}
}
