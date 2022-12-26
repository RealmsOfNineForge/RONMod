package net.mcreator.realmsofnine.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.realmsofnine.init.RealmsOfNineModBlocks;

public class AshSaplingRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean canSaplingBePlaced = false;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
				canSaplingBePlaced = true;
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.MYCELIUM) {
				canSaplingBePlaced = true;
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIRT) {
				canSaplingBePlaced = true;
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COARSE_DIRT) {
				canSaplingBePlaced = true;
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.PODZOL) {
				canSaplingBePlaced = true;
			} else {
				canSaplingBePlaced = false;
			}
			if (canSaplingBePlaced == true) {
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getItem() == RealmsOfNineModBlocks.ASH_SAPLING.get().asItem()) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					world.setBlock(new BlockPos(x, y + 1, z), RealmsOfNineModBlocks.ASH_SAPLING.get().defaultBlockState(), 3);
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.place")), SoundSource.NEUTRAL, 1,
									(float) 0.8);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.place")),
									SoundSource.NEUTRAL, 1, (float) 0.8, false);
						}
					}
				}
			}
		}
	}
}
