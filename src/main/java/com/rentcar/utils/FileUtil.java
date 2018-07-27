package com.rentcar.util;

import com.rentcar.controller.CarController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class FileUtil {
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat(
            "yyyyMMddHHmmss"); // 时间格式化的格式
    private static final Random r = new Random();
    
    /** 
    * @Description: 获取图片存储基本路径 
    * @Param: [] 
    * @return: java.lang.String 
    * @Author: Zr 
    * @Date: 2018/7/27 
    */
    public static String getImgBasePath(){
        return FileUtil.class.getClassLoader().getResource("").getPath();
    }
    
    /** 
    * @Description: 生成随机文件名 
    * @Param: [] 
    * @return: java.lang.String 
    * @Author: Zr 
    * @Date: 2018/7/27 
    */
    public static String getRandomFileName() {
        // 生成随机文件名：当前年月日时分秒+五位随机数
        int ranNum = r.nextInt(90000)+10000; // 获取随机数
        String nowTimeStr = sDateFormat.format(new Date()); // 当前时间
        return nowTimeStr + ranNum;
    }
}
