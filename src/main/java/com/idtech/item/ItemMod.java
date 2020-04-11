package com.idtech.item;
 
import com.idtech.BaseMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
 
public class ItemMod {
 
	//Items
	
	//Emerald
    public static ItemEmeraldTransporter itemEmeraldTransporter;
    
    
    //Ruby
    //public static ItemRuby itemRuby;

    // Tools
    
    //Emerald
    public static ItemEmeraldPickaxe itemEmeraldPickaxe;
    public static ItemEmeraldAxe itemEmeraldAxe;
    public static ItemEmeraldShovel itemEmeraldShovel;
    public static ItemEmeraldHoe itemEmeraldHoe;
    public static ItemEmeraldSword itemEmeraldSword;
    

    // Food
    
    //Ruby
    //public static ItemRubyApple itemRubyApple;
    
 
     
    // Tool Material
    public static ToolMaterial toolMaterialEmerald;
    public static ToolMaterial toolMaterialRuby;
    public static ToolMaterial toolMaterialObsidian;
    
    //Armor
    
    //Emerald
    public static ItemEmeraldArmor emeraldHelm;
    public static ItemEmeraldArmor emeraldChestplate;
    public static ItemEmeraldArmor emeraldLeggings;
    public static ItemEmeraldArmor emeraldBoots;
    public static ArmorMaterial emeraldArmorMaterial;
    

    //Obsidian
    
    
    
    public static void preInit(){
         
        // Tool materials
    	
    	//Emerald
        toolMaterialEmerald = EnumHelper.addToolMaterial("EMERALD+", 1500, 2000, 2500, 4000, 4000);
        
        //Ruby
        toolMaterialRuby = EnumHelper.addToolMaterial("RUBY+", 1000, 1500, 2000, 2500, 3000);
        
        //Obsidian
        toolMaterialObsidian = EnumHelper.addToolMaterial("OBSIDIAN+", 2000, 3000, 4000, 5000, 6000);
         
         
        // Items
        
        //Emerald
        itemEmeraldTransporter = new ItemEmeraldTransporter();
        
        //Ruby
        //itemRuby = new ItemRuby();
        
         
        // Tools
        
        //Emerald
        itemEmeraldPickaxe = new ItemEmeraldPickaxe();
        itemEmeraldAxe = new ItemEmeraldAxe();
        itemEmeraldShovel = new ItemEmeraldShovel();
        itemEmeraldHoe = new ItemEmeraldHoe();
        itemEmeraldSword = new ItemEmeraldSword();
         

        
        

        // Food
        
        
        //Armor
        
        //Emerald
        emeraldHelm = new ItemEmeraldArmor(emeraldArmorMaterial.DIAMOND,0,0,"EmeraldHelmet");
        emeraldChestplate = new ItemEmeraldArmor(emeraldArmorMaterial.DIAMOND,0,1,"EmeraldChestplate");
        emeraldLeggings = new ItemEmeraldArmor(emeraldArmorMaterial.DIAMOND,0,2,"EmeraldLeggings");
        emeraldBoots = new ItemEmeraldArmor(emeraldArmorMaterial.DIAMOND,0,3,"EmeraldBoots");
 
        
        //Items
        
        //Emerald
        GameRegistry.registerItem(itemEmeraldTransporter, itemEmeraldTransporter.name);
        
        //Ruby
        //GameRegistry.registerItem(itemRuby, itemRuby.name);
 
        // Tools
        
        //Emerald
        GameRegistry.registerItem(itemEmeraldPickaxe, itemEmeraldPickaxe.name);
        GameRegistry.registerItem(itemEmeraldAxe, itemEmeraldAxe.name);
        GameRegistry.registerItem(itemEmeraldShovel, itemEmeraldShovel.name);
        GameRegistry.registerItem(itemEmeraldHoe, itemEmeraldHoe.name);
        GameRegistry.registerItem(itemEmeraldSword, itemEmeraldSword.name);
        
        //Ruby
        

        // Food
        
        //Ruby
        //GameRegistry.registerItem(itemRubyApple, itemRubyApple.name);
        
         
        //Armor
        
        //Emerald
        GameRegistry.registerItem(emeraldHelm,emeraldHelm.name);
        GameRegistry.registerItem(emeraldChestplate,emeraldChestplate.name);
        GameRegistry.registerItem(emeraldLeggings,emeraldLeggings.name);
        GameRegistry.registerItem(emeraldBoots,emeraldBoots.name);
        
        
    }
 
    public static void init(){
        // Item inventory Rendering
        if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
 
            // Items
            
            //Emerald
            renderItem.getItemModelMesher().register(ItemMod.itemEmeraldTransporter,0, new ModelResourceLocation(BaseMod.instance.MODID +":" + ItemMod.itemEmeraldTransporter.name, "inventory"));
            
            // Tools
            
            //Emerald
            renderItem.getItemModelMesher().register(ItemMod.itemEmeraldPickaxe,0, new ModelResourceLocation(BaseMod.instance.MODID +":" + ItemMod.itemEmeraldPickaxe.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemMod.itemEmeraldAxe,0, new ModelResourceLocation(BaseMod.instance.MODID +":" + ItemMod.itemEmeraldAxe.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemMod.itemEmeraldShovel,0, new ModelResourceLocation(BaseMod.instance.MODID +":" + ItemMod.itemEmeraldShovel.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemMod.itemEmeraldHoe,0, new ModelResourceLocation(BaseMod.instance.MODID +":" + ItemMod.itemEmeraldHoe.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemMod.itemEmeraldSword,0, new ModelResourceLocation(BaseMod.instance.MODID +":" + ItemMod.itemEmeraldSword.name, "inventory"));
             
            
            //Food
            
            //Ruby
            //renderItem.getItemModelMesher().register(ItemMod.itemRubyApple,0, new ModelResourceLocation(BaseMod.instance.MODID + ":" + ItemMod.itemRubyApple.name, "inventory"));
            
            
            //Armor
            
            //Emerald
            renderItem.getItemModelMesher().register(ItemMod.emeraldHelm, 0, new ModelResourceLocation(BaseMod.instance.MODID + ":" + ItemMod.emeraldHelm.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemMod.emeraldChestplate, 0, new ModelResourceLocation(BaseMod.instance.MODID + ":" + ItemMod.emeraldChestplate.name, "inventory"));           
            renderItem.getItemModelMesher().register(ItemMod.emeraldLeggings, 0, new ModelResourceLocation(BaseMod.instance.MODID + ":" + ItemMod.emeraldLeggings.name, "inventory"));
            renderItem.getItemModelMesher().register(ItemMod.emeraldBoots, 0, new ModelResourceLocation(BaseMod.instance.MODID + ":" + ItemMod.emeraldBoots.name, "inventory"));
            
            

        }
    }
 
 
}