package com.hipter57.bitofeverything.util;

import com.hipter57.bitofeverything.Reference;

public class Utils {
    private static Lang lang;

    public static Lang getLang(){
        if(lang==null){
            lang = new Lang(Reference.MODID);
        }
        return lang;
    }

}
