package com.idtech;

import com.idtech.item.ItemMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabMod {

	
	
	
	//Creative Tabs
		public static CreativeTabs EmeraldTab = new CreativeTabs("EmeraldTab"){

			@Override
			public Item getTabIconItem() {
				return ItemMod.itemEmeraldSword;
			}
};
}