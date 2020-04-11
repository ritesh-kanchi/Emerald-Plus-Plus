
package com.idtech.item;
 
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
 
import com.idtech.BaseMod;
import com.idtech.TabMod;
 
public class ItemEmeraldArmor extends ItemArmor{
 
    public final String name;
     
    public ItemEmeraldArmor(ArmorMaterial material, int renderIndex,
            int armorType, String name) {
        super(material, renderIndex, armorType);
        this.name = name;
         
        this.setUnlocalizedName(BaseMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabCombat).setCreativeTab(TabMod.EmeraldTab);
        // TODO Auto-generated constructor stub
    }
 
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot,
            String type) {
        // TODO Auto-generated method stub
        if(slot == 2){
            return "examplemod:textures/models/armor/emerald_layer_2.png";
        }
        return "examplemod:textures/models/armor/emerald_layer_1.png";
    }
     
     
 
}