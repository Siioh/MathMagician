package com.siioh.MathMagician.CreativeTabs;

import com.siioh.MathMagician.swords.MathMagicianSwordInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MathMagicianCreativeTab extends CreativeTabs {
	public MathMagicianCreativeTab(int id, String unlocalizedName) {
		 
        super(id, unlocalizedName);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		return MathMagicianSwordInit.mysticLightSword;
	}

}