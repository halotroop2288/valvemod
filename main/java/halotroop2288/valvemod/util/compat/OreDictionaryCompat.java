package halotroop2288.valvemod.util.compat;

import halotroop2288.valvemod.init.ModBlocks;
import halotroop2288.valvemod.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat
{
	public static void registerOres()
	{
					// Moon Rocks
		OreDictionary.registerOre("blockMoon_Rock", ModBlocks.MOON_ROCK_BLOCK);
		OreDictionary.registerOre("gemMoon_Rock", ModItems.MOON_ROCK);
		OreDictionary.registerOre("dustMoon_Rock", ModItems.MOON_ROCK_DUST);
		OreDictionary.registerOre("ingotMoon_Rock", ModItems.MOON_ROCK_INGOT);
	}
}
