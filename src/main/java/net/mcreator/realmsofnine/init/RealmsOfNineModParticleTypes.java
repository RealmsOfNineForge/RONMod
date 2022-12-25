
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.realmsofnine.RealmsOfNineMod;

public class RealmsOfNineModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, RealmsOfNineMod.MODID);
	public static final RegistryObject<SimpleParticleType> WISPS = REGISTRY.register("wisps", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> MIDGARD_PORTAL_PARTICLE = REGISTRY.register("midgard_portal_particle",
			() -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SVARTELHEIM_PORTAL_PARTICLES = REGISTRY.register("svartelheim_portal_particles",
			() -> new SimpleParticleType(false));
}
