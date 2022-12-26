
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.realmsofnine.block.entity.AshSaplingBlockEntity;
import net.mcreator.realmsofnine.RealmsOfNineMod;

public class RealmsOfNineModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			RealmsOfNineMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ASH_SAPLING = register("ash_sapling", RealmsOfNineModBlocks.ASH_SAPLING,
			AshSaplingBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
