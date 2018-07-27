package com.rentcar.utils;

import java.util.UUID;

public class CommonTool {
    /**
     * 获取一个随机的 不带"-"的 小写的UUID
     * @return UUID
     */
    public static String getLowerCaseRandomUUID(){
        return UUID.randomUUID().toString().replace("-","").toLowerCase();
    }

    public static String getFileExtName(String fileName){
        int index = fileName.lastIndexOf('.');
        if (index == -1){
            return fileName.toLowerCase();
        }else {
            return fileName.substring(index).toLowerCase();
        }
    }

}
