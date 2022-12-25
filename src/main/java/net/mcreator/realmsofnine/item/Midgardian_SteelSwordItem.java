
package net.mcreator.realmsofnine.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.realmsofnine.init.RealmsOfNineModTabs;
import net.mcreator.realmsofnine.init.RealmsOfNineModItems;

public class Midgardian_SteelSwordItem extends SwordItem {
	public Midgardian_SteelSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 294;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 2.699999999999999f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RealmsOfNineModItems.MIDGARDIAN_STEEL_INGOT.get()));
			}
		}, 3, -2.5f, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_REALMS_ARMOUR));
	}
}
