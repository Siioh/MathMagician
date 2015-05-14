package com.siioh.MathMagician.swords;

import java.util.List;

import com.siioh.MathMagician.MathMagician;
import com.siioh.MathMagician.items.MathMagicianItemInit;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class MysticLightSword extends MathMagicianSword {

	public MysticLightSword() {
		super(MathMagicianSword.mysticLight);
		setCreativeTab(MathMagician.tabStandard);
		setUnlocalizedName("mysticLightSword");
		setTextureName("MathMagician:mysticLightSword");
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase hitEntity,
			EntityLivingBase attackingEntity) {

		@SuppressWarnings("unused")
		boolean hasFireAspect = false;

		if (stack.stackTagCompound != null) {
			if (stack.stackTagCompound.getTag("ench") != null) {
				NBTTagList enchants = (NBTTagList) stack.stackTagCompound
						.getTag("ench");
				for (int i = 0; i < enchants.tagCount(); i++) {
					NBTTagCompound enchant = ((NBTTagList) enchants)
							.getCompoundTagAt(i);
					if (enchant.getInteger("id") == 20) {
						hasFireAspect = true;
						break;
					}
				}
			}
			if (hasFireAspect = true) {
				hitEntity.setFire(10);
			}
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player,
			@SuppressWarnings("rawtypes") List list, boolean isHeld) {
		list.add(EnumChatFormatting.AQUA
				+ StatCollector.translateToLocal("tooltip.pure"));
		list.add(EnumChatFormatting.DARK_PURPLE
				+ StatCollector.translateToLocal("tooltip."
						+ getUnlocalizedName() + ".desc.0"));
		list.add(EnumChatFormatting.DARK_PURPLE
				+ StatCollector.translateToLocal("tooltip."
						+ getUnlocalizedName() + ".desc.1"));
		list.add(EnumChatFormatting.DARK_PURPLE
				+ StatCollector.translateToLocal("tooltip."
						+ getUnlocalizedName() + ".desc.2"));
		list.add(EnumChatFormatting.DARK_PURPLE
				+ StatCollector.translateToLocal("tooltip."
						+ getUnlocalizedName() + ".desc.3"));
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack) {
		return par2ItemStack.isItemEqual(new ItemStack(
				MathMagicianItemInit.pureLightIngot))
				|| super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}