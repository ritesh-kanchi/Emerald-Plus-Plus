
package com.idtech.world;
 
import net.minecraftforge.fml.common.registry.GameRegistry;
 
 
public class WorldMod {
     
    public static WorldGeneratorOre worldGen;
     
    public static void init(){
         
        worldGen = new WorldGeneratorOre();
         
        GameRegistry.registerWorldGenerator(worldGen, 10);
 
    }
 
}