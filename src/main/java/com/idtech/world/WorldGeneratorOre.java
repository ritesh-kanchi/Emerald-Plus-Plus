
package com.idtech.world;
 
import java.util.Random;
 
import com.idtech.block.BlockMod;
 
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
 
public class WorldGeneratorOre implements IWorldGenerator {
 
    /*
     *  Generate will be called each time a 16x16 chunk is generated
     *  Be careful how much code you add here - it gets slow very quickly!
     */
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        // TODO Auto-generated method stub
        switch(world.provider.getDimensionId()){
        case -1:
            // Nether
            break;
        case 0:
            // Surface
            generateSurface(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
            break;
        case 1:
            // The End
            break;
        }
    }
     
    public void generateSurface(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
         
        for(int i = 0; i < 5; i++){
             int startX = chunkX * 16 + random.nextInt(16);
             // Vertical position - this sets how deep down your ore will generate. Lower numbers are deeper
             int startY = random.nextInt(32) + 64;
             int startZ = chunkZ * 16 + random.nextInt(16);
              
             // Store the coordinates in a BlockPos
             BlockPos start = new BlockPos(startX, startY, startZ);
              
             //(new WorldGenMinable(BlockMod.blockRubyOre.getDefaultState(), random.nextInt(5) + 5)).generate(world, random, start);
        }
         
         
    }
 
}