package com.siioh.MathMagician.armor;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.siioh.MathMagician.MathMagician;
import com.siioh.MathMagician.items.MathMagicianItemInit;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MysticLightBoots extends MathMagicianArmor {

	boolean timeractive = false;

	public MysticLightBoots() {
		super(MathMagicianArmor.mysticLight, 1, 3);
		setUnlocalizedName("mysticLightBoots");
		setCreativeTab(MathMagician.tabStandard);
		setTextureName("MathMagician:mysticLight_boots");
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
	}

	@Override
	public void onArmorTick(World world, final EntityPlayer player,
			ItemStack itemStack) {
		if (player.getCurrentArmor(0) != null
				&& player.getCurrentArmor(0).getItem()
						.equals(MathMagicianArmorInit.mysticLightBoots)) {
			if (timeractive == false) {
				timeractive = true;
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						player.addPotionEffect(new PotionEffect(Potion.jump
								.getId(), 400, 1));
						timeractive = false;
					}
				}, 1 * 10 * 1000);
			}

		}
	}
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack,
			ItemStack par2ItemStack) {
		return par2ItemStack.isItemEqual(new ItemStack(
				MathMagicianItemInit.pureLightIngot))
				|| super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}
