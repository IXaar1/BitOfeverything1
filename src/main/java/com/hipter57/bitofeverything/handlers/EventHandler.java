package com.hipter57.bitofeverything.handlers;

import com.hipter57.bitofeverything.events.SoulSteelerEvents;
import net.minecraftforge.common.MinecraftForge;

public class EventHandler {
    public void registerEvents(){
        MinecraftForge.EVENT_BUS.register(new SoulSteelerEvents());
    }
}
