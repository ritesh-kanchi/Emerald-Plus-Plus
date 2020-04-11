package com.idtech.entity;
 
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;
 
import com.idtech.BaseMod;
 
 
public class EntityMod {
     
    public static int currentEntityId = 0;
     
    public static void preInit(){
         
        createEntityWithEgg(EntityGelZombie.class, "EmeraldSkull", 0x66FF33, 0x000000);
        
        
 
    }
 
    public static void init(){
        BaseMod.proxy.registerEntityRenderers();
         
        // Add Spawns
        addSpawn(EntityGelZombie.class, 1000, 1, 5, EnumCreatureType.MONSTER);
        
         
    }
     
    public static void createEntityWithEgg(Class entityClass, String entityName, int solidColor, int spotColor){
        int entityId = currentEntityId++;
        EntityRegistry.registerModEntity(entityClass, entityName, entityId, BaseMod.instance, 250, 1, true, solidColor, spotColor);
    }
     
    public static void addSpawn(Class entityClass, int probability, int min, int max, EnumCreatureType type) {
        for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++) {
            if (BiomeGenBase.getBiomeGenArray()[i] != null) {
                EntityRegistry.addSpawn(entityClass, probability, min, max, type, BiomeGenBase.getBiomeGenArray()[i]);
            }
        }
    }
 
}