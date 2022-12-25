
package net.mcreator.realmsofnine.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class DeepslateDwarvenCoalBlock extends Block {
	public DeepslateDwarvenCoalBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.DEEPSLATE).strength(2.5f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
