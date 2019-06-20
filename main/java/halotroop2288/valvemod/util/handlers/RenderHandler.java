package halotroop2288.valvemod.util.handlers;

import halotroop2288.valvemod.entities.EntityEnergyBall;
import halotroop2288.valvemod.entities.render.RenderEnergyBall;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityEnergyBall.class, new IRenderFactory<EntityEnergyBall>()
		{
			@Override
			public Render<? super EntityEnergyBall> createRenderFor(RenderManager manager) {
				return new RenderEnergyBall(manager);
			}
		});
	}
}
