
package net.mcreator.realmsofnine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.realmsofnine.init.RealmsOfNineModTabs;

public class MidgardianNuggetsItem extends Item {
	public MidgardianNuggetsItem() {
		super(new Item.Properties().tab(RealmsOfNineModTabs.TAB_RISE_OF_THE_NINE).stacksTo(64).rarity(Rarity.COMMON));
	}
}
