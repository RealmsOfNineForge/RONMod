
package net.mcreator.realmsofnine.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.realmsofnine.procedures.WroughtIronHammerBlockDestroyedWithToolProcedure;
import net.mcreator.realmsofnine.init.RealmsOfNineModTabs;
import net.mcreator.realmsofnine.init.RealmsOfNineModItems;

public class WroughtIronHammerItem extends PickaxeItem {
	public WroughtIronHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 2501;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RealmsOfNineModItems.MIDGARDIAN_STEEL_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_TOOLS));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		WroughtIronHammerBlockDestroyedWithToolProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
