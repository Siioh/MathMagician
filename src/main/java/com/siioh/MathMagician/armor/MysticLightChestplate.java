package com.siioh.MathMagician.armor;

import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.siioh.MathMagician.MathMagician;
import com.siioh.MathMagician.items.MathMagicianItemInit;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MysticLightChestplate extends MathMagicianArmor {

	Random generator = new Random();
	boolean timeractive = false;
	boolean alternateTimerActive = false;

	public MysticLightChestplate() {
		super(MathMagicianArmor.mysticLight, 1, 1);
		setUnlocalizedName("mysticLightChestplate");
		setCreativeTab(MathMagician.tabStandard);
		setTextureName("MathMagician:mysticLight_chestplate");
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
	public void onArmorTick(final World world, final EntityPlayer player,
			ItemStack itemStack) {
		if (player.getCurrentArmor(2) != null
				&& player.getCurrentArmor(2).getItem()
						.equals(MathMagicianArmorInit.mysticLightChestplate)) {
			if (timeractive == false) {
				final int i = generator.nextInt(2) + 1;
				timeractive = true;
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						if (i == 1) {
							player.addChatMessage(new ChatComponentTranslation(
									"msg.randomchestplate.txt.0"));
							player.addChatMessage(new ChatComponentTranslation(
									"msg.randomchestplate.txt.1"));
							player.addExperienceLevel(1);
							player.addPotionEffect(new PotionEffect(
									Potion.resistance.getId(), 600));
						}
						timeractive = false;
					}
				}, 1 * 60 * 1000);
			}
			if (player.getCurrentArmor(0) != null
					&& player.getCurrentArmor(0).getItem()
							.equals(MathMagicianArmorInit.mysticLightBoots)) {
				if (player.getCurrentArmor(1) != null
						&& player
								.getCurrentArmor(1)
								.getItem()
								.equals(MathMagicianArmorInit.mysticLightLeggings)) {
					if (player.getCurrentArmor(3) != null
							&& player
									.getCurrentArmor(3)
									.getItem()
									.equals(MathMagicianArmorInit.mysticLightHelm)) {
						if (alternateTimerActive == false) {
							final double x = player.posX;
							final double y = player.posY;
							final double z = player.posZ;
							alternateTimerActive = true;
							Timer alternateTime = new Timer();
							alternateTime.schedule(new TimerTask() {
								@Override
								public void run() {
									int particleSpawns = 10;
									while (particleSpawns > 0) {
										boolean randbool1 = generator
												.nextBoolean();
										boolean randbool2 = generator
												.nextBoolean();
										double randdouble1 = generator
												.nextDouble();
										double randdouble2 = generator
												.nextDouble();
										if (randbool1 == randbool2) {
											randdouble1 = -randdouble1 - 1;
											randdouble2 = randdouble2 + 1;
										}
										randbool1 = generator.nextBoolean();
										randbool2 = generator.nextBoolean();
										if (randbool1 == randbool2) {
											randdouble2 = -randdouble2 - 1;
											randdouble1 = randdouble1 + 1;
										}
										world.spawnParticle("enchantmenttable",
												x, y + 1.5, z, randdouble1, 0,
												randdouble2);
										particleSpawns = particleSpawns - 1;
										world.spawnParticle("fireworksSpark", x, y - 1, z, 0, 0, 0);
										world.spawnParticle("fireworksSpark", x + 0.5, y - 1, z, 0, 0, 0);
										world.spawnParticle("fireworksSpark", x, y - 1, z + 0.5, 0, 0, 0);
										world.spawnParticle("fireworksSpark", x - 0.5, y - 1, z, 0, 0, 0);
										world.spawnParticle("fireworksSpark", x, y - 1, z - 0.5, 0, 0, 0);
									}
									alternateTimerActive = false;
								}
							}, 1 * 1 * 250);
						}
					}
				}
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