package com.idtech.item;
 
import com.idtech.BaseMod;
import com.idtech.TabMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
 
public class ItemEmeraldAxe extends ItemAxe {

	public static final String name = "EmeraldAxe";
	
	
	protected ItemEmeraldAxe(){
		super(ItemMod.toolMaterialEmerald);
		// TODO Auto-generated constructor stub
		setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabTools).setCreativeTab(TabMod.EmeraldTab);
	}
     
}

