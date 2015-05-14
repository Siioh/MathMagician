package com.siioh.MathMagician;

import com.siioh.MathMagician.CreativeTabs.MathMagicianCreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "MathMagicianMod", name = "Math Magician", version = "1.0")
public class MathMagician {

	public static CreativeTabs tabStandard = new MathMagicianCreativeTab(
			CreativeTabs.getNextID(), "mysticCreativeTab");

	// The instance of your mod that Forge uses.
	@Instance(value = "MathMagicianMod")
	public static MathMagician instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "com.siioh.MathMagician.client.ClientProxy", serverSide = "com.siioh.MathMagician.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Stub
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.preInit(event);
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}