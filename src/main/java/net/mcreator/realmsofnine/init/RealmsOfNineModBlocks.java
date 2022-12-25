
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
import net.mcreator.realmsofnine.block.SvartelheimPortalBlock;
import net.mcreator.realmsofnine.block.SuperiorVanaCrystalBlockBlock;
import net.mcreator.realmsofnine.block.SteelOreBlock;
import net.mcreator.realmsofnine.block.RootedBricksBlock;
import net.mcreator.realmsofnine.block.RootInfusedStoneBlock;
import net.mcreator.realmsofnine.block.Midgardian_SteelOreBlock;
import net.mcreator.realmsofnine.block.Midgardian_SteelBlockBlock;
import net.mcreator.realmsofnine.block.MidgardPortalBlock;
import net.mcreator.realmsofnine.block.DwarvenMetalOreBlock;
import net.mcreator.realmsofnine.block.DwarvenMetalBlockBlock;
import net.mcreator.realmsofnine.block.DwarvenCoalOreBlock;
import net.mcreator.realmsofnine.block.DwarvenCoalBlockBlock;
import net.mcreator.realmsofnine.block.DeepslateDwarvenMetalOreBlock;
import net.mcreator.realmsofnine.block.DeepslateDwarvenCoalBlock;
import net.mcreator.realmsofnine.block.AlfheimPortalBlock;
import net.mcreator.realmsofnine.block.AlfcrystalOreBlock;
import net.mcreator.realmsofnine.block.AlfcrystalBlockBlock;
import net.mcreator.realmsofnine.RealmsOfNineMod;

public class RealmsOfNineModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RealmsOfNineMod.MODID);
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
	public static final RegistryObject<Block> ALFCRYSTAL_ORE = REGISTRY.register("alfcrystal_ore", () -> new AlfcrystalOreBlock());
	public static final RegistryObject<Block> ALFCRYSTAL_BLOCK = REGISTRY.register("alfcrystal_block", () -> new AlfcrystalBlockBlock());
	public static final RegistryObject<Block> VANA_CRYSTAL_BLOCK = REGISTRY.register("vana_crystal_block", () -> new VanaCrystalBlockBlock());
	public static final RegistryObject<Block> SUPERIOR_VANA_CRYSTAL_BLOCK = REGISTRY.register("superior_vana_crystal_block",
			() -> new SuperiorVanaCrystalBlockBlock());
	public static final RegistryObject<Block> YGGDRASIL_ROOTS = REGISTRY.register("yggdrasil_roots", () -> new WorldTreeRootsBlock());
	public static final RegistryObject<Block> ALFHEIM_PORTAL = REGISTRY.register("alfheim_portal", () -> new AlfheimPortalBlock());
	public static final RegistryObject<Block> MIDGARD_REALM_PORTAL = REGISTRY.register("midgard_realm_portal", () -> new MidgardPortalBlock());
	public static final RegistryObject<Block> SVARTELHEIM_PORTAL = REGISTRY.register("svartelheim_portal", () -> new SvartelheimPortalBlock());
}
