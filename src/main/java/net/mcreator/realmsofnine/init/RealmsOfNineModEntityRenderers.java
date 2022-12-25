
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.realmsofnine.client.renderer.WispRenderer;
import net.mcreator.realmsofnine.client.renderer.RaidersRenderer;
import net.mcreator.realmsofnine.client.renderer.MidgardianRenderer;
import net.mcreator.realmsofnine.client.renderer.LightElvesRenderer;
import net.mcreator.realmsofnine.client.renderer.DarkElfRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RealmsOfNineModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RealmsOfNineModEntities.MIDGARDIAN.get(), MidgardianRenderer::new);
		event.registerEntityRenderer(RealmsOfNineModEntities.WISP.get(), WispRenderer::new);
		event.registerEntityRenderer(RealmsOfNineModEntities.LIGHT_ELF.get(), LightElvesRenderer::new);
		event.registerEntityRenderer(RealmsOfNineModEntities.DARK_ELF.get(), DarkElfRenderer::new);
		event.registerEntityRenderer(RealmsOfNineModEntities.RAIDERS.get(), RaidersRenderer::new);
	}
}
