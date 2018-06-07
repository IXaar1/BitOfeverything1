package com.hipter57.bitofeverything.init;

import com.hipter57.bitofeverything.BitOfEverything;
import com.hipter57.bitofeverything.Reference;
import com.hipter57.bitofeverything.items.ItemGeneric;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

public class ModItems {
    public static Logger logger = BitOfEverything.logger;

    public static Item itemTinIngot;

    public static void init(){

        itemTinIngot = new ItemGeneric("tin_ingot", "tin_ingot");

    }

    public static void register(){

        registerItem(itemTinIngot);

    }

    public static void registerRenders(){

        registerRender(itemTinIngot);

    }

    public static void registerItem(Item item){
        GameRegistry.register(item);
        logger.info("Registered item: " + Reference.MODID + ":" + item.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        logger.info("Registered render for " + Reference.MODID + ":" + item.getUnlocalizedName().substring(5));
    }
}
