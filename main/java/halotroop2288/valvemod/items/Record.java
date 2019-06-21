package halotroop2288.valvemod.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;

import halotroop2288.valvemod.Main;
import halotroop2288.valvemod.init.ModItems;
import halotroop2288.valvemod.util.IHasModel;
import halotroop2288.valvemod.util.Reference;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.stats.StatList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;


public class Record extends ItemRecord implements IHasModel
{	
	public Record(String name, SoundEvent soundIn)
	{ 
		super(name, soundIn);
		setCreativeTab(Main.VALVE_TAB);
		setUnlocalizedName(name);
		setRegistryName(name);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}