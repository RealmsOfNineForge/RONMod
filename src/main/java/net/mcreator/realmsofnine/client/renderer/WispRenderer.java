
package net.mcreator.realmsofnine.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.realmsofnine.entity.WispEntity;
import net.mcreator.realmsofnine.client.model.Modelwisp;

public class WispRenderer extends MobRenderer<WispEntity, Modelwisp<WispEntity>> {
	public WispRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwisp(context.bakeLayer(Modelwisp.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WispEntity entity) {
		return new ResourceLocation("realms_of_nine:textures/entities/wispcurrent.png");
	}
}
