package com.sergey.music;

public class Common {

    public static boolean notEmpty(String str){
        if(str != null && !str.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
