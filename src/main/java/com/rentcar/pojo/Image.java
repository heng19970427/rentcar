package com.rentcar.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Xiaoliu
 */
public class Image {
    private Integer id;
    private String path;
    private String title;
    private MultipartFile img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }
}
