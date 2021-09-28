package io.github.vodiik.armorsmith.init;

import java.util.ArrayList;
import java.util.List;

import io.github.vodiik.armorsmith.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ARMORSMITH_BENCH = new BlockBase("armorsmith_bench", Material.WOOD);
}
