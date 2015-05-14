package com.siioh.MathMagician.shovels;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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

public class MysticLightShovel extends MathMagicianShovel {

	boolean timeractive = false;
	
	public MysticLightShovel() {
		super(MathMagicianShovel.mysticLight);
		setUnlocalizedName("mysticLightShovel");
		setTextureName("MathMagician:mysticLightShovel");
		setCreativeTab(MathMagician.tabStandard);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player,
			@SuppressWarnings("rawtypes") List list, boolean isHeld) {
		list.add(EnumChatFormatting.AQUA
				+ StatCollector.translateToLocal("tooltip.pure"));
		list.add(EnumChatFormatting.DARK_PURPLE
				+ StatCollector
						.translateToLocal("tooltip.item.mysticLightTool.desc.0"));
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, final Entity entity,
			int slot, boolean active) {
		if (active = true && slot > 0 && slot <= 8) {
			if (timeractive == false) {
				timeractive = true;
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						((EntityLivingBase) entity)
								.addPotionEffect(new PotionEffect(
										Potion.digSpeed.getId(), 20, 1));
						timeractive = false;
					}
				}, 1 * 1 * 1000);
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