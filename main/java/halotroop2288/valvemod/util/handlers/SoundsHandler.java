package halotroop2288.valvemod.util.handlers;

import halotroop2288.valvemod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
	public static SoundEvent TILE_MODBUTTON_ACTIVATE;
	
	public static void registerSounds()
	{
		TILE_MODBUTTON_ACTIVATE = registerSound("tile.modbutton.activate");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
