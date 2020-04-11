package com.idtech.block;

import com.idtech.BaseMod;
import com.idtech.item.ItemMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class BlockMod {

	//Blocks
	
	//Emerald
	public static BlockDiamondEmerald blockDiamondEmerald;
	public static BlockEmeraldSkull blockEmeraldSkull;
	
	
	public static void preInit(){
		
		//Blocks
		
		//Emerald
		blockDiamondEmerald = new BlockDiamondEmerald();
		blockEmeraldSkull = new BlockEmeraldSkull();
		

		
		//Blocks
		
		//Emerald
		GameRegistry.registerBlock(blockDiamondEmerald,blockDiamondEmerald.name);
		GameRegistry.registerBlock(blockEmeraldSkull,blockEmeraldSkull.name);
		


	}
	
	public static void init(){
		
		if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
			//Blocks
			
			//Emerald
			renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockMod.blockDiamondEmerald),0, new ModelResourceLocation(BaseMod.instance.MODID +":" + BlockMod.blockDiamondEmerald.name, "inventory"));
			renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockMod.blockEmeraldSkull),0, new ModelResourceLocation(BaseMod.instance.MODID +":" + BlockMod.blockEmeraldSkull.name, "inventory"));
			
			
			
			
		}

		
	}

}
