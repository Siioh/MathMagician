package com.siioh.MathMagician.armor;

import java.util.List;
import java.util.Random;
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

public class MysticLightLeggings extends MathMagicianArmor {

	Random rand = new Random();
	boolean timeractive = false;

	public MysticLightLeggings() {
		super(MathMagicianArmor.mysticLight, 1, 2);
		setUnlocalizedName("mysticLightLeggings");
		setCreativeTab(MathMagician.tabStandard);
		setTextureName("MathMagician:mysticLight_leggings");
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
	}

	@Override
	public void onArmorTick(World world, final EntityPlayer player,
			ItemStack itemStack) {
		if (player.getCurrentArmor(1) != null
				&& player.getCurrentArmor(1).getItem()
						.equals(MathMagicianArmorInit.mysticLightLeggings)) {
			if (timeractive == false) {
				timeractive = true;
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						player.addPotionEffect(new PotionEffect(
								Potion.moveSpeed.getId(), 400, 1));
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