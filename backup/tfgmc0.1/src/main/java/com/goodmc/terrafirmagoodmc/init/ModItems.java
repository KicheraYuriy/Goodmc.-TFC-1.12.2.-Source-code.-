package com.goodmc.terrafirmagoodmc.init;

import java.util.ArrayList;
import java.util.List;

import com.goodmc.terrafirmagoodmc.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item BOOK_COVER = new ItemBase("book_cover");
	public static final Item BOOK_PAGES = new ItemBase("book_pages");
	public static final Item GLUE = new ItemBase("glue");
}
