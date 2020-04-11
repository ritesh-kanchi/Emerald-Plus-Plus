package com.idtech.item;
 
import com.idtech.BaseMod;
import com.idtech.TabMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
 
public class ItemEmeraldPickaxe extends ItemPickaxe {

	public static final String name = "EmeraldPickaxe";
	
	
	protected ItemEmeraldPickaxe(){
		super(ItemMod.toolMaterialEmerald);
		// TODO Auto-generated constructor stub
		setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabTools).setCreativeTab(TabMod.EmeraldTab);
	}
     
}

