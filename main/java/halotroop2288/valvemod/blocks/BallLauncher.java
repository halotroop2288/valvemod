package halotroop2288.valvemod.blocks;

import halotroop2288.valvemod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BallLauncher extends BlockBase implements IHasModel
{
	public BallLauncher(String name, Material material)
	{
		super(name, Material.IRON);
		// TODO Make it do the shooty shooty
	}
}
