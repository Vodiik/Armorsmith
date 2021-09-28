package io.github.vodiik.armorsmith.objects.blocks;

import io.github.vodiik.armorsmith.Main;
import io.github.vodiik.armorsmith.init.BlockInit;
import io.github.vodiik.armorsmith.init.ItemInit;
import io.github.vodiik.armorsmith.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "iventory");
	}
}
