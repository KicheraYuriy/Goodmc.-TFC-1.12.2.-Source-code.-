package com.goodmc.terrafirmagoodmc.tabs;

import com.goodmc.terrafirmagoodmc.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GoodMc extends CreativeTabs
{
	public GoodMc(String label)
	{
		super("GoodMc");
		this.setBackgroundImageName("item_search.png");
	}
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.GLUE);
	}
}
