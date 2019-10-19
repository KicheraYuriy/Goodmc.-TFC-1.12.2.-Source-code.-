package com.goodmc.terrafirmagoodmc.items;

import com.goodmc.terrafirmagoodmc.Main;
import com.goodmc.terrafirmagoodmc.init.ModItems;
import com.goodmc.terrafirmagoodmc.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.GoodMc);
		
		ModItems.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
