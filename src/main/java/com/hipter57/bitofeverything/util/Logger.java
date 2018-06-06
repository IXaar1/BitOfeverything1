package com.hipter57.bitofeverything.util;

import com.hipter57.bitofeverything.Reference;
import org.apache.logging.log4j.LogManager;

public class Logger {

    private static org.apache.logging.log4j.Logger logger;

    public static org.apache.logging.log4j.Logger getLogger() {
        if(logger == null){
            logger = LogManager.getFormatterLogger(Reference.MODID);
        }
        return logger;
    }
}
