
package net.mcreator.realmsofnine.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.realmsofnine.init.RealmsOfNineModTabs;
import net.mcreator.realmsofnine.init.RealmsOfNineModItems;

public class DwarvenPickaxeItem extends PickaxeItem {
	public DwarvenPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1550;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RealmsOfNineModItems.DWARVEN_METAL_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_TOOLS));
	}
}
