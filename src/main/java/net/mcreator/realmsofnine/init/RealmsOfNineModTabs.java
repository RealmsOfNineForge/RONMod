
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RealmsOfNineModTabs {
	public static CreativeModeTab TAB_RISE_OF_THE_NINE;
	public static CreativeModeTab TAB_RISE_OF_THE_NINE_TOOLS;
	public static CreativeModeTab TAB_RISE_OF_THE_NINE_REALMS_ARMOUR;

	public static void load() {
		TAB_RISE_OF_THE_NINE = new CreativeModeTab("tabrise_of_the_nine") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RealmsOfNineModBlocks.ROOTED_BRICKS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RISE_OF_THE_NINE_TOOLS = new CreativeModeTab("tabrise_of_the_nine_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RealmsOfNineModItems.MIDGARDIAN_STEEL_PICKAXE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RISE_OF_THE_NINE_REALMS_ARMOUR = new CreativeModeTab("tabrise_of_the_nine_realms_armour") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RealmsOfNineModItems.MIDGARDIAN_STEEL_ARMOR_CHESTPLATE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
