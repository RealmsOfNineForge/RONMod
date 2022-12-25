
package net.mcreator.realmsofnine.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.realmsofnine.init.RealmsOfNineModTabs;
import net.mcreator.realmsofnine.init.RealmsOfNineModItems;

public class Midgardian_SteelAxeItem extends AxeItem {
	public Midgardian_SteelAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 456;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 10.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RealmsOfNineModItems.MIDGARDIAN_STEEL_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_TOOLS));
	}
}
