package com.hipter57.bitofeverything.items;

import com.hipter57.bitofeverything.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemGeneric extends Item {

    public ItemGeneric(String unlocalizedName, String registryName){

        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));

    }
}
