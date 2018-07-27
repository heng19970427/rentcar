package com.rentcar.utils;

import com.rentcar.pojo.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
    
    /** 
    * @Description: 根据传入文件返回图片对象 
    * @Param: [file, basePath] 
    * @return: com.rentcar.pojo.Image 
    * @Author: Zr 
    * @Date: 2018/7/27 
    */
    public static Image saveFile(MultipartFile file, String basePath) {
        //判断文件是否为空
        if (!file.isEmpty()){
            try {
                Image image=new Image();
                //文件保存路径
                //logger.debug("图片基本路径:"+basePath);
                String filename=file.getOriginalFilename();
                String[] titles = filename.split("\\.");
                String saveName=FileUtil.getRandomFileName()+"."+titles[1];
                //logger.debug("saveName");
                File saveFile=new File(basePath);
                if(!saveFile.exists()){
                    saveFile.mkdir();
                }
                String filePath=basePath+"\\"+saveName;
                image.setTitle(titles[0]);
                image.setPath(saveName);

                //转存文件
                file.transferTo(new File(filePath));
               // logger.debug("图片保存成功");
                return image;
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
