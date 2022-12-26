package net.mcreator.realmsofnine.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.realmsofnine.init.RealmsOfNineModBlockEntities;

public class AshSaplingBlockEntity extends BlockEntity {
	public AshSaplingBlockEntity(BlockPos pos, BlockState state) {
		super(RealmsOfNineModBlockEntities.ASH_SAPLING.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
