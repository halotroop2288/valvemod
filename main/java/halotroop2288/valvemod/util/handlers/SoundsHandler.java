package halotroop2288.valvemod.util.handlers;

import halotroop2288.valvemod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
    public static SoundEvent PROCEDURAL_JIGGLE_BONE;
    public static SoundEvent SELF_ESTEEM_FUND;
    public static SoundEvent SUBJECT_NAME_HERE;
    public static SoundEvent PARTY_ESCORT;
    public static SoundEvent TASTE_OF_BLOOD;
    public static SoundEvent ANDROID_HELL;
    public static SoundEvent FOUR_THOUSAND_DEGREES_KELVIN;
    public static SoundEvent STOP_WHAT_YOU_ARE_DOING;
    public static SoundEvent NO_CAKE_FOR_YOU;
    public static SoundEvent YOURE_NOT_A_GOOD_PERSON;
    public static SoundEvent YOU_CANT_ESCAPE;
    public static SoundEvent STILL_ALIVE;
    public static SoundEvent STILL_ALIVE_RADIO_LOOP;
    public static SoundEvent WANT_YOU_GONE;
	
	public static void registerSounds()
	{
    	PROCEDURAL_JIGGLE_BONE = registerSound("record.portal.procedural_jiggle_bone");
    	SELF_ESTEEM_FUND = registerSound("record.portal.self_esteem_fund");
    	SUBJECT_NAME_HERE = registerSound("record.portal.subject_name_here");
    	PARTY_ESCORT = registerSound("record.portal.party_escort");
    	TASTE_OF_BLOOD = registerSound("record.portal.taste_of_blood");
    	ANDROID_HELL = registerSound("record.portal.android_hell");
    	FOUR_THOUSAND_DEGREES_KELVIN = registerSound("record.portal.4000_degrees_kelvin");
    	STOP_WHAT_YOU_ARE_DOING = registerSound("record.portal.stop_what_you_are_doing");
    	NO_CAKE_FOR_YOU = registerSound("record.portal.no_cake_for_you");
    	YOURE_NOT_A_GOOD_PERSON = registerSound("record.portal.youre_not_a_good_person");
    	YOU_CANT_ESCAPE = registerSound("record.portal.you_cant_escape");
        STILL_ALIVE = registerSound("record.portal.stil_alive");
        STILL_ALIVE_RADIO_LOOP = registerSound("record.portal.still_alive_radio_loop");
        WANT_YOU_GONE = registerSound("record.portal.want_you_gone");
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
