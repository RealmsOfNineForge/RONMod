
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.realmsofnine.item.YggdrasilRootsItem;
import net.mcreator.realmsofnine.item.WispyEssenceItem;
import net.mcreator.realmsofnine.item.VanaCrystalItem;
import net.mcreator.realmsofnine.item.UnrefinedVanaCrystalItem;
import net.mcreator.realmsofnine.item.ThreadedFatesItem;
import net.mcreator.realmsofnine.item.SvartelheimItem;
import net.mcreator.realmsofnine.item.SuperiorVanaCrystalItem;
import net.mcreator.realmsofnine.item.RawSteelOreItem;
import net.mcreator.realmsofnine.item.RawDwarvenMetalOreItem;
import net.mcreator.realmsofnine.item.Midgardian_SteelSwordItem;
import net.mcreator.realmsofnine.item.Midgardian_SteelShovelItem;
import net.mcreator.realmsofnine.item.Midgardian_SteelPickaxeItem;
import net.mcreator.realmsofnine.item.Midgardian_SteelIngotItem;
import net.mcreator.realmsofnine.item.Midgardian_SteelHoeItem;
import net.mcreator.realmsofnine.item.Midgardian_SteelAxeItem;
import net.mcreator.realmsofnine.item.Midgardian_SteelArmorItem;
import net.mcreator.realmsofnine.item.MidgardianSatchelItem;
import net.mcreator.realmsofnine.item.MidgardianNuggetsItem;
import net.mcreator.realmsofnine.item.MidgardItem;
import net.mcreator.realmsofnine.item.MeadItem;
import net.mcreator.realmsofnine.item.FruitOfTheWorldItem;
import net.mcreator.realmsofnine.item.FatedLeatherItem;
import net.mcreator.realmsofnine.item.DwarvenSwordItem;
import net.mcreator.realmsofnine.item.DwarvenShovelItem;
import net.mcreator.realmsofnine.item.DwarvenPickaxeItem;
import net.mcreator.realmsofnine.item.DwarvenMetalNuggetsItem;
import net.mcreator.realmsofnine.item.DwarvenMetalIngotItem;
import net.mcreator.realmsofnine.item.DwarvenHoeItem;
import net.mcreator.realmsofnine.item.DwarvenCoalItem;
import net.mcreator.realmsofnine.item.DwarvenAxeItem;
import net.mcreator.realmsofnine.item.DwarvenArmorItem;
import net.mcreator.realmsofnine.item.DistilledWaterItem;
import net.mcreator.realmsofnine.item.CiderItem;
import net.mcreator.realmsofnine.item.BigGlassBottleItem;
import net.mcreator.realmsofnine.item.AlfheimItem;
import net.mcreator.realmsofnine.item.AlfcrystalSwordItem;
import net.mcreator.realmsofnine.item.AlfcrystalShovelItem;
import net.mcreator.realmsofnine.item.AlfcrystalPickaxeItem;
import net.mcreator.realmsofnine.item.AlfcrystalItem;
import net.mcreator.realmsofnine.item.AlfcrystalHoeItem;
import net.mcreator.realmsofnine.item.AlfcrystalAxeItem;
import net.mcreator.realmsofnine.item.AlfcrystalArmorItem;
import net.mcreator.realmsofnine.item.AleItem;
import net.mcreator.realmsofnine.RealmsOfNineMod;

public class RealmsOfNineModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RealmsOfNineMod.MODID);
	public static final RegistryObject<Item> ROOT_INFUSED_STONE = block(RealmsOfNineModBlocks.ROOT_INFUSED_STONE,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ROOTED_BRICKS = block(RealmsOfNineModBlocks.ROOTED_BRICKS, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> STEEL_ORE = block(RealmsOfNineModBlocks.STEEL_ORE, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> DEEPSLATE_STEEL_ORE = block(RealmsOfNineModBlocks.DEEPSLATE_STEEL_ORE,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_BLOCK = block(RealmsOfNineModBlocks.MIDGARDIAN_STEEL_BLOCK,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> DWARVEN_COAL_ORE = block(RealmsOfNineModBlocks.DWARVEN_COAL_ORE,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> DEEPSLATE_DWARVEN_COAL = block(RealmsOfNineModBlocks.DEEPSLATE_DWARVEN_COAL,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> DWARVEN_COAL_BLOCK = block(RealmsOfNineModBlocks.DWARVEN_COAL_BLOCK,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> DWARVEN_METAL_ORE = block(RealmsOfNineModBlocks.DWARVEN_METAL_ORE,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> DEEPSLATE_DWARVEN_METAL_ORE = block(RealmsOfNineModBlocks.DEEPSLATE_DWARVEN_METAL_ORE,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> DWARVEN_METAL_BLOCK = block(RealmsOfNineModBlocks.DWARVEN_METAL_BLOCK,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ALFCRYSTAL_ORE = block(RealmsOfNineModBlocks.ALFCRYSTAL_ORE, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ALFCRYSTAL_BLOCK = block(RealmsOfNineModBlocks.ALFCRYSTAL_BLOCK,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> VANA_CRYSTAL_BLOCK = block(RealmsOfNineModBlocks.VANA_CRYSTAL_BLOCK,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> SUPERIOR_VANA_CRYSTAL_BLOCK = block(RealmsOfNineModBlocks.SUPERIOR_VANA_CRYSTAL_BLOCK,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> RAW_STEEL_ORE = REGISTRY.register("raw_steel_ore", () -> new RawSteelOreItem());
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_INGOT = REGISTRY.register("midgardian_steel_ingot",
			() -> new Midgardian_SteelIngotItem());
	public static final RegistryObject<Item> MIDGARDIAN_NUGGETS = REGISTRY.register("midgardian_nuggets", () -> new MidgardianNuggetsItem());
	public static final RegistryObject<Item> DWARVEN_COAL = REGISTRY.register("dwarven_coal", () -> new DwarvenCoalItem());
	public static final RegistryObject<Item> RAW_DWARVEN_METAL_ORE = REGISTRY.register("raw_dwarven_metal_ore", () -> new RawDwarvenMetalOreItem());
	public static final RegistryObject<Item> DWARVEN_METAL_INGOT = REGISTRY.register("dwarven_metal_ingot", () -> new DwarvenMetalIngotItem());
	public static final RegistryObject<Item> DWARVEN_METAL_NUGGETS = REGISTRY.register("dwarven_metal_nuggets", () -> new DwarvenMetalNuggetsItem());
	public static final RegistryObject<Item> ALFCRYSTAL = REGISTRY.register("alfcrystal", () -> new AlfcrystalItem());
	public static final RegistryObject<Item> UNREFINED_VANA_CRYSTAL = REGISTRY.register("unrefined_vana_crystal",
			() -> new UnrefinedVanaCrystalItem());
	public static final RegistryObject<Item> VANA_CRYSTAL = REGISTRY.register("vana_crystal", () -> new VanaCrystalItem());
	public static final RegistryObject<Item> SUPERIOR_VANA_CRYSTAL = REGISTRY.register("superior_vana_crystal", () -> new SuperiorVanaCrystalItem());
	public static final RegistryObject<Item> FRUIT_OF_THE_WORLD = REGISTRY.register("fruit_of_the_world", () -> new FruitOfTheWorldItem());
	public static final RegistryObject<Item> YGGDRASIL_ROOTS_FIBERS = REGISTRY.register("yggdrasil_roots_fibers", () -> new YggdrasilRootsItem());
	public static final RegistryObject<Item> YGGDRASIL_ROOTS = block(RealmsOfNineModBlocks.YGGDRASIL_ROOTS, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> THREADED_FATES = REGISTRY.register("threaded_fates", () -> new ThreadedFatesItem());
	public static final RegistryObject<Item> WISPY_ESSENCE = REGISTRY.register("wispy_essence", () -> new WispyEssenceItem());
	public static final RegistryObject<Item> FATED_LEATHER = REGISTRY.register("fated_leather", () -> new FatedLeatherItem());
	public static final RegistryObject<Item> BIG_GLASS_BOTTLE = REGISTRY.register("big_glass_bottle", () -> new BigGlassBottleItem());
	public static final RegistryObject<Item> DISTILLED_WATER = REGISTRY.register("distilled_water", () -> new DistilledWaterItem());
	public static final RegistryObject<Item> MEAD = REGISTRY.register("mead", () -> new MeadItem());
	public static final RegistryObject<Item> CIDER = REGISTRY.register("cider", () -> new CiderItem());
	public static final RegistryObject<Item> ALE = REGISTRY.register("ale", () -> new AleItem());
	public static final RegistryObject<Item> MIDGARDIAN = REGISTRY.register("midgardian_spawn_egg",
			() -> new ForgeSpawnEggItem(RealmsOfNineModEntities.MIDGARDIAN, -13303786, -12639715,
					new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE)));
	public static final RegistryObject<Item> WISP = REGISTRY.register("wisp_spawn_egg", () -> new ForgeSpawnEggItem(RealmsOfNineModEntities.WISP,
			-4980737, -12466197, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE)));
	public static final RegistryObject<Item> LIGHT_ELF = REGISTRY.register("light_elf_spawn_egg",
			() -> new ForgeSpawnEggItem(RealmsOfNineModEntities.LIGHT_ELF, -13948638, -11784401,
					new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE)));
	public static final RegistryObject<Item> DARK_ELF = REGISTRY.register("dark_elf_spawn_egg",
			() -> new ForgeSpawnEggItem(RealmsOfNineModEntities.DARK_ELF, -13558499, -13090238,
					new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE)));
	public static final RegistryObject<Item> RAIDERS = REGISTRY.register("raiders_spawn_egg",
			() -> new ForgeSpawnEggItem(RealmsOfNineModEntities.RAIDERS, -13624060, -11203572,
					new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE)));
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_PICKAXE = REGISTRY.register("midgardian_steel_pickaxe",
			() -> new Midgardian_SteelPickaxeItem());
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_AXE = REGISTRY.register("midgardian_steel_axe", () -> new Midgardian_SteelAxeItem());
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_SHOVEL = REGISTRY.register("midgardian_steel_shovel",
			() -> new Midgardian_SteelShovelItem());
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_HOE = REGISTRY.register("midgardian_steel_hoe", () -> new Midgardian_SteelHoeItem());
	public static final RegistryObject<Item> DWARVEN_PICKAXE = REGISTRY.register("dwarven_pickaxe", () -> new DwarvenPickaxeItem());
	public static final RegistryObject<Item> DWARVEN_AXE = REGISTRY.register("dwarven_axe", () -> new DwarvenAxeItem());
	public static final RegistryObject<Item> DWARVEN_SHOVEL = REGISTRY.register("dwarven_shovel", () -> new DwarvenShovelItem());
	public static final RegistryObject<Item> DWARVEN_HOE = REGISTRY.register("dwarven_hoe", () -> new DwarvenHoeItem());
	public static final RegistryObject<Item> ALFCRYSTAL_PICKAXE = REGISTRY.register("alfcrystal_pickaxe", () -> new AlfcrystalPickaxeItem());
	public static final RegistryObject<Item> ALFCRYSTAL_AXE = REGISTRY.register("alfcrystal_axe", () -> new AlfcrystalAxeItem());
	public static final RegistryObject<Item> ALFCRYSTAL_SHOVEL = REGISTRY.register("alfcrystal_shovel", () -> new AlfcrystalShovelItem());
	public static final RegistryObject<Item> ALFCRYSTAL_HOE = REGISTRY.register("alfcrystal_hoe", () -> new AlfcrystalHoeItem());
	public static final RegistryObject<Item> ALFHEIM = REGISTRY.register("alfheim", () -> new AlfheimItem());
	public static final RegistryObject<Item> MIDGARD_REALM = REGISTRY.register("midgard_realm", () -> new MidgardItem());
	public static final RegistryObject<Item> SVARTELHEIM = REGISTRY.register("svartelheim", () -> new SvartelheimItem());
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_SWORD = REGISTRY.register("midgardian_steel_sword",
			() -> new Midgardian_SteelSwordItem());
	public static final RegistryObject<Item> DWARVEN_SWORD = REGISTRY.register("dwarven_sword", () -> new DwarvenSwordItem());
	public static final RegistryObject<Item> ALFCRYSTAL_SWORD = REGISTRY.register("alfcrystal_sword", () -> new AlfcrystalSwordItem());
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_ARMOR_HELMET = REGISTRY.register("midgardian_steel_armor_helmet",
			() -> new Midgardian_SteelArmorItem.Helmet());
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_ARMOR_CHESTPLATE = REGISTRY.register("midgardian_steel_armor_chestplate",
			() -> new Midgardian_SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_ARMOR_LEGGINGS = REGISTRY.register("midgardian_steel_armor_leggings",
			() -> new Midgardian_SteelArmorItem.Leggings());
	public static final RegistryObject<Item> MIDGARDIAN_STEEL_ARMOR_BOOTS = REGISTRY.register("midgardian_steel_armor_boots",
			() -> new Midgardian_SteelArmorItem.Boots());
	public static final RegistryObject<Item> DWARVEN_ARMOR_HELMET = REGISTRY.register("dwarven_armor_helmet", () -> new DwarvenArmorItem.Helmet());
	public static final RegistryObject<Item> DWARVEN_ARMOR_CHESTPLATE = REGISTRY.register("dwarven_armor_chestplate",
			() -> new DwarvenArmorItem.Chestplate());
	public static final RegistryObject<Item> DWARVEN_ARMOR_LEGGINGS = REGISTRY.register("dwarven_armor_leggings",
			() -> new DwarvenArmorItem.Leggings());
	public static final RegistryObject<Item> DWARVEN_ARMOR_BOOTS = REGISTRY.register("dwarven_armor_boots", () -> new DwarvenArmorItem.Boots());
	public static final RegistryObject<Item> ALFCRYSTAL_ARMOR_HELMET = REGISTRY.register("alfcrystal_armor_helmet",
			() -> new AlfcrystalArmorItem.Helmet());
	public static final RegistryObject<Item> ALFCRYSTAL_ARMOR_CHESTPLATE = REGISTRY.register("alfcrystal_armor_chestplate",
			() -> new AlfcrystalArmorItem.Chestplate());
	public static final RegistryObject<Item> ALFCRYSTAL_ARMOR_LEGGINGS = REGISTRY.register("alfcrystal_armor_leggings",
			() -> new AlfcrystalArmorItem.Leggings());
	public static final RegistryObject<Item> ALFCRYSTAL_ARMOR_BOOTS = REGISTRY.register("alfcrystal_armor_boots",
			() -> new AlfcrystalArmorItem.Boots());
	public static final RegistryObject<Item> MIDGARDIAN_SATCHEL = REGISTRY.register("midgardian_satchel", () -> new MidgardianSatchelItem());
	public static final RegistryObject<Item> ASH_WOOD = block(RealmsOfNineModBlocks.ASH_WOOD, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_LOG = block(RealmsOfNineModBlocks.ASH_LOG, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_PLANKS = block(RealmsOfNineModBlocks.ASH_PLANKS, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_STAIRS = block(RealmsOfNineModBlocks.ASH_STAIRS, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_SLAB = block(RealmsOfNineModBlocks.ASH_SLAB, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_FENCE = block(RealmsOfNineModBlocks.ASH_FENCE, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_FENCE_GATE = block(RealmsOfNineModBlocks.ASH_FENCE_GATE, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_PRESSURE_PLATE = block(RealmsOfNineModBlocks.ASH_PRESSURE_PLATE,
			RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_BUTTON = block(RealmsOfNineModBlocks.ASH_BUTTON, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_LEAVES = block(RealmsOfNineModBlocks.ASH_LEAVES, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);
	public static final RegistryObject<Item> ASH_SAPLING = block(RealmsOfNineModBlocks.ASH_SAPLING, RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
