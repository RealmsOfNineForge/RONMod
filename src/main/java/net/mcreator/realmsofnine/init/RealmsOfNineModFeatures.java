
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.realmsofnine.world.features.plants.WorldTreeRootsFeature;
import net.mcreator.realmsofnine.world.features.plants.AshSaplingFeature;
import net.mcreator.realmsofnine.world.features.ores.SteelOreFeature;
import net.mcreator.realmsofnine.world.features.ores.RootInfusedStoneFeature;
import net.mcreator.realmsofnine.world.features.ores.Midgardian_SteelOreFeature;
import net.mcreator.realmsofnine.world.features.ores.DwarvenMetalOreFeature;
import net.mcreator.realmsofnine.world.features.ores.DwarvenCoalOreFeature;
import net.mcreator.realmsofnine.world.features.ores.DeepslateDwarvenMetalOreFeature;
import net.mcreator.realmsofnine.world.features.ores.DeepslateDwarvenCoalFeature;
import net.mcreator.realmsofnine.world.features.ores.AlfcrystalOreFeature;
import net.mcreator.realmsofnine.world.features.AshWoodTreeFeature;
import net.mcreator.realmsofnine.RealmsOfNineMod;

@Mod.EventBusSubscriber
public class RealmsOfNineModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RealmsOfNineMod.MODID);
	public static final RegistryObject<Feature<?>> ROOT_INFUSED_STONE = REGISTRY.register("root_infused_stone", RootInfusedStoneFeature::feature);
	public static final RegistryObject<Feature<?>> STEEL_ORE = REGISTRY.register("steel_ore", SteelOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATE_STEEL_ORE = REGISTRY.register("deepslate_steel_ore",
			Midgardian_SteelOreFeature::feature);
	public static final RegistryObject<Feature<?>> DWARVEN_COAL_ORE = REGISTRY.register("dwarven_coal_ore", DwarvenCoalOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATE_DWARVEN_COAL = REGISTRY.register("deepslate_dwarven_coal",
			DeepslateDwarvenCoalFeature::feature);
	public static final RegistryObject<Feature<?>> DWARVEN_METAL_ORE = REGISTRY.register("dwarven_metal_ore", DwarvenMetalOreFeature::feature);
	public static final RegistryObject<Feature<?>> DEEPSLATE_DWARVEN_METAL_ORE = REGISTRY.register("deepslate_dwarven_metal_ore",
			DeepslateDwarvenMetalOreFeature::feature);
	public static final RegistryObject<Feature<?>> ALFCRYSTAL_ORE = REGISTRY.register("alfcrystal_ore", AlfcrystalOreFeature::feature);
	public static final RegistryObject<Feature<?>> YGGDRASIL_ROOTS = REGISTRY.register("yggdrasil_roots", WorldTreeRootsFeature::feature);
	public static final RegistryObject<Feature<?>> ASH_SAPLING = REGISTRY.register("ash_sapling", AshSaplingFeature::feature);
	public static final RegistryObject<Feature<?>> ASH_WOOD_TREE = REGISTRY.register("ash_wood_tree", AshWoodTreeFeature::feature);
}
