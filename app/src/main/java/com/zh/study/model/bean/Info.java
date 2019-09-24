package com.zh.study.model.bean;

import java.util.List;

public class Info {

    private String authorId;
    private String authorName;
    private String authorPic;
    private String description;
    private Integer goodsNum;
    private String id;
    private String inventoryImg;
    private String mainTitle;
    private Long publishTime;
    private String skuIds;
    private String subTitle;
    private String summary;

    private List<Picture> skuList;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPic() {
        return authorPic;
    }

    public void setAuthorPic(String authorPic) {
        this.authorPic = authorPic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInventoryImg() {
        return inventoryImg;
    }

    public void setInventoryImg(String inventoryImg) {
        this.inventoryImg = inventoryImg;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public String getSkuIds() {
        return skuIds;
    }

    public void setSkuIds(String skuIds) {
        this.skuIds = skuIds;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Picture> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Picture> skuList) {
        this.skuList = skuList;
    }

    @Override
    public String toString() {
        return "Info{" +
                "authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorPic='" + authorPic + '\'' +
                ", description='" + description + '\'' +
                ", goodsNum=" + goodsNum +
                ", id='" + id + '\'' +
                ", inventoryImg='" + inventoryImg + '\'' +
                ", mainTitle='" + mainTitle + '\'' +
                ", publishTime=" + publishTime +
                ", skuIds='" + skuIds + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", summary='" + summary + '\'' +
                ", skuList=" + skuList +
                '}';
    }
}
