
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.realmsofnine.block.WorldTreeRootsBlock;
import net.mcreator.realmsofnine.block.VanaCrystalBlockBlock;
import net.mcreator.realmsofnine.block.SuperiorVanaCrystalBlockBlock;
import net.mcreator.realmsofnine.block.SteelOreBlock;
import net.mcreator.realmsofnine.block.ShardsOfBladeOreBlock;
import net.mcreator.realmsofnine.block.RootedBricksBlock;
import net.mcreator.realmsofnine.block.RootInfusedStoneBlock;
import net.mcreator.realmsofnine.block.Midgardian_SteelOreBlock;
import net.mcreator.realmsofnine.block.Midgardian_SteelBlockBlock;
import net.mcreator.realmsofnine.block.HawthornWoodBlock;
import net.mcreator.realmsofnine.block.HawthornStairsBlock;
import net.mcreator.realmsofnine.block.HawthornSlabBlock;
import net.mcreator.realmsofnine.block.HawthornPressurePlateBlock;
import net.mcreator.realmsofnine.block.HawthornPlanksBlock;
import net.mcreator.realmsofnine.block.HawthornLogBlock;
import net.mcreator.realmsofnine.block.HawthornLeavesBlock;
import net.mcreator.realmsofnine.block.HawthornFenceGateBlock;
import net.mcreator.realmsofnine.block.HawthornFenceBlock;
import net.mcreator.realmsofnine.block.HawthornButtonBlock;
import net.mcreator.realmsofnine.block.DwarvenMetalOreBlock;
import net.mcreator.realmsofnine.block.DwarvenMetalBlockBlock;
import net.mcreator.realmsofnine.block.DwarvenGlassPaneBlock;
import net.mcreator.realmsofnine.block.DwarvenGlassBlock;
import net.mcreator.realmsofnine.block.DwarvenCoalOreBlock;
import net.mcreator.realmsofnine.block.DwarvenCoalBlockBlock;
import net.mcreator.realmsofnine.block.DeepslateDwarvenMetalOreBlock;
import net.mcreator.realmsofnine.block.DeepslateDwarvenCoalBlock;
import net.mcreator.realmsofnine.block.AshWoodBlock;
import net.mcreator.realmsofnine.block.AshStairsBlock;
import net.mcreator.realmsofnine.block.AshSlabBlock;
import net.mcreator.realmsofnine.block.AshSaplingBlock;
import net.mcreator.realmsofnine.block.AshPressurePlateBlock;
import net.mcreator.realmsofnine.block.AshPlanksBlock;
import net.mcreator.realmsofnine.block.AshLogBlock;
import net.mcreator.realmsofnine.block.AshLeavesBlock;
import net.mcreator.realmsofnine.block.AshFenceGateBlock;
import net.mcreator.realmsofnine.block.AshFenceBlock;
import net.mcreator.realmsofnine.block.AshButtonBlock;
import net.mcreator.realmsofnine.block.AlfcrystalOreBlock;
import net.mcreator.realmsofnine.block.AlfcrystalBlockBlock;
import net.mcreator.realmsofnine.RealmsOfNineMod;

public class RealmsOfNineModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RealmsOfNineMod.MODID);
	public static final RegistryObject<Block> ASH_LOG = REGISTRY.register("ash_log", () -> new AshLogBlock());
	public static final RegistryObject<Block> ASH_WOOD = REGISTRY.register("ash_wood", () -> new AshWoodBlock());
	public static final RegistryObject<Block> ASH_PLANKS = REGISTRY.register("ash_planks", () -> new AshPlanksBlock());
	public static final RegistryObject<Block> ASH_LEAVES = REGISTRY.register("ash_leaves", () -> new AshLeavesBlock());
	public static final RegistryObject<Block> HAWTHORN_WOOD = REGISTRY.register("hawthorn_wood", () -> new HawthornWoodBlock());
	public static final RegistryObject<Block> HAWTHORN_LOG = REGISTRY.register("hawthorn_log", () -> new HawthornLogBlock());
	public static final RegistryObject<Block> HAWTHORN_PLANKS = REGISTRY.register("hawthorn_planks", () -> new HawthornPlanksBlock());
	public static final RegistryObject<Block> HAWTHORN_LEAVES = REGISTRY.register("hawthorn_leaves", () -> new HawthornLeavesBlock());
	public static final RegistryObject<Block> ROOT_INFUSED_STONE = REGISTRY.register("root_infused_stone", () -> new RootInfusedStoneBlock());
	public static final RegistryObject<Block> ROOTED_BRICKS = REGISTRY.register("rooted_bricks", () -> new RootedBricksBlock());
	public static final RegistryObject<Block> STEEL_ORE = REGISTRY.register("steel_ore", () -> new SteelOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_STEEL_ORE = REGISTRY.register("deepslate_steel_ore", () -> new Midgardian_SteelOreBlock());
	public static final RegistryObject<Block> MIDGARDIAN_STEEL_BLOCK = REGISTRY.register("midgardian_steel_block",
			() -> new Midgardian_SteelBlockBlock());
	public static final RegistryObject<Block> DWARVEN_COAL_ORE = REGISTRY.register("dwarven_coal_ore", () -> new DwarvenCoalOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_DWARVEN_COAL = REGISTRY.register("deepslate_dwarven_coal",
			() -> new DeepslateDwarvenCoalBlock());
	public static final RegistryObject<Block> DWARVEN_COAL_BLOCK = REGISTRY.register("dwarven_coal_block", () -> new DwarvenCoalBlockBlock());
	public static final RegistryObject<Block> DWARVEN_METAL_ORE = REGISTRY.register("dwarven_metal_ore", () -> new DwarvenMetalOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_DWARVEN_METAL_ORE = REGISTRY.register("deepslate_dwarven_metal_ore",
			() -> new DeepslateDwarvenMetalOreBlock());
	public static final RegistryObject<Block> DWARVEN_METAL_BLOCK = REGISTRY.register("dwarven_metal_block", () -> new DwarvenMetalBlockBlock());
	public static final RegistryObject<Block> DWARVEN_GLASS = REGISTRY.register("dwarven_glass", () -> new DwarvenGlassBlock());
	public static final RegistryObject<Block> DWARVEN_GLASS_PANE = REGISTRY.register("dwarven_glass_pane", () -> new DwarvenGlassPaneBlock());
	public static final RegistryObject<Block> ALFCRYSTAL_ORE = REGISTRY.register("alfcrystal_ore", () -> new AlfcrystalOreBlock());
	public static final RegistryObject<Block> ALFCRYSTAL_BLOCK = REGISTRY.register("alfcrystal_block", () -> new AlfcrystalBlockBlock());
	public static final RegistryObject<Block> VANA_CRYSTAL_BLOCK = REGISTRY.register("vana_crystal_block", () -> new VanaCrystalBlockBlock());
	public static final RegistryObject<Block> SUPERIOR_VANA_CRYSTAL_BLOCK = REGISTRY.register("superior_vana_crystal_block",
			() -> new SuperiorVanaCrystalBlockBlock());
	public static final RegistryObject<Block> SHARDS_OF_BLADE_ORE = REGISTRY.register("shards_of_blade_ore", () -> new ShardsOfBladeOreBlock());
	public static final RegistryObject<Block> ASH_SLAB = REGISTRY.register("ash_slab", () -> new AshSlabBlock());
	public static final RegistryObject<Block> ASH_STAIRS = REGISTRY.register("ash_stairs", () -> new AshStairsBlock());
	public static final RegistryObject<Block> ASH_FENCE = REGISTRY.register("ash_fence", () -> new AshFenceBlock());
	public static final RegistryObject<Block> ASH_FENCE_GATE = REGISTRY.register("ash_fence_gate", () -> new AshFenceGateBlock());
	public static final RegistryObject<Block> ASH_PRESSURE_PLATE = REGISTRY.register("ash_pressure_plate", () -> new AshPressurePlateBlock());
	public static final RegistryObject<Block> ASH_BUTTON = REGISTRY.register("ash_button", () -> new AshButtonBlock());
	public static final RegistryObject<Block> HAWTHORN_STAIRS = REGISTRY.register("hawthorn_stairs", () -> new HawthornStairsBlock());
	public static final RegistryObject<Block> HAWTHORN_SLAB = REGISTRY.register("hawthorn_slab", () -> new HawthornSlabBlock());
	public static final RegistryObject<Block> HAWTHORN_FENCE = REGISTRY.register("hawthorn_fence", () -> new HawthornFenceBlock());
	public static final RegistryObject<Block> HAWTHORN_FENCE_GATE = REGISTRY.register("hawthorn_fence_gate", () -> new HawthornFenceGateBlock());
	public static final RegistryObject<Block> HAWTHORN_PRESSURE_PLATE = REGISTRY.register("hawthorn_pressure_plate",
			() -> new HawthornPressurePlateBlock());
	public static final RegistryObject<Block> HAWTHORN_BUTTON = REGISTRY.register("hawthorn_button", () -> new HawthornButtonBlock());
	public static final RegistryObject<Block> ASH_SAPLING = REGISTRY.register("ash_sapling", () -> new AshSaplingBlock());
	public static final RegistryObject<Block> YGGDRASIL_ROOTS = REGISTRY.register("yggdrasil_roots", () -> new WorldTreeRootsBlock());
}
