package halotroop2288.valvemod.tabs;

import halotroop2288.valvemod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ValveTab extends CreativeTabs {
	
	public ValveTab(String label)
	{
	super(label);
	//this.setBackgroundImageName("tutorial.png");
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(Items.CHEST_MINECART);
	}
}