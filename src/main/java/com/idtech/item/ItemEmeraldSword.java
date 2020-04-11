package com.idtech.item;
 
import com.idtech.BaseMod;
import com.idtech.TabMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
 
public class ItemEmeraldSword extends ItemSword {

	public static final String name = "EmeraldSword";
	
	
	protected ItemEmeraldSword(){
		super(ItemMod.toolMaterialEmerald);
		// TODO Auto-generated constructor stub
		setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabCombat).setCreativeTab(TabMod.EmeraldTab);
	}
     
}


