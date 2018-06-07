package com.hipter57.bitofeverything.items;

import com.hipter57.bitofeverything.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraft.util.ResourceLocation;

public class ItemModShovel extends ItemSpade {

    public ItemModShovel(ToolMaterial material, String unlocalizedName) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, unlocalizedName));
    }
}
