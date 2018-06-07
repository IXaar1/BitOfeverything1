package com.hipter57.bitofeverything.init;

import com.hipter57.bitofeverything.Reference;
import com.hipter57.bitofeverything.blocks.BlockBasicOre;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

public class ModBlocks {
    public static Logger logger = Reference.logger;

    public static Block blockTinOre;

    public static void init(){
        blockTinOre = new BlockBasicOre("tin_ore", "tin_ore");
    }

    public static void register(){
        registerBlock(blockTinOre);
    }

    public static void registerRenders(){
        registerRender(blockTinOre);
    }

    public static void registerBlock(Block block){
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        logger.info("Registered Block: " + Reference.MODID + ":" + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
        logger.info("Registered render for " + Reference.MODID + ":" + block.getUnlocalizedName().substring(5));
    }

}
