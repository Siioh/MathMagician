package com.siioh.MathMagician.axes;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import com.siioh.MathMagician.MathMagician;
import com.siioh.MathMagician.items.MathMagicianItemInit;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ImpureMysticLightAxe extends MathMagicianAxe {

	public ImpureMysticLightAxe() {
		super(MathMagicianAxe.mysticLight);
		setUnlocalizedName("impureMysticLightAxe");
		setTextureName("MathMagician:impureMysticLightAxe");
		setCreativeTab(MathMagician.tabStandard);
	}

	@SuppressWarnings("unchecked")
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player,
			@SuppressWarnings("rawtypes") List list, boolean isHeld) {
		list.add(EnumChatFormatting.GRAY
				+ StatCollector.translateToLocal("tooltip.impure"));
		list.add(EnumChatFormatting.DARK_GRAY
				+ StatCollector
						.translateToLocal("tooltip.item.impureMysticTool.desc.0"));
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack) {
		return par2ItemStack.isItemEqual(new ItemStack(
				MathMagicianItemInit.impureLightIngot))
				|| super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}