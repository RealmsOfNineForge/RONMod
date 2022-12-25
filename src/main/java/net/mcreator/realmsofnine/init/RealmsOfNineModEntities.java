
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.realmsofnine.entity.WispEntity;
import net.mcreator.realmsofnine.entity.RaidersEntity;
import net.mcreator.realmsofnine.entity.MidgardianEntity;
import net.mcreator.realmsofnine.entity.LightElvesEntity;
import net.mcreator.realmsofnine.entity.DarkElfEntity;
import net.mcreator.realmsofnine.RealmsOfNineMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RealmsOfNineModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RealmsOfNineMod.MODID);
	public static final RegistryObject<EntityType<MidgardianEntity>> MIDGARDIAN = register("midgardian",
			EntityType.Builder.<MidgardianEntity>of(MidgardianEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MidgardianEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WispEntity>> WISP = register("wisp",
			EntityType.Builder.<WispEntity>of(WispEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(WispEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LightElvesEntity>> LIGHT_ELF = register("light_elf",
			EntityType.Builder.<LightElvesEntity>of(LightElvesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LightElvesEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DarkElfEntity>> DARK_ELF = register("dark_elf",
			EntityType.Builder.<DarkElfEntity>of(DarkElfEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DarkElfEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RaidersEntity>> RAIDERS = register("raiders",
			EntityType.Builder.<RaidersEntity>of(RaidersEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RaidersEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MidgardianEntity.init();
			WispEntity.init();
			LightElvesEntity.init();
			DarkElfEntity.init();
			RaidersEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MIDGARDIAN.get(), MidgardianEntity.createAttributes().build());
		event.put(WISP.get(), WispEntity.createAttributes().build());
		event.put(LIGHT_ELF.get(), LightElvesEntity.createAttributes().build());
		event.put(DARK_ELF.get(), DarkElfEntity.createAttributes().build());
		event.put(RAIDERS.get(), RaidersEntity.createAttributes().build());
	}
}
