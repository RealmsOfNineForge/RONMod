
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class RealmsOfNineModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == RealmsOfNineModItems.DWARVEN_COAL.get())
			event.setBurnTime(3500);
		else if (itemstack.getItem() == RealmsOfNineModBlocks.DWARVEN_COAL_BLOCK.get().asItem())
			event.setBurnTime(35000);
		else if (itemstack.getItem() == RealmsOfNineModItems.YGGDRASIL_ROOTS_FIBERS.get())
			event.setBurnTime(50);
	}
}
