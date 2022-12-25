
package net.mcreator.realmsofnine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.realmsofnine.init.RealmsOfNineModTabs;

public class FruitOfTheWorldItem extends Item {
	public FruitOfTheWorldItem() {
		super(new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE).stacksTo(8).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(9).saturationMod(2.5f)

						.build()));
	}
}
