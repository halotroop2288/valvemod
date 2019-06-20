package halotroop2288.valvemod.util.compat;

import halotroop2288.valvemod.init.ModBlocks;
import halotroop2288.valvemod.init.ModItems;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat
{
	public static void registerOres()
	{
					// Moon Rocks
		OreDictionary.registerOre("blockMoonRock", ModBlocks.MOON_ROCK_BLOCK);
		OreDictionary.registerOre("gemMoonRock", ModItems.MOON_ROCK);
		OreDictionary.registerOre("dustMoonRock", ModItems.MOON_ROCK_DUST);
		OreDictionary.registerOre("ingotMoonRock", ModItems.MOON_ROCK_INGOT);
	}
}
