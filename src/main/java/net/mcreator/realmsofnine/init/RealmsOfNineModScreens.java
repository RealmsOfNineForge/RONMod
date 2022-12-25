
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.realmsofnine.client.gui.Tier3GUIScreen;
import net.mcreator.realmsofnine.client.gui.Tier2GUIScreen;
import net.mcreator.realmsofnine.client.gui.Tier1GUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RealmsOfNineModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RealmsOfNineModMenus.TIER_1_GUI.get(), Tier1GUIScreen::new);
			MenuScreens.register(RealmsOfNineModMenus.TIER_2_GUI.get(), Tier2GUIScreen::new);
			MenuScreens.register(RealmsOfNineModMenus.TIER_3_GUI.get(), Tier3GUIScreen::new);
		});
	}
}
