package com.hipter57.bitofeverything.blocks;

import com.hipter57.bitofeverything.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockBasicOre extends Block {

    public BlockBasicOre(String unlocalizedName, String registryName) {
        super(Material.ROCK);

        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
        this.setHardness(4.0F);
        this.setResistance(4.0F);
    }

    @Nullable
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
