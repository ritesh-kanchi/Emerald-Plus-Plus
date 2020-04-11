package com.idtech.item;
 
import com.idtech.BaseMod;
import com.idtech.TabMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
 
public class ItemEmeraldShovel extends ItemSpade {

	public static final String name = "EmeraldShovel";
	
	
	protected ItemEmeraldShovel(){
		super(ItemMod.toolMaterialEmerald);
		// TODO Auto-generated constructor stub
		setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabTools).setCreativeTab(TabMod.EmeraldTab);
	}
     
}


