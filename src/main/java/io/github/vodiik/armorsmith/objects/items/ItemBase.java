package io.github.vodiik.armorsmith.objects.items;

import io.github.vodiik.armorsmith.Main;
import io.github.vodiik.armorsmith.init.ItemInit;
import io.github.vodiik.armorsmith.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRender(this, 0, "iventory");
	}
}
