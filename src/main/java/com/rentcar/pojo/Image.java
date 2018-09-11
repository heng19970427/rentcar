package com.rentcar.pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-09-09
 */
public class Image {
    private Integer imageId;

    private String path;

    private String title;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}