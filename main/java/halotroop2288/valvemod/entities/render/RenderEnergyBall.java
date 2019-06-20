package halotroop2288.valvemod.entities.render;

import halotroop2288.valvemod.entities.EntityEnergyBall;
import halotroop2288.valvemod.entities.model.ModelEnergyBall;
import halotroop2288.valvemod.util.Reference;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEnergyBall extends Render<EntityEnergyBall>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entities/energy_ball.png");
	
	public RenderEnergyBall(RenderManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityEnergyBall entity) {
		// TODO Auto-generated method stub
		return TEXTURES;
	}
	
}
