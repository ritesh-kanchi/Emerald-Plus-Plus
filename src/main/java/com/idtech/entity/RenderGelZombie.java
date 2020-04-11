
    package com.idtech.entity;
     
    import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
 
import com.idtech.BaseMod;
     
    public class RenderGelZombie extends RenderBiped {
     
        public RenderGelZombie(ModelBiped model,
                float scale) {
            super(Minecraft.getMinecraft().getRenderManager(), model, scale);
            // TODO Auto-generated constructor stub
        }
     
        @Override
        protected ResourceLocation getEntityTexture(Entity entity) {
            // TODO Auto-generated method stub
            return new ResourceLocation(BaseMod.MODID, "textures/entity/custom_biped.png");
        }
     
    }