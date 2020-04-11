
package com.idtech.recipe;
 
import com.idtech.block.BlockMod;
import com.idtech.item.ItemMod;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
 
public class RecipeMod {
     
    public static void init(){
         
    	//Emerald
        GameRegistry.addShapedRecipe(new ItemStack(BlockMod.blockDiamondEmerald,1), "xyx", "yyy", "xyx", 'x', Items.diamond, 'y', Items.emerald);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald,9), BlockMod.blockDiamondEmerald);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemEmeraldPickaxe,1), "xxx", " y ", " y ", 'x', Items.emerald, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemEmeraldHoe,1), "xx ", " y ", " y ", 'x', Items.emerald, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemEmeraldAxe,1), "xx ", "xy ", " y ", 'x', Items.emerald, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemEmeraldSword,1), " x ", " x ", " y ", 'x', Items.emerald, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemEmeraldShovel,1), " x ", " y ", " y ", 'x', Items.emerald, 'y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.itemEmeraldTransporter,1), " x ", "xyx", " x ", 'x', Items.emerald, 'y', Items.compass);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.emeraldHelm,1), "xxx", "x x", "   ", 'x', Items.emerald);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.emeraldChestplate,1), "x x", "xxx", "xxx", 'x', Items.emerald);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.emeraldLeggings,1), "xxx", "x x", "x x", 'x', Items.emerald);
        GameRegistry.addShapedRecipe(new ItemStack(ItemMod.emeraldBoots,1), "   ", "x x", "x x", 'x', Items.emerald);
        GameRegistry.addShapedRecipe(new ItemStack(BlockMod.blockEmeraldSkull,1), "xxx", "xyx", "xxx", 'x', Items.emerald, 'y', Items.skull);
        GameRegistry.addShapedRecipe(new ItemStack(BlockMod.blockEmeraldSkull,1), "xxx", "xyx", "xxx", 'x', Items.emerald, 'y', Items.bone);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald,9), BlockMod.blockEmeraldSkull);
        
        
        
    }
 
}
