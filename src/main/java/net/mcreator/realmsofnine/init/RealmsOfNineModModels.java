
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.realmsofnine.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.realmsofnine.client.model.Modelwisp;
import net.mcreator.realmsofnine.client.model.ModelJotunModel;
import net.mcreator.realmsofnine.client.model.ModelFaeModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RealmsOfNineModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelJotunModel.LAYER_LOCATION, ModelJotunModel::createBodyLayer);
		event.registerLayerDefinition(ModelFaeModel.LAYER_LOCATION, ModelFaeModel::createBodyLayer);
		event.registerLayerDefinition(Modelwisp.LAYER_LOCATION, Modelwisp::createBodyLayer);
	}
}
