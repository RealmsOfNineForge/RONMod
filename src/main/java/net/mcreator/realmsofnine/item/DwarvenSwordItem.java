
package net.mcreator.realmsofnine.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.realmsofnine.init.RealmsOfNineModTabs;
import net.mcreator.realmsofnine.init.RealmsOfNineModItems;

public class DwarvenSwordItem extends SwordItem {
	public DwarvenSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1550;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RealmsOfNineModItems.DWARVEN_METAL_INGOT.get()));
			}
		}, 3, -2f, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_REALMS_ARMOUR));
	}
}
