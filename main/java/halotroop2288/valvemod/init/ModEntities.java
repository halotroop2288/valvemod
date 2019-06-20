package halotroop2288.valvemod.init;

import halotroop2288.valvemod.Main;
import halotroop2288.valvemod.entities.EntityEnergyBall;
import halotroop2288.valvemod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities
{

	public static void registerEntities()
	{
		registerEntity("energy_ball", EntityEnergyBall.class, Reference.ENTITY_ENERGY_BALL, 1000, 16606720, 30975);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
}
