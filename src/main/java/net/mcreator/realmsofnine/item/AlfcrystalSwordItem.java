
package net.mcreator.realmsofnine.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.realmsofnine.init.RealmsOfNineModTabs;
import net.mcreator.realmsofnine.init.RealmsOfNineModItems;

public class AlfcrystalSwordItem extends SwordItem {
	public AlfcrystalSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 912;
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
				return Ingredient.of(new ItemStack(RealmsOfNineModItems.ALFCRYSTAL.get()));
			}
		}, 3, -3f, new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE_REALMS_ARMOUR));
	}
}
