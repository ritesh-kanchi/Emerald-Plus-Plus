package com.idtech.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.idtech.BaseMod;
import com.idtech.TabMod;

public class ItemEmeraldTransporter extends Item {
	
	public final String name = "EmeraldTransporter";
	
	public ItemEmeraldTransporter(){
		super();
		setUnlocalizedName(BaseMod.MODID + "_" + name);
		this.setCreativeTab(CreativeTabs.tabMisc).setCreativeTab(TabMod.EmeraldTab);
		
		
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn,
            EntityPlayer playerIn) {
        
        // CHANGE THIS: Teleport Range
        float range = 125;
        
        /* ---DON'T EDIT BELOW THIS LINE--- */
        
        // Gets the player's position and the direction they're looking
        Vec3 posVec = new Vec3(playerIn.posX, playerIn.posY + playerIn.getEyeHeight(), playerIn.posZ);
        Vec3 lookVec = playerIn.getLookVec();
        
        // Draw a line from the player to where the player is aiming, save it if we hit a block.
        MovingObjectPosition blockHit = worldIn.rayTraceBlocks(posVec, posVec.addVector(lookVec.xCoord * range, lookVec.yCoord * range, lookVec.zCoord * range));
        
        // If blockHit != null, we hit a block in range
        if( blockHit != null){
            // We don't want to put the player inside blocks, so get the air block we clicked
            BlockPos destination = blockHit.getBlockPos().offset(blockHit.sideHit);
            // Move player to destination
            playerIn.setPosition(destination.getX(), destination.getY(), destination.getZ());
        }
        
        return super.onItemRightClick(itemStackIn, worldIn, playerIn);
    }

}

