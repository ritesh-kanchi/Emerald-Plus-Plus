package com.idtech.block;

import com.idtech.BaseMod;
import com.idtech.TabMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockEmeraldSkull extends Block{

	public static final String name = "EmeraldSkull";
	
	public BlockEmeraldSkull() {
		super(Material.wood);
		// TODO Auto-generated constructor stub
		
		this.setUnlocalizedName(BaseMod.MODID + "_" + name );
		this.setCreativeTab(CreativeTabs.tabMisc).setCreativeTab(TabMod.EmeraldTab);
		
		// Make this block hard to break
		this.setHardness(30);
		
		// Set tool level to wooden pickaxe (0 = wood, 1 = stone, 2 = iron, 3 = diamond)
		this.setHarvestLevel("pickaxe", 2);
		
		// Make the block emit a faint glow
		this.setLightLevel(0.0f);
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos,
			Entity entityIn) {
		// TODO Auto-generated method stub
		
		
		
		super.onEntityCollidedWithBlock(worldIn, pos, entityIn);
	}
	
	

}
