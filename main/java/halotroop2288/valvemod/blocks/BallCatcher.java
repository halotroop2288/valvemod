package halotroop2288.valvemod.blocks;

import halotroop2288.valvemod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BallCatcher extends BlockBase implements IHasModel
{
	
	public BallCatcher(String name, Material material)
	{
		super(name, Material.IRON);
		// TODO Make it do that catchy catch
		// TODO make it permanently output redstone on all sides after catching
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
}
