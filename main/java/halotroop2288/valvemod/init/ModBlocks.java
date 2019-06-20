package halotroop2288.valvemod.init;

import java.util.ArrayList;
import java.util.List;

import halotroop2288.valvemod.blocks.BallCatcher;
import halotroop2288.valvemod.blocks.BallLauncher;
import halotroop2288.valvemod.blocks.BlockBase;
import halotroop2288.valvemod.blocks.WeightedCube;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// Ores
	
	// Blocks
	public static final Block MOON_ROCK_BLOCK = new BlockBase("moon_rock_block", Material.ROCK); // Moon Rock Block
	public static final Block WEIGHTED_CUBE_NORMAL = new WeightedCube("weighted_cube_normal", Material.IRON); // Weighted Storage Cube
	public static final Block WEIGHTED_CUBE_COMPANION = new WeightedCube("weighted_cube_companion", Material.IRON); // Weighted Companion Cube
	
	public static final Block ENERGY_BALL_LAUNCHER = new BallLauncher("energy_ball_launcher", Material.IRON);
	public static final Block ENERGY_BALL_CATCHER = new BallCatcher("energy_ball_catcher", Material.IRON);
	//public static final Block BLOCK_NAME = new BlockType("block_name", Material.MATERIALTYPE);
}