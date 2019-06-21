package halotroop2288.valvemod.util;

import halotroop2288.valvemod.items.MusicDisc;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModSoundEvent extends SoundEvent {
    
    public ModSoundEvent(ResourceLocation soundNameIn) {
		super(soundNameIn);
	}

	@SideOnly(Side.CLIENT)
    public ResourceLocation getSoundName()
    {
        return this.getSoundName();
    }
	
	public static void registerSounds()
	{
		registerSound("record.portal.procedural_jiggle_bone");
		registerSound("record.portal.self_esteem_fund");
		registerSound("record.portal.subject_name_here");
		registerSound("record.portal.party_escort");
		registerSound("record.portal.taste_of_blood");
		registerSound("record.portal.android_hell");
		registerSound("record.portal.4000_degrees_kelvin");
		registerSound("record.portal.stop_what_you_are_doing");
		registerSound("record.portal.no_cake_for_you");
		registerSound("record.portal.youre_not_a_good_person");
		registerSound("record.portal.you_cant_escape");
		registerSound("record.portal.still_alive");
		registerSound("record.portal.still_alive_radio_loop");
		registerSound("record.portal.want_you_gone");
	}
	
	static SoundEvent registerSound(String name)
	{
		SoundEvent event = new SoundEvent(new ResourceLocation(Reference.MOD_ID, name));
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		
		return event;
	}
}
