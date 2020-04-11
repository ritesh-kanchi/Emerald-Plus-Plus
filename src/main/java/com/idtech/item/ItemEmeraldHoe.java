package com.idtech.item;
 
import com.idtech.BaseMod;
import com.idtech.TabMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
 
public class ItemEmeraldHoe extends ItemHoe {

	public static final String name = "EmeraldHoe";
	
	
	protected ItemEmeraldHoe(){
		super(ItemMod.toolMaterialEmerald);
		// TODO Auto-generated constructor stub
		setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabTools).setCreativeTab(TabMod.EmeraldTab);
	}
     
}


