package halotroop2288.valvemod.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes
{
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.MOON_ROCK_DUST, new ItemStack(ModItems.MOON_ROCK_INGOT, 1), 1.5f);
	}
}
