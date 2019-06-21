package halotroop2288.valvemod.blocks;

import halotroop2288.valvemod.Main;
import halotroop2288.valvemod.util.IHasModel;

import halotroop2288.valvemod.init.ModBlocks;
import halotroop2288.valvemod.init.ModItems;
import halotroop2288.valvemod.tabs.ValveTab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class WeightedCube extends BlockBase implements IHasModel
{
	public WeightedCube(String name, Material material)
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setLightLevel(0.75F);
		setCreativeTab(Main.VALVE_TAB);
		setLightOpacity(1);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
}
