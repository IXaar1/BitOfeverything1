package com.hipter57.bitofeverything;

import com.hipter57.bitofeverything.init.ModBlocks;
import com.hipter57.bitofeverything.init.ModItems;
import com.hipter57.bitofeverything.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID , name = Reference.NAME , version = Reference.VERSION)
public class BitOfEverything {

    @Mod.Instance
    public static BitOfEverything instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    public static org.apache.logging.log4j.Logger logger = Reference.logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger.info("Hello Minecraft!");
        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();

        proxy.registerRenders();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        logger.info("Starting Initialization");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        logger.info("Starting PostInitialization");

    }

}
