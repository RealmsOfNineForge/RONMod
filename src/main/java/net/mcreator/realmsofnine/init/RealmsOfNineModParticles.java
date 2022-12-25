
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.realmsofnine.client.particle.WispsParticle;
import net.mcreator.realmsofnine.client.particle.SvartelheimPortalParticlesParticle;
import net.mcreator.realmsofnine.client.particle.MidgardPortalParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RealmsOfNineModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(RealmsOfNineModParticleTypes.WISPS.get(), WispsParticle::provider);
		event.register(RealmsOfNineModParticleTypes.MIDGARD_PORTAL_PARTICLE.get(), MidgardPortalParticleParticle::provider);
		event.register(RealmsOfNineModParticleTypes.SVARTELHEIM_PORTAL_PARTICLES.get(), SvartelheimPortalParticlesParticle::provider);
	}
}
