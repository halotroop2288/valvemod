package halotroop2288.valvemod.items;

import halotroop2288.valvemod.Main;
import halotroop2288.valvemod.init.ModItems;
import halotroop2288.valvemod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.SoundEvent;

public class MusicDisc extends ItemRecord implements IHasModel
{

	public MusicDisc(String name, SoundEvent soundName)
    { 
    	super(name, soundName);
    	setCreativeTab(Main.VALVE_TAB);
    	setUnlocalizedName(name);
    	setRegistryName(name);
    	
    	ModItems.ITEMS.add(this);
    }

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
    
}