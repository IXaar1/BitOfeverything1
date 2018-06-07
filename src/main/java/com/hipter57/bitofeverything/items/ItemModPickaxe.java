package com.hipter57.bitofeverything.items;

import com.hipter57.bitofeverything.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;

public class ItemModPickaxe extends ItemPickaxe {

    public ItemModPickaxe(ToolMaterial material, String unlocolizedName) {
        super(material);

        this.setUnlocalizedName(unlocolizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocolizedName));
    }

}
