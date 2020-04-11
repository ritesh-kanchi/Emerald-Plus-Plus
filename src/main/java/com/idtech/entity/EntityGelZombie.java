
package com.idtech.entity;
 
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
 
public class EntityGelZombie extends EntityMob {
 
    public EntityGelZombie(World worldIn) {
        super(worldIn);
        // TODO Auto-generated constructor stub
        this.tasks.addTask(0, new EntityAISwimming(this));
         
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityLivingBase.class, 1.0D, false));
        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
         
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
    }
 
    @Override
    protected void applyEntityAttributes() {
        // Apply base attributes
        super.applyEntityAttributes();
        // Change any attributes we want to be different
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0d);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5d);
    }
     
     
 
}