
package com.idtech.proxy;
 
import net.minecraft.client.model.ModelZombie;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
 
import com.idtech.entity.EntityGelZombie;
import com.idtech.entity.RenderGelZombie;
 
 
/**
 * 
 * @author Blam
 * 
 * This Class is for client-side only code in your mod.
 *
 */
public class ClientProxy extends CommonProxy {
     
    @Override
    public void registerEntityRenderers(){
         
        RenderingRegistry.registerEntityRenderingHandler(EntityGelZombie.class, new RenderGelZombie(new ModelZombie(), 0.5f));
         
    }
 
}