package com.hipter57.bitofeverything.init;

import com.hipter57.bitofeverything.Reference;
import com.hipter57.bitofeverything.items.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

public class ModTools {
    public static Logger logger = Reference.logger;

    public static final Item.ToolMaterial tinMaterial = EnumHelper.addToolMaterial(Reference.MODID + ":tin", 2, 300, 5.0F, 2.0F, 12);

    public static ItemPickaxe tinPickaxe;
    public static ItemModAxe tinAxe;
    public static ItemHoe tinHoe;
    public static ItemSpade tinShovel;
    public static ItemSword tinSword;

    public static ItemSoulSteeler toolSoulSteeler;

    public static void init(){
       tinPickaxe = new ItemModPickaxe(tinMaterial, "tin_pickaxe");
       tinAxe = new ItemModAxe(tinMaterial, "tin_axe");
       tinHoe = new ItemModHoe(tinMaterial, "tin_hoe");
       tinShovel = new ItemModShovel(tinMaterial, "tin_shovel");
       tinSword = new ItemModSword(tinMaterial, "tin_sword");
       toolSoulSteeler = new ItemSoulSteeler("soul_steeler");
    }

    public static void register(){
        registerItem(tinPickaxe);
        registerItem(tinAxe);
        registerItem(tinHoe);
        registerItem(tinShovel);
        registerItem(tinSword);
        registerItem(toolSoulSteeler);

    }

    public static void registerRenders(){
        registerRender(tinPickaxe);
        registerRender(tinAxe);
        registerRender(tinHoe);
        registerRender(tinShovel);
        registerRender(tinSword);
        registerRender(toolSoulSteeler);
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
