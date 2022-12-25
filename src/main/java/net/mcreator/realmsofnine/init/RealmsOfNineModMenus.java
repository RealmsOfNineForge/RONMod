
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.realmsofnine.world.inventory.Tier3GUIMenu;
import net.mcreator.realmsofnine.world.inventory.Tier2GUIMenu;
import net.mcreator.realmsofnine.world.inventory.Tier1GUIMenu;
import net.mcreator.realmsofnine.RealmsOfNineMod;

public class RealmsOfNineModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RealmsOfNineMod.MODID);
	public static final RegistryObject<MenuType<Tier1GUIMenu>> TIER_1_GUI = REGISTRY.register("tier_1_gui",
			() -> IForgeMenuType.create(Tier1GUIMenu::new));
	public static final RegistryObject<MenuType<Tier2GUIMenu>> TIER_2_GUI = REGISTRY.register("tier_2_gui",
			() -> IForgeMenuType.create(Tier2GUIMenu::new));
	public static final RegistryObject<MenuType<Tier3GUIMenu>> TIER_3_GUI = REGISTRY.register("tier_3_gui",
			() -> IForgeMenuType.create(Tier3GUIMenu::new));
}
